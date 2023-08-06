package examen;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Gerente extends Persona implements Impuestos{
	private String telefono;
	
	public Gerente() {
		super();
		this.telefono = "";
	}

	public Gerente(String dni, String nombre, String apellido, String direccion, String correo, String telefono) {
		super(dni, nombre, apellido, direccion, correo);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Gerente [telefono=" + telefono + "]";
	}

	@Override
	public double IRPF(double sueldo) {
		return sueldo * 0.24;
	}
	
	public void pagoMonitor(Monitor m, String mes, int year) throws FileNotFoundException {
		m.clasesMonitor(mes, year);
		m.calculaComplementoClases(mes);
		
		double nomina = m.getBase()+m.getExtraAlumnos()+m.getExtraClases();
		nomina -= this.IRPF(nomina);
		
		try {
			BD.getInstance().consultaBD("INSERT INTO pagos VALUES('"+m.getCodigoMonitor()+"','"+mes+"',"+year+","+nomina+",'PAGADO')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Monitor "+m.getNombre()+" "+m.getApellido()+" pagado "+nomina+"€ en "+mes);
	}
	
//	public static void main(String[] args) throws FileNotFoundException {
//		Monitor m = new Monitor("", "Maria", "Perez", "", "", 100, "");
//		Gerente g = new Gerente("", "", "", "", "", "");
//		
//		g.pagoMonitor(m, "Febrero", 2023);
//	}
}

package herencia;

public class Empleado extends Trabajador {
	private double sueldo;
	private double impuestos;
	private final static int PAGA=14; //constante
	//constructor
	public Empleado(String dni, String nombre, String apellidos, String telefono, double sueldo) {
		super(dni, nombre, apellidos, telefono);
		this.sueldo = sueldo;
		this.impuestos = 0.3*this.sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString()+" [sueldo=" + sueldo + ", impuestos=" + impuestos + "]" ;
	}

	public double calcularPaga() {
		return (this.sueldo-this.impuestos)/PAGA;
	}
}

package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona{
	private double totalMes;
	private String metodoPago;
	private ArrayList<ActividadReservada> actividades;
	
	public Cliente() {
		super();
		this.totalMes = 0;
		this.metodoPago = "";
		this.actividades = new ArrayList<>();
	}
	
	public Cliente(int codigo) {
		super(codigo);
		this.totalMes = 0;
		this.metodoPago = "";
		this.actividades = new ArrayList<>();
	}
	
	public Cliente(int codigo, String nombre, String apellido, String email, double totalMes, String metodoPago) {
		super(codigo, nombre, apellido, email);
		this.totalMes = totalMes;
		this.metodoPago = metodoPago;
		this.actividades = new ArrayList<>();
	}
	
	public Cliente(int codigo, String nombre, String apellido, String email, double totalMes, String metodoPago,
			ArrayList<ActividadReservada> actividades) {
		super(codigo, nombre, apellido, email);
		this.totalMes = totalMes;
		this.metodoPago = metodoPago;
		this.actividades = actividades;
	}

	public double getTotalMes() {
		return totalMes;
	}

	public void setTotalMes(double gastoDia) {
		this.totalMes = this.totalMes+gastoDia;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public ArrayList<ActividadReservada> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadReservada> actividades) {
		this.actividades = actividades;
	}

	@Override
	public String toString() {
		return "Cliente [totalMes=" + totalMes + ", metodoPago=" + metodoPago + ", actividades=" + actividades + "]";
	}
	
	public void verActividades() {
		try {
			Scanner in=new Scanner(new File("participantesCodigo.txt"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split("-");
				
				if(this.getCodigo()==Integer.parseInt(linea[0])) {
					System.out.println(linea[1]+" a las "+linea[2]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void confirmarReserva() {
		try {
			Scanner in=new Scanner(new File("participantesCodigo.txt"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split("-");
				
				if(this.getCodigo()==Integer.parseInt(linea[0])) {
					if (valido(Double.parseDouble(linea[2]))) {
						this.actividades.add(new ActividadReservada(linea[1], Double.parseDouble(linea[2])));
					} else {
						System.out.println("ya existe una actividad reservada a las "+linea[2]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Devuelve verdadero si la hora no esta cogida y falso si si lo esta
	private boolean valido(double hora) {
		for (ActividadReservada act:this.actividades) {
			if (act.getHora()==hora) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Cliente c=new Cliente(500, "pepe", "pepo", "jndsf", 40, "efectivo");
		c.confirmarReserva();
		
		for(ActividadReservada act:c.getActividades()) {
			System.out.println(act.getNombreActividad()+" "+act.getHora());
		}
		
		System.out.println(c.getActividades().size()*10);
		c.setTotalMes(c.getActividades().size()*10);
		System.out.println(c.getTotalMes());
	}
}

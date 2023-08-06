package ejercicio4;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String DNI;
	private String direccion;
	private String eMail;
	private ArrayList<Animal> mascotas;
	
	public Cliente() {
		super();
		this.nombre = "";
		this.DNI = "";
		this.direccion = "";
		this.eMail = "";
		this.mascotas = new ArrayList<>();
	}
	
	public Cliente(String nombre, String dNI, String direccion, String eMail) {
		super();
		this.nombre = nombre;
		this.DNI = dNI;
		this.direccion = direccion;
		this.eMail = eMail;
		this.mascotas = new ArrayList<>();
	}
	
	public Cliente(String nombre, String dNI, String direccion, String eMail, ArrayList<Animal> mascotas) {
		super();
		this.nombre = nombre;
		this.DNI = dNI;
		this.direccion = direccion;
		this.eMail = eMail;
		this.mascotas = mascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", eMail=" + eMail
				+ ", mascotas=" + mascotas + "]";
	}
	
	
}

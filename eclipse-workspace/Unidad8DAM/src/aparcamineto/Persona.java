package aparcamineto;

import java.io.Serializable;

public abstract class Persona implements Valida, Serializable{
	protected String dni;
	protected String nombre;
	protected String apellidos;
	private int edad;
	private String direccion;
	private String email;
	
	public Persona() {
		super();
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.direccion = "";
		this.email = "";
	}
	
	public Persona(String dni, String nombre, String apellidos, int edad, String direccion, String email) {
		super();
		this.setDni(dni);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (valida(dni)) {
			this.dni=dni;
		} else {
			this.dni = "00000000A";
			System.out.println("Dni no valido");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}
	
	@Override
	public boolean valida(String cadena) {
		char letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		if(cadena.matches("[0-9]{8}[A-Z]{1}")) {
			int n=Integer.parseInt(cadena.substring(0,cadena.length()-1));
			if (cadena.charAt(cadena.length()-1)==letras[n%23]) {
				return true;
			}
			
		}
		return false;
	}
}

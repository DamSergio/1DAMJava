package examen;

import java.io.Serializable;

public class Persona implements Serializable{
	private int codigo;
	private String nombre;
	private String apellido;
	private String email;
	
	public Persona() {
		super();
		this.codigo = 0;
		this.nombre = "";
		this.apellido = "";
		this.email = "";
	}
	
	public Persona(int codigo) {
		super();
		this.codigo = codigo;
		this.nombre = "";
		this.apellido = "";
		this.email = "";
	}
	
	public Persona(int codigo, String nombre, String apellido, String email) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
}

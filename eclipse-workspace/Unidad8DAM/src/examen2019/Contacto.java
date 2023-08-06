package examen2019;

public class Contacto {
	private String nombre;
	private String direccion;
	private int cp;
	private int telefono;
	private String email;
	
	public Contacto() {
		super();
		this.nombre = "";
		this.direccion = "";
		this.cp = 0;
		this.telefono = 0;
		this.email = "";
	}
	
	public Contacto(String nombre, String direccion, int cp, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cp = cp;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimir() {
		System.out.println(nombre+" "+direccion+" "+cp+" "+telefono+" "+email);
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", direccion=" + direccion + ", cp=" + cp + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
}

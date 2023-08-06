package canciones;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellido;
	private String direccion;
	private String usuario;
	private String clave;
	
	public Persona() {
		super();
		DNI = "";
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.usuario = "";
		this.clave = "";
	}
	
	public Persona(String dNI, String nombre, String apellido, String direccion, String usuario, String clave) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", usuario=" + usuario + ", clave=" + clave + "]";
	}
}

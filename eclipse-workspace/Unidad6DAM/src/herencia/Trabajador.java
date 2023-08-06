package herencia;

public class Trabajador {
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	//constructor
	public Trabajador(String dni, String nombre, String apellidos, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "[dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	public double calcularPaga() {
		return 0.0;
	}
}

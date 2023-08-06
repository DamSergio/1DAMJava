package ejemplo;

public class Persona {

	private String nombre;
	private String apellidos;
	private String DNI;
	private int edad;
	//constructor: inicializa las variables y reserva memoria
	//constructor por defecto
	public Persona() {
		this.DNI="";
		this.nombre="";
		this.apellidos="";
		this.edad=0;
	}
	//constructor usando todos los parametros
	public Persona(String nombre, String apellidos, String dNI, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
	}
	//constructor nombre y apellidos
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad + "]";
	}

	
	
	
	
	
}

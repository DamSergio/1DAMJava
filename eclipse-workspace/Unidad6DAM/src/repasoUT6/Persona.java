package repasoUT6;

public class Persona {
	private String nombre;
	private String apellidos;
	private Direccion direccion;
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.direccion=null;
	}
	
	public Persona(String nombre, String apellidos, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}
	
	public static void main(String[] args) {
		Direccion d=new Direccion("Plaza del pan", "1B", 1, 2, 45600);
		Persona p=new Persona("Sergio", "Ballesteros", d);
		System.out.println(p);
	}
}

package actividadRepaso;

public class Mascota implements Identificacion{
	protected int edad;
	protected String nombre;
	protected String id;
	
	public Mascota() {
		super();
		this.edad = 0;
		this.nombre = "";
		this.id = "";
	}
	
	public Mascota(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.id = generarId();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Mascota [edad=" + edad + ", nombre=" + nombre + ", id=" + id + "]";
	}

	@Override
	public String generarId() {
		return "";
	}
}

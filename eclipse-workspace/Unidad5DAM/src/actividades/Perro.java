package actividades;

public class Perro {
	private String nombre;
	private String raza;
	private int edad;
	private boolean sobrepeso;
	private String id;
	
	//inicializa variables y reserva memoria (sin parametros)
	public Perro() {
		this.nombre="";
		this.raza="";
		this.edad=0;
		this.sobrepeso=false;
		this.id="";
	}
	
	public Perro(String nombre, String raza, int edad, boolean sobrepeso) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso = sobrepeso;
		this.id = this.generarId(nombre, raza);
	}
	
	private String generarId(String nombre, String raza) {
		if (nombre.length()>=2 && raza.length()>=3) {
			return (int)(1+Math.random()*20)+nombre.substring(0,2)+raza.substring(0,3).toUpperCase();
		} else {
			return (int)(1+Math.random()*20)+nombre+raza.toUpperCase();
		}
		
	}

	public Perro(String nombre, String raza, int edad) {
		this.id=this.generarId(nombre, raza);
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso=false;
	}

	public Perro(String nombre) {
		this.nombre = nombre;
		this.raza = "";
		this.edad = 0;
		this.sobrepeso = false;
		this.id = "";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isSobrepeso() {
		return sobrepeso;
	}
	public void setSobrepeso(boolean sobrepeso) {
		this.sobrepeso = sobrepeso;
	}
	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nRaza: "+raza+"\nEdad: "+edad;
	}
	
	
}

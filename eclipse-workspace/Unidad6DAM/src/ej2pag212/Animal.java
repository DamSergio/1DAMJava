package ej2pag212;

public abstract class Animal {
	
	protected double peso;
	protected int edad;
	protected String alimentacion;
	protected String nombre;
	
	//construtor por defecto
	public Animal() {
		this.peso = 0;
		this.edad = 0;
		this.alimentacion = "";
		this.nombre = "";
	}
	
	//contructor con todos los parametros
	public Animal(double peso, int edad, String alimentacion, String nombre) {
		this.peso = peso;
		this.edad = edad;
		this.alimentacion = alimentacion;
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", edad=" + edad + ", alimentacion=" + alimentacion + ", nombre=" + nombre
				+ "]";
	}
	
//	public static void main(String[] args) {
//		Animal a[]=new Animal[100];
//	}
}

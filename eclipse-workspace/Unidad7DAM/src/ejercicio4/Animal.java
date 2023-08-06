package ejercicio4;

import java.util.ArrayList;

public class Animal {
	protected String nombre;
	protected String raza;
	protected String sexo;
	protected int edad;
	protected double peso;
	protected ArrayList<Vacuna> libroVacunacion;
	
	public Animal() {
		super();
		this.edad = 0;
		this.peso = 0;
		this.raza = "";
		this.sexo = "";
		this.nombre = "";
		this.libroVacunacion = new ArrayList<>();
	}
	
	public Animal(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.libroVacunacion = libroVacunacion;
	}
	
	public Animal(int edad, double peso, String raza, String sexo, String nombre) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.libroVacunacion = new ArrayList<>();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vacuna> getLibroVacunacion() {
		return libroVacunacion;
	}

	public void setLibroVacunacion(ArrayList<Vacuna> libroVacunacion) {
		this.libroVacunacion = libroVacunacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	
	
}

package ej2pag212;

public class Perro extends Animal {

	private String raza;
	private String chip;
	
	public Perro() {
		super();
		this.raza = "";
		this.chip = "";
	}
	
	public Perro(double peso, int edad, String alimentacion, String nombre, String raza, String chip) {
		super(peso, edad, alimentacion, nombre);
		this.raza = raza;
		this.chip = chip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}
	
	public String ladra() {
		return "Guau!!";
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", chip=" + chip + ", peso=" + peso + ", edad=" + edad + ", alimentacion="
				+ alimentacion + ", nombre=" + nombre + "]";
	}
	
	
}

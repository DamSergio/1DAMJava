package ejercicio4;

import java.util.ArrayList;

public class Perro extends Animal{
	private String chip;
	private boolean seguroObligatorio;
	
	public Perro() {
		super();
		this.chip = "";
		this.seguroObligatorio = false;
	}
	
	public Perro(int edad, double peso, String raza, String sexo, String nombre, 
			String chip, boolean seguroObligatorio,ArrayList<Vacuna> libroVacunacion) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.chip = chip;
		this.seguroObligatorio = seguroObligatorio;
	}

	public Perro(int edad, double peso, String raza, String sexo, String nombre, String chip,
			boolean seguroObligatorio) {
		super(edad, peso, raza, sexo, nombre);
		this.chip = chip;
		this.seguroObligatorio = seguroObligatorio;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public boolean isSeguroObligatorio() {
		return seguroObligatorio;
	}

	public void setSeguroObligatorio(boolean seguroObligatorio) {
		this.seguroObligatorio = seguroObligatorio;
	}

	@Override
	public String toString() {
		return "Perro [chip=" + chip + ", seguroObligatorio=" + seguroObligatorio + ", nombre=" + nombre + ", raza="
				+ raza + ", libroVacunacion=" + libroVacunacion + "]";
	}
	
}

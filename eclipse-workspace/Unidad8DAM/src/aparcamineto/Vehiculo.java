package aparcamineto;

import java.io.Serializable;

public abstract class Vehiculo implements Valida, Serializable{
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.color = "";
		this.marca = "";
		this.modelo = "";
	}
	
	public Vehiculo(String matricula, String color, String marca, String modelo) {
		super();
		this.setMatricula(matricula);
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (valida(matricula)) {
			this.matricula=matricula;
		} else {
			System.out.println("Matricula no valida");
			this.matricula = "0000-ZZZ";
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double precioEstacionamineto(int dias) {
		return 0;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
	@Override
	public boolean valida(String cadena) {
		return cadena.matches("[0-9]{4}-[A-Z]{3}");
	}
}

package aparcamineto;

import java.io.Serializable;

public class Furgoneta extends Vehiculo implements Serializable{
	private double capacidad;
	
	public Furgoneta() {
		super();
		this.capacidad = 0;
	}
	
	public Furgoneta(String matricula, String color, String marca, String modelo, double capacidad) {
		super(matricula, color, marca, modelo);
		this.capacidad = capacidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	public double precioEstacionamineto(int dias) {
		return 15*dias;
	}
	
	@Override
	public String toString() {
		return "Furgoneta [capacidad=" + capacidad + "]";
	}
}

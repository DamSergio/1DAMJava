package dueñoVehiculos;

public class Moto extends Vehiculo {
	private double cilindrada;

	public Moto() {
		super();
		this.cilindrada=0;
	}

	public Moto(String matricula, String marca, String modelo, double cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String getTipo() {
		return "Moto";
	}
	
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
	
	
}

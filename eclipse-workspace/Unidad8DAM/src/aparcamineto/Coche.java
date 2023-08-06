package aparcamineto;

import java.io.Serializable;

public class Coche extends Vehiculo implements Serializable{
	private int nPuertas;

	public Coche() {
		super();
		this.nPuertas = 0;
	}
	
	public Coche(String matricula, String color, String marca, String modelo, int nPuertas) {
		super(matricula, color, marca, modelo);
		this.nPuertas = nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	
	public double precioEstacionamineto(int dias) {
		return 10*dias;
	}

	@Override
	public String toString() {
		return "Coche [nPuertas=" + nPuertas + "]";
	}
}

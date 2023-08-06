package dueñoVehiculos;

public class Coche extends Vehiculo {
	private String color;
	private int nPuertas;
	public Coche() {
		super();
		this.color="";
		this.nPuertas=0;
	}
	public Coche(String matricula, String marca, String modelo, String color, int nPuertas) {
		super(matricula, marca, modelo);
		this.color = color;
		this.nPuertas = nPuertas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getnPuertas() {
		return nPuertas;
	}
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	public String getTipo() {
		return "Coche";
	}
	
	@Override
	public String toString() {
		return "Coche [color=" + color + ", nPuertas=" + nPuertas + "]";
	}
	
}

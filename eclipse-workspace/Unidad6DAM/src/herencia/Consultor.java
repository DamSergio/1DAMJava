package herencia;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifa;
	
	public Consultor(String dni, String nombre, String apellidos, String telefono, int horas, double tarifa) {
		super(dni, nombre, apellidos, telefono);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString()+" [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga() {
		return this.horas*this.tarifa;
	}
}

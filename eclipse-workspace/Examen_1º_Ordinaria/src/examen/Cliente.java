package examen;

public class Cliente extends Persona {
	private String metodoPago;
	private double cuota;
	
	public Cliente() {
		super();
		this.metodoPago = "";
		this.cuota = 0;
	}
	
	public Cliente(String dni, String nombre, String apellido, String direccion, String correo, String metodoPago,
			double cuota) {
		super(dni, nombre, apellido, direccion, correo);
		this.metodoPago = metodoPago;
		this.cuota = cuota;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", cuota=" + cuota + "]";
	}
}

package examen1ºOrdinaria2022;

public class Cliente extends Persona {
	private String metodoPago;

	public Cliente() {
		super();
		this.metodoPago = "";
	}
	
	public Cliente(String dni, String nombre, String apellido, String direccion, String metodoPago) {
		super(dni, nombre, apellido, direccion);
		this.metodoPago = metodoPago;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + "]";
	}
}

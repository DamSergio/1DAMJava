package examen2022;

public class Pedido {
	private int codigoPedido;
	private String dniCliente;
	private int descuento;
	private int turno;
	
	public Pedido() {
		super();
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.descuento = 0;
		this.turno = 0;
	}
	
	public Pedido(int codigoPedido, String dniCliente, int descuento, int turno) {
		super();
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.descuento = descuento;
		this.turno = turno;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", dniCliente=" + dniCliente + ", descuento=" + descuento
				+ ", turno=" + turno + "]";
	}
}
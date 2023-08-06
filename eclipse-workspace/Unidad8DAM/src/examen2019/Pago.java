package examen2019;

public class Pago {
	private String factura;
	private int trimestre;
	private int año;
	private double importe;
	
	public Pago() {
		super();
		this.factura = "";
		this.trimestre = 0;
		this.año = 0;
		this.importe = 0;
	}
	
	public Pago(String factura, int trimestre, int año, double importe) {
		super();
		this.factura = factura;
		this.trimestre = trimestre;
		this.año = año;
		this.importe = importe;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public int getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(int trimestre) {
		this.trimestre = trimestre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Factura "+factura+" perteneciente al trimestre "+trimestre+" del año "+año+" por importe de "+importe+" euros";
	}
}

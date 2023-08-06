package banco;


//HECHO POR: ÁLVARO FDEZ.
public class Cuenta {
	private String IBAN;
	private String cuenta;
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	
	@Override
	public String toString() {
		return "IBAN:" + IBAN + "\n cuenta:" + cuenta + "\ncodigoTitular:" + codigoTitular
		+ "\ncodigoAutorizado:" + codigoAutorizado + "saldo:" + saldo + "€";
	}
	
	public void retirarSaldo(double cantidad){
		if(cantidad>this.saldo) {
			System.out.println("La cantidad a retirar supera el saldo actual de la cuenta.");
		}else {
			this.setSaldo(this.getSaldo()-cantidad);
			System.out.println("Ha retirado "+this.saldo+" €");
		}
		
	}
	
	public void ingresar(double cantidad) {
		double total=this.getSaldo()+cantidad;
		this.setSaldo(total);
	}
	
	public Cuenta () {
		this.IBAN = "";
		this.cuenta = "";
		this.codigoTitular = "";
		this.codigoAutorizado = "";
		this.saldo =0;
	}
	
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		this.IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getCodigoTitular() {
		return codigoTitular;
	}
	public void setCodigoTitular(String codigoTitular) {
		this.codigoTitular = codigoTitular;
	}
	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}
	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static void main(String[] args) {
		Cuenta c=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000.0);
		System.out.println(c);
	}

}
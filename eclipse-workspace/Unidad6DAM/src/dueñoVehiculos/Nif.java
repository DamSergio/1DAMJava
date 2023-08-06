package dueñoVehiculos;

public class Nif {
	private final static int DIMENSION_MAX=9;
	private final static int DIVISOR=23;
	private char letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private String numero;
	
	public Nif(String numero) {
		this.numero = setNif(numero);
	}

	public boolean esCorrecto (String dni) {
		int numero=Integer.parseInt(dni.substring(0, dni.length()-1));
		if (dni.length()==DIMENSION_MAX && letras[numero%DIVISOR]==dni.charAt(dni.length()-1)) {
			return true;
		}
		return false;
	}
	
	public String setNif (String dni) {
		if (esCorrecto(dni)) {
			return dni;
		}
		return "NIF no valido";
	}
	
	public String getNif() {
		return this.numero;
	}

	@Override
	public String toString() {
		return numero;
	}
	
	
}

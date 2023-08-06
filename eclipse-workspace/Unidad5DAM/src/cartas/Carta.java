package cartas;

public class Carta {
	private int numero;
	private String palo;
	//constructor por defecto
	public Carta () {
		this.numero=0;
		this.palo="";
	}
	//constructor con todos los parametros
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return numero+" de "+palo;
	}
	
	
}

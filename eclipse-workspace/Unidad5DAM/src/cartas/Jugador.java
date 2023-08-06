package cartas;

public class Jugador {
	private String nombre;
	private Carta carta;
	
	public Jugador (String nombre) {
		this.nombre = nombre;
		this.carta =new Carta();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	public void extraerCarta() {
		String palos[]= {"copas", "bastos", "espadas", "oros"};
		int n=(int)(Math.random()*4);
		int numero=0;
		this.carta.setPalo(palos[n]);
		do {
			numero=(int)(1+Math.random()*12);
		} while (numero==8 || numero==9);
		this.carta.setNumero(numero);
	}
}

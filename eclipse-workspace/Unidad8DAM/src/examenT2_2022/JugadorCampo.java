package examenT2_2022;

public class JugadorCampo extends Jugador{
	private String posicion;
	private int golesMarcados;
	
	public JugadorCampo() {
		super();
		this.posicion = "";
		this.golesMarcados = 0;
	}
	
	public JugadorCampo(int dorsal, int tarjetasRojas, int tarjetasAmarillas, String nombre, String posicion,
			int golesMarcados) {
		super(dorsal, tarjetasRojas, tarjetasAmarillas, nombre);
		this.posicion = posicion;
		this.golesMarcados = golesMarcados;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Override
	public String toString() {
		return "JugadorCampo [posicion=" + posicion + ", golesMarcados=" + golesMarcados + "]";
	}
}

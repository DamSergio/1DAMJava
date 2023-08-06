package examenT2_2022;

public class Portero extends Jugador{
	private int golesEncajados;

	public Portero() {
		super();
		this.golesEncajados = 0;
	}
	
	public Portero(int dorsal, int tarjetasRojas, int tarjetasAmarillas, String nombre, int golesEncajados) {
		super(dorsal, tarjetasRojas, tarjetasAmarillas, nombre);
		this.golesEncajados = golesEncajados;
	}

	public int getGolesEncajados() {
		return golesEncajados;
	}

	public void setGolesEncajados(int golesEncajados) {
		this.golesEncajados = golesEncajados;
	}

	@Override
	public String toString() {
		return "Portero [golesEncajados=" + golesEncajados + "]";
	}
}

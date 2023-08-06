package examenT2_2022;

public abstract class Jugador {
	private int dorsal;
	private int tarjetasRojas;
	private int tarjetasAmarillas;
	private String nombre;
	
	public Jugador() {
		super();
		this.dorsal = 0;
		this.tarjetasRojas = 0;
		this.tarjetasAmarillas = 0;
		this.nombre = "";
	}
	
	public Jugador(int dorsal, int tarjetasRojas, int tarjetasAmarillas, String nombre) {
		super();
		this.dorsal = dorsal;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", tarjetasRojas=" + tarjetasRojas + ", tarjetasAmarillas="
				+ tarjetasAmarillas + ", nombre=" + nombre + "]";
	}
}

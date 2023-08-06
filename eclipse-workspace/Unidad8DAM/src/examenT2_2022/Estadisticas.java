package examenT2_2022;

import java.util.Arrays;

public class Estadisticas {
	private Jugador[] jugadores;
	
	public Estadisticas() {
		super();
		this.jugadores = new Jugador[15];
		this.jugadores[0]=new Portero();
		this.jugadores[1]=new Portero();
		for (int i=2; i<this.jugadores.length; i++) {
			this.jugadores[i]=new JugadorCampo();
		}
	}
	
	public Estadisticas(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Estadisticas [jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	public void expulsado() {
		int maxExp=0;
		
		for (Jugador i:this.jugadores) {
			int expulsiones=0;
			expulsiones+=(i.getTarjetasAmarillas()/2)+i.getTarjetasRojas();
			
			if (expulsiones>maxExp) {
				maxExp=expulsiones;
			}
		}
		
		for (Jugador i:this.jugadores) {
			if ((i.getTarjetasAmarillas()/2)+i.getTarjetasRojas()==maxExp) {
				System.out.println(i.getNombre());
			}
		}
	}
	
	public void listado() {
		for (Jugador jug:this.getJugadores()) {
			for (int i=0; i<jug.getNombre().length(); i++) {
				if (jug.getNombre().charAt(i)==' ' && i>4) {
					System.out.println(jug.getNombre());
				}
			}
		}
	}
	
//	public static void main(String[] args) {
//		Estadisticas e=new Estadisticas();
//		Portero p=new Portero(5,2,4,"juana alberto", 5);
//		Portero p2=new Portero(5,2,4,"juan", 5);
//		
//		e.getJugadores()[0]=p;
//		e.getJugadores()[1]=p2;
//		
//		e.listado();
//	}
}

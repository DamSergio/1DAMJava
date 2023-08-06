package actividadRepaso;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Programa {
	private ArrayList<Mascota> mascotas;
	
	public Programa() {
		super();
		this.mascotas = new ArrayList<>();
	}
	
	public Programa(ArrayList<Mascota> mascotas) {
		super();
		this.mascotas = mascotas;
	}
	
	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public static void main(String[] args) {
		Programa app = new Programa();
		
		app.getMascotas().add(new Perro(15, "Paco", true));
		app.getMascotas().add(new Gato(17, "Cerdo", false));
		app.getMascotas().add(new Perro(15, "Luis", true));
		app.getMascotas().add(new Gato(8, "Pepe", true));
		app.getMascotas().add(new Perro(18, "Lucas", true));
		
		System.out.println(app.mayorEdad());

	}

	private String mayorEdad() {
		return this.mascotas.stream().
				map(m -> m instanceof Perro ? (((Perro) m).isEstaLadrando() ? m : null) : (((Gato) m).isEstaMaullando() ? m : null)).
				filter(m -> m != null).
				filter(m -> m.getEdad() >= this.mascotas.stream().
					map(j -> j instanceof Perro ? (((Perro) j).isEstaLadrando() ? j : null) : (((Gato) j).isEstaMaullando() ? j : null)).
					filter(j -> j != null).
					mapToInt(j -> j.getEdad()).
					max().
					getAsInt()).
				collect(Collectors.toList()).
				get(0).
				getNombre();
	}
}

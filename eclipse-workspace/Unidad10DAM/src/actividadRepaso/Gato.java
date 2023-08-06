package actividadRepaso;

public class Gato extends Mascota {
	private boolean estaMaullando;
	
	public Gato() {
		super();
		this.estaMaullando = false;
	}
	
	public Gato(int edad, String nombre, boolean estaMaullando) {
		super(edad, nombre);
		this.estaMaullando = estaMaullando;
	}

	public boolean isEstaMaullando() {
		return estaMaullando;
	}

	public void setEstaMaullando(boolean estaMaullando) {
		this.estaMaullando = estaMaullando;
	}

	@Override
	public String toString() {
		return "Gato [estaMaullando=" + estaMaullando + "]";
	}
	
	@Override
	public String generarId() {
		return "G"+this.nombre.substring(0,2)+(int)(Math.random()*21);
	}
}

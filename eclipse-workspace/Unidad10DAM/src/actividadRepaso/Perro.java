package actividadRepaso;

public class Perro extends Mascota {
	private boolean estaLadrando;

	public Perro() {
		super();
		this.estaLadrando = false;
	}
	
	public Perro(int edad, String nombre, boolean estaLadrando) {
		super(edad, nombre);
		this.estaLadrando = estaLadrando;
	}

	public boolean isEstaLadrando() {
		return estaLadrando;
	}

	public void setEstaLadrando(boolean estaLadrando) {
		this.estaLadrando = estaLadrando;
	}

	@Override
	public String toString() {
		return "Perro [estaLadrando=" + estaLadrando + "]";
	}
	
	@Override
	public String generarId() {
		return "P"+this.nombre.substring(0,2)+(int)(Math.random()*21);
	}
}

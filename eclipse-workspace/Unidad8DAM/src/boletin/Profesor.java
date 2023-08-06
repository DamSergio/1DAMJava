package boletin;

public class Profesor extends Persona{
	private String titulacion;

	public Profesor() {
		super();
		this.titulacion = "";
	}
	
	public Profesor(int codigo, String dNI, String nombre, String apellidos, String titulacion) {
		super(codigo, dNI, nombre, apellidos);
		this.titulacion = titulacion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	@Override
	public String toString() {
		return "Profesor [titulacion=" + titulacion + "]";
	}
}

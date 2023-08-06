package clinica;

public class Profesional extends Persona{
	private String especialidad;
	private int turno;
	private static final int MAÑANA = 0;
	private static final int TARDE = 1;
	private static final int GUARDIA = 2;
	
	public Profesional() {
		super();
		this.especialidad = "";
		this.turno = 0;
	}
	
	public Profesional(String dni, String nombre, String apellido, String telefono, String especialidad, int turno) {
		super(dni, nombre, apellido, telefono);
		this.especialidad = especialidad;
		this.turno = turno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Profesional [especialidad=" + especialidad + ", turno=" + turno + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getTelefono()="
				+ getTelefono() + "]";
	}
}

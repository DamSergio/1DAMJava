package canciones;

public class Administrador extends Persona {
	private int turno;

	public Administrador() {
		super();
		this.turno = 0;
	}
	
	public Administrador(String dNI, String nombre, String apellido, String direccion, String usuario, String clave,
			int turno) {
		super(dNI, nombre, apellido, direccion, usuario, clave);
		this.turno = turno;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Administrador [turno=" + turno + "]";
	}
}

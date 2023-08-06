package aparcamineto;

public class Conductor extends Persona{
	private int codigo;
	private int turno;
	public final static int MAÑANA=1;
	public final static int TARDE=2;
	public final static int NOCHE=3;
	
	public Conductor() {
		super();
		this.codigo = 0;
		this.turno = 0;
	}
	
	public Conductor(String dni, String nombre, String apellidos, int edad, String direccion, String email, int codigo,
			int turno) {
		super(dni, nombre, apellidos, edad, direccion, email);
		this.codigo = codigo;
		this.turno = turno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Conductor [codigo=" + codigo + ", tipo=" + turno + "]";
	}
}

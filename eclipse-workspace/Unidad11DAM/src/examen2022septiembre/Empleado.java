package examen2022septiembre;

import java.io.FileNotFoundException;

public class Empleado extends Persona {
	private int turno;
	
	public Empleado() throws FileNotFoundException {
		super();
		this.turno = 0;
	}
	
	public Empleado(String dni, String nombre, String apellido, String direccion, int turno) throws FileNotFoundException {
		super(dni, nombre, apellido, direccion);
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
		return "Empleado [turno=" + turno + "]";
	}
}
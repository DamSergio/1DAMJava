package examen;

public class Dueño extends Persona{
	private String telefono; //por si acaso llevo +34

	public Dueño() {
		super();
		this.telefono = "";
	}
	
	public Dueño(int codigo, String nombre, String apellido, String email, String telefono) {
		super(codigo, nombre, apellido, email);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Dueño [telefono=" + telefono + "]";
	}
}

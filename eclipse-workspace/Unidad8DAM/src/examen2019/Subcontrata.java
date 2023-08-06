package examen2019;

import java.util.ArrayList;

public class Subcontrata extends Empresa {
	private int personal;

	public Subcontrata() {
		super();
		this.personal = 0;
	}
	
	public Subcontrata(int codigo, String cif, String nombre, Contacto persona_contacto,int personal) {
		super(codigo, cif, nombre, persona_contacto);
		this.personal = personal;
	}

	public Subcontrata(int codigo, String cif, String nombre, Contacto persona_contacto, ArrayList<Pago> pagos,int personal) {
		super(codigo, cif, nombre, persona_contacto, pagos);
		this.personal = personal;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "Subcontrata [personal=" + personal + "]";
	}
}
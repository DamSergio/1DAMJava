package examen2019;

import java.util.ArrayList;

public abstract class Empresa implements Pagable{
	private int codigo;
	private String cif;
	private String nombre;
	private Contacto persona_contacto;
	private ArrayList<Pago> pagos;
	
	public Empresa() {
		super();
		this.codigo = 0;
		this.cif = "";
		this.nombre = "";
		this.persona_contacto = null;
		this.pagos = new ArrayList<>();
	}
	
	public Empresa(int codigo, String cif, String nombre, Contacto persona_contacto) {
		super();
		this.codigo = codigo;
		this.cif = cif;
		this.nombre = nombre;
		this.persona_contacto = persona_contacto;
		this.pagos = new ArrayList<>();
	}
	
	public Empresa(int codigo, String cif, String nombre, Contacto persona_contacto, ArrayList<Pago> pagos) {
		super();
		this.codigo = codigo;
		this.cif = cif;
		this.nombre = nombre;
		this.persona_contacto = persona_contacto;
		this.pagos = pagos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contacto getPersona_contacto() {
		return persona_contacto;
	}

	public void setPersona_contacto(Contacto persona_contacto) {
		this.persona_contacto = persona_contacto;
	}

	public ArrayList<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(ArrayList<Pago> pagos) {
		this.pagos = pagos;
	}
	
	public void añadirPago(Pago p) {
		this.pagos.add(p);
	}
	
	public double totalTrimestre(int año, int tri) {
		double imp=0;
		for (Pago p:this.pagos) {
			if (p.getAño()==año && p.getTrimestre()==tri) {
				imp+=p.getImporte();
			}
		}
		return imp;
	}
	
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", cif=" + cif + ", nombre=" + nombre + ", persona_contacto="
				+ persona_contacto + "]";
	}
}

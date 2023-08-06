package gruposYCanciones;

import java.util.ArrayList;

public class Grupo {
	private String codigo;
	private String nombre;
	private int año;
	private String tipo;
	
	public Grupo() {
		super();
		this.codigo = "";
		this.nombre = "";
		this.año = 0;
		this.tipo = tipo;
	}
	
	public Grupo(String codigo, String nombre, int año, String tipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}
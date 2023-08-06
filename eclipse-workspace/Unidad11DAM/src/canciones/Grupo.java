package canciones;

public class Grupo {
	private String codigo;
	private String nombre;
	private String fechaCreacion;
	private String tipoMusica;
	
	public Grupo() {
		super();
		this.codigo = "";
		this.nombre = "";
		this.fechaCreacion = "";
		this.tipoMusica = "";
	}
	
	public Grupo(String codigo, String nombre, String fechaCreacion, String tipoMusica) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tipoMusica = tipoMusica;
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

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	@Override
	public String toString() {
		return "Grupo [codigo=" + codigo + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", tipoMusica="
				+ tipoMusica + "]";
	}
}

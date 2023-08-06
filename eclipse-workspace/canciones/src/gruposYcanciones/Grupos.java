package gruposYcanciones;

public class Grupos {
	
	private String codigoGrupo;
	private String nombre;
	private String añoCreacion;
	private String tipoMusica;
	
	//constructor vacio 
	public Grupos() {
	
		this.codigoGrupo = "";
		this.nombre = "";
		this.añoCreacion = "";
		this.tipoMusica = "";
	}
	
	
	//contructor
	public Grupos(String codigoGrupo, String nombre, String añoCreacion, String tipoMusica) {
		super();
		this.codigoGrupo = codigoGrupo;
		this.nombre = nombre;
		this.añoCreacion = añoCreacion;
		this.tipoMusica = tipoMusica;
	}
	//get and set
	public String getCodigoGrupo() {
		return codigoGrupo;
	}
	public void setCodigoGrupo(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(String añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	public String getTipoMusica() {
		return tipoMusica;
	}
	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	//to String

	@Override
	public String toString() {
		return "Grupos [codigoGrupo=" + codigoGrupo + ", nombre=" + nombre + ", añoCreacion=" + añoCreacion
				+ ", tipoMusica=" + tipoMusica + "]";
	}
	
	
	
	
}

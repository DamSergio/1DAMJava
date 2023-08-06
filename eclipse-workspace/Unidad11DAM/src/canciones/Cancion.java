package canciones;

public class Cancion {
	private String codGrupo;
	private String disco;
	private String nombre;
	private int minutos;
	
	public Cancion() {
		super();
		this.codGrupo = "";
		this.disco = "";
		this.nombre = "";
		this.minutos = 0;
	}
	
	public Cancion(String codGrupo, String disco, String nombre, int minutos) {
		super();
		this.codGrupo = codGrupo;
		this.disco = disco;
		this.nombre = nombre;
		this.minutos = minutos;
	}

	public String getCodGrupo() {
		return codGrupo;
	}

	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return nombre+": "+minutos;
	}
}

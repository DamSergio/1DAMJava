package gruposYCanciones;

public class Cancion {
	private String codigo;
	private String disco;
	private String titulo;
	private int minutos;
	private int segundos;
	
	public Cancion() {
		super();
		this.codigo = "";
		this.disco = "";
		this.titulo = "";
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Cancion(String codigo, String disco, String titulo, int minutos, int segundos) {
		super();
		this.codigo = codigo;
		this.disco = disco;
		this.titulo = titulo;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return "Disco: "+this.disco+" - "+this.titulo;
	}
}

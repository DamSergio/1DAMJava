package videoClub;

public class Dvd {
	private String titulo;
	private int tipo;
	public final static int INFANTIL=2;
	public final static int NORMAL=0;
	public final static int NOVEDAD=1;
	
	public Dvd() {
		this.titulo="";
		this.tipo=0;
	}
	
	public Dvd(String titulo, int tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Dvd [titulo=" + titulo + ", tipo=" + tipo + "]";
	}
	
	
}

package actividades;

public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPag;
	
	public Libro(String iSBN, String titulo, String autor, int numeroPag) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPag = numeroPag;
	}

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPag() {
		return numeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}
	@Override
	public String toString() {
		return "El libro "+titulo+" con ISBN "+ISBN+" por el autor "+autor+" tiene "+numeroPag+" paginas";
	}
	
	
}

package notasAlumnos;

public class Nota {
	private String modulo;
	private double nota;
	
	public Nota () {
		this.modulo="";
		this.nota=0;
	}

	public Nota(String modulo, double nota) {
		this.modulo = modulo;
		this.nota = nota;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void asignarNota (String modulo, double nota) {
		this.modulo=modulo;
		this.nota=nota;
	}

	@Override
	public String toString() {
		return "Modulo:"+this.modulo+"=>"+this.nota;
	}
	
	public static void main (String[]args) {
		Nota n=new Nota("pro",10);
		System.out.println(n);
	}
}

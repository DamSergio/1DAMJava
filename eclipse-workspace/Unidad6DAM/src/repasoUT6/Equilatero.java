package repasoUT6;

public class Equilatero extends Figura{
	private double lado;

	public Equilatero() {
		super();
		this.lado=0;
	}
	
	public Equilatero(String color,double lado) {
		super(color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		return (Math.sqrt(3)/4)*Math.pow(lado, 2);
	}
	
	@Override
	public double getPerimetro() {
		return this.lado*3;
	}
	
	@Override
	public boolean equals(Figura fig) {
		if (fig instanceof Equilatero && fig.getArea()==this.getArea() && fig.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Equilatero [lado=" + lado + ", area=" + this.getArea() + ", perimetro=" + this.getPerimetro() + ", color="+this.getColor();
	}
	
	public static void main(String[] args) {
		Equilatero e=new Equilatero("verde", 5);
		System.out.println(e);
	}
	
}

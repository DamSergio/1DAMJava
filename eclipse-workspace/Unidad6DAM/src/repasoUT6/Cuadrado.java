package repasoUT6;

public class Cuadrado extends Figura {
	private double lado;
	private double area;
	private double perimetro;
	
	public Cuadrado() {
		super();
		lado=0;
	}
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
		this.area=getArea();
		this.perimetro=getPerimetro();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
	
	@Override
	public double getPerimetro() {
		return this.lado*4;
	}
	
	@Override
	public boolean equals(Figura fig) {
		if (fig instanceof Cuadrado && fig.getArea()==this.area && fig.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [area=" + area + ", perimetro=" + perimetro + ", color="+this.getColor()+"]";
	}
	
	public static void main(String[] args) {
		Cuadrado c=new Cuadrado("rojo", 6);
		Cuadrado h=new Cuadrado("rojo", 6);
		System.out.println(c);
		if (c.equals(h)) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
	}
}

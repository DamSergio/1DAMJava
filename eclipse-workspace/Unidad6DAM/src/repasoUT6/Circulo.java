package repasoUT6;

public class Circulo extends Figura{
	
	private double radio;
	private double area;
	private double perimetro;
	
	public Circulo() {
		super();
		radio=0;
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio=radio;
		this.area=getArea();
		this.perimetro=getPerimetro();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radio, 2);
	}
	
	@Override
	public double getPerimetro() {
		return 2*Math.PI*this.radio;
	}
	
	public boolean equals (Figura fig) {
		if (fig instanceof Circulo && fig.getArea()==this.area && fig.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Circulo: area="+area+", perimetro="+perimetro+", color="+this.getColor();
	}
	
	public static void main(String[] args) {
		Circulo c=new Circulo("verde", 5);
		System.out.println(c);
		System.out.println(c.getArea());
	}
}

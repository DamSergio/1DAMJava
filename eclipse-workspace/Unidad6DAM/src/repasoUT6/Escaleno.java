package repasoUT6;

public class Escaleno extends Figura {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Escaleno(String color, double ladoA, double ladoB, double ladoC) {
		super(color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	@Override
	public double getArea() {
		double sp=(this.getPerimetro())/2;
		return (Math.sqrt(sp*(sp-this.ladoA)*(sp-this.ladoB)*(sp-this.ladoC)));
	}
	
	@Override
	public double getPerimetro() {
		return this.ladoA+this.ladoB+this.ladoC;
	}
	
	@Override
	public boolean equals(Figura fig) {
		if (fig instanceof Escaleno && fig.getArea()==this.getArea() && fig.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Escaleno [area=" + this.getArea() + ", perimetro=" + this.getPerimetro() + ", Color=" + getColor() + "]";
	}
	
	public static void main(String[] args) {
		Escaleno e=new Escaleno("verde", 4, 5, 3);
		System.out.println(e);
	}
}

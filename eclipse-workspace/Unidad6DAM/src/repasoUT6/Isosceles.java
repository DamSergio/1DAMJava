package repasoUT6;

public class Isosceles extends Figura{
	private double ladoRep;
	private double ladoDis;
	
	public Isosceles() {
		super();
		this.ladoRep=0;
		this.ladoDis=0;
	}

	public Isosceles(String color, double ladoRep, double ladoDis) {
		super(color);
		this.ladoRep = ladoRep;
		this.ladoDis = ladoDis;
	}
	
	public double getLadoRep() {
		return ladoRep;
	}

	public void setLadoRep(double ladoRep) {
		this.ladoRep = ladoRep;
	}

	public double getLadoDis() {
		return ladoDis;
	}

	public void setLadoDis(double ladoDis) {
		this.ladoDis = ladoDis;
	}

	@Override
	public double getArea() {
		return (this.ladoDis*Math.sqrt(Math.pow(ladoRep, 2)-(Math.pow(ladoDis, 2)/4)))/2;
	}
	
	@Override
	public double getPerimetro() {
		return this.ladoRep*2+this.ladoDis;
	}
	
	@Override
	public boolean equals(Figura fig) {
		if (fig instanceof Isosceles && fig.getArea()==this.getArea() && fig.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Isosceles [ladoRep=" + ladoRep + ", ladoDis=" + ladoDis + ", area=" + this.getArea() + ", perimetro=" + this.getPerimetro()
				+ ", getColor()=" + getColor() + "]";
	}
	
	public static void main(String[] args) {
		Isosceles i=new Isosceles("verde", 2, 3);
		System.out.println(i);
	}
}

package repasoUT6;

public abstract class Figura {
	private String color;
	
	public Figura() {
		color="";
	}

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimetro() {
		return 0;
	}
	
	public boolean equals(Figura fig) {
		return false;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	
}

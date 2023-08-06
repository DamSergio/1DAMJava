package repasoUT6;

public class AppFiguras {

	public static void main(String[] args) {
		Circulo c=new Circulo("verde", 3);
		Circulo c3=new Circulo("amarillo", 3);
		Cuadrado c2=new Cuadrado("verde", 3);
		if (c.equals(c2)) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		if (c.equals(c3)) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}

	}

}

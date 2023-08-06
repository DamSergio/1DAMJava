package bucles;

public class Ejercicio11 {

	public static void main(String[] args) {
		int i=10, n=1, mult=1;
		
		while (i>0) {
			i--;
			mult*=n;
			n+=2;
			System.out.println(mult);
		}

	}

}

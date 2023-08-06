package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int i=10, cont0=0, contp=0, contn=0, n=0;
		float sumap=0.0f, suman=0.0f;
		
		while (i>0) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n==0) {
				cont0++;
			}
			if (n>0) {
				contp++;
				sumap+=n;
			} else {
				contn++;
				suman+=n;
			}
			i--;
		}
		System.out.println("La media de numeros positivos es: "+(sumap/contp));
		System.out.println("La media de numeros negativos es: "+(suman/contn));
		System.out.println("El total de ceros es: "+cont0);
		t.close();
	}

}

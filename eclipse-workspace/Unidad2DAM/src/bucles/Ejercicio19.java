package bucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, j=2, i=1, cont=0, primo=0;
		
		System.out.println("dame un numero");
		n=t.nextInt(); //primos hasta n
		
		while (j<=n) {
			while (i<=j) {
				if (j%i==0) {
					cont++;
				}
				i++;
			}
			if (cont==2) {
				primo++;
			}
			i=1;
			j++;
			cont=0;
		}
		System.out.println("hay "+primo+" numeros primos entre 1 y "+n);
		
//		while (j<=n) { //desde 2 hasta n
//			i=1;
//			while (i<=j) {
//				if (j%i==0) {
//					cont++;
//					System.out.println(cont);
//				}
//				i++;
//				cont=0;
//			} //while i
//			if (cont==2) {
//				System.out.println(j+" es primo");
//			} else {
//				System.out.println(j+" es compuesto");
//			}
//			j++;
//		} //while i2
		
		//System.out.println("hay "+primos+" numero primos");
		t.close();
	}

}

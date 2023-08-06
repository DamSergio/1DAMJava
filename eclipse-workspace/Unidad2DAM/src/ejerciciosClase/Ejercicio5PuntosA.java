package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio5PuntosA {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, suma=0, mayor=0;
		
		for (int i=0; i<10; i++) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n%3==0 && n>6) {
				suma+=n;
				if (n>mayor) {
					mayor=n;
				}
			}
		}
		System.out.println("la suma es "+suma);
		System.out.println("el mayor es "+mayor);
		t.close();
	}

}

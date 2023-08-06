package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio5PuntosD {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, suma=0, menor=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		menor=n;
		if (n%3==0 && n<18) {
			suma+=n;
		}
		for (int i=0; i<10; i++) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n%3==0 && n<18) {
				suma+=n;
				if (n<menor) {
					menor=n;
				}
			}
		}
		System.out.println("la suma es "+suma);
		System.out.println("el menor es "+menor);
		t.close();

	}

}

package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio5PuntosC {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cont=0, menor=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		menor=n;
		if (n%2==1 && n<20) {
			cont++;
		}
		for (int i=0; i<11; i++) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n%2==1 && n<20) {
				cont++;
				if (n<menor) {
					menor=n;
				}
			}
		}
		System.out.println(cont);
		System.out.println("el menor es "+menor);
		t.close();

	}

}

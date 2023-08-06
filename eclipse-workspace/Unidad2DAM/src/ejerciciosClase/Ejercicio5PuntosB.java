package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio5PuntosB {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cont=0, m=0;
		
		for (int i=0; i<8; i++) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n%5==0 && n>10) {
				cont++;
				if (n>m) {
					m=n;
				}
			}
		}
		System.out.println("El numero de digitos mayores de 10 y multiplos de 5 es "+cont);
		System.out.println("de estos, el mayor es: "+m);
		
		t.close();

	}

}

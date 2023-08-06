package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio10V3 {

	public static void main(String[] args) {

		//Variables
		
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0, n3=0, aux=0;
		
		//procesos
		
		System.out.println("dame un numero");
		n1=teclado.nextInt();
		System.out.println("dame otro numero");
		n2=teclado.nextInt();
		System.out.println("dame otro numero");
		n3=teclado.nextInt();
		
		if (n1<n2) {
			aux=n1;
			n1=n2;
			n2=aux;
		}
		if (n2<n3) {
			aux=n2;
			n2=n3;
			n3=aux;
		}
		if (n1<n2) {
			aux=n1;
			n1=n2;
			n2=aux;
		}
		
		System.out.println(n1+" "+n2+" "+n3);
		
		teclado.close();

	}

}

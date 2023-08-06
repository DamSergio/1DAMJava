package ejerciciosClase;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, n1=0, cont=0, impares=0;
		
		System.out.println("Dame un numero");
		n1=t.nextInt();
		if (n1%2==0) {
			cont++;
		}
		if (n1%2==1 && n1<10) {
			impares+=n1;
		}
		while (n!=2 && n1!=2) {
			System.out.println("dame otro numero");
			n=t.nextInt();
			if (n%2==0) {
				cont++;
			}
			if (n%2==1 && n<10){
				impares+=n;
			}
		}
		if (n1%2==0) {
			System.out.println("Has introducido "+cont+" numero pares");
		} else {
			System.out.println("La suma de los impares menores de 10 es: "+impares);
		}
		t.close();
	}

}

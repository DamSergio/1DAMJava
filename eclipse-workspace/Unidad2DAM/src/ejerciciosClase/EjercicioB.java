package ejerciciosClase;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=1, n1=0, cont=0, pares=0;
		
		System.out.println("Dame un numero");
		n1=t.nextInt();
		
		if (n1>=2) {
			if (n1%2==1) {
				cont++;
			}
		}
		
		while (n1!=0 && n!=0) {
			System.out.println("dame otro numero");
			n=t.nextInt();
			if (n%2==1) {
				cont++;
			}
			if (n%2==0 && n>5) {
				pares+=n;
			}
		}
		
		if (n1>=2) {
			System.out.println("el numero de impares es: "+cont);
		} else {
			System.out.println("la suma de numeros pares mayores a 5 es: "+pares);
		}
		
		t.close();

	}

}

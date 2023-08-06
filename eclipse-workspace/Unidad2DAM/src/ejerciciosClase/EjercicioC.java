package ejerciciosClase;

import java.util.Scanner;

public class EjercicioC {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, n1=0, cont=0, suma=0;
		
		System.out.println("Dame un numero");
		n1=t.nextInt();
		
		while (n1!=3 && n!=3) {
			System.out.println("dame otro numero");
			n=t.nextInt();
			if (n%2==0) {
				cont++;
			}
			if (n%2==1 && n>3) {
				suma+=n;
			}
		}
		if (n1%2==0) {
			System.out.println("La suma de los impares mayores que 3 es: "+suma);
		} else {
			System.out.println("La cantidad de numeros pares que has introducido es: "+cont);
		}
		t.close();
	}

}

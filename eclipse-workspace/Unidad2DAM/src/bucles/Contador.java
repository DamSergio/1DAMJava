package bucles;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		//pedir numeros al usuario mientras que nos de numeros >0
		Scanner teclado=new Scanner(System.in);
		int cont=0, n=0;
		
		while (n>=0) {
			cont++;
			System.out.println("dame un numero");
			n=teclado.nextInt();
		}
		System.out.println("has introducido "+cont+" numeros");
		teclado.close();
	}

}

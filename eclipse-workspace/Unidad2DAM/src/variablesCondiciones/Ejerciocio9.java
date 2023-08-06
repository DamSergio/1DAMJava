package variablesCondiciones;

import java.util.Scanner;

public class Ejerciocio9 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0;
		
		//Procesos
		
		System.out.println("Dame un numero");
		n1=teclado.nextInt();
		
		System.out.println("Dame otro numero");
		n2=teclado.nextInt();
		
		if (n1>n2) {
			System.out.println(n2+", "+n1);
		} else {
			System.out.println(n1+", "+n2);
		}
		
		teclado.close();
	}

}

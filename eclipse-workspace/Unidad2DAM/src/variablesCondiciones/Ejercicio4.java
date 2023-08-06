package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declarar variable
		
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0;
		
		//Procesamiento
		
		System.out.println("Dime un numero");
		n1=teclado.nextInt();
		System.out.println("Dime otro numero");
		n2=teclado.nextInt();
		
		if (n1==n2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		teclado.close();
	}

}

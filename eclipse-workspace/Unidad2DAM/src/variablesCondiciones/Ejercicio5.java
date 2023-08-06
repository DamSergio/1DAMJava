package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		
		Scanner teclado=new Scanner(System.in);
		int n1=0;
		
		//Procesos
		
		System.out.println("Dime un numero");
		n1=teclado.nextInt();
		
		if (n1==0) {
			System.out.println("El numero es 0");
		} else {
			if (n1>0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
		}
		
		teclado.close();
	}

}

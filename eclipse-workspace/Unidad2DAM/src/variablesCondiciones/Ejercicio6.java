package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0;
		
		//Procesos
		
		System.out.println("Dime un numero");
		n1=teclado.nextInt();
		
		System.out.println("Dime otro numero");
		n2=teclado.nextInt();
		
//		if (n1>n2) {
//			if (n1%n2==0) {
//				System.out.println("Son multiplos");
//			} else {
//				System.out.println("No son multiplos");
//			}
//		} else {
//			if (n2%n1==0 ) {
//				System.out.println("Son multiplos");
//			} else {
//				System.out.println("No son multiplos");
//			}
//		}
		
		if (n1%n2==0 || n2%n1==0) {
			System.out.println("Son multiplos");
		} else {
			System.out.println("No son multiplos");
		}
		
		teclado.close();
	}

}

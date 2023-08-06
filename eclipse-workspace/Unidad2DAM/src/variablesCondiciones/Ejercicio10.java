package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Variables
		
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0, n3=0;
		
		//Procesos
		
		System.out.println("dame un numero");
		n1=teclado.nextInt();
		System.out.println("dame otro numero");
		n2=teclado.nextInt();
		System.out.println("dame otro numero");
		n3=teclado.nextInt();
		
		if (n1>n2 && n1>n3) {
			if (n2>n3) {
				System.out.println(n1+", "+n2+", "+n3);
			} else {
				System.out.println(n1+", "+n3+", "+n2);
			}
		} else {
			if (n2>n1 && n2>n3) {
				if (n1>n3) {
					System.out.println(n2+", "+n1+", "+n3);
				} else {
					System.out.println(n2+", "+n3+", "+n1);
				} 
			} else {
				if (n1>n2) {
					System.out.println(n3+", "+n1+", "+n2);
				} else {
					System.out.println(n3+", "+n2+", "+n1);
				}
			}
		} 
		
		teclado.close();
	}

}

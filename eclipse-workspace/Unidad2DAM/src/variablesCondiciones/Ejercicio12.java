package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//variables
		
		Scanner teclado=new Scanner(System.in);
		int nota=0;
		
		//procesos
		
		System.out.println("Dime tu nota");
		nota=teclado.nextInt();
		
		if (nota>=0 && nota<=4) {
			System.out.println("suspenso");
		} else {
			if (nota==5) {
				System.out.println("aprovado");
			} else {
				if (nota==6) {
					System.out.println("bien");
				} else {
					if (nota>=7 && nota<=8) {
						System.out.println("notable");
					} else {
						System.out.println("sobresaliente");
					}
				}
			}
		}
		
		teclado.close();
	}

}

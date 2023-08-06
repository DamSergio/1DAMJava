package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio12v2 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int nota=0;
		
		System.out.println("Dime tu nota");
		nota=teclado.nextInt();
		
		switch (nota) {
			case 0,1,2,3,4: System.out.println("suspenso"); break;
			case 5: System.out.println("aprovado"); break;
			case 6: System.out.println("bien"); break;
			case 7,8: System.out.println("notable"); break;
			case 9,10: System.out.println("sobresaliente"); break;
			default: System.out.println("la nota debe ser entre 0 y 10");
		}
		teclado.close();
	}

}

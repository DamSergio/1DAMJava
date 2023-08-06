package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio13v2 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int dia=0;
		
		System.out.println("Dame el numero del dia de la semana");
		dia=teclado.nextInt();
		
		switch (dia) {
			case 1: System.out.println("lunes"); break;
			case 2: System.out.println("martes"); break;
			case 3: System.out.println("miercoles"); break;
			case 4: System.out.println("jueves"); break;
			case 5: System.out.println("viernes"); break;
			case 6: System.out.println("sabado"); break;
			case 7: System.out.println("domingo"); break;
			default: System.out.println("el numero debe ser entre 1 y 7");
		}
		teclado.close();
	}

}

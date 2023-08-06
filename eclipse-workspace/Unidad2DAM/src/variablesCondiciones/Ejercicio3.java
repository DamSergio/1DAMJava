package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		
		Scanner teclado=new Scanner(System.in);
		float radio=0.0f, dia=0.0f, lon=0.0f;
		
		//Procesos
		
		System.out.println("Dime el radio");
		radio=teclado.nextFloat();
		
		dia=radio*radio;
		lon=(float) (Math.PI*dia);
		
		System.out.println("La longitud es "+lon);
		
		teclado.close();
	}

}

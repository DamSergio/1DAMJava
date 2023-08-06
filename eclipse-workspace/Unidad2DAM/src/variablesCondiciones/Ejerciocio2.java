package variablesCondiciones;

import java.util.Scanner;

public class Ejerciocio2 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		
		Scanner teclado=new Scanner(System.in);
		float radio=0.0f;
		float area=0.0f;
		
		//Procesos
		
		System.out.println("Dime el radio del circulo");
		radio=teclado.nextFloat();
		//area=(float) (Math.PI*radio*radio);
		area=(float) (Math.PI*Math.pow(radio, 2));
		
		//Resultado
		
		System.out.println("El area es "+area);
		
		teclado.close();
	}
	
}

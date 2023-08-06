package variablesCondiciones;

import java.util.Scanner;

public class IntercambioDeVariables {

	public static void main(String[] args) {
		
		//variables
		
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0, aux=0;
		
		//procesos
		
		System.out.println("valor de x");
		x=teclado.nextInt();
		
		System.out.println("valor de y");
		y=teclado.nextInt();
		
		//intercambio
		
		aux=x;
		x=y;
		y=aux;
		
		System.out.println("intercambio los valores");
		System.out.println("valor de x: "+x);
		System.out.println("valor de y: "+y);
		
		teclado.close();
	}

}

package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//variable
		
		Scanner teclado=new Scanner(System.in);
		String n="";
		
		//procesos
		
		System.out.println("dame un numero");
		n=teclado.next();
		
		System.out.println("tiene "+n.length()+" cifras");
		
		teclado.close();
	}

}

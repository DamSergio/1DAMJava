package actividades;

import java.util.Scanner;

public class EjerciciosStrings {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String cadena=t.next();
		
		if (esPal(cadena)) {
			System.out.println("es un palindromo");
		} else {
			System.out.println("no es un palindromo");
		}
		
		t.close();
	}
	private static String alReves (String cadena) {
		String cadena2="";
		for (int i=cadena.length()-1; i>=0; i--) {
			//System.out.println(cadena.charAt(i));
			cadena2+=cadena.charAt(i);
		}
		return cadena2;
	}
	private static boolean esPal (String cadena) {
		return cadena.equals(alReves(cadena));
	}
}

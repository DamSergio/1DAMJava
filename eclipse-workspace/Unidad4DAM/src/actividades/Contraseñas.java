package actividades;

import java.util.Scanner;

public class Contraseñas {
	// UNA CONTRASEÑA E SSEGURA SI TIENE AL MENOS 8 CARACTERES UNA MAYUSCULA UN NUMERO Y UN "_" (BARRA BAJA)
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String cad;
		
		do {
			System.out.println("contraseña: ");
			cad=t.next();
		} while (!pass(cad));
		System.out.println("done");
		t.close();
	}
	private static boolean pass (String cad) {
		if (cad.length()>=8 && may(cad) && bar(cad)) {
			return true;
		} else {
			return false;
		}
	}
	private static boolean may (String cad) {
		for (int i=0; i<cad.length(); i++) {
			if (Character.isUpperCase(cad.charAt(i))) {
				return true;
			} 
		}
		return false;
	}
	private static boolean bar (String cad) {
		String letra="";
		for (int i=0; i<cad.length(); i++) {
			letra+=cad.charAt(i);
			if (letra.equals("_")) {
				return true;
			}
			letra="";
		}
		return false;
	}
}

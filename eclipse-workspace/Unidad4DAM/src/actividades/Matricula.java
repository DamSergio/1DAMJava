package actividades;

import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String cadena=t.next();
		
		if (mat(cadena)) {
			System.out.println("es una matricula");
		} else {
			System.out.println("no es una matricula");
		}
		t.close();
	}
	private static boolean mat (String cadena) {
		String letra="";
		String numero="";
		if (cadena.length()==7) {
			numero=cadena.substring(0,4);
			for (int i=0; i<numero.length(); i++) {
				if (!Character.isDigit(numero.charAt(i))) {
					return false;
				}
			}
			letra=cadena.substring(4, 7);
			for (int i=0; i<letra.length(); i++) {
				if (!Character.isUpperCase(letra.charAt(i))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}

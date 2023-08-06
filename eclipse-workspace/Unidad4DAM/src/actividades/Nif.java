package actividades;

import java.util.Scanner;

public class Nif {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String cadena=t.next();
		
		if (esDNI(cadena)) {
			System.out.println("es un DNI");
		} else {
			System.out.println("no es un DNI");
		}
		t.close();
	}
	private static boolean esDNI (String cadena) {
		String numero="";
		if (cadena.length()==9) {
			numero=cadena.substring(0, 8);
			for (int i=0; i<numero.length(); i++) {
				if(!Character.isDigit(numero.charAt(i))) {
					return false;
				}
			}
			if (!Character.isUpperCase(cadena.charAt(8))) {
				return false;
			}
			return true;
		} else  {
			return false;
		}
	}
}

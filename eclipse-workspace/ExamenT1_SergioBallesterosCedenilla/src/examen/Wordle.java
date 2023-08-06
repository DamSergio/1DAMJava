package examen;

import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String palabras[]= {
			"PLATO","PISAR","PLANO","MAREO","LISTA","LISTO",
			"SUCIO","PERRO","MIXTO","BULTO","CASTO","PRADO",
			"MOSCA","PISTO","TURCO","BRAVO","VISTO","QUESO",
			"GUISO","USADO"
		};
		String pUsuario="";
		String pAdivina="";
		int intentos=6;
		String pSecreta=pRandom(palabras);
		System.out.println(pSecreta);
		
		do {
			do {
				System.out.println("Dime una palabra de 5 letras MAYUSCULAS");
				pUsuario=t.next();
			} while (!correcto(pUsuario));
			pAdivina="";
			for (int i=0; i<pUsuario.length(); i++) {
				if(pUsuario.charAt(i)==pSecreta.charAt(i)) {
					pAdivina+=pUsuario.charAt(i);
				} else {
					pAdivina+="_";
				}
			}
			System.out.println(pAdivina);
			intentos--;
		} while (!pSecreta.equals(pAdivina) && intentos>0);
		
		if(intentos>0) {
			System.out.println("La palabra es: "+pSecreta+" ¡¡Esplendido!!");
		} else {
			System.out.println("La palabra era "+pSecreta);
		}
		
		t.close();
	}

	private static boolean correcto(String pUsuario) {
		return pUsuario.matches("[A-Z]{5}");
	}

	private static String pRandom(String[] palabras) {
		int n=(int)(Math.random()*20);
		return palabras[n];
	}

}
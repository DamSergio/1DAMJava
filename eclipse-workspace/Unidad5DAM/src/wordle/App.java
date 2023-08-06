package wordle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		String palabras[]= {
				"PLATO","PISAR","PLANO","MAREO","LISTA","LISTO",
				"SUCIO","PERRO","MIXTO","BULTO","CASTO","PRADO",
				"MOSCA","PISTO","TURCO","BRAVO","VISTO","QUESO",
				"GUISO","USADO"
		};
		int posicion=(int)(Math.random()*20);
		int intentos=6;
		
		String adivina="";
		Palabra secreta=new Palabra(palabras[posicion]);
		String p="";
		Palabra usuario=new Palabra(p);
		System.out.println(secreta);
		
		do {
			do {
				System.out.println("Dame una palabra de 5 letras mayusculas");
				p=t.next();
				usuario.setCadena(p);
			} while (!usuario.correcta());
			adivina=secreta.comparar(usuario);
			System.out.println(adivina);
			intentos--;
		} while (intentos>0 && !secreta.equals(usuario));
		
		if(secreta.equals(usuario)) {
			System.out.println("La palabra es: "+secreta+" ¡¡Esplendido!!");
		} else {
			System.out.println("La palabra era "+secreta);
		}
		
		t.close();
	}

}

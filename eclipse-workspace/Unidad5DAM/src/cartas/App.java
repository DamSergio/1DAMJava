package cartas;

import java.util.Scanner;

public class App {

	//MAYOR O MENOR
	
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		Jugador j1=new Jugador("sergio");
		String op="";
		int score=0, nCarta=0;
		boolean acierta=false;
		
		j1.extraerCarta();
		System.out.println(j1.getCarta());
		
		do {
			nCarta=j1.getCarta().getNumero();
			System.out.println("La siguiente carta es mayor o menor");
			do {
				op=t.next();
			} while (comp(op));
			j1.extraerCarta();
			System.out.println(j1.getCarta());
			if (acierta(op, j1.getCarta(), nCarta)) {
				System.out.println("Has acertado");
				score++;
				acierta=true;
			} else {
				System.out.println("Fallastes");
				acierta=false;
			}
			System.out.println();
		} while (acierta);
		
		System.out.println("Tu puntuacion es: "+score);
		
		t.close();
	}

	private static boolean acierta(String op, Carta carta, int nCarta) {
		if (op.equalsIgnoreCase("mayor")) {
			if (carta.getNumero()>=nCarta) {
				return true;
			}
			return false;
		}
		if (op.equalsIgnoreCase("menor")) {
			if (carta.getNumero()<=nCarta) {
				return true;
			}
			return false;
		}
		return false;
	}

	private static boolean comp(String op) {
		if (op.equalsIgnoreCase("menor") || op.equalsIgnoreCase("mayor")) {
			return false;
		}
		System.out.println("Opcion no valida");
		return true;
	}

}

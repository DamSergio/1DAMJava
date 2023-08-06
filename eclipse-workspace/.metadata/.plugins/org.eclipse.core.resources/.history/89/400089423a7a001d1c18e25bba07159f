package bingo;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String nombre;
		int cont=0;
		int numeros[]=new int[20];
		//Preguntar nombres
		System.out.println("Dime el nombre del P1");
		nombre=t.next();
		Jugador p1=new Jugador(nombre);
		System.out.println("Dime el nombre del P2");
		nombre=t.next();
		//Imprimir jugadores
		Jugador p2=new Jugador(nombre);
		System.out.println("\n------------------------------------------------------------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("------------------------------------------------------------\n");
		//Juego
		do {
			int n;
			do {
				n=(int)(1+Math.random()*20);
			} while (valido(n, numeros, cont));
			numeros[cont]=n;
			cont++;
			System.out.println("ha salido el numero "+n);
			if (bola(p1.getBoleto(), n)) {
				System.out.println("El numeros esta en el boleto de "+p1.getNick());
				System.out.println(p1.getNick()+" "+Arrays.toString(p1.getBoleto()));
			}
			if (bola(p2.getBoleto(), n)) {
				System.out.println("El numeros esta en el boleto de "+p2.getNick());
				System.out.println(p2.getNick()+" "+Arrays.toString(p2.getBoleto()));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (comp(p1.getBoleto()) && comp(p2.getBoleto()));
		//Comprobar quien gana
		if (!comp(p1.getBoleto())) {
			System.out.println(p1.getNombre()+" Gana!");
		}
		if (!comp(p2.getBoleto())) {
			System.out.println(p2.getNombre()+" Gana!");
		}
		t.close();
	}

	private static boolean bola(int[] boleto, int n) {
		for (int i=0; i<boleto.length; i++) {
			if (boleto[i]==n) {
				boleto[i]=0;
				return true;
			}
		}
		return false;
	}

	private static boolean valido(int n, int[] numeros, int cont) {
		for (int i=0; i<=cont; i++) {
			if (numeros[i]==n) {
				return true;
			}
		}
		return false;
	}

	private static boolean comp(int[] boleto) {
		for (int i=0; i<boleto.length; i++) {
			if (boleto[i]!=0) {
				return true;
			}
		}
		return false;
	}

}

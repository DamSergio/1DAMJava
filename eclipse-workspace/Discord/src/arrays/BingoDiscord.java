package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BingoDiscord {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String p1="";
		String p2="";
		int b1[]=new int[5];
		int b2[]=new int[5];
		int numeros[]=new int[20];
		int cont=0;
		//Pido los nombres
		System.out.println("Dame el nombre del Jugador1");
		p1=t.next();
		System.out.println("Dame el nombre del Jugador2");
		p2=t.next();
		//Relleno los boletos
		getBoleto(b1);
		getBoleto(b2);
		//Relleno los Alias
		String alias1=getAlias(p1);
		String alias2=getAlias(p2);
		//Imprime los jugadores
		System.out.println("*********************************************************************************");
		imprimeJugador(p1, alias1, b1);
		imprimeJugador(p2, alias2, b2);
		System.out.println("*********************************************************************************");
		
		do {
			int n;
			do {
				n=(int)(1+Math.random()*20);
			} while (valido(n, numeros, cont));
			numeros[cont]=n;
			cont++;
			System.out.println("Ha salido el numero "+n);
			if (bola(b1, n)) {
				System.out.println("El numeros esta en el boleto de "+alias1);
				System.out.println(alias1+" "+Arrays.toString(b1));
			}
			if (bola(b2, n)) {
				System.out.println("El numeros esta en el boleto de "+alias2);
				System.out.println(alias2+" "+Arrays.toString(b2));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (comp(b1) && comp(b2));
		
		if (!comp(b1)) {
			System.out.println(p1+" Gana!");
		}
		if (!comp(b2)) {
			System.out.println(p2+" Gana!");
		}
		
		t.close();
	}

	private static boolean bola(int[] b, int n) {
		for (int i=0; i<b.length; i++) {
			if (b[i]==n) {
				b[i]=0;
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

	private static boolean comp(int[] b) {
		for (int i=0; i<b.length; i++) {
			if (b[i]!=0) {
				return true;
			}
		}
		return false;
	}

	private static void imprimeJugador(String p, String alias, int[] b) {
		System.out.println("El jugador "+p+" con alias "+alias+" tiene el boleto "+Arrays.toString(b));
		
	}

	private static String getAlias(String p) {
		int n=(int)(Math.random()*101);
		if (p.length()<3) {
			return "J"+p+n;
		}
		return "J"+p.substring(0,3)+n;
	}

	private static void getBoleto(int[] b) {
		int n;
		for (int i=0; i<b.length; i++) {
			do {
				n=(int)(1+Math.random()*20);
			} while (correcto(b, n, i));
			b[i]=n;
		}
		
	}

	private static boolean correcto(int[] b, int n, int j) {
		for (int i=0; i<=j; i++) {
			if (n==b[i]) {
				return true;
			}
		}
		return false;
	}

}

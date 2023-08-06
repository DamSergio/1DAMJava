package actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String []players=new String[2];
		String []alias=new String[2];
		int boleto1[]=new int[5];
		int boleto2[]=new int[5];
		int numeros[]=new int[20];
		int ganador1=5, ganador2=5, cont=0;
		
		for (int i=0; i<players.length; i++) {
			System.out.println("Dime tu nombre");
			players[i]=t.next();
		}
		getAlias(players, alias);
		getBoleto(boleto1);
		getBoleto(boleto2);
		imprimejugador(players, alias, boleto1, boleto2);
		
		do {
			int n;
			do {
				n=(int)(1+Math.random()*20);
			} while (!valido(n, numeros));
			numeros[cont]=n;
			System.out.println("Sale el numero: "+n);
			for (int i=0; i<boleto1.length; i++) {
				if (boleto1[i]==n) {
					boleto1[i]=0;
					ganador1--;
					System.out.println("El boleto esta en el boleto de "+alias[0]);
					System.out.println(alias[0]+" "+Arrays.toString(boleto1));
				}
			}
			for (int i=0; i<boleto2.length; i++) {
				if (boleto2[i]==n) {
					boleto2[i]=0;
					ganador2--;
					System.out.println("El boleto esta en el boleto de "+alias[1]);
					System.out.println(alias[1]+" "+Arrays.toString(boleto2));
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cont++;
		} while (ganador1!=0 && ganador2!=0);
		
		if(ganador1==0) {
			System.out.println(players[0]+" GANA!!!");
		}
		if(ganador2==0) {
			System.out.println(players[1]+" GANA!!!");
		}
		t.close();
	}
	private static boolean valido(int n, int[] numeros) {
		for (int i=0; i<numeros.length; i++) {
			if(numeros[i]==n) {
				return false;
			}
		}
		return true;
	}
	private static void getBoleto(int[] boleto) {
		for(int i=0; i<boleto.length; i++) {
			boolean correcto=false;
			while(!correcto) {
				int n=(int)(1+Math.random()*20);
				correcto=correcto(n, boleto, i);
				if (correcto) {
					boleto[i]=n;
				}
			}
		}
		
	}
	private static boolean correcto(int n, int[] boleto, int j) {
		for(int i=0; i<=j; i++) {
			if(n==boleto[i]) {
				return false;
			}
		}
		return true;
	}

	private static void imprimejugador(String[] players, String[] alias, int[] boleto1, int[] boleto2) {
		System.out.println("Los jugadores son:");
		System.out.println("*************************************************");
		System.out.println("El jugador "+players[0]+" con alias "+alias[0]+" tiene el boleto "+Arrays.toString(boleto1));
		System.out.println("El jugador "+players[1]+" con alias "+alias[1]+" tiene el boleto"+Arrays.toString(boleto2));
		System.out.println("*************************************************");
	}

	private static void getAlias(String[] players, String[] alias) {
		
		for (int i=0; i<players.length; i++) {
			int n=(int)(Math.random()*100);
			String letras="";
			String nom=players[i];
			alias[i]="j";
			for(int j=0; j<3; j++) {
				letras+=nom.charAt(j);
			}
			alias[i]+=letras;
			alias[i]+=n;
		}
	}
}

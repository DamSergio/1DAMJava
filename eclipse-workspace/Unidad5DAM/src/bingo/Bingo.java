package bingo;

import java.util.Scanner;

public class Bingo {
	
	public int numeros[];
	public int cont;
	
	public Bingo() {
		this.numeros=new int[20];
		this.cont=0;
	}

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String nombre;
		int n;
		Bingo bingo=new Bingo();
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
			do {
				n=(int)(1+Math.random()*20);
			} while (!bingo.valido(n));
			System.out.println("ha salido el numero "+n);
			p1.comparar(n);
			p2.comparar(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (p1.gana() && p2.gana());
		//Comprobar quien gana
		if (!p1.gana()) {
			System.out.println(p1.getNombre()+" Gana!");
		}
		if (!p2.gana()) {
			System.out.println(p2.getNombre()+" Gana!");
		}
		t.close();
	}

	private boolean valido(int n) {
		for (int i=0; i<=this.cont; i++) {
			if (this.numeros[i]==n) {
				return false;
			}
		}
		this.numeros[cont]=n;
		this.cont++;
		return true;
	}

}

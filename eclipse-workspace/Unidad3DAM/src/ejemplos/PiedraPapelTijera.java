package ejemplos;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		int secreto=0;
		
		do {
			menu(); //imprime menu
			opcion=teclado.nextInt(); //pido la opcion
			
			secreto=(int)(1+Math.random()*3); //numero aleatorio entre 1 y 3
			juegaPC(secreto);
			
			juego(opcion, secreto);
		} while (opcion!=4);
		teclado.close();
	}
	public static void menu () { //menu
		System.out.println("1. Piedra");
		System.out.println("2. Papel");
		System.out.println("3. Tijera");
		System.out.println("4. Salir");
		System.out.println("Elige una opción: ");
	}
	public static void juegaPC(int n) {
		switch(n) {
		case 1: System.out.println("\t Piedra");
				break;
		case 2: 
				System.out.println("\t Papel");
				break;
		case 3: 
				System.out.println("\t Tijera");
				break;
					
		}
	}
	public static void juego(int opcion, int secreto) {
		if(opcion==secreto)
			System.out.println("Empate!!!");
		
		else {
			//Piedra
			if(opcion==1) {
			
				if(secreto==2)
					System.out.println("He ganado!");
				if(secreto==3) 
					System.out.println("Has ganado! :(");
			}
			//Papel
			if(opcion==2) {
				
				if(secreto==1)
					System.out.println("Has ganado!:(");
				if(secreto==3) 
					System.out.println("He ganado! :)");
			}
			//Tijera
			if(opcion==3) {
				
				if(secreto==1)
					System.out.println("He ganado!:(");
				if(secreto==2) 
					System.out.println("Has ganado! :)");
			}
		
		}//else
	}

}

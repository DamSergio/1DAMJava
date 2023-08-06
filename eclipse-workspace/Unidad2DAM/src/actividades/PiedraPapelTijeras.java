package actividades;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		
		while (n!=4) {
			int secreto=(int)(1+Math.random()*3);
			System.out.println(secreto);
			System.out.println("Elige Piedra(1), Papel(2), Tijeras(3), Salir(4)");
			n=t.nextInt();
			
			switch (n) {
				case 1:
					if (secreto==1) {
						System.out.println("Empate");
					}
					if (secreto==2) {
						System.out.println("Pierdes");
					}
					if (secreto==3) {
						System.out.println("Ganas");
					}
					break;
				case 2:
					if (secreto==1) {
						System.out.println("Ganas");
					}
					if (secreto==2) {
						System.out.println("Empate");
					}
					if (secreto==3) {
						System.out.println("Pierdes");
					}
					break;
				case 3:
					if (secreto==1) {
						System.out.println("Pierdes");
					}
					if (secreto==2) {
						System.out.println("Ganas");
					}
					if (secreto==3) {
						System.out.println("Empate");
					}
					break;
				case 4: 
					System.out.println("salir");
					break;
				default: System.out.println("no me sirve");
			}
		}
		t.close();
	}

}

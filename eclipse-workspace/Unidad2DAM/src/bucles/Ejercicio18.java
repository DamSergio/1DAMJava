package bucles;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		
		int n=0, arriba=1, lados=2, abajo=1, interior=2, cont=2;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		if (n==1) {
			System.out.println("*");
		}
		while (abajo<n) {
			while (arriba<n) {
				System.out.print("*");
				arriba++;
			}
			while (lados<=n) {
				lados++;
				System.out.println("*");
				System.out.print("*");
				while (interior<n) {
					if (cont<n) {
						System.out.print(" ");
					}
					interior++;
				}
				interior=2;
				cont++;
			}
			while (abajo<n) {
				System.out.print("*");
				abajo++;
			}
			abajo++;
		}
		t.close();
	}

}

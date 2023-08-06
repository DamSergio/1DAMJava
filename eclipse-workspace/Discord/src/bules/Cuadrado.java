package bules;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);

		System.out.println("Dime un numero");
		int n=t.nextInt();
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		t.close();
	}

}

package bules;

import java.util.Scanner;

public class CuadradoVacio {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=t.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("* ");
		}
		System.out.println("");
		for (int i=0; i<n-2; i++) {
			System.out.print("* ");
			for(int j=0; j<n-2; j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		if (n!=1) {
			for (int i=0; i<n; i++) {
				System.out.print("* ");
			}
		}
		t.close();
	}

}

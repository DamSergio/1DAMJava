package buclesVariables;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		
		System.out.println("Dame un numero");
		n=t.nextInt();
		
		for (int i=0; i<n; i++) {
			//System.out.print("*");
			System.out.println();
			for (int j=0; j<n; j++) {
				System.out.print("* ");
			}
		}
	t.close();

	}

}

package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=1;
		
		while (n!=0) {
			System.out.println("Dame un numero");
			n=t.nextInt();
			if (n!=0) {
				if (n>0) {
					System.out.println("es positivo");
				} else {
					System.out.println("es negativo");
				}
			}
		}
		System.out.println("fin");
		t.close();
	}

}

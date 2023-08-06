package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=1;
		
		while (n!=0) {
			System.out.println("Dame un numero");
			n=t.nextInt();
			if (n!=0) {
				if (n%2==0) {
					System.out.println(n+" es par");
				} else {
					System.out.println(n+" es impar");
				}
			}
		}
		System.out.println("fin");
		t.close();

	}

}

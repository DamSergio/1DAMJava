package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=1, suma=0;
		
		while (n!=0) {
			System.out.println("dame un numero");
			n=t.nextInt();
			suma+=n;
		}
		System.out.println(suma);
		t.close();
	}

}

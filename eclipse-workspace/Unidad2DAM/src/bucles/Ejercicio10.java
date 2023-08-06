package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, suma=0, i=15;
		
		while (i>0) {
			System.out.println("dame un numero");
			n=t.nextInt();
			suma+=n;
			i--;
		}
		System.out.println("la suma de todo es: "+suma);
		t.close();
	}

}

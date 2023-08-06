package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		
		while (n>=0) {
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n>=0) //para evitar el cuadrado de un negativo
				System.out.println("su cuadrado es "+n*n);
		}
		System.out.println("FIN");
		t.close();
	}

}

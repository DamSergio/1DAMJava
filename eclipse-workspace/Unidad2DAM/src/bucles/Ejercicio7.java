package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cont=0;
		float media=0.0f, suma=0.0f;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		while (n>=0) {
			cont++;
			suma+=n;
			System.out.println("dame un numero");
			n=t.nextInt();
		}
		media=suma/cont;
		System.out.println(media);
		t.close();
	}

}

package bucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int i=5, n=0, cont=0;
		
		while (i>0) {
			System.out.println("dame un numero");
			n=t.nextInt();
			i--;
			if (n%3==0) {
				cont++;
			}
		}
		System.out.println(cont+" numeros han sido multiplos de 3");
		t.close();
	}

}

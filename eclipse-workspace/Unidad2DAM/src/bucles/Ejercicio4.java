package bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cont=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		while (n>=0) {
			cont++;
			System.out.println("dame un numero");
			n=t.nextInt();
		}
		System.out.println(cont);
		t.close();


	}

}

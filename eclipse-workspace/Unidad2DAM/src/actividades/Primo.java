package actividades;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, i=1, cont=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		
		while (i<=n) {
			if (n%i==0) {
				System.out.println(i+" es dividor de "+n);
				cont++;
			}
			i++;
		}
		System.out.println("el contador vale "+cont);
		if (cont==2) {
			System.out.println("es primo");
		} else {
			System.out.println("es compuesto");
		}
		t.close();
	}

}

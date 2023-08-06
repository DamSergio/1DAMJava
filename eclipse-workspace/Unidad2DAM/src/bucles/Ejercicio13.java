package bucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int i=10, n=0, suma=0, cont=0;
		
		while (i>0) {
			System.out.println("dime tu sueldo");
			n=t.nextInt();
			if (n>1000) {
				cont++;
			}
			suma+=n;
			i--;
		}
		System.out.println("la suma total es: "+suma);
		System.out.println("la cantidad de sueldo mayores a 1000€ es: "+cont);
		t.close();
	}

}

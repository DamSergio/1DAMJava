package actividadesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n[]=new int[20];
		int cont=0;
		
		for (int i=0; i<n.length; i++) {
			n[i]=(int)(1+Math.random()*25);
		}
		System.out.println(Arrays.toString(n));
		System.out.println("\nDame un numero");
		int n2=t.nextInt();
		
		for (int i=0; i<n.length; i++) {
			if (n2==n[i]) {
				cont++;
				System.out.println("Aparece en la posicion: "+i);
			}
		}
		System.out.println("Aparece: "+cont+" veces");
		t.close();
	}

}

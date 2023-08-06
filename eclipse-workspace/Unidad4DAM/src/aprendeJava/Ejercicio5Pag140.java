package aprendeJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Pag140 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n[]=new int[10];
		
		for (int i=0; i<n.length; i++) {
			n[i]=t.nextInt();
		}
		
		Arrays.sort(n);
		System.out.println("El minimo es: "+n[0]);
		System.out.println("El maximo es: "+n[n.length-1]);
		
		t.close();
	}

}

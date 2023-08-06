package arrays;

import java.util.Arrays;

public class PasoParametros {

	public static void main(String[] args) {
		int a=3, b=6;
		
		System.out.println("a="+a+" b="+b);
		intercambio(a, b);
		System.out.println("a="+a+" b="+b);
		
		int n[]= {1,4,3,6,7};
		System.out.println(Arrays.toString(n));
		intercambio(n);
		System.out.println(Arrays.toString(n));
	}
	private static void intercambio (int a, int b) {
		int aux=a;
		a=b;
		b=aux;
	}
	private static void intercambio (int[] n) {
		int aux=n[0];
		n[0]=n[n.length-1];
		n[n.length-1]=aux;
	}
}

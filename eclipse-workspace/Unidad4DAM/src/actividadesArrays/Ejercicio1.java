package actividadesArrays;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n[]=new int[20];
		
		for (int i=0; i<n.length; i++) {
			n[i]=(int)(1+Math.random()*50);
			System.out.print(n[i]+" ");
		}
		System.out.println("");
		for (int i=n.length-1; i>=0; i--) {
			System.out.print(n[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(n));
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
	}

}

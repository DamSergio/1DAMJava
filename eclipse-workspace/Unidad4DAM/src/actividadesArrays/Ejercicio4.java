package actividadesArrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int b1[]=new int[5];
		
		for(int i=0; i<b1.length; i++) {
			boolean correcto=false;
			while(!correcto) {
				int n=(int)(1+Math.random()*54);
				correcto=correcto(n, b1, i);
				if (correcto) {
					b1[i]=n;
				}
			}
		}
		System.out.println(Arrays.toString(b1));
		int b2=(int)(Math.random()*9);
		System.out.println(b2);
		
	}
	private static boolean correcto (int n, int[] b1, int j) {
		for(int i=0; i<=j; i++) {
			if(n==b1[i]) {
				return false;
			}
		}
		return true;
	}
}

package aprendeJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6Pag140 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n[]=new int[15];
		int ult=0;
		
		for (int i=0; i<n.length; i++) {
			n[i]=t.nextInt();
		}
		ult=n[n.length-1];
		for(int i=n.length-1; i>0; i--) {
			n[i]=n[i-1];
		}
		n[0]=ult;
		System.out.println(Arrays.toString(n));
		
		t.close();
	}

}

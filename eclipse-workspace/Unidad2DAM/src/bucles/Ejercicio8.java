package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, i=1;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		while (i<=n) {
			System.out.print(i+" ");
			i++;
		}
		t.close();
	}

}

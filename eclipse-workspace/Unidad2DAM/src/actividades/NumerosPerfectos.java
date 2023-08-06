package actividades;

import java.util.Scanner;

public class NumerosPerfectos {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int suma=0, n=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
//		
//		for (int i=1; i<n; i++){
//			if (n%i==0) {
//				suma+=i;
//			}
//		}
//		
//		if (suma==n) {
//			System.out.println("es perfecto");
//		} else {
//			System.out.println("no es perfecto");
//		}
//		t.close();
		for (int i=1; i<=n; i++) {
			suma=0;
			for (int j=1; j<i; j++) {
				if (i%j==0) {
					suma+=j;
				}
			}
			if (suma==i) {
				System.out.println(i+" es perfecto");
			}
		}
		t.close();
	}

}

package actividades;

import java.util.Scanner;

public class EjercicioGoogle {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, original=0, vuelta=0, cont=0, comp=0;
		boolean pal=false, primo=false;
		
		System.out.println("dame un numero entre 1 y 1.000.000");
		n=t.nextInt();
		
//		original=n;
//		while (n>0) {
//			vuelta+=n%10;
//			vuelta*=10;
//			//System.out.println(cuenta);
//			//System.out.println(vuelta);
//			//vuelta+=cuenta;
//			n/=10;
//		}
//		
//		vuelta/=10;
//		System.out.println(vuelta);
//		
//		if (vuelta==original) {
//			System.out.println("es palindromo");
//			pal=true;
//		} else {
//			System.out.println("no es palindromo");
//		}
		
		for (int i=n; !pal && !primo && i<100000000; i++) {
			pal=false;
			primo=false;
			cont=0;
			//System.out.println(i+" i");
			for (int j=1; j<=i; j++) {
				//System.out.println(j+" j");
				if (i%j==0) {
					cont++;
				}
			}
//			System.out.println(cont);
			if (cont==2) {
				comp=i;
				original=i;
				vuelta=0;
				while (comp>0) {
					vuelta+=comp%10;
					vuelta*=10;
					//cuenta=comp/10;
					comp/=10;
				}
				vuelta/=10;
				if (vuelta==original) {
					pal=true;
					primo=true;
				}
			}
			System.out.println(i);
			//System.out.println(pal);
			//System.out.println(primo);
			
		}
		
		System.out.println(original);
		t.close();
		
	}

}

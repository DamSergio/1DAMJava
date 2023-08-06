package primos;

import java.util.Scanner;

public class ElMejorNumero {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=t.nextInt();
		
		if(reves(cuentaPrimos(reves(n)))==cuentaPrimos(n) && cifras(n)==cuentaPrimos(n)) {
			System.out.println("Es el mejor numero");
		} else {
			System.out.println("No es el mejor numero");
		}
		
		t.close();
	}
	
	private static int cifras (int n) {
		int mult=1;
		while (n>0) {
			mult*=n%10;
			n/=10;
		}
		return mult;
	}
	
	private static int reves(int n) {
		int resto=0;
		while (n>0) {
			resto+=n%10;
			resto*=10;
			n/=10;
		}
		resto/=10;
		return resto;
	}

	private static int cuentaPrimos(int n) {
		int cont=0, nPrimos=0;
		for (int i=1; i<=n; i++) {
			cont=0;
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					cont++;
				}
			}
			if (cont==2) {
				nPrimos++;
			}
		}
		return nPrimos;
	}

}

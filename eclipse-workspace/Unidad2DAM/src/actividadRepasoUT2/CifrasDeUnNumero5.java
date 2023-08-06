package actividadRepasoUT2;

import java.util.Scanner;

public class CifrasDeUnNumero5 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, bs=0, ms=0, comp=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		
		while (n>0) {
			comp=n%10;
			if (comp==3 || comp==7 || comp==8 || comp==9) {
				bs++;
			} else {
				ms++;
			}
			n/=10;
		}
		
		if (bs>=ms) {
			System.out.println("el numero es afortunado");
		} else {
			System.out.println("el numero es desafortunado");
		}
		t.close();
	}

}

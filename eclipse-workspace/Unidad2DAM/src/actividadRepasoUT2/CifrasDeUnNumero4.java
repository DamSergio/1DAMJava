package actividadRepasoUT2;

import java.util.Scanner;

public class CifrasDeUnNumero4 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, ud=0, cont=1, div=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		div=n/10;
		
		ud=n%10;
		while (n>10) {
			n/=10;
			cont*=10;
		}
		ud*=cont;
		ud+=div;
		System.out.println(ud);
		
		t.close();
	}

}

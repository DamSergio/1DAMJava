package bucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int i=10, n=0;
		boolean neg=false;
		
		while (i>0) {
			i--;
			System.out.println("dame un numero");
			n=t.nextInt();
			if (n<0)
				neg=true;
		}
		if (neg) 
			System.out.println("pusistes algun numero negativo");
		else 
			System.out.println("no pusistes numeros negativos");
		
		
		t.close();
	}

}

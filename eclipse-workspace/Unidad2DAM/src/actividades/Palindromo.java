package actividades;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, original=0, vuelta=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		
		original=n;
		while (n>0) {
			vuelta+=n%10;
			vuelta*=10;
			//System.out.println(cuenta);
			//System.out.println(vuelta);
			//vuelta+=cuenta;
			n/=10;
		}
		
		vuelta/=10;
		System.out.println(vuelta);
		
		if (vuelta==original) {
			System.out.println("es palindromo");
		} else {
			System.out.println("no es palindromo");
		}
		t.close();
	}

}

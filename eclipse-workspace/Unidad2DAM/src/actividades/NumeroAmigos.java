package actividades;

import java.util.Scanner;

public class NumeroAmigos {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0, suma1=0, suma2=0;
		
		System.out.println("Dame un numero");
		n1=t.nextInt();
		System.out.println("Dame otro numero");
		n2=t.nextInt();
		
		for (int i=1; i<n1; i++) {
			if (n1%i==0) {
				suma1+=i;
			}
		}
		for (int i=1; i<n2; i++) {
			if (n2%i==0) {
				suma2+=i;
			}
		}
		//System.out.println(suma);
		if (suma1==n2 && suma2==n1) {
			System.out.println("son amigos");
		} else {
			System.out.println("no son amigos");
		}
		t.close();
	}

}

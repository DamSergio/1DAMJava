package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int secreto=(int)(1+Math.random()*20);
		int n=0, i=7;
		
		//System.out.println(secreto);
		System.out.println("dame un numero");
		n=t.nextInt();
		
		while (i>1 && n!=secreto) {
			if (n<secreto) {
				System.out.println("el numero secreto es mayor");
			} else {
				System.out.println("el numero secreto es menor");
			}
			n=t.nextInt();
			i--;
		}
		if (n==secreto) {
			System.out.println("has ganado");
		} else {
			System.out.println("Has perdido");
		}
		
		t.close();
	}

}

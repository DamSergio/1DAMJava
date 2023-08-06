package actividades;

import java.util.Scanner;

public class Secreto {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int secreto=(int)(1+Math.random()*10);
		int n1=0;
		
		System.out.println(secreto);
		
		System.out.println("adivina el numero entre 1 y 10");
		n1=teclado.nextInt();
		
		if (n1>10 || n1<0) {
			System.out.println("eso no esta entre 1 y 10, dame otro");
			n1=teclado.nextInt();
		}
		if (n1==secreto) {
			System.out.println("eres el puto amo");
		} else {
			System.out.println("eres un mierdas");
		}
		
		teclado.close();

	}

}

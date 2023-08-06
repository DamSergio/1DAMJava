package actividades;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, mayor=0, menor=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		menor=n;
		mayor=n;
		
		while (n!=0) {
			if (n>mayor) {
				mayor=n;
			}
			if (n!=0 && n<menor) {
				menor=n;
			}
			System.out.println("dame un numero");
			n=t.nextInt();
		}
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		t.close();
	}

}

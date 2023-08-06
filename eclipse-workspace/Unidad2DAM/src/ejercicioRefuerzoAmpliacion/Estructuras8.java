package ejercicioRefuerzoAmpliacion;

import java.util.Scanner;

public class Estructuras8 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, menor=0;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		menor=n;
		for (int i=0; i<4; i++) {
			System.out.println("dime un numero");
			n=t.nextInt();
			if (n<menor) {
				menor=n;
			}
		}
		System.out.println("el menor es: "+menor);
		t.close();
	}

}

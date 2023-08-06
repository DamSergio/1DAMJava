package buclesVariables;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int conta=0, contm=0, sumae=0;
		float sumaa=0.0f, n=0.0f;
		
		for (int i=0; i<5; i++) {
			System.out.println("Dame tu edad");
			n=t.nextFloat();
			sumae+=n;
			if (n>=18) {
				contm++;
			}
			System.out.println("Dame tu altura");
			n=t.nextFloat();
			sumaa+=n;
			if (n>=1.75) {
				conta++;
			}
		}
		System.out.println("La media de edad es: "+(sumae/5));
		System.out.println("La media de altura es: "+(sumaa/5));
		System.out.println("Los alumnos mayores de 18 años son: "+contm);
		System.out.println("Los alumnos mas altos de 1.75 son: "+conta);
		t.close();
	}

}

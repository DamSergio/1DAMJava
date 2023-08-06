package bucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int i=5, mayores=0, altos=0, sumae=0;
		float n=0.0f, sumaa=0.0f;
		
		while (i>0) {
			System.out.println("dame tu edad");
			n=t.nextFloat();
			sumae+=n;
			if (n>18) {
				mayores++;
			}
			System.out.println("dame tu altura");
			n=t.nextFloat();
			sumaa+=n;
			if (n>1.75) {
				altos++;
			}
			i--;
		}
		System.out.println("la media de edad es: "+(sumae/5));
		System.out.println("la media de altura es: "+(sumaa/5));
		System.out.println(mayores+" alumnos tienes mas de 18 años");
		System.out.println(altos+" alumnos miden mas de 1.75");
		t.close();
	}

}

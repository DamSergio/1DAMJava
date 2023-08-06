package actividadRepasoUT2;

import java.util.Scanner;

public class CifrasDeUnNumero3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, contar=0, mayor=0, menor=9, numero=0, cont=0;
		float media=0.0f, suma=0.0f;
		
		System.out.println("dame un numero");
		n=t.nextInt();
		contar=n;
		
		while (contar>0) {
			suma+=contar%10;
			cont++;
			numero=contar%10;
			if (numero<menor) {
				menor=numero;
			}
			if (numero>mayor) {
				mayor=numero;
			}
			contar/=10;
		}
		media=suma/cont;
		System.out.println("El numero tiene "+cont+" cifras");
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);
		System.out.println("la cifra mayor es: "+mayor);
		System.out.println("la cifra menor es: "+menor);
		
		t.close();
	}

}

package actividades;

import java.util.Scanner;

public class SecuenciaParesMayor {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int cont=0, pares=0, n=0;
		
		while (n!=-1) {
			System.out.println("dime un numero");
			n=t.nextInt();
			if (n%2==0) {
				cont++;
			} else {
				cont=0;
			}
			if (cont>pares) {
				pares=cont;
			}
		}
	System.out.println("la secuencia mayor de pares consecutivos es: "+pares);
	t.close();
	}

}

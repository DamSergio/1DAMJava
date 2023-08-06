package ejercicioRefuerzoAmpliacion;

import java.util.Scanner;

public class Estructuras7 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, d1=0, d2=0, suma=0, cont=0;
		
		System.out.println("Dame un numero de 2 cifras");
		n=t.nextInt();
		
		if (n>=10 && n<100) {
			d1=n/10;
			d2=n%10;
			suma=d1+d2;
			if (d1%2==0) {
				cont++;
			}
			if (d2%2==0) {
				cont++;
			}
			System.out.println("la suma de sus digitos es: "+suma);
			System.out.println("El numero tiene "+cont+" digitos pares");
		} else {
			System.out.println("El numero tiene que ser de 2 cifras");
		}
		
		t.close();
	}

}

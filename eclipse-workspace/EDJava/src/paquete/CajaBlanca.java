package paquete;

import java.util.Scanner;

public class CajaBlanca {

	private static final String DAME_UN_NUMERO = "Dame un numero";
	private static int suma;
	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println(DAME_UN_NUMERO);
		int n=teclado.nextInt();
		suma = 0;
		
		suma = extracted2(n, suma);//6Fin bucle
		extracted(n, suma);//10
		
	}

	private static int extracted2(int n, int suma) {
		for(int i=1;i<n;i++) {//2
			if(n%i==0) {//3
				suma=suma+i;//4
			}//5Fin si
		}
		return suma;
	}

	private static void extracted(int n, int suma) {
		String stringElnumero = "El numero ";
		if(suma==n) {//7
			System.out.println(stringElnumero+n+" es perfecto");//8
		}else {
			System.out.println(stringElnumero+n+" no es perfecto");//9
		}
	}

}
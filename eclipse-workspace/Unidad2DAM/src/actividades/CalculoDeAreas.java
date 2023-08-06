package actividades;

import java.util.Scanner;

public class CalculoDeAreas {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int menu=0; 
		float n1=0, n2=0, r=0;
		
		System.out.println("MENU\n");
		System.out.println("1. Area del cuadrado");
		System.out.println("2. Area del circulo");
		System.out.println("3. Area del triangulo");
		System.out.println("4. Salir");
		System.out.println("********************************************");
		System.out.println("Elije una opcion");
		menu=teclado.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println("Dime la longitud del lado");
				n1=teclado.nextInt();
				r=n1*n1;
				System.out.println("el area del cuadrado es: "+r);
				break;
			case 2:
				System.out.println("Dime el radio");
				n1=teclado.nextInt();
				r=(float) (Math.PI*(n1*n1));
				System.out.println("el area del circulo es: "+r);
				break;
			case 3:
				System.out.println("Dime la base y la altura");
				n1=teclado.nextInt();
				n2=teclado.nextInt();
				r=(n1*n2)/2;
				System.out.println("el area del triangulo es: "+r);
				break;
			case 4: System.out.println("Adios"); break;
			default: System.out.println("Debe elejir opcion de 1 al 4");
		}
		teclado.close();
	}

}

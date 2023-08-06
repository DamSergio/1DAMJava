package activiades;

import java.util.Scanner;

public class PracticaEvaluableUT3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a, b, aux;
		String op;
		// PIDE DOS NUMEROS
		do {
			System.out.println("Dame un numero");
			a=t.nextInt();
			System.out.println("Dame otro numero");
			b=t.nextInt();
		} while (!correcto(a, b)); // METODO CORRECTO
		
		if (a>b) {
			aux=a;
			a=b;
			b=aux;
		}
		
		do { 
			menu(); // METODO MENU
			op=t.next();
			switch (op) { 
			case "a", "A":
				perfecto(a, b); // METODO PERFECTO
				break;
			case "b", "B":
				primo(a, b); // METODO PRIMO
				break;
			case "c", "C":
				pal(a, b); // METODO PAL
				break;
			case "d", "D":
				suma(a, b); // METODO SUMA
				break;
			case "e", "E":
				System.out.println("Hasta pronto!");
				break;
			default: System.out.println("Esa no es una opcion");
			}
		} while (!op.equalsIgnoreCase("e")); 
		t.close();
	}
	public static boolean correcto (int a, int b) { 
		// COMPRUEBA QUE LOS NUMEROS SEAN POSITIVOS Y DISTINTOS
		if (a!=b && a>=0 && b>=0) { 
			System.out.println("Los numeros son validos");
			return true;
		} else { 
			System.out.println("Los numeros no son validos");
			return false;
		}
	}
	public static void menu () { 
		// MENU	
		System.out.println("Elige una opcion:");
		System.out.println("a. Imprimir los numeros perfectos entre a y b");
		System.out.println("b. ¿Cuantos primos hay entre ambos?");
		System.out.println("c. Imprimir los palindromos pares entre a y b");
		System.out.println("d. ¿Cuantos suman las cifras de a y las cifra de b?");
		System.out.println("e. Salir");
	}
	public static void perfecto (int a, int b) { 
		// NUMEROS PERFECTOS
		int suma=0, cont=0;
		for (int i=a; i<=b; i++) { 
			suma=0; 
			for (int j=1; j<=i/2; j++) {
				if (i%j==0) {
					suma+=j;
				}
			}
			if (suma==i) {
				System.out.println(i+" es perfecto");
				cont++;
			}
		}	
		if (cont==0) {
			System.out.println("No hay numeros perfectos");
		}
		
	}
	public static void primo (int a, int b) {
		// NUMEROS PRIMOS
		int cont=0, contp=0;
		for (int i=a; i<=b; i++) {
			cont=0;
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					 cont++;
				}
			}
			if (cont==2 || cont==1) {
				contp++;
			}
		}
		System.out.println("Hay "+contp+" numeros primos");
	}
	public static void pal (int a, int b) {
		// NUMEROS PALINDROMOS
		int cont=0;
		for (int i=a; i<=b; i++) {
			if (i%2==0) {
				int suma=0;
				int n=i;
				while (n>0) {
					suma+=n%10;
					suma*=10;
					n/=10;
				}
				suma/=10;
				if (suma==i) {
					System.out.println(i+" es palindromo");
					cont++;
				}
			}
		}
		if (cont==0) {
			System.out.println("No hay palindromos");
		}
	}
	public static void suma (int a, int b) {
		// SUMA DE CRIFRAS
		int sumaa=0, sumab=0;
		while (a>0) {
			sumaa+=a%10;
			a/=10;
		}
		System.out.println("La suma de las cifras de A es: "+sumaa);
		while (b>0) {
			sumab+=b%10;
			b/=10;
		}
		System.out.println("La suma de las cifras de B es: "+sumab);
		System.out.println("La suma de las cifras de A mas las cifras de B es: "+(sumaa+sumab));
	}
}

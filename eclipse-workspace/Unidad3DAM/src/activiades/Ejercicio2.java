package activiades;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int op=0;
		float n1=0, n2=0;
		
		menu();
		op=t.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("Dime el lado");
			n1=t.nextFloat();
			System.out.println("El area es: "+cuadrado(n1));
			break;
		case 2:
			System.out.println("Dime el radio");
			n1=t.nextFloat();
			System.out.println("El area es: "+circulo(n1));
			break;
		case 3:
			System.out.println("Dime el lado");
			n1=t.nextFloat();
			System.out.println("Dime la altura");
			n2=t.nextFloat();
			System.out.println("El area es: "+rectangulo(n1, n2));
			break;
		}
		t.close();

	}
	public static void menu() {
		System.out.println("1. Area del cuadrado");
		System.out.println("2. Area del circulo");
		System.out.println("3. Area del rectangulo");
		System.out.println("Elige una opcion");
	}
	public static float cuadrado(float lado) {
		return lado*lado;
	}
	public static float circulo(float radio) {
		return (float) (Math.PI*Math.pow(radio, 2)) ;
	}
	public static float rectangulo(float base, float altura) {
		return base*altura;
	}

}

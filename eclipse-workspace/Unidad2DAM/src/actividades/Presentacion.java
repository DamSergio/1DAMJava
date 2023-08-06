package actividades;

import java.util.Scanner;

public class Presentacion {

	public static void main(String[] args) {
		
		//Declaracion de variables/objetos
		
		Scanner teclado=new Scanner(System.in);
		String nombre="";
		int edad=0;
		float peso=0.0f;
		
		//Procesos
		//1º pregunta tu nombre
		
		System.out.println("Dime tu nombre");
		nombre=teclado.next();
		
		//2º pregunta la edad
		
		System.out.println("Dime tu edad");
		edad=teclado.nextInt();
		
		//3º pregunta el peso
		
		System.out.println("Dime tu peso");
		peso=teclado.nextFloat();
		
		//4º saludamos
		
		System.out.println("Hola "+nombre+ ", tienes "+edad+ " años, y pesas "+peso+ " kg");
		
		//5º miramos si es mayor de edad
		
		if (edad>=18) {
			System.out.println("Hola "+nombre+", eres mayor de edad");
		}
		else {
			System.out.println("Hola "+nombre+", eres menor de edad");
		}
			
		teclado.close();
		
	}

}

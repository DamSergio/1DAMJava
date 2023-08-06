package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		
		Scanner teclado=new Scanner(System.in);
		int a=0, b=0, c=0;
		float r1=0.0f, r2=0.0f, comprobacion=0.0f;
		//Procesos
		
		System.out.println("Dime el coeficiente A");
		a=teclado.nextInt();
		
		System.out.println("Dime el coeficiente B");
		b=teclado.nextInt();
		
		System.out.println("Dime el coeficiente C");
		c=teclado.nextInt();
		
//		r1=(float) (-b+Math.sqrt((b*b)-4*a*c));
//		r1=r1/(2*a);
//		r2=(float) (-b-Math.sqrt((b*b)-4*a*c));
//		r2=r2/(2*a);
		
//		System.out.println("Los resultados son: "+r1+" y "+r2);
		
		comprobacion=(b*b)-4*a*c;
		
		System.out.println(comprobacion);
		
		if (a==0 || comprobacion<0) {
			System.out.println("No tiene solucion");
		} else {
			if (comprobacion==0) {
				r1=(float) ((-b+Math.sqrt(comprobacion))/(2*a));
				System.out.println("La solucion es "+r1);
			} else {                 
				r1=(float) ((-b+Math.sqrt(comprobacion))/(2*a));
				r2=(float) ((-b-Math.sqrt(comprobacion))/(2*a));
				System.out.println("Las soluciones son "+r1+" y "+r2);
			}
		}
		teclado.close();
	}

}

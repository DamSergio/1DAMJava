package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//variables
		
		Scanner teclado=new Scanner(System.in);
		int dia=0;
		
		//procesos
		
		System.out.println("dame un numero de la semana");
		dia=teclado.nextInt();
		
		if (dia>=1 && dia<=7) {
			if (dia==1) {
				System.out.println("lunes");
			} else {
				if (dia==2) {
					System.out.println("martes");
				} else {
					if (dia==3) {
						System.out.println("miercoles");
					} else {
						if (dia==4) {
							System.out.println("jueves");
						} else {
							if (dia==5) {
								System.out.println("viernes");
							} else {
								if (dia==6) {
									System.out.println("sabado");
								} else {
									System.out.println("domingo");
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("no me sirve");
		}
		
		teclado.close();
	}

}

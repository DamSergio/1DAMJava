package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//variables
		
		Scanner teclado=new Scanner(System.in);
		int mes=0;
		
		//procesos
		
		System.out.println("dame el numero del mes");
		mes=teclado.nextInt();
		
		if (mes>=1 && mes<=12) {
			if (mes==1) {
				System.out.println("enero");
			} else {
				if (mes==2) {
					System.out.println("febrero");
				} else {
					if (mes==3) {
						System.out.println("marzo");
					} else {
						if (mes==4) {
							System.out.println("abril");
						} else {
							if (mes==5) {
								System.out.println("mayo");
							} else {
								if (mes==6) {
									System.out.println("junio");
								} else {
									if (mes==7) {
										System.out.println("julio");
									} else {
										if (mes==8) {
											System.out.println("agosto");
										} else {
											if (mes==9) {
												System.out.println("septiembre");
											} else {
												if (mes==10) {
													System.out.println("octube");
												} else {
													if (mes==11) {
														System.out.println("noviembre");
													} else {
														System.out.println("diciembre");
													}
												}
											}
										}
									}
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

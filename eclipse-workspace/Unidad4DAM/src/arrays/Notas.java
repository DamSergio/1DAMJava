package arrays;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		//String nombre="Juan";
		Scanner t=new Scanner(System.in);
		float suma=0;
		float notas[]=new float[7];
		
		for (int i=0; i<notas.length; i++) {
			notas[i]=(int)(1+Math.random()*10);
			//System.out.println(notas[i]);
			suma+=notas[i];
		}
		System.out.println("Nota de programacion "+notas[0]);
		System.out.println("Nota de BD "+notas[1]);
		System.out.println("Nota de ED "+notas[2]);
		System.out.println("Nota de Ingles "+notas[3]);
		System.out.println("Nota de FOL "+notas[4]);
		System.out.println("Nota de LM "+notas[5]);
		System.out.println("Nota de SISI "+notas[6]);
		System.out.println(suma/notas.length);
		
		System.out.println("Dame un numero");
		int n=t.nextInt();
		
		for (int i=0; i<notas.length; i++) {
			if (n==notas[i]) {
				System.out.println("Encontrado en la posicion: "+i);
			}
		}
		//borrar un elemento del array e insertar
		//nada  todavia
		t.close();
	}

}

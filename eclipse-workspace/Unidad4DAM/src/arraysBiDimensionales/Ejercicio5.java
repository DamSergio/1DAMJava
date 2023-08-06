package arraysBiDimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int filas, columnas;
		
		System.out.println("Dime las filas");
		filas=t.nextInt();
		System.out.println("Dime las columnas");
		columnas=t.nextInt();
		
		int m[][]=new int[filas][columnas];
		
		
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				m[y][x]=(int)(1+Math.random()*10);
				System.out.print(m[y][x]+"\t");
			}
			System.out.println("");
		}
		
		
		System.out.println(Arrays.toString(columna(m)));
		System.out.println(Arrays.toString(fila(m)));
		System.out.println(suma(columna(m), fila(m)));
		t.close();
	}
	private static int suma(int[] columna, int[] fila) {
		int suma=0;
		for (int i=0; i<fila.length; i++) {
			suma+=fila[i];
		}
		for (int i=0; i<columna.length; i++) {
			suma+=columna[i];
		}
		return suma;
	}
	private static int[] fila(int[][] m) {
		int vector[]=new int[m.length];
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				vector[y]+=m[y][x];
			}
		}
		return vector;
	}
	private static int[] columna (int[][] m) {
		int vector[]=new int[m[0].length];
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				vector[x]+=m[y][x];
			}
		}
		return vector;
	}

}

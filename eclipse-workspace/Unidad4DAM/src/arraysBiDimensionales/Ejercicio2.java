package arraysBiDimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int filas, columnas;
		
		do {
			System.out.println("Dime las filas");
			filas=t.nextInt();
			System.out.println("Dime las columnas");
			columnas=t.nextInt();
		} while (!correcto(filas, columnas));
		
		int m[][]=new int[filas][columnas];
		int suma[]=new int[filas];
		
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				m[y][x]=(int)(1+Math.random()*50);
				System.out.print(m[y][x]+"\t");
				suma[y]+=m[y][x];
			}
			
			System.out.println("");
		}
		System.out.println(Arrays.toString(suma));
		t.close();
	}

	private static boolean correcto(int filas, int columnas) {
		if (filas>=2 && filas<=10 && columnas>=2 && columnas<=10) {
			return true;
		}
		return false;
	}
	
}

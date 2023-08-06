package arraysBiDimensionales;

import java.util.Scanner;

public class Ejercicio5v2 {

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
				//System.out.print(m[y][x]+"\t");
			}
			//System.out.println("");
		}
		suma(m);
		t.close();
	}

	private static void suma(int[][] m) {
		int suma=0, sumat=0;
		for (int y=0; y<m.length; y++) {
			suma=0;
			for (int x=0; x<m[0].length; x++) {
				System.out.print(m[y][x]+"\t");
				suma+=m[y][x];
			}
			System.out.println("|"+suma+"\t");
			sumat+=suma;
		}
		for(int i=0; i<=m[0].length; i++) {
			System.out.print("-------");
		}
		System.out.println();
		//System.out.println("--------------------------------------------------------------------");
		for (int x=0; x<m[0].length; x++) {
			suma=0;
			for (int y=0; y<m.length; y++) {
				suma+=m[y][x];
			}
			System.out.print(suma+"\t");
			sumat+=suma;
		}
		System.out.println("TOTAL:"+sumat);
		
	}

}

package arraysBiDimensionales;

public class Ejercicio3 {

	public static void main(String[] args) {
	int m[][]=new int[3][4];
	int m2[][]=new int[3][4];
	int suma[][]=new int[3][4];
	
	bucle(m);
	System.out.println("****************************");
	bucle(m2);
	System.out.println("****************************");
	for (int y=0; y<m.length; y++) {
		for (int x=0; x<m[0].length; x++) {
			suma[y][x]=m[y][x]+m2[y][x];
			System.out.print(suma[y][x]+"\t");
		}
		System.out.println("");
	}
	}
	private static void bucle (int[][] m) {
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				m[y][x]=(int)(1+Math.random()*30);
				System.out.print(m[y][x]+"\t");
			}
			System.out.println("");
		}
	}
}

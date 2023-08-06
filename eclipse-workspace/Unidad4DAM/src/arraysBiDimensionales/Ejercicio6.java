package arraysBiDimensionales;

public class Ejercicio6 {

	public static void main(String[] args) {
		int m[][]=new int[10][10];
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				m[y][x]=(int)(1+Math.random()*100);
				System.out.print(m[y][x]+"\t");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------------------------------------------");
		diagonal(m);
	}

	private static void diagonal(int[][] m) {
		int max=0, min=100;
		float med=0;
		for (int y=0; y<m.length; y++) {
			System.out.print(m[y][y]+"\t");
			if (m[y][y]>max) {
				max=m[y][y];
			}
			if (m[y][y]<min) {
				min=m[y][y];
			}
			med+=m[y][y];
		}
		System.out.println();
		System.out.println("Maximo es: "+max);
		System.out.println("Minimo es: "+min);
		System.out.println("Media es: "+med/m.length);
	}

}

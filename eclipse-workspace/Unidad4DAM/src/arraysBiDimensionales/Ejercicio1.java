package arraysBiDimensionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		int m[][]=new int[3][4];
		int cont=1;
		
		for (int y=0; y<m.length; y++) {
			for (int x=0; x<m[0].length; x++) {
				m[y][x]=cont;
				cont++;
				System.out.print(m[y][x]+"\t");
			}
			System.out.println(" ");
		}

	}

}

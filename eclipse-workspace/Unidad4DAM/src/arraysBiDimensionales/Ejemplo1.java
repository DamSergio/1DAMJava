package arraysBiDimensionales;

public class Ejemplo1 {

	public static void main(String[] args) {
		int matriz[][]=new int[3][4]; //3 filas 4 columnas
		
		for (int y=0; y<matriz.length; y++) { //filas
			for (int x=0; x<matriz[0].length; x++) { //columnas
				matriz[y][x]=(int)(1+Math.random()*10);
				System.out.print(matriz[y][x]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println();
	}

}

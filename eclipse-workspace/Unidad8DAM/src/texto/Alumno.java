package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Alumno {
	
	public static void main(String[] args) {
		//LEER FICHERO notas.txt
		try {
			Scanner entrada=new Scanner(new File("notas.txt"));
			String cadena="";
			String linea[];
			
			while (entrada.hasNext()) {
				
				cadena=entrada.nextLine();
				//System.out.println(cadena);
				
				linea=cadena.split(" ");
				double suma=0;
				for (int i=2; i<linea.length; i++) {
					suma+=Integer.parseInt(linea[i]);
				}
				System.out.println(linea[0]+" "+linea[1]+" tiene una media de: "+suma/(linea.length-2));
				
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("El fichero no existe");
		}
		
	}
}

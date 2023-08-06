package texto;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texto {
	
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
//		FileWriter f=null;
//		try {
//			f = new FileWriter("numeros.txt", true);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		File f=new File("numeros.txt");
		
		try {
			
			PrintWriter salida=new PrintWriter(f);
			int n=0;
			
			do {
				
				System.out.println("Dame un numero");
				n=t.nextInt();
				salida.println(n);
				
			} while (n!=0);
			
			salida.flush();
			salida.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//LEER FICHERO
		System.out.println("Leemo del fichero");
		try {
			Scanner entrada=new Scanner(new File("numeros.txt"));
			int num=0;
			while (entrada.hasNext()) {
				num=entrada.nextInt();
				System.out.println(num);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		t.close();
	}
}

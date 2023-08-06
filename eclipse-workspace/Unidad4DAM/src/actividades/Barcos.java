package actividades;

import java.util.Scanner;

public class Barcos {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String boleto[]=new String[10];
		int intentos=6, op, barcos=4;
		
		imprimirBoleto(boleto);
		
		do {
			System.out.println("Dime una posicion");
			op=t.nextInt();
			
			if (comp(boleto, op)) {
				System.out.println("Hundido!!!");
				boleto[op]="A";
				barcos--;
			} else {
				System.out.println("Agua");
				intentos--;
			}
		} while (intentos>0 && barcos>0);
		
		if (intentos>0) {
			System.out.println("Has ganado");
		} else {
			System.out.println("has perdido, te quedastes sin intentos");
		}
		t.close();
	}

	private static boolean comp(String[] boleto, int op) {
		if (boleto[op].equals("B")) {
			return true;
		}
		return false;
	}

	private static void imprimirBoleto(String[] boleto) {
		int barcos=0, agua=0;
		for (int i=0; i<boleto.length; i++) {
			System.out.print(i+" \t");
		}
		System.out.println();
		for (int i=0; i<boleto.length; i++) {
			int n=(int)(Math.random()*2);
			if (barcos<4) {
				if (agua<6) {
					if (n==0) {
						boleto[i]="A";
						agua++;
					}
					if (n==1) {
						boleto[i]="B";
						barcos++;
					}
				} else {
					boleto[i]="B";
					barcos++;
				}
			} else {
				boleto[i]="A";
				agua++;
			}
			//System.out.print(boleto[i]+"\t");
		}
		System.out.println();
		
	}

}

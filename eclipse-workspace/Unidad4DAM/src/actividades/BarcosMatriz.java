package actividades;

import java.util.Scanner;

public class BarcosMatriz {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String boleto[][]=new String[10][10];
		int op, op2, barcos=4;
		
		imprimirBoleto(boleto);
		
		do {
			System.out.println("Dime una posicion (alto)");
			op=t.nextInt();
			System.out.println("Dime una posicion (largo)");
			op2=t.nextInt();
			
			if (comp(boleto, op, op2)) {
				System.out.println("Hundido!!!");
				boleto[op][op2]="A";
				barcos--;
			} else {
				System.out.println("Agua");
			}
			System.out.println("----------------------------------------------------------------------");
			for (int i=0; i<boleto.length; i++) {
				for (int j=0; j<boleto[0].length; j++) {
					System.out.print(boleto[i][j]+"\t");
				}
				System.out.println();
			}
		} while (barcos>0);
		System.out.println("Ganastes");
		t.close();
	}

	private static boolean comp(String[][] boleto, int op, int op2) {
		if (boleto[op][op2].equals("B")) {
			return true;
		}
		return false;
	}

	private static void imprimirBoleto(String[][] boleto) {
		int barcos=0, agua=0;
		for (int i=0; i<boleto.length; i++) {
			barcos=0; 
			agua=0;
			for (int j=0; j<boleto[0].length; j++) {
				int n=(int)(Math.random()*2);
				if (barcos<3) {
					if (agua<7) {
						if (n==0) {
							boleto[i][j]="A";
							agua++;
						}
						if (n==1) {
							boleto[i][j]="B";
							barcos++;
						}
					} else {
						boleto[i][j]="B";
						barcos++;
					}
				} else {
					boleto[i][j]="A";
					agua++;
				}
				System.out.print(boleto[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

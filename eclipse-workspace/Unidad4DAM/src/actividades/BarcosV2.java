package actividades;

import java.util.Scanner;

public class BarcosV2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String boleto="AAAAAAAAAA";
		int intentos=6, op;
		
		boleto=imprimirBoleto(boleto);
		System.out.println(boleto);
		
		do {
			System.out.println("Dime una posicion (entre 0 y 9)");
			op=t.nextInt();
			if (boleto.charAt(op)=='B') {
				System.out.println("Hundido!!!");
				boleto=cambiar(boleto, op);
			} else {
				System.out.println("Agua");
				intentos--;
			}
			System.out.println(boleto);
		} while (intentos>0 && comp(boleto));
		
		if (intentos>0) {
			System.out.println("Has ganado");
		} else {
			System.out.println("has perdido, te quedastes sin intentos");
		}
		
		t.close();
	}

	private static boolean comp(String boleto) {
		for (int i=0; i<10; i++) {
			if (boleto.charAt(i)=='B') {
				return true;
			}
		}
		return false;
	}

	private static String cambiar(String boleto, int op) {
		return boleto.substring(0, op)+"A"+boleto.substring(op+1);
	}

	private static String imprimirBoleto(String boleto) {
//		int barcos=0, agua=0;
//		for (int i=0; i<10; i++) {
//			int n=(int)(Math.random()*2);
//			if (barcos<4) {
//				if (agua<6) {
//					if (n==0) {
//						boleto+="A";
//						agua++;
//					}
//					if (n==1) {
//						boleto+="B";
//						barcos++;
//					}
//				} else {
//					boleto+="B";
//					barcos++;
//				}
//			} else {
//				boleto+="A";
//				agua++;
//			}
//		}
		for (int i=0; i<4; i++) {
			int n=(int)(Math.random()*10);
			if(boleto.charAt(n)=='A') {
				boleto=boleto.substring(0, n)+"B"+boleto.substring(n+1);
			} else {
				i--;
			}
		}
		return boleto;
		
	}

}

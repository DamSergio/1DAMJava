package actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Examen2021 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String j1="", j2="";
		int p1=0, p2=0;
		
		do {
			System.out.println("Dime el nombre del J1");
			j1=t.next();
		} while (correcto(j1));
		
		do {
			System.out.println("Dime el nombre del J2");
			j2=t.next();
		} while (correcto(j2));
		
		int resultado1[]=new int[5];
		int resultado2[]=new int[5];
		
		rellenar(resultado1);
		rellenar(resultado2);
		
		System.out.println(j1+" tiene "+Arrays.toString(resultado1));
		System.out.println(j2+" tiene "+Arrays.toString(resultado2));
		
		for (int i=0; i<5; i++) {
			int n=(int)(1+Math.random()*6);
			System.out.println("Dado: "+n);
			if(comp(resultado1, n)) {
				System.out.println("\t"+j1+" coincide con el resultado del lanzamiento "+i);
				p1++;
			}
			if(comp(resultado2, n)) {
				System.out.println("\t"+j2+" coincide con el resultado del lanzamiento "+i);
				p2++;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(p1==p2) {
			System.out.println("Empate");
		} else {
			if(p1>p2) {
				System.out.println("Gana "+j1+" con aciertos="+p1);
			} else {
				System.out.println("Gana "+j2+" con aciertos="+p2);
			}
		}
		
		t.close();
	}

	private static boolean comp(int[] resultado, int n) {
		for (int i=0; i<resultado.length; i++) {
			if(resultado[i]==n) {
				return true;
			}
		}
		return false;
	}

	private static void rellenar(int[] resultado) {
		for (int i=0; i<resultado.length; i++) {
			resultado[i]=(int)(1+Math.random()*6);
		}
	}

	private static boolean correcto(String j) {
		if(j.length()==5) {
			if (j.substring(0,1).equals("J")) {
				for(int i=1; i<4; i++) {
					if (!Character.isUpperCase(j.charAt(i))) {
						System.out.println("No esta en mayusculas");
						return true;
					}
				}
				if (Character.isDigit(j.charAt(4))) {
					return false;
				} else {
					System.out.println("Falta un numero al final");
					return true;
				}
			}
			System.out.println("Tiene que empezar por J");
			return true;
		}
		System.out.println("error");
		return true;
	}

}

package ejerciciosAmpliacionRefuerzo;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String usuario,pass;
		int intentos=3;
		
//		for (int i=3; i>0; i--) {
//			System.out.println("dime el usuario");
//			usuario=t.next();
//			System.out.println("dime la contraseña");
//			pass=t.next();
//			if (usuario.equals("root") && pass.equals("1234")) {
//				i=0;
//				System.out.println("estas dentro");
//			} else {
//				System.out.println("te quedan "+(i-1)+" intentos");
//			}
//		}
		
		do {
			System.out.println("usuario");
			usuario=t.next();
			System.out.println("password");
			pass=t.next();
			intentos--;
		} while (intentos>0 && (!usuario.equals("root") || !pass.equals("1234")));
		if (usuario.equals("root") && pass.equals("1234")) {
			System.out.println("has entrado");
		} else {
			System.out.println("te has quedado sin intentos");
		}
		t.close();

	}

}

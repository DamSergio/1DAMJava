package actividades;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String contraseña;
		
		System.out.println("Dame un cadena");
		contraseña=t.next();
		Password p1=new Password(contraseña);
		
		System.out.println("Dame un cadena");
		contraseña=t.next();
		Password p2=new Password(contraseña);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.getContraseña().equals(p2.getContraseña())) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		t.close();
	}

}

package ejemplos;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		float radio=0;
		
		System.out.println("Dame el radio");
		radio=t.nextFloat();
		float a=area(radio);
		
		System.out.println("el area es "+a);
		t.close();

	}

	private static float area(float r) {
		
		return (float) (Math.PI*Math.pow(r, 2));
	}

}

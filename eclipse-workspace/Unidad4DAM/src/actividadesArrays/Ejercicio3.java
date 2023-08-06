package actividadesArrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String []dia= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		float []temp=new float[7];
		float media=0;
		
		for (int i=0; i<dia.length; i++) {
			System.out.println("dime la temperatura del "+dia[i]);
			temp[i]=t.nextFloat();
			media+=temp[i];
		}
		media/=dia.length;
		System.out.println("la media es: "+media);
		for (int i=0; i<temp.length; i++) {
			if (temp[i]>media) {
				System.out.println("El "+dia[i]+" la temperatura esta por encima de la media");
			} else {
				System.out.println("El "+dia[i]+" la temperatura esta por debajo de la media");
			}
		}
		t.close();
	}

}

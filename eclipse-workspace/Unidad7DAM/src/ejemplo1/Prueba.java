package ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		
		int a[]= {1,4,6,7,9};
		System.out.println(Arrays.toString(a));
		
		//Borrar un elemento del array
		a[1]=0;
		System.out.println(Arrays.toString(a));
		
		int b[]= {1,6,7,9};
		System.out.println(Arrays.toString(b));
		
		//Añadir un elemento al array
		System.out.println("no gracias");
		
		//Recorrer el array
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//ArrayList
		ArrayList <Integer> numeros=new ArrayList<>(); //crear
		numeros.add(1); //añadir al final
		numeros.add(4); //añadir al final
		numeros.add(6); //añadir al final
		numeros.add(9); //añadir al final
		
		numeros.add(3, 7); //posicion y numero
		
		System.out.println(numeros); //imprimir
		System.out.println(numeros.get(3)); //imprimir posicion
		
		numeros.add(0, -3); //posicion y numero
		System.out.println(numeros); //imprimir
		
		numeros.remove(0); //eliminar posicion
		System.out.println(numeros); //imprimir
		
		//Recorrer de forma nostalgica
		for (int i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i)+" ");
		}
		
		System.out.println();
		
		//Recorrer de forma nueva
		for (Integer i : numeros) {
			System.out.print(i+" ");
		}
	}

}

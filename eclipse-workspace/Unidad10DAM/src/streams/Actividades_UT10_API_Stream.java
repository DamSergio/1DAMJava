package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Actividades_UT10_API_Stream{
	
	public static void main(String[] args) {
		List<Integer>lista=Arrays.asList(3,2,12,5,6,11,13);
		
		System.out.println("\n\tEjercicio 1");
		
		for (Integer i:lista) {
			System.out.println(i);
		}
		
		System.out.println("\n-------------------------\n");
		
		lista.forEach(System.out::println);
		
		System.out.println("\n\tEjercicio 2\n");
		
		int pares=0;
		for (Integer i:lista) {
			if (i%2==0) {
				pares++;
			}
		}
		System.out.println(pares);
		
		System.out.println("\n-------------------------\n");
		
		System.out.println(lista.stream().filter(i->i%2==0).count());
		
		System.out.println("\n\tEjercicio3\n");
		
		List<Integer>paresNuevo1 = new ArrayList<>();
		
		for (Integer i:lista) {
			if(i%2==0) {
				paresNuevo1.add(i);
			}
		}
		
		for (Integer i:paresNuevo1) {
			System.out.println(i);
		}
		
		System.out.println("\n-------------------------\n");
		
		List<Integer>paresNuevo2 = lista.stream().filter(i->i%2==0).collect(Collectors.toList());
		paresNuevo2.forEach(System.out::println);
		
		System.out.println("\n\tEjercicio4\n");
		
		int suma=0;
		for (Integer i:lista) {
			if(i%2==0) {
				suma+=i;
			}
		}
		System.out.println(suma);
		
		System.out.println("\n-------------------------\n");
		
		System.out.println(lista.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum());
		
		System.out.println("\n\tEjercicio5\n");
		
		boolean valido=false;
		for (Integer i:lista) {
			if (i>10) {
				valido=true;
			}
		}
		
		if (valido) {
			System.out.println("Existen numeros mayores a 10 en la lista");
		}
		
		System.out.println("\n-------------------------\n");
		
		if (lista.stream().anyMatch(i->i>10)) {
			System.out.println("Existen numeros mayores a 10 en la lista");
		}
		
		System.out.println("\n\tEjercicio Inventado\n");
		
		List<Integer>notas = Arrays.asList(9,5,7,8,9,10);
		
		if(notas.stream().allMatch(i->i>=5)) {
			System.out.println("Todo aprovado");
		}
	}
	
}
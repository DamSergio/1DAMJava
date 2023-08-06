package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class NumerosStream {

	public static void main(String[] args) {
		List<Integer>numeros = Arrays.asList(2,3,4,5,6,7);
		
		numeros.stream().map(x->x=x*x).forEach(System.out::println);
		List<Integer>numerosCuadrado = numeros.stream().map(x->x=x*x).collect(Collectors.toList());
		
		System.out.println("\n-------------------------\n");
		
		numerosCuadrado.forEach(System.out::println);
		
		System.out.println("\n-------------------------\n");
		
		//CONTADOR CON FILTRO
		long cont = numeros.stream().filter(x->x>=4).count();
		System.out.println(cont);
		
		System.out.println("\n-------------------------\n");
		
		//ACUMULADOR
		int suma = numeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println(suma);
		
		System.out.println("\n-------------------------\n");
		
		//MEDIA
		OptionalDouble media = numeros.stream().mapToInt(Integer::intValue).average();
		System.out.println(media.getAsDouble());
	}

}

package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
	
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Marta");
		nombres.add("Amelia");
		
		nombres.forEach(n->System.out.println(n));
		System.out.println("\n-------------------------\n");
		nombres.forEach(System.out::println);
		
		System.out.println("\n-------------------------\n");
		System.out.println("Nombre que empiezan por A:");
		nombres.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		List<String>nombresA = nombres.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		
		System.out.println("\n-------------------------\n");
		
		nombresA.forEach(System.out::println);
	}
	
}

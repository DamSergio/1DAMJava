package productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		
		productos.add(new Producto("1", "HP Laptop", 0.5, 2500, "Portatil"));
		productos.add(new Producto("2", "Teclado logitech", 0.15, 25, "teclado"));
		productos.add(new Producto("3", "Raton logitech", 0.25, 15, "raton"));
		productos.add(new Producto("4", "Samsung Galaxy Note 20", 0.1, 1000, "telefono"));
		productos.add(new Producto("5", "Iphone 7", 0.1, 1000, "telefono"));
		productos.add(new Producto("6", "Disco SSD", 0.2, 300, "disco"));
		
		int op;
		
		do {
			menu();
			op=t.nextInt();
			
			System.out.println();
			
			switch (op) {
			case 1:
				productos.forEach(i->System.out.println(i.getNombre()));
				break;
			case 2:
				System.out.println(productos.stream().filter(i->i.getNombre().charAt(0)=='H').count());
				break;
			case 3:
				productos.stream().filter(i->i.getPrecio()>=1000).forEach(i->System.out.println(i.getNombre()));
				break;
			case 4:
				productos.stream().filter(i->i.getPeso()<0.5).forEach(i->System.out.println(i.getNombre()+" "+i.getPeso()+" "+i.getPrecio()));				
				break;
			case 5:
				System.out.println(productos.stream().mapToDouble(i->i.getPrecio()).sum()+"€");
				break;
			case 6:
				List<Producto> telefonos = productos.stream().filter(i->i.getCategoria().equals("telefono")).collect(Collectors.toList());
				
				telefonos.forEach(i->System.out.println(i.getNombre()));
				break;
			case 7:
				List<Double> precios = productos.stream().filter(i->i.getPrecio()>500).map(i->i.getPrecio()).collect(Collectors.toList());
				
				precios.forEach(System.out::println);
				System.out.println(precios.stream().mapToDouble(Double::doubleValue).sum());
				break;
			case 8:
				System.out.println(productos.stream().mapToDouble(i->i.getPrecio()).max().getAsDouble());
				break;
			case 9:
				System.out.println(productos.stream().mapToDouble(i->i.getPrecio()).min().getAsDouble());
				break;
			case 10:
				productos.stream().filter(i->i.getPrecio()<100 && i.getPeso()<0.5).forEach(i->System.out.println(i.getNombre().toUpperCase()));
				break;
			case 11:
				System.out.println("Adios!!! 🖐🖐🖐");
				break;
			}
		} while (op!=7);
		
		t.close();
	}

	private static void menu() {
		System.out.println();
		System.out.println("1. Ver los nombres de los productos vendidos");
		System.out.println("2. Cuantos productos hay cuyo nombre empieza por H");
		System.out.println("3. Nombre de los productos vendidos de mas de 1000€");
		System.out.println("4. Nombre, peso y precio de los prodcutos con el peso menor a 0.5Kg");
		System.out.println("5. Total optenido con la venta de los productos");
		System.out.println("6. Crea otra lista e imprime por pantalla esa nueva lista que contiene con los teléfonos vendidos");
		System.out.println("7. Crear una lista de los precios de los productos que superen los 500€");
		System.out.println("8. Precio del producto vendido mas caro");
		System.out.println("9. Precio del producto vendido mas barato");
		System.out.println("10. Nombres de los productos de menos de 100€ y peso < 0.5kg en mayúscula");
		System.out.println("11. Salir");
		System.out.println("Elige una opcion");
		
		
	}
}
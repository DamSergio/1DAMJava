package agenda;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int op=0;
		
		Agenda a=new Agenda();
		a.cargarAgenda("contactos.bin");
		
		do {
			menu();
			op=t.nextInt();
			
			switch (op) {
			case 1:
				a.imprimirAgenda();
				break;
			case 2:
				Contacto c=new Contacto();
				
				System.out.println("Dime el nombre");
				c.setNombre(t.next());
				System.out.println("Dime el numero");
				c.setTelefono(t.next());
				System.out.println("Dime el correo");
				c.setCorreo(t.next());
				System.out.println("Dime la direccion");
				c.setDireccion(t.next());
				
				a.añadirContacto(c);
				break;
			case 3:
				System.out.println("Dime el nombre del contacto a eliminar");
				a.borrarContacto(t.next());
				break;
			case 4:
				System.out.println("Adios 🖐🖐🖐");
				a.guardarAgenda("contactos.bin");
				break;
			}
		} while (op!=4);
		
		t.close();
	}

	private static void menu() {
		System.out.println("1)imprimir agenda");
		System.out.println("2)añadir contacto");
		System.out.println("3)eliminar contacto");
		System.out.println("4)salir");
	}

}

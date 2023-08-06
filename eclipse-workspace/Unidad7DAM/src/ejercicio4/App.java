package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private ArrayList<Cliente> clientes;
	
	public App() {
		this.clientes=new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int op;
		String dni;
		
		Vacuna v1=new Vacuna("Astra Zeneca", "enero", "XX", 20);
		Vacuna v2=new Vacuna("Pfizer", "enero", "XX", 30);
		//ArrayList vacunas
		ArrayList<Vacuna> listaVacunas=new ArrayList<>();
		listaVacunas.add(v1);
		listaVacunas.add(v2);
		//Con ArrayList
		Perro p=new Perro(1, 10, "Border Collie", "Hembra", "Lori", "123455", false, listaVacunas);
		//Sin ArrayList
		Gato g1=new Gato(1, 2, "Ragdoll", "macho", "Leon", true);
		Gato g2=new Gato(1, 2, "Ragdoll", "macho", "Tina", true);
		//ArrayList mascotas
		ArrayList<Animal> mascotas1=new ArrayList<>();
		mascotas1.add(p);
		mascotas1.add(g1);
		ArrayList<Animal> mascotas2=new ArrayList<>();
		mascotas2.add(g2);
		//Clientes
		Cliente c1=new Cliente("Sergio", "1234D", "St criatura", "kerriCopoJhon@gmail.com", mascotas1);
		Cliente c2=new Cliente("Dante", "1234H", "Tres olivos", "dantewe@gmail.com", mascotas2);
		
		//AQUI EMPIEZA EL PROGRAMA
		
		App clientes=new App();
		clientes.getClientes().add(c1);
		clientes.getClientes().add(c2);
		
		do {
			System.out.println("**************************************************");
			clientes.menu();
			op=t.nextInt();
			switch (op) {
			case 1:
				clientes.alta();
				break;
			case 2:
				System.out.println("Dime tu DNI");
				dni=t.next();
				clientes.atenderCliente(dni);
				System.out.println("1.Dar de alta nueva mascota");
				System.out.println("2.Dar de baja mascota");
				op=t.nextInt();
				if (op==1) {
					System.out.println("Que animal vas a dar de alta? (1.Perro / 2.Gato)");
					op=t.nextInt();
					clientes.darAlta(dni, op);
				} else {
					clientes.darBaja(dni);
				}
				break;
			case 3:
				System.out.println("Adios");
			}
		} while (op!=3);
		
		t.close();
	}
	
	private void alta() {
		Scanner t=new Scanner(System.in);
		String cadena="";
		
		Cliente c=new Cliente();
		
		System.out.println("Dime el dni");
		cadena=t.next();
		c.setDNI(cadena);
		System.out.println("Dime el nombre");
		cadena=t.next();
		c.setNombre(cadena);
		System.out.println("Dime el email");
		cadena=t.next();
		c.seteMail(cadena);
		System.out.println("Dime la direccion");
		cadena=t.next();
		c.setDireccion(cadena);
		
		this.clientes.add(c);
		for (Cliente cli:this.clientes) {
			System.out.println(cli);
		}
	}
	
	private void darBaja(String dni) {
		Scanner t=new Scanner(System.in);
		int cont=1;
		for (Cliente i:this.clientes) {
			if (i.getDNI().equals(dni)) {
				for (Animal a:i.getMascotas()) {
					System.out.println(cont+" "+a.getNombre());
					cont++;
				}
				System.out.println("Que mascota quieres dar de baja?");
				int op=t.nextInt()-1;
				
				i.getMascotas().remove(op);
				this.verMascotas(i);
			}
		}
	}

	private void darAlta(String dni, int op) {
		Scanner t=new Scanner(System.in);
		String cadena;
		double cantidad;
		boolean boleano=false;
		for (Cliente i:this.clientes) {
			if (i.getDNI().equals(dni)) {
				if (op==1) {
					Perro perro=new Perro();
					System.out.println("Dime el nombre");
					cadena=t.next();
					perro.setNombre(cadena);
					System.out.println("Dime el sexo");
					cadena=t.next();
					perro.setSexo(cadena);
					System.out.println("Dime la raza");
					cadena=t.next();
					perro.setRaza(cadena);
					System.out.println("Dime el peso");
					cantidad=t.nextDouble();
					perro.setPeso(cantidad);
					System.out.println("Tiene seguro (true/false)");
					boleano=t.nextBoolean();
					perro.setSeguroObligatorio(boleano);
					System.out.println("Dime el chip");
					cadena=t.next();
					perro.setChip(cadena);
					i.getMascotas().add(perro);
				} else {
					Gato gato=new Gato();
					System.out.println("Dime el nombre");
					cadena=t.next();
					gato.setNombre(cadena);
					System.out.println("Dime el sexo");
					cadena=t.next();
					gato.setSexo(cadena);
					System.out.println("Dime la raza");
					cadena=t.next();
					gato.setRaza(cadena);
					System.out.println("Dime el peso");
					cantidad=t.nextDouble();
					gato.setPeso(cantidad);
					System.out.println("Esta gordo? (true/false)");
					boleano=t.nextBoolean();
					gato.setObesidad(boleano);
					i.getMascotas().add(gato);
				}
				this.verMascotas(i);
			}
		}
		
	}

	private void atenderCliente(String dni) {
		for (Cliente i:this.clientes) {
			if (i.getDNI().equals(dni)) {
				System.out.println("El cliente es: "+i.getNombre());
				System.out.println("**********Mascotas**********");
				this.verMascotas(i);
			}
		}
		
	}

	private void verMascotas(Cliente i) {
		int cont=1;
		for (Animal a:i.getMascotas()) {
			if (a instanceof Perro) {
				System.out.println("\t"+cont+".Perro: "+a.getNombre());
			}
			if (a instanceof Gato) {
				System.out.println("\t"+cont+".Gato: "+a.getNombre());
			}
			cont++;
		}
		
	}

	public void menu() {
		System.out.println("1. Dar de alta un cliente");
		System.out.println("2. Atender un cliente");
		System.out.println("\t1.Ver mascotas");
		System.out.println("3. Salir");
		System.out.println("Elige opcion: ");
	}

}

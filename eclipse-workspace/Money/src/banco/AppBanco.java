//MAIN HECHO POR SERGIO
package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {
	private ArrayList<Cliente> clientes;
	
	public AppBanco() {
		this.clientes=new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez");
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		Cuenta c3=new Cuenta("ES234211", "Ahorro Boda", "B124", "A128", 14200);
		Cuenta c4=new Cuenta("ES234212", "Compartida", "B124", "A129", 17000);
		Cliente cli2=new Cliente("B124", "11111J", "Marta", "López", new ArrayList<>());
		cli2.getCuentas().add(c4);
		cli2.getCuentas().add(c3);
		////////////////////////////////////////////////////
		AppBanco app=new AppBanco();
		app.getClientes().add(cli);
		app.getClientes().add(cli2);
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
			app.nuevoCliente();
			break;
			case 2:
			app.mostrarClientes();
			break;
			case 3:
			System.out.println("Codigo cliente:");
			String codigo=teclado.next();
			app.accesoCliente(codigo);
			break;
			}
		}while(opcion!=4);
	}
	
	private void menu() {
		System.out.println("1. Alta cliente");
		System.out.println("2. Mostrar clientes");
		System.out.println("3. Acceso cliente");
		System.out.println("4. Salir");
	}
	
	private void nuevoCliente() {
		Scanner t=new Scanner(System.in);
		String cod, dni, nombre, apellidos;
		
		System.out.println("Dime el codigo de cliente");
		cod=t.next();
		System.out.println("Dime el dni del cliente");
		dni=t.next();
		System.out.println("Dime el nombre del cliente");
		nombre=t.next();
		System.out.println("Dime los apellidos del cliente");
		apellidos=t.next();
		
		Cliente c=new Cliente(cod, dni, nombre, apellidos);
		this.clientes.add(c);
	}
	
	private void mostrarClientes() {
		for (Cliente i:this.clientes) {
			System.out.println(i.getNombre()+" "+i.getApellidos());
			System.out.println("\tCodigo de cliente: "+i.getCodigoCliente());
			System.out.println("\tdni: "+i.getDni());
		}
	}
	
	private void accesoCliente(String cod) {
		for (Cliente i:clientes) {
			if(i.getCodigoCliente().equals(cod)) {
//				for (Cuenta j:i.getCuentas) {
//					System.out.println(j.getCuenta+" "+j.getSaldo+"€");
//					total+=j.getSaldo;
//				}
				i.mostrarCuentas();	
				System.out.println("TOTAL: "+i.toltaCuenta());
			}
		}
	}
	
}

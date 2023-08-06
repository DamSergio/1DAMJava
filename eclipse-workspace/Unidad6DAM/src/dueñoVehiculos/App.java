package dueñoVehiculos;

public class App {

	public static void main(String[] args) {
		
		int nCoches=0;
		int nMotos=0;
		
		//CLIENTE1
		
		Nif nif=new Nif("02319182T");
		Coche c=new Coche("1234FFF", "Seat", "Ibiza", "Blanco", 3);
		Moto m=new Moto("1234GGG", "Ducati", "hola", 300);
		
		Vehiculo v[]=new Vehiculo[2];
		
		v[0]=c;
		v[1]=m;
		
		Cliente cliente1=new Cliente(nif, "Marta", "Lopez", "C/Mayor", 200, v);
		
		System.out.println(cliente1);
		
		System.out.println(cliente1.getNombre()+" "+cliente1.getApellido());
		
		
		
		for (int i=0; i<cliente1.getV().length; i++) {
//			if (cliente1.getV()[i].getTipo().equals("Coche")) {
//				nCoches++;
//			}
			if (cliente1.getV()[i] instanceof Coche) {
				nCoches++;
			}
		}
		
		System.out.println("Nº coches: "+nCoches);
		
		if (nCoches>0) {
			for (int i=0; i<cliente1.getV().length; i++) {
				if (cliente1.getV()[i] instanceof Coche) {
					System.out.println("\tMatricula: "+cliente1.getV()[i].getMatricula());
					System.out.println("\tMarca: "+cliente1.getV()[i].getMarca());
					System.out.println("\tModelo: "+cliente1.getV()[i].getModelo());
				}
			}
		}
		
		for (int i=0; i<cliente1.getV().length; i++) {
			if (cliente1.getV()[i] instanceof Moto) {
				nMotos++;
			}
		}
		System.out.println("Nº motoss: "+nMotos);
		
		//CLIENTE2
		
		Nif nif2=new Nif("02319181E");
		Coche c2=new Coche("1234ZZZ", "Fiat", "Punto", "Negro", 3);
		Coche c3=new Coche("1234PPP", "Seat", "Ibiza", "Blanco", 3);
		
		Vehiculo v2[]=new Vehiculo[2];
		
		v2[0]=c2;
		v2[1]=c3;
		
		Cliente cliente2=new Cliente(nif2, "Daniela", "Juarez", "C/Pan", 200, v2);
		
		System.out.println(cliente2);
		
		//CLIENTE3
		
		Cliente cliente3=new Cliente(null, "", "", "", 0, new Vehiculo[2]);
		
		//TODOS LOS CLIENTES
		
		System.out.println("\n---------------------TODOS LOS CLIENTES---------------------\n");
		
		Cliente misClientes[]=new Cliente[3];
		
		misClientes[0]=cliente1;
		misClientes[1]=cliente2;
		misClientes[2]=cliente3;
		
		for (int i=0; i<misClientes.length; i++) {
			nCoches=0;
			System.out.println("************************************************************");
			System.out.println(misClientes[i].getNombre()+" "+misClientes[i].getApellido()+"\n");
			for (int j=0; j<cliente1.getV().length; j++) {
				if (misClientes[i].getV()[j] instanceof Coche) {
					nCoches++;
				}
			}
			
			System.out.println("Nº coches: "+nCoches);
			
			if (nCoches>0) {
				for (int j=0; j<misClientes[i].getV().length; j++) {
					if (misClientes[i].getV()[j] instanceof Coche) {
						System.out.println("\tMatricula: "+misClientes[i].getV()[j].getMatricula());
						System.out.println("\tMarca: "+misClientes[i].getV()[j].getMarca());
						System.out.println("\tModelo: "+misClientes[i].getV()[j].getModelo()+"\n");
						System.out.println("\tnº puertas: "+((Coche)(misClientes[i].getV()[j])).getnPuertas()+"\n");
					}
				}
			}
			
		}
	}

}

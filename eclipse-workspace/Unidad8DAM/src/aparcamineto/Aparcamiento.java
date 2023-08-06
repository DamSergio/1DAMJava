package aparcamineto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aparcamiento {
	private ArrayList<Conductor> conductores;
	private ArrayList<Cliente> clientesAparcamineto;
	
	public Aparcamiento() {
		super();
		this.conductores = new ArrayList<>();
		this.clientesAparcamineto = new ArrayList<>();
	}
	
	public ArrayList<Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(ArrayList<Conductor> conductores) {
		this.conductores = conductores;
	}

	public ArrayList<Cliente> getClientesAparcamineto() {
		return clientesAparcamineto;
	}

	public void setClientesAparcamineto(ArrayList<Cliente> clientesAparcamineto) {
		this.clientesAparcamineto = clientesAparcamineto;
	}

	public Aparcamiento(ArrayList<Conductor> conductores, ArrayList<Cliente> clientesAparcamineto) {
		super();
		this.conductores = conductores;
		this.clientesAparcamineto = clientesAparcamineto;
	}
	
	@Override
	public String toString() {
		return "Aparcamiento [conductores=" + conductores + ", clientesAparcamineto=" + clientesAparcamineto + "]";
	}

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		Aparcamiento a=new Aparcamiento();
		
		a.cargarClientes();
		
		int op=0;
		do {
			a.menu();
			op=t.nextInt();
			
			switch (op) {
			case 1:
				a.setConductores(a.leerConductores("conductor.csv"));
				break;
			case 2:
				a.getClientesAparcamineto().add(a.darAlta());
				break;
			case 3:
				a.guardarClientes();
				break;
			case 4:
				System.out.println("Se van a sobreescribir los datos del array de clientes 💀, desea continuar (Y/N)");
				String opcion=t.next();
				if (opcion.equalsIgnoreCase("Y")) {
					a.cargarClientes();
				} else {
					System.out.println("Accion cancelada ❌");
				}
				break;
			case 5:
				a.generarTicket();
				break;
			case 6:
				a.turno();
				break;
			case 0:
				System.out.println("Adios 🖐🖐🖐");
				break;
			}
		} while(op!=0);
		
		t.close();
	}

	private void turno() {
		for(Conductor i:this.getConductores()) {
			for(Cliente j:this.getClientesAparcamineto()) {
				switch (i.getTurno()) {
				case 1:
					if (j.getHora()>=9 && j.getHora()<=16) {
						System.out.println("El conductor: "+i.getNombre());
						System.out.println(j.getNombre()+" "+j.getVehiculo());
					}
					break;
				case 2:
					if (j.getHora()>=17 && j.getHora()<=24 || j.getHora()==0) {
						System.out.println("El conductor: "+i.getNombre());
						System.out.println(j.getNombre()+" "+j.getVehiculo());
					}
					break;
				case 3:
					if (j.getHora()>=1 && j.getHora()<=8) {
						System.out.println("El conductor: "+i.getNombre());
						System.out.println(j.getNombre()+" "+j.getVehiculo());
					}
					break;
				}
			}
		}
		
	}

	private void generarTicket() {
		for (Cliente cli:this.getClientesAparcamineto()) {
			try {
				String filename="Ticket"+cli.getNombre()+cli.getApellidos()+".txt";
				PrintWriter out=new PrintWriter(new File(filename));
				
				out.println("Vehiculo: "+cli.getVehiculo());
				out.println("Importe: "+cli.getVehiculo().precioEstacionamineto(cli.getDias()));
				
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Character c;
		
	}

	private void cargarClientes() {
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("clientes.par"));
			
			Cliente cli=null;
			while(in!=null) {
				try {
					cli=(Cliente)in.readObject();
					this.clientesAparcamineto.add(cli);
				} catch (Exception e) {
					in=null;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void guardarClientes() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("clientes.par"));
			
			for (Cliente i:this.getClientesAparcamineto()) {
				out.writeObject(i);;
			}
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private Cliente darAlta() {
		Scanner t=new Scanner(System.in);
		Cliente c=new Cliente();
		
		String dni;
		do {
			System.out.println("Dime el dni");
			dni=t.next();
		} while(!c.valida(dni));
		c.setDni(dni);
		
		System.out.println("Dime el nombre");
		c.setNombre(t.next());
		System.out.println("Dime los apellidos");
		c.setApellidos(t.next());
		System.out.println("Dime la edad");
		c.setEdad(t.nextInt());
		System.out.println("Dime la direccion");
		c.setDireccion(t.next());
		System.out.println("Dime el email");
		c.setEmail(t.next());
		System.out.println("Dime la hora de llegada");
		c.setHora(t.nextInt());
		System.out.println("Dime los dias");
		c.setDias(t.nextInt());
		
		System.out.println("Dime tu vehiculo (1. coche / 2. moto / 3. furgoneta)");
		int op=t.nextInt();
		String mat;
		
		switch (op) {
		case 1:
			Coche co=new Coche();
			
			do {
				System.out.println("Dime la matricula");
				mat=t.next();
			} while(!co.valida(mat));
			co.setMatricula(mat);
			
			System.out.println("Dime la marca");
			co.setMarca(t.next());
			System.out.println("Dime el modelo");
			co.setModelo(t.next());
			System.out.println("Dime el color");
			co.setColor(t.next());
			System.out.println("Dime el numero de puertas");
			co.setnPuertas(t.nextInt());
			
			c.setVehiculo(co);
			break;
		case 2:
			Moto m=new Moto();
			
			do {
				System.out.println("Dime la matricula");
				mat=t.next();
			} while(!m.valida(mat));
			m.setMatricula(mat);
			
			System.out.println("Dime la marca");
			m.setMarca(t.next());
			System.out.println("Dime el modelo");
			m.setModelo(t.next());
			System.out.println("Dime el color");
			m.setColor(t.next());
			System.out.println("Dime el tipo");
			m.setTipo(t.next());
			System.out.println("Dime la cilindrada");
			m.setCilindrada(t.nextDouble());
			System.out.println("Dime el carnet");
			m.setCarnet(t.next());
			
			c.setVehiculo(m);
			break;
		case 3:
			Furgoneta f=new Furgoneta();
			
			do {
				System.out.println("Dime la matricula");
				mat=t.next();
			} while(!f.valida(mat));
			f.setMatricula(mat);
			
			System.out.println("Dime la marca");
			f.setMarca(t.next());
			System.out.println("Dime el modelo");
			f.setModelo(t.next());
			System.out.println("Dime el color");
			f.setColor(t.next());
			System.out.println("Dime la capacidad");
			f.setCapacidad(t.nextDouble());
			
			c.setVehiculo(f);
			break;
		}
		
		//System.out.println(c);
		return c;
	}

	private ArrayList<Conductor> leerConductores(String filename) {
		ArrayList<Conductor> c=new ArrayList<>();
		try {
			Scanner in=new Scanner(new File(filename));
			in.nextLine();
			
			while (in.hasNext()) {
				String line[];
				line=in.nextLine().split(";");
				
				c.add(new Conductor(line[2], line[3], line[4], Integer.parseInt(line[5]), line[6], line[7], Integer.parseInt(line[0]), Integer.parseInt(line[1])));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}

	private void menu() {
		System.out.println("1. Leer conductores");
		System.out.println("2. Dar de alta cliente");
		System.out.println("3. Guardar clientes");
		System.out.println("4. Leer clientes");
		System.out.println("5. Generar ticket");
		System.out.println("6. Imprimir turno de entrega");
		System.out.println("0. Salir");
		System.out.println("Elige una opcion");
		
	}
	/*
	int max=0;
    int maxmax=0;
    ArrayList<Character> c = new ArrayList<>();

    for (int i=0; i<s.length; i++){
        if(!c.contains(s.charAt(i))){
            c.add(s.charAt(i));
            max++;
        } else {
            if (max>maxmax){
                maxmax=max;
            }
            max=0;
            c.removeAll();
        }
    }

    return maxmax;
    */

}

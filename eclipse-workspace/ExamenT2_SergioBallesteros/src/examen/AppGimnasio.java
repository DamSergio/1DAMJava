package examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGimnasio {
	private ArrayList<Monitor> monitores;
	private ArrayList<Cliente> clientes;

	public AppGimnasio() {
		super();
		this.monitores = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	
	public AppGimnasio(ArrayList<Monitor> monitores, ArrayList<Cliente> clientes) {
		super();
		this.monitores = monitores;
		this.clientes = clientes;
	}

	public ArrayList<Monitor> getMonitores() {
		return monitores;
	}

	public void setMonitores(ArrayList<Monitor> monitores) {
		this.monitores = monitores;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "AppGimnasio [monitores=" + monitores + "]";
	}

	public static void main(String[] args) {
		AppGimnasio app=new AppGimnasio();
		Cliente c1=new Cliente(500, "pepo", "dvsd", "dvsd", 10, "sdsfd");
		Cliente c2=new Cliente(501, "pepa", "dvsd", "dvsd", 10, "sdsfd");
		app.getClientes().add(c1);
		app.getClientes().add(c2);
		Scanner t=new Scanner(System.in);
		app.leerMonitores();
		
		String name;
		int pass;
		
		do {
			System.out.println("Usuario");
			name=t.next();
			System.out.println("Contraseña");
			pass=t.nextInt();
		} while(!name.equals("monitor") && !name.equals("admin") && !name.equals("cliente"));
		
		
		if(name.equals("monitor")) {
			app.imprimirMonitor(pass);
		}
		
		if (name.equals("admin") && pass==1234) {
			int op;
			do {
				app.menu();
				op=t.nextInt();
				
				switch(op) {
				case 1:
					for (Monitor monitor:app.getMonitores()) {
						System.out.println(monitor.getNombre()+" "+monitor.getApellido());
					}
					break;
				case 2:
					System.out.println("Dime el codigo del monitor");
					int cod=t.nextInt();
					app.imprimirMonitor(cod);
					break;
				case 3:
					app.darAlta();
					break;
				case 4:
					app.alumnosMonitor();
					break;
				case 5:
					app.guardar();
					System.out.println("Adios! 🖐🖐🖐");
					break;
				}
			} while (op!=5);
		}
		
		if (name.equals("cliente") && app.correcto(pass)) {
			int op;
			do {
				app.menuCliente();
				op=t.nextInt();
				
				switch(op) {
				case 1:
					for (Cliente cli:app.getClientes()) {
						if (cli.getCodigo()==pass) {
							cli.verActividades();
							
						}
					}
//					app.verActividad(pass);
					break;
				case 2:
					for (Cliente cli:app.getClientes()) {
						if (cli.getCodigo()==pass) {
							cli.confirmarReserva();
						}
					}
//					app.comprobar(pass);
					break;
				case 3:
					app.coste(pass);
					break;
				case 4:
					System.out.println("Adios! 🖐🖐🖐");
					break;
				}
			} while(op!=4);
			
		}
		
		t.close();
	}

	private void alumnosMonitor() {
		for(Monitor mon:this.monitores) {
			int cont=0;
			for(ActividadReservada act:mon.getActividades()) {
				cont+=act.getnPart();
			}
			System.out.println(mon.getNombre()+" "+mon.getApellido()+" tiene "+cont+" alumnos");
		}
		
	}

	private void coste(int pass) {
		for (Cliente cli:this.clientes) {
			if (cli.getCodigo()==pass) {
				System.out.println("El coste sera: "+cli.getActividades().size()*10);
			}
		}
		
	}

//	private void comprobar(int pass) {
//		ArrayList<Double> horas=new ArrayList<>();
//		int cont=0;
//		boolean repetido=false;
//		double horaRep=0;
//		
//		for (Cliente cli:this.clientes) {
//			if (cli.getCodigo()==pass) {
//				for (ActividadReservada act:cli.getActividades()) {
//					horas.add(act.getHora());
//				}
//				for (ActividadReservada act:cli.getActividades()) {
//					cont=0;
//					for (Double hora:horas) {
//						if (hora==act.getHora()) {
//							cont++;
//						}
//					}
//					if (cont>=2) {
//						repetido=true;
//						horaRep=act.getHora();
//					}
//				}
//			}
//		}
//		
//		if(repetido) {
//			System.out.println("Tiene actividades repetidas a las "+horaRep);
//		}
//	}

//	private void verActividad(int pass) {
//		for (Cliente cli:this.clientes) {
//			if (cli.getCodigo()==pass) {
//				for (ActividadReservada act:cli.getActividades()) {
//					System.out.println(act.getNombreActividad()+" "+act.getHora());
//				}
//			}
//		}
//		
//	}

	private void menuCliente() {
		System.out.println("1. ver actividades");
		System.out.println("2. Comprobar actividades");
		System.out.println("3. Coste del dia");
		System.out.println("4. Salir");
		
	}

	private boolean correcto(int pass) {
		for (Cliente cli:this.clientes) {
			if(cli.getCodigo()==pass) {
				return true;
			}
		}
		return false;
	}

	private void guardar() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("monitores.bin"));
			
			for (Monitor monitor:this.monitores) {
				out.writeObject(monitor);
			}
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void darAlta() {
		Scanner t=new Scanner(System.in);
		Monitor mon=new Monitor();
		
		System.out.println("Dime el nombre");
		mon.setNombre(t.next());
		System.out.println("Dime el apellido");
		mon.setApellido(t.next());
		System.out.println("Dime el email");
		mon.setEmail(t.next());
		System.out.println("Dime el codigo");
		mon.setCodigo(t.nextInt());
		
		mon.cargarActividades();
		
		this.monitores.add(mon);
	}

	private void leerMonitores() {
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("monitores.bin"));
			
			Monitor mon=null;
			while (in!=null) {
				try {
					mon=(Monitor)in.readObject();
					this.monitores.add(mon);
					//System.out.println(mon.getNombre()+" "+mon.getApellido());
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

	private void menu() {
		System.out.println("1. Ver monitores");
		System.out.println("2. Ver actividades");
		System.out.println("3. Dar de alta un monitor");
		System.out.println("4. Contar alumnos monitor");
		System.out.println("5. Salir y guardar");
		System.out.println("Elige una opcion");
	}

	private void imprimirMonitor(int pass) {
		for (Monitor monitor:this.monitores) {
			if (pass==monitor.getCodigo()) {
				System.out.println("Monitor "+pass+": "+monitor.getNombre()+" "+monitor.getApellido());
				for (ActividadReservada actividad:monitor.getActividades()) {
					if ((actividad.getnMaxPart()-actividad.getnPart())<=0) {
						System.out.println("Actividad "+actividad.getNombreActividad()+" a las "+actividad.getHora()+" no tiene plazas");
					} else {
						System.out.println((actividad.getnMaxPart()-actividad.getnPart())+" plazas disponibles "+actividad.getNombreActividad()+" a las "+actividad.getHora());

					}
				}
			}
		}
		
	}
	
//	private void cargarClientes() {
//		try {
//			Scanner in=new Scanner(new File("participantesCodigo.txt"));
//			
//			in.nextLine();
//			while(in.hasNext()) {
//			String linea[]=in.nextLine().split("-");
//				if (valida(Integer.parseInt(linea[0]))) {
//					ActividadReservada act=new ActividadReservada(linea[1], Double.parseDouble(linea[2]));
//					Cliente c=new Cliente(Integer.parseInt(linea[0]));
//					c.getActividades().add(act);
//					c.setTotalMes(10);
//					this.clientes.add(c);
//				} else {
//					for (Cliente cli:this.clientes) {
//						if(cli.getCodigo()==Integer.parseInt(linea[0])) {
//							cli.getActividades().add(new ActividadReservada(linea[1], Double.parseDouble(linea[2])));
//							cli.setTotalMes(10);
//						}
//					}
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	private boolean valida(int cod) {
//		for(Cliente cli:this.clientes) {
//			if (cli.getCodigo()==cod) {
//				return false;
//			}
//		}
//		return true;
//	}

}

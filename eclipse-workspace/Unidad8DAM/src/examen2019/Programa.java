package examen2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	private ArrayList<Empresa> proveedores;

	public Programa() {
		super();
		this.proveedores = new ArrayList<>();
	}
	
	public Programa(ArrayList<Empresa> proveedores) {
		super();
		this.proveedores = proveedores;
	}

	public ArrayList<Empresa> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Empresa> proveedores) {
		this.proveedores = proveedores;
	}

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		Programa p=new Programa();
		
		int año;
		int op;
		do {
			p.menu();
			op=t.nextInt();
			
			switch (op) {
			case 1:
				p.leerProveedores();
				System.out.println("Fichero leido");
//				for (Persona per:p.getProveedores()) {
//					System.out.println(per);
//				}
				break;
			case 2:
				p.leerPagos();
				System.out.println("Fichero leido");
				break;
			case 3:
				System.out.println("Dime el año");
				año=t.nextInt();
				System.out.println("Dime el trimestre");
				int tri=t.nextInt();
				p.generarIva(año, tri);
				break;
			case 4:
				System.out.println("Dime el año");
				año=t.nextInt();
				p.informe(año);
				break;
			case 5:
				System.out.println("Bye bye 🖐🖐🖐");
				break;
			}
		} while (op!=5);
		
		t.close();
	}
	
	private void informe(int año) {
		System.out.println("Informe anual del año "+año);
		
		double total=0;
		for (Empresa p:this.proveedores) {
			System.out.println("*********************************************************************");
			total=0;
			
			for (int i=1; i<5; i++) {
				System.out.println("Proveedor "+p.getNombre()+" - Trimestre "+i+": "+p.totalTrimestre(año, i));
				total+=p.totalTrimestre(año, i);
			}
			
			System.out.println("Total de "+p.getNombre()+" = "+total);
		}
	}

	private void generarIva(int año, int tri) {
		System.out.println("Informe de IVA del trimestre "+tri+" del año "+año);
		System.out.println("*********************************************************************");
		for (Empresa p:this.proveedores) {
			System.out.println("Proveedor "+p.getNombre()+" "+p.totalTrimestre(año, tri));
		}
	}

	private void leerPagos() {
		try {
			Scanner in=new Scanner(new File("pagos.csv"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split(";");
				linea[4]=linea[4].replace(',', '.');
				
				for (Empresa p:this.proveedores) {
					if (p.getCodigo()==Integer.parseInt(linea[0])) {
						Pago pago=new Pago(linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3]), Double.parseDouble(linea[4]));
						p.getPagos().add(pago);
						System.out.println(p.getNombre()+": "+pago);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void leerProveedores() {
		try {
			Scanner in=new Scanner(new File("proveedores.csv"));
			
			in.nextLine();
			while (in.hasNext()) {
				String linea[]=in.nextLine().split(";");
				Contacto c=new Contacto(linea[8], linea[4], Integer.parseInt(linea[6]), Integer.parseInt(linea[5]), linea[9]);
				
				if (linea[3].equals("suministro")) {
					this.proveedores.add(new Proveedor(Integer.parseInt(linea[0]), linea[1], linea[2], c, Double.parseDouble(linea[7])));
				} else {
					this.proveedores.add(new Subcontrata(Integer.parseInt(linea[0]), linea[1], linea[2], c, Integer.parseInt(linea[10])));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void menu() {
		System.out.println("****************************************************************");
		System.out.println("1. Leer proveedores");
		System.out.println("2. Leer pagos");
		System.out.println("3. Generar IVA de un trimestre");
		System.out.println("4. Informe de pagos anuales");
		System.out.println("5. Salir");
	}
}

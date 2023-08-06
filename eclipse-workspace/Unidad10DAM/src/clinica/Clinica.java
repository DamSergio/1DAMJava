package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica implements EntradasUsuario{
	private ArrayList<Profesional> medicos;
	private ArrayList<Paciente> pacientes;

	public Clinica() {
		super();
		this.medicos = new ArrayList<>();
		this.pacientes = new ArrayList<>();
	}
	
	public Clinica(ArrayList<Profesional> medicos, ArrayList<Paciente> pacientes) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
	}

	public ArrayList<Profesional> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Profesional> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Clinica app = new Clinica();
		String op="0";
		
		app.cargarFichero();
		
		do {
			app.menu();
			
			do {
				op=t.next();
				
				if(!app.esNum(op)) {
					System.out.println("Numero no valido");
				}
			} while (!app.esNum(op));
			
			
			switch (op) {
			case "1":
				app.listado();
				break;
			case "2":
				app.historia();
				break;
			case "3":
				System.out.println("Dime tu DNI");
				app.atender(t.next());
				break;
			case "4":
				System.out.println("Adios!!!🖐🖐🖐");
				break;
			}
		} while (!op.endsWith("4"));
	}

	private void atender(String dni) {
		Scanner t = new Scanner(System.in);
		for (Paciente p : this.pacientes) {
			if (p.getDni().equals(dni)) {
				System.out.println("El paciente es: "+p.getNombre()+" "+p.getApellido());
				System.out.println("el motivo de su visita");
				
				String cad="";
				String cadena="";
				do {
					cad=t.nextLine();
					if (!cad.equalsIgnoreCase("fin")) {
						cadena=cadena+cad+"\n";
					}
				} while (!cad.equalsIgnoreCase("fin"));
				
				p.setHistoria(p.getHistoria()+"\n\n"+cadena);
				//System.out.println(p.getHistoria());
				p.guardarHistoria();
			}
		}
	}

	private void historia() {
		for (Paciente p : this.pacientes) {
			try {
				Scanner in = new Scanner(new File("Historia"+p.getDni()+".txt"));
				
				String cad="";
				while(in.hasNext()) {
					cad=cad+in.nextLine()+"\n";
				}
				
				p.setHistoria(cad);
				//System.out.println(p.getHistoria());
				System.out.println("Existe Historia "+p.getDni()+".txt");
			} catch (FileNotFoundException e) {
				//System.out.println("No existe "+p.getDni());
			}
		}
		
	}

	private void listado() {
		for (Profesional p : this.medicos) {
			System.out.println("************************* "+p.getEspecialidad()+" *************************");
			System.out.println("lista de pacientes de Dr/Dra."+p.getNombre()+" "+p.getApellido()+" es:");
			
			this.pacientes.stream().filter(i->i.getCita().equals(p.getEspecialidad())).forEach(i->System.out.println("\t"+i.getNombre()+" "+i.getApellido()+"\n"));
		}
		
	}

	private void cargarFichero() {
		try {
			Scanner in = new Scanner(new File("personas.csv"));
			
			in.nextLine();
			while(in.hasNext()) {
				String cad=quitarTildes(in.nextLine());
				String linea[]=cad.split(";");
				if (linea[0].equals("medico")) {
					this.medicos.add(new Profesional(linea[1], linea[2], linea[3], linea[4], linea[5], Integer.parseInt(linea[6])));
				} else {
					this.pacientes.add(new Paciente(linea[1], linea[2], linea[3], linea[4], Float.parseFloat(linea[7]), Integer.parseInt(linea[8]), linea[10]));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private String quitarTildes(String cadena) {
		cadena=cadena.replace('á', 'a');
		cadena=cadena.replace('é', 'e');
		cadena=cadena.replace('í', 'i');
		cadena=cadena.replace('ó', 'o');
		cadena=cadena.replace('ú', 'u');
		
		return cadena;
	}

	private void menu() {
		System.out.println("1. Listado de pacientes");
		System.out.println("2. Cargar historias clinicas");
		System.out.println("3. Atender paciente");
		System.out.println("4. Salir");
		System.out.println("Elija una opcion:");
	}

	@Override
	public boolean esNum(String cad) {
		return cad.matches("[0-9]+");
	}

}

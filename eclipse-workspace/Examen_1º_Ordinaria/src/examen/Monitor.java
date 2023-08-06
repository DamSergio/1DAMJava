package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona {
	private int codigoMonitor;
	private String clave;
	private ArrayList<Clase> clasesImpartidas;
	private double extraClases;
	private double extraAlumnos;
	private static final int BASE = 1200;
	
	public Monitor() {
		super();
		this.codigoMonitor = 0;
		this.clave = "";
		this.clasesImpartidas = new ArrayList<>();
		this.extraClases = 0;
		this.extraAlumnos = 0;
	}
	
	public Monitor(String dni, String nombre, String apellido, String direccion, String correo, int codigoMonitor,
			String clave) {
		super(dni, nombre, apellido, direccion, correo);
		this.codigoMonitor = codigoMonitor;
		this.clave = clave;
		this.clasesImpartidas = new ArrayList<>();
		this.extraClases = 0;
		this.extraAlumnos = 0;
	}
	
	public Monitor(String dni, String nombre, String apellido, String direccion, String correo, int codigoMonitor,
			String clave, ArrayList<Clase> clasesImpartidas, double extraClases, double extraAlumnos) {
		super(dni, nombre, apellido, direccion, correo);
		this.codigoMonitor = codigoMonitor;
		this.clave = clave;
		this.clasesImpartidas = clasesImpartidas;
		this.extraClases = extraClases;
		this.extraAlumnos = extraAlumnos;
	}

	public int getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public ArrayList<Clase> getClasesImpartidas() {
		return clasesImpartidas;
	}

	public void setClasesImpartidas(ArrayList<Clase> clasesImpartidas) {
		this.clasesImpartidas = clasesImpartidas;
	}

	public double getExtraClases() {
		return extraClases;
	}

	public void setExtraClases(double extraClases) {
		this.extraClases = extraClases;
	}

	public double getExtraAlumnos() {
		return extraAlumnos;
	}

	public void setExtraAlumnos(double extraAlumnos) {
		this.extraAlumnos = extraAlumnos;
	}

	public static int getBase() {
		return BASE;
	}

	@Override
	public String toString() {
		return "Monitor [codigoMonitor=" + codigoMonitor + ", clave=" + clave + ", clasesImpartidas=" + clasesImpartidas
				+ ", extraClases=" + extraClases + ", extraAlumnos=" + extraAlumnos + "]";
	}
	
	public void clasesMonitor(String mes, int year) throws FileNotFoundException {
		Scanner in = new Scanner(new File("asistencia"+mes+year+".csv"));
		
		in.nextLine();
		while (in.hasNext()) {
			String line[] = in.nextLine().split(";");
			boolean pertenece_al_monitor = this.codigoMonitor == Integer.parseInt(line[5]);
			
			if (pertenece_al_monitor) {
				this.clasesImpartidas.add(new Clase(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6].trim())));
			}
		}
	}
	
	public void calculaComplementoClases(String mes) throws FileNotFoundException {
		int clases_dia = 0;
		int alumnos_dia = 0;
		
		PrintWriter out = new PrintWriter(new File("Complemento"+mes+this.getNombre()+this.getApellido()+".txt"));
		
		out.println("*****************************************************");
		out.println("MES: "+mes);
		out.println("Complementos nomina: "+this.getNombre()+" "+this.getApellido());
		out.println("*****************************************************");
		
		for (int dia = 1; dia <= 31; dia++) {
			clases_dia = 0;
			alumnos_dia = 0;
			
			for (Clase clas:this.clasesImpartidas) {
				if (clas.getDia() == dia) {
					clases_dia++;
					alumnos_dia += clas.getNumParticipantes();
				}
			}
			
			if (clases_dia != 0) {
				out.println("Dia "+dia+":");
				out.println("\tNumero de clases: "+clases_dia+" a 5€/clase= "+(clases_dia*5)+"€");
				this.extraClases += clases_dia*5;
				
				out.println("\tNumero total alumnos: "+alumnos_dia+" a 0,05€/alumno= "+(alumnos_dia*0.05)+"€");
				this.extraAlumnos += alumnos_dia*0.05;
			}
		}
		
		out.println("Total por clases: "+this.extraClases+"€");
		out.println("Total por alumnos: "+this.extraAlumnos+"€");
		
		out.flush();
		out.close();
	}
}

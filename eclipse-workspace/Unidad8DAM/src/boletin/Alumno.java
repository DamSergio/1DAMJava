package boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona{
	private ArrayList<Nota> notas;

	public Alumno() {
		super();
		this.notas = new ArrayList<>();
	}
	
	public Alumno(int codigo, String dNI, String nombre, String apellidos) {
		super(codigo, dNI, nombre, apellidos);
		this.notas = new ArrayList<>();
	}
	
	public Alumno(int codigo, String dNI, String nombre, String apellidos, ArrayList<Nota> notas) {
		super(codigo, dNI, nombre, apellidos);
		this.notas = notas;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void cargarNotas() {
		try {
			Scanner in=new Scanner(new File("matricula.csv"));
			
			String linea[];
			while(in.hasNext()) {
				linea=in.nextLine().split(";");
				if (this.getCodigo()==Integer.parseInt(linea[2])) {
					this.notas.add(new Nota(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Alumno [notas=" + notas + "]";
	}
}

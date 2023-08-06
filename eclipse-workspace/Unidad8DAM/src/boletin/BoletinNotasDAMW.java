package boletin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoletinNotasDAMW {
	private ArrayList<Alumno>dam;
	
	public BoletinNotasDAMW() {
		dam=new ArrayList<>();
	}
	
	public void cargaInicial() throws IOException {
		Scanner in=new Scanner(new File("Alumnos.csv"));
		
		String linea[];
		while(in.hasNext()) {
			linea=in.nextLine().split(";");
			this.dam.add(new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));
		}
	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}
	
	public void menu() {
		System.out.println("1. Leer notas");
		System.out.println("2. Imprimir boletines");
		System.out.println("3. Salir");
		System.out.println("Elige una opcion");
	}
	
	public static void main(String[] args) throws IOException {
		Scanner t=new Scanner(System.in);
		BoletinNotasDAMW app=new BoletinNotasDAMW();
		
		app.cargaInicial();
			
		int op=0;
		do {
			app.menu();
			op=t.nextInt();
			
			switch(op) {
			case 1:
				for (Alumno i:app.getDam()) {
					i.cargarNotas();
				}
				break;
			case 2:
				app.imrpimirNotas();
				break;
			case 3:
				System.out.println("Adios 🖐🖐🖐");
				break;
			}
		} while(op!=3);
		
		t.close();
	}

	private void imrpimirNotas() throws IOException{
		float suma=0;
		float cont=0;
		
		for (Alumno i:this.dam) {
			PrintWriter out=new PrintWriter(new File("Boletin"+i.getNombre()+i.getApellidos()+".txt"));
			suma=0;
			cont=0;
			
			out.println("***************IES RIBERA DEL TAJO***************");
			out.println("Curso 1DAMW");
			out.println(i.getNombre());
			for (Nota j:i.getNotas()) {
				out.println("\t"+j.getNombre()+": "+j.getNota());
				suma+=j.getNota();
				cont++;
			}
			
			float media=suma/cont;
			out.println("Nota media: "+media);
			
			out.flush();
			out.close();
		}
		
	}
}
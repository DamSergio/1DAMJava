package correos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CorreoRibera {
	private ArrayList<Correo> listaCorreos;

	public CorreoRibera() {
		this.listaCorreos = new ArrayList<>();
	}

	public ArrayList<Correo> getListaCorreos() {
		return listaCorreos;
	}

	public void setListaCorreos(ArrayList<Correo> listaCorreos) {
		this.listaCorreos = listaCorreos;
	}
	
	public static void main(String[] args) {
		CorreoRibera c=new CorreoRibera();
		
		//LEO FICHERO
		Scanner in;
		try {
			in = new Scanner(new File("AlumnosDAM.csv"));
			//SALTO CABECERA (5 LINEAS)
			for (int i=0; i<5; i++) {
				in.nextLine();
			}
			//RECORRO EL FICHERO
			String cadena;
			String linea[];
			String curso="";
			while (in.hasNext()) {
				cadena=in.nextLine();
				//System.out.println(cadena);
				linea=cadena.split(";");
				String nombreApe=linea[0];
				curso=linea[2];
//				System.out.println(nombreApe+" "+curso);
				String nombre=c.getNombre(nombreApe);
				String ape1=c.getApellido1(nombreApe);
//				System.out.println(nombre);
//				System.out.println(ape1);
//				System.out.println(curso);
				
				c.getListaCorreos().add(new Correo(nombre, ape1, curso, curso.substring(0,curso.length()-1).toLowerCase()+"_"+nombre+ape1+"@riberadeltajo.es"));
			}
			
			c.generarFicheroTexto(curso);
			c.generarFicheroCSV(curso);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("******************************************************************************");
//		
//		
//		File f=new File("Correos.txt");
//		try {
//			PrintWriter out=new PrintWriter(f);
//			
//			for (Correo i:c.getListaCorreos()) {
//				out.println(i.getCorreo());
//				//ºSystem.out.println(i.getCorreo());
//			}
//			
//			out.flush();
//			out.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private void generarFicheroCSV(String curso) {
		int cont=1;
		try {
			PrintWriter out=new PrintWriter(new File("Correos"+curso+".csv"));
			
			out.println("Correos de: "+curso);
			out.println("numero;correo");
			for (Correo i:this.getListaCorreos()) {
				out.println(cont+";"+i.getCorreo());
				cont++;
			}
			
			out.flush();
			out.close();
			
			System.out.println("Fichero: Correos"+curso+".csv creado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void generarFicheroTexto(String curso) {
		try {
			PrintWriter out=new PrintWriter(new File("Correos"+curso+".txt"));
			
			out.println("Correos de: "+curso);
			out.println();
			for (Correo i:this.getListaCorreos()) {
				out.println(i.getCorreo());
			}
			
			out.flush();
			out.close();
			
			System.out.println("Fichero: Correos"+curso+".txt creado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private String getApellido1(String nombreApe) {
		String cadena[]=nombreApe.split(" ");
		String ape1=cadena[0].trim().toLowerCase();
		
		ape1=quitaTilde(ape1);
		
		return ape1;
	}

	private String getNombre(String nombreApe) {
		String cadena[]=nombreApe.split(",");
		String nombre=cadena[1].trim().toLowerCase();
		
		nombre=quitaTilde(nombre);

		for (int i=0; i<nombre.length(); i++) {
			if (nombre.charAt(i)==' ') {
				String linea[]=nombre.split(" ");
				nombre=linea[0]+linea[1];
			}
		}
		
		return nombre;
	}
	
	private String quitaTilde(String cadena) {
		
		cadena=cadena.replace('á', 'a');
		cadena=cadena.replace('é', 'e');
		cadena=cadena.replace('í', 'i');
		cadena=cadena.replace('ó', 'o');
		cadena=cadena.replace('ú', 'u');
		cadena=cadena.replace('ñ', 'n');
		
		return cadena;
	}
}

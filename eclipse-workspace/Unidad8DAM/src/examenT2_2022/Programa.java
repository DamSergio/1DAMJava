package examenT2_2022;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	private ArrayList<Alumno> DAM;
	private ArrayList<Alumno> DAW;

	public Programa() {
		super();
		DAM = new ArrayList<>();
		DAW = new ArrayList<>();
	}
	
	public Programa(ArrayList<Alumno> dAM, ArrayList<Alumno> dAW) {
		super();
		DAM = dAM;
		DAW = dAW;
	}

	public ArrayList<Alumno> getDAM() {
		return DAM;
	}

	public void setDAM(ArrayList<Alumno> dAM) {
		DAM = dAM;
	}

	public ArrayList<Alumno> getDAW() {
		return DAW;
	}

	public void setDAW(ArrayList<Alumno> dAW) {
		DAW = dAW;
	}
	
	public void leerFicheroCSV(String filename) throws IOException {
		Scanner in=new Scanner(new File(filename));
		
		in.nextLine();
		while (in.hasNext()) {
			String linea[]=in.nextLine().split(";");
			if (linea[4].trim().equals("dam")) {
				Alumno a=new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], Double.parseDouble(linea[3]), linea[4]);
				this.DAM.add(a);
			} else {
				Alumno a=new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], Double.parseDouble(linea[3]), linea[4]);
				this.DAW.add(a);
			}
		}
	}
	
	public static void main(String[] args) {
		Programa p=new Programa();
		double mediaDAM=0;
		double mediaDAW=0;
		
		try {
			p.leerFicheroCSV("alumnoss.csv");
			
			System.out.println("Media de DAM");
			for(Alumno a:p.getDAM()) {
				mediaDAM+=a.getNotaMedia();
			}
			mediaDAM/=p.getDAM().size();
			System.out.println(mediaDAM);
			
			System.out.println("Media de DAW");
			for(Alumno a:p.getDAW()) {
				mediaDAW+=a.getNotaMedia();
			}
			mediaDAW=mediaDAW/p.getDAW().size();
			System.out.println(mediaDAW);
			
			p.escribirCSVDAM("DAM.csv", mediaDAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void escribirCSVDAM(String filename, double media) throws IOException{
		PrintWriter out=new PrintWriter(new File(filename));
		
		for (Alumno a:this.getDAM()) {
			if (a.getNotaMedia()>=media) {
				out.println(a);
			}
		}
		
		out.flush();
		out.close();
	}
}

package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona implements Serializable{
	private ArrayList<ActividadReservada> actividades;

	public Monitor() {
		super();
		this.actividades = new ArrayList<>();
	}
	
	public Monitor(int codigo, String nombre, String apellido, String email,
			ArrayList<ActividadReservada> actividades) {
		super(codigo, nombre, apellido, email);
		this.actividades = actividades;
	}

	public ArrayList<ActividadReservada> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadReservada> actividades) {
		this.actividades = actividades;
	}

	@Override
	public String toString() {
		return "Monitor [actividades=" + actividades + "]";
	}
	
	public void cargarActividades() {
		try {
			Scanner in=new Scanner(new File("reserva.csv"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split(";");
				if (this.getCodigo()==Integer.parseInt(linea[2])) {
					this.actividades.add(new ActividadReservada(linea[0], Double.parseDouble(linea[1]), Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

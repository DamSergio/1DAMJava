package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class ActividadReservada implements Serializable{
	private String nombreActividad;
	private double hora;
	private int codigoMonitor;
	private int nMaxPart;
	private int nPart;
	
	public ActividadReservada() {
		super();
		this.nombreActividad = "";
		this.hora = 0;
		this.codigoMonitor = 0;
		this.nMaxPart = 0;
		this.nPart = this.calcularParticipantes();
	}
	
	public ActividadReservada(String nombreActividad, double hora) {
		super();
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = 0;
		this.nMaxPart = 0;
		this.nPart = this.calcularParticipantes();
	}
	
	public ActividadReservada(String nombreActividad, double hora, int codigoMonitor, int nMaxPart) {
		super();
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMaxPart = nMaxPart;
		this.nPart = this.calcularParticipantes();
	}

	private int calcularParticipantes() {
		int participantes=0;
		try {
			Scanner in=new Scanner(new File("participantes.txt"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split("-");
				if (this.nombreActividad.equals(linea[1]) && Double.parseDouble(linea[2])==this.hora) {
					participantes++;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return participantes;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public int getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getnMaxPart() {
		return nMaxPart;
	}

	public void setnMaxPart(int nMaxPart) {
		this.nMaxPart = nMaxPart;
	}

	public int getnPart() {
		return nPart;
	}

	public void setnPart(int nPart) {
		this.nPart = nPart;
	}

	@Override
	public String toString() {
		return "ActividadReservada [nombreActividad=" + nombreActividad + ", hora=" + hora + ", codigoMonitor="
				+ codigoMonitor + ", nMaxPart=" + nMaxPart + ", nPart=" + nPart + "]";
	}
	
	
}

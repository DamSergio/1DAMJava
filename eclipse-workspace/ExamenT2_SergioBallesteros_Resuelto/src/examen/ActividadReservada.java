package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ActividadReservada {
	private String nombreActividad;
	private double hora;
	private String codigoMonitor;
	private int nMax;
	private int nPart;
	
	public ActividadReservada() {
		super();
		this.nombreActividad = "";
		this.hora = 0;
		this.codigoMonitor = "";
		this.nMax = 0;
		this.nPart = 0;
	}
	
	public ActividadReservada(String nombreActividad, double hora, String codigoMonitor, int nMax) {
		super();
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMax = nMax;
		this.nPart = calcularPart();
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

	public String getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getnMax() {
		return nMax;
	}

	public void setnMax(int nMax) {
		this.nMax = nMax;
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
				+ codigoMonitor + ", nMax=" + nMax + ", nPart=" + nPart + "]";
	}
	
	private int calcularPart() {
		int part=0;
		try {
			Scanner in=new Scanner(new File("participantes.txt"));
			
			in.nextLine();
			while(in.hasNext()) {
				String linea[]=in.nextLine().split("-");
				if (linea[1].equals(this.nombreActividad) && Double.parseDouble(linea[2])==this.hora) {
					part++;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return part;
	}
}

package videoClub;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Cliente {
	private Alquiler alquileres[];
	private String nombre;
	private int nAlquileres;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres=new Alquiler[1];
		this.nAlquileres=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevoAlquiler(Alquiler alquiler) {
		if (this.nAlquileres>=this.alquileres.length) {
			Alquiler nAlquiler[]=new Alquiler[this.alquileres.length+1];
			for (int i=0; i<this.alquileres.length; i++) {
				nAlquiler[i]=this.alquileres[i];
			}
			this.alquileres=nAlquiler;
		}
		this.alquileres[this.nAlquileres]=alquiler;
		this.nAlquileres++;
		
	}
	
	public double informe() throws FileNotFoundException {
		PrintWriter salida=new PrintWriter("Ticket-"+this.nombre+".txt");
		
		double precio=0;
		double pTotal=0;
		int puntos=this.alquileres.length;
		salida.println("Informe para "+this.nombre);
		for (int i=0; i<this.alquileres.length; i++) {
			switch (this.alquileres[i].getDVD().getTipo()) {
			case Dvd.NORMAL:
				precio=2*this.alquileres[i].getTiempo();
				break;
			case Dvd.NOVEDAD:
				precio=3*this.alquileres[i].getTiempo();
				if (this.alquileres[i].getTiempo()>1) {
					puntos++;
				}
				break;
			case Dvd.INFANTIL:
				precio=1.5*this.alquileres[i].getTiempo();
				break;
			}
			salida.println("\t"+this.alquileres[i].getDVD().getTitulo()+"\t"+precio+" euros");
			pTotal+=precio;
		}
		salida.println("IMPORTE TOTAL = "+pTotal+" euros");
		salida.println("Dispone de "+puntos+" puntos");
		salida.flush();
		salida.close();
		
		return pTotal;
	}
	
	
}

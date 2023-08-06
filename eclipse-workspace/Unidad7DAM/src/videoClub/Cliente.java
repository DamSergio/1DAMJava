package videoClub;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cliente {
	private ArrayList <Alquiler> alquileres;
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevoAlquiler(Alquiler alquiler) {
		this.alquileres.add(alquiler);
	}
	
	public ArrayList <Alquiler> getAlquiler(){
		return this.alquileres;
	}
	
	public double informe() throws FileNotFoundException {
		PrintWriter salida=new PrintWriter("Ticket-"+this.nombre+".txt");
		
		double precio=0;
		double pTotal=0;
		int puntos=this.alquileres.size();
		salida.println("Informe para "+this.nombre);
		System.out.println("Informe para "+this.nombre);
		for (Alquiler i:this.alquileres) {
			switch (i.getDVD().getTipo()) {
			case Dvd.NORMAL:
				precio=2*i.getTiempo();
				break;
			case Dvd.NOVEDAD:
				precio=3*i.getTiempo();
				if (i.getTiempo()>1) {
					puntos++;
				}
				break;
			case Dvd.INFANTIL:
				precio=1.5*i.getTiempo();
				break;
			}
			salida.println("\t"+i.getDVD().getTitulo()+"\t"+precio+" euros");
			System.out.println("\t"+i.getDVD().getTitulo()+"\t"+precio+" euros");
			pTotal+=precio;
		}
		salida.println("IMPORTE TOTAL = "+pTotal+" euros");
		System.out.println("IMPORTE TOTAL = "+pTotal+" euros");
		salida.println("Dispone de "+puntos+" puntos");
		System.out.println("Dispone de "+puntos+" puntos");
		salida.flush();
		salida.close();
		
		return pTotal;
	}
	
	
}

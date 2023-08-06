package proveedores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Programa{
	private ArrayList<Pieza> piezas;
	private ArrayList<Proveedor> proveedores;
	
	public Programa() {
		this.piezas = new ArrayList<>();
		this.proveedores = new ArrayList<>();
	}
	
	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	
	@Override
	public String toString() {
		return "Programa [piezas=" + piezas + ", proveedores=" + proveedores + "]";
	}

	public static void main(String[] args) {
		Programa p=new Programa();
		Utilidades u=new Utilidades();
		
		p.setPiezas(u.leerPiezas("piezas.csv"));
		p.setProveedores(u.leerProveedores("proveedor.csv"));
		
		p.generarFichero("proveedorPieza.txt");
	}
	
	public void generarFichero(String filename) {
		double suma=0;
		try {
			PrintWriter out=new PrintWriter(new File(filename));
			
			for (Proveedor i:this.getProveedores()) {
				out.println("El proveedor "+i.getNombreProveedor()+" suministra:");
				for (Pieza j:this.getPiezas()) {
					if (i.getCodProveedor()==j.getProveedor()) {
						suma+=j.getPeso();
						out.println("\t*)"+j.getNombrePieza().toUpperCase().charAt(0)+j.getNombrePieza().substring(1));
					}
				}
				out.println("\tPeso total: "+suma);
				suma=0;
			}
			
			out.flush();
			out.close();
			
			System.out.println("Fichero creado");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
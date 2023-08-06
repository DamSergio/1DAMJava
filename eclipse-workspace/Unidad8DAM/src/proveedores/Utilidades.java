package proveedores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
	private Scanner in;
	
	public ArrayList<Pieza> leerPiezas(String filename){
		ArrayList<Pieza> piezas=new ArrayList<>();
		
		try {
			this.in=new Scanner(new File(filename));
			this.in.nextLine();
			
			while(this.in.hasNext()) {
				String linea[];
				linea=this.in.nextLine().split(";");
				
				int cod=Integer.parseInt(linea[0]);
				String pieza=linea[1];
				int prov=Integer.parseInt(linea[2]);
				double peso=Double.parseDouble(linea[3]);
				
				piezas.add(new Pieza(cod,pieza,prov,peso));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return piezas;
	}
	
	public ArrayList<Proveedor> leerProveedores(String filename){
		ArrayList<Proveedor> proveedores=new ArrayList<>();
		
		try {
			this.in=new Scanner(new File(filename));
			this.in.nextLine();
			
			while(this.in.hasNext()) {
				String linea[];
				linea=this.in.nextLine().split(";");
				
				int cod=Integer.parseInt(linea[0]);
				String nombre=linea[1];
				String loc=linea[2];
				
				proveedores.add(new Proveedor(cod,nombre,loc));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proveedores;
	}
}

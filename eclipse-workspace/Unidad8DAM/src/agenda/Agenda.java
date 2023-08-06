package agenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> lista;

	public Agenda() {
		super();
		this.lista = new ArrayList<>();
	}
	
	public Agenda(ArrayList<Contacto> lista) {
		super();
		this.lista = lista;
	}

	public ArrayList<Contacto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Contacto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	public void cargarAgenda(String filename) {
		try {
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(fi);
			
			Contacto c=null;
			while(in!=null) {
				try {
					
					c=(Contacto)in.readObject();
					this.añadirContacto(c);
					
				} catch (Exception e) {
					
					in=null;
					
				}
				
			}//WHILE
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardarAgenda(String filename) {
		try {
			FileOutputStream fo=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(fo);
			
			for (Contacto i:this.getLista()) {
				//ESCRIBIMOS CADA OBJETO EN EL FICHERO
				out.writeObject(i);
			}
			
			fo.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void imprimirAgenda() {
		System.out.println("Los contactos son:\n");
		for (Contacto i:this.getLista()) {
			System.out.println("\t"+i.getNombre()+" "+i.getTelefono());
		}
	}
	
	public void añadirContacto(Contacto c) {
		this.getLista().add(c);
	}
	
	public void borrarContacto(String nombre) {
		for (int i=0; i<this.lista.size(); i++) {
			if (this.getLista().get(i).getNombre().equalsIgnoreCase(nombre)) {
				this.getLista().remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Agenda a=new Agenda();
		
		Contacto c1=new Contacto("sergio", "601274661", "c berlin 177", "dante01.bc@gmail.com");
		Contacto c2=new Contacto("pepito", "601274661", "c berlin 177", "dante01.bc@gmail.com");
		Contacto c3=new Contacto("carlitos", "601274661", "c berlin 177", "dante01.bc@gmail.com");
		
		a.añadirContacto(c1);
		a.añadirContacto(c2);
		a.añadirContacto(c3);
		//GUARDAR EN FICHERO
		a.guardarAgenda("contactos.bin");
		//CARGAR CONTACTOS DESDE FICHERO
		a.getLista().clear();
		a.cargarAgenda("contactos.bin");
		a.imprimirAgenda();
	}
}
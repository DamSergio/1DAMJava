package videoClub;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		double caja=0;
		//Creo mi cliente
		 Cliente c1=new Cliente("Juan López Sánchez");
		 //Creo los 3 DVD
		 Dvd casablanca = new Dvd("Casablanca",Dvd.NORMAL);
		 Dvd indy = new Dvd("Indiana Jones XIII",Dvd.NOVEDAD);
		 Dvd shrek = new Dvd("Shrek",Dvd.INFANTIL);
		 //Creo el alquiler y se lo asigno a mi cliente
		 Alquiler a11=new Alquiler(casablanca,2);
		 Alquiler a12=new Alquiler(indy,1);
		 Alquiler a13=new Alquiler(shrek, 5);
		 
		 //System.out.println(casablanca.getTipo());
		 c1.nuevoAlquiler(a11);
		 c1.nuevoAlquiler(a12);
		 c1.nuevoAlquiler(a13);
		 
		 caja+=c1.informe();
		 
		 System.out.println("\n**************************************************************\n");
		 //CLIENTE2
		 
		 Cliente c2=new Cliente("Pedrito");
		 
		 Alquiler a21=new Alquiler(shrek, 14);
		 Alquiler a22=new Alquiler(indy, 7);
		 
		 c2.nuevoAlquiler(a21);
		 c2.nuevoAlquiler(a22);
		 
		 caja+=c2.informe();
		 
		 System.out.println("\n**************************************************************\n");
		 
		 System.out.println("Caja de hoy: "+caja+"€");
		 
	}

}

package videoClub;

public class Alquiler {
	private Dvd DVD;
	private int tiempo;
	
	public Alquiler() {
		this.DVD=null;
		this.tiempo=0;
	}
	
	public Alquiler(Dvd Dvd, int tiempo) {
		DVD = Dvd;
		this.tiempo = tiempo;
	}

	public int getTiempo() {
		return tiempo;
	}
	
	public Dvd getDVD() {
		return DVD;
	}
	
	
	
}

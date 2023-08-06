package repasoUT6;

public class Direccion {
	private String calle;
	private String nPortal;
	private int nPiso;
	private int nPuerta;
	private int cp;
	
	public Direccion(String calle, String nPortal, int cp) {
		this.calle = calle;
		this.nPortal = nPortal;
		this.nPiso = 0;
		this.nPuerta = 0;
		this.cp = cp;
	}
	
	public Direccion(String calle, String nPortal, int nPiso, int nPuerta, int cp) {
		this.calle = calle;
		this.nPortal = nPortal;
		this.nPiso = nPiso;
		this.nPuerta = nPuerta;
		this.cp = cp;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getnPortal() {
		return nPortal;
	}
	public void setnPortal(String nPortal) {
		this.nPortal = nPortal;
	}
	public int getnPiso() {
		return nPiso;
	}
	public void setnPiso(int nPiso) {
		this.nPiso = nPiso;
	}
	public int getnPuerta() {
		return nPuerta;
	}
	public void setnPuerta(int nPuerta) {
		this.nPuerta = nPuerta;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	@Override
	public String toString() {
		return "calle "+calle+", numero "+nPortal+", piso "+nPiso+", puerta "+nPuerta+", codigo postal "+cp;
	}
	
	public static void main(String[] args) {
		Direccion d=new Direccion("Plaza del pan", "1B", 1, 2, 45600);
		System.out.println(d);
	}
}

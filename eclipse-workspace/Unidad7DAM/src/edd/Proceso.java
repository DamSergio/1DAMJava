package edd;

public class Proceso {
	private String nombre;
	private int pid;
	private String nSesion;
	private int numSesion;
	private double memoria;
	
	public Proceso() {
		this.nombre = "";
		this.pid = 0;
		this.nSesion = "";
		this.numSesion = 0;
		this.memoria = 0;
	}
	
	public Proceso(String nombre, int pid, String nSesion, int numSesion, double memoria) {
		this.nombre = nombre;
		this.pid = pid;
		this.nSesion = nSesion;
		this.numSesion = numSesion;
		this.memoria = memoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getnSesion() {
		return nSesion;
	}

	public void setnSesion(String nSesion) {
		this.nSesion = nSesion;
	}

	public int getNumSesion() {
		return numSesion;
	}

	public void setNumSesion(int numSesion) {
		this.numSesion = numSesion;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", pid=" + pid + ", nSesion=" + nSesion + ", numSesion=" + numSesion
				+ ", memoria=" + memoria + "]";
	}
	
	
}

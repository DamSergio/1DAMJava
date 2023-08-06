package examen;

public class Clase {
	private int dia;
	private String mes;
	private int año;
	private String codigoClase;
	private int hora;
	private int codigoMonitor;
	private int numParticipantes;
	
	public Clase() {
		super();
		this.dia = 0;
		this.mes = "";
		this.año = 0;
		this.codigoClase = "";
		this.hora = 0;
		this.codigoMonitor = 0;
		this.numParticipantes = 0;
	}
	
	public Clase(int dia, String mes, int año, String codigoClase, int hora, int codigoMonitor, int numParticipantes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.codigoClase = codigoClase;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.numParticipantes = numParticipantes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getCodigoClase() {
		return codigoClase;
	}

	public void setCodigoClase(String codigoClase) {
		this.codigoClase = codigoClase;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Clase [dia=" + dia + ", mes=" + mes + ", año=" + año + ", codigoClase=" + codigoClase + ", hora=" + hora
				+ ", codigoMonitor=" + codigoMonitor + ", numParticipantes=" + numParticipantes + "]";
	}
}

package gruposYcanciones;

public class Canciones {
	
	private String codigoCancion;
	private String disco;
	private String nombre;
	private String minuto;
	private String segundo;
	
	
	
	//construtor vacio
	public Canciones() {

		this.codigoCancion = "";
		this.disco = "";
		this.nombre = "";
		this.minuto = "";
		this.segundo = "";
	}
	//contructor
	public Canciones(String codigoCancion, String disco, String nombre, String minuto, String segundo) {
		super();
		this.codigoCancion = codigoCancion;
		this.disco = disco;
		this.nombre = nombre;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	//get set
	public String getCodigoCancion() {
		return codigoCancion;
	}
	public void setCodigoCancion(String codigoCancion) {
		this.codigoCancion = codigoCancion;
	}
	public String getDisco() {
		return disco;
	}
	public void setDisco(String disco) {
		this.disco = disco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMinuto() {
		return minuto;
	}
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	public String getSegundo() {
		return segundo;
	}
	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}
	
	//to String
	@Override
	public String toString() {
		return "Disco: "+disco+"---"+nombre;
	}
	
	
	
}

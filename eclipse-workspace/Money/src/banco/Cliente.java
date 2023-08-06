package banco;   //Andrea
import java.util.ArrayList;
public class Cliente {
	private String codigoCliente;
	private String dni;
	private String nombre;
	private String apellidos;
	private ArrayList <Cuenta> cuentas;
	
	
	public double toltaCuenta() {
		double total=0;
		for(Cuenta cli:this.cuentas) {
			total+=cli.getSaldo();
		}
		return total;
		
	}
	
		//constructor menos AL
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
		super();
		this.cuentas=new ArrayList<>();
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	//constructor
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
		super();
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}
	//getters y setters
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", dni=" + dni + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", cuentas=" + cuentas + "]";
	}
	
	
	public void mostrarCuentas() {
		System.out.println("Cuentas bancarias: ");
		for(Cuenta cli:this.cuentas) {
			System.out.println("\t"+cli.getCuenta()+" "+cli.getSaldo());
		}
		
	}
	
	public double totalCuentas() {
		double total=0;
		for(Cuenta cli:this.cuentas) {
			total+=cli.getSaldo();
		}
			return total;
	}
}

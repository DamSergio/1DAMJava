package aparcamineto;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
	private int hora;
	private int dias;
	private Vehiculo vehiculo;
	
	public Cliente() {
		super();
		this.hora = 0;
		this.dias = 0;
		this.vehiculo=null;
	}
	
	public Cliente(String dni, String nombre, String apellidos, int edad, String direccion, String email, int hora,
			int dias, Vehiculo vehiculo) {
		super(dni, nombre, apellidos, edad, direccion, email);
		this.hora = hora;
		this.dias = dias;
		this.vehiculo = vehiculo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cliente [hora=" + hora + ", dias=" + dias + ", vehiculo=" + vehiculo + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
				+ ", getDireccion()=" + getDireccion() + ", getEmail()=" + getEmail() + "]";
	}

	
}

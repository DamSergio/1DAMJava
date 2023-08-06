package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paciente extends Persona{
	private float peso;
	private int edad;
	private String cita;
	private String historia;
	
	public Paciente() {
		super();
		this.peso = 0;
		this.edad = 0;
		this.cita = "";
		this.historia = "";
	}
	
	public Paciente(String dni, String nombre, String apellido, String telefono, float peso, int edad, String cita) {
		super(dni, nombre, apellido, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = "";
	}
	
	public Paciente(String dni, String nombre, String apellido, String telefono, float peso, int edad, String cita,
			String historia) {
		super(dni, nombre, apellido, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getTelefono()="
				+ getTelefono() + "]";
	}

	public void guardarHistoria() {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("Historia"+this.getDni()+".txt"), true);
			
			out.println(this.historia);
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
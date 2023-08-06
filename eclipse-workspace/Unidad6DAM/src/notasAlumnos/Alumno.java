package notasAlumnos;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private Nota notas[];
	
	public Alumno () {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		this.notas=new Nota[7];
		for (int i=0; i<this.notas.length; i++) { //lo relleno para evitar punteros nulos (null)
			this.notas[i]=new Nota();
		}
	}

	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notas=new Nota[7];
		for (int i=0; i<this.notas.length; i++) { //lo relleno para evitar punteros nulos (null)
			this.notas[i]=new Nota();
		}
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	public void imprimirNotas() {
		System.out.println("El alumno "+this.nombre+" "+this.apellidos+" tiene las siguientes notas");
		for (int i=0; i<this.notas.length; i++) {
			System.out.println(this.notas[i]);
		}
	}
	
	public static void main (String[]args) {
		Scanner t=new Scanner(System.in);
		String modulo="";
		double nota;
		double media=0;
		
		Alumno a1=new Alumno("sergio", "Ballesteros", 21);
		
		for (int i=0; i<7; i++) {
			System.out.println("dime el modulo");
			modulo=t.next();
			System.out.println("dime la nota");
			nota=t.nextDouble();
			a1.getNotas()[i].asignarNota(modulo, nota);
			
			media+=a1.getNotas()[i].getNota();
		}
		a1.imprimirNotas();
		
		System.out.println("La media es: "+media/7);
		
		t.close();
	}
}

package notasAlumnos;

import java.util.Scanner;

public class ClaseDAM {
	
	private Alumno[] dam;
	
	public ClaseDAM() {
		this.dam=new Alumno[3];
		for (int i=0; i<this.dam.length; i++) {
			this.dam[i]=new Alumno();
		}
	}
	
	public Alumno[] getDam() {
		return dam;
	}

	public void setDam(Alumno[] dam) {
		this.dam = dam;
	}

	

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int op;
		int numero;
		String cadena;
		ClaseDAM d=new ClaseDAM();
		
		d.getDam()[0].setNombre("Sergio");
		d.getDam()[0].setApellidos("Ballesteros");
		d.getDam()[0].setEdad(21);
		
		//System.out.println(d.getDam()[0]);
		
		do {
			numero=0;
			cadena="";
			menu();
			op=t.nextInt();
			switch (op) {
			case 1:
				for (int i=0; i<3; i++) {
					System.out.println("Dime el nombre del alumno");
					cadena=t.next();
					d.getDam()[i].setNombre(cadena);
					System.out.println("Dime el apellido del alumno");
					cadena=t.next();
					d.getDam()[i].setApellidos(cadena);
					System.out.println("Dime la edad del alumno");
					numero=t.nextInt();
					d.getDam()[i].setEdad(numero);
				}
				break;
			case 2:
				for (int i=0; i<3; i++) {
					System.out.println("Dime las notas del alumno: "+d.getDam()[i].getNombre());
					for (int j=0; j<d.getDam()[0].getNotas().length; j++) {
						System.out.println("\tDime el modulo");
						cadena=t.next();
						d.getDam()[i].getNotas()[j].setModulo(cadena);
						System.out.println("\tDime la nota");
						numero=t.nextInt();
						d.getDam()[i].getNotas()[j].setNota(numero);
					}
				}
				break;
			case 3:
				suspendos(d);
				break;
			case 4:
				media(d);
				break;
			case 5:
				System.out.println("Adios");
			}
		} while (op!=5);
		
		t.close();
	}

	private static void media(ClaseDAM d) {
		float media=0;
		for (int i=0; i<d.getDam().length; i++) {
			media=0;
			System.out.println("Alumno: "+d.getDam()[i].getNombre());
			for (int j=0; j<d.getDam()[0].getNotas().length; j++) {
				media+=d.getDam()[i].getNotas()[j].getNota();
			}
			System.out.println("Tiene una media de: "+(media/d.getDam()[0].getNotas().length));
		}
		
	}

	private static void suspendos(ClaseDAM d) {
		int nSus=0;
		for (int i=0; i<d.getDam().length; i++) {
			nSus=0;
			System.out.println("Alumno: "+d.getDam()[i].getNombre());
			for (int j=0; j<d.getDam()[0].getNotas().length; j++) {
				if (d.getDam()[i].getNotas()[j].getNota()<5) {
					nSus++;
				}
			}
			System.out.println("Ha suspendido "+nSus+" asignaturas");
		}
		
	}

	private static void menu() {
		System.out.println("1. Dar de alta alumnos");
		System.out.println("2. Asignar notas");
		System.out.println("Calcular:");
		System.out.println("3. Numero de suspensos por alumno");
		System.out.println("4. Nota media de cada alumno");
		System.out.println("5. Salir");
		System.out.println("Elige una opcion");
	}
}

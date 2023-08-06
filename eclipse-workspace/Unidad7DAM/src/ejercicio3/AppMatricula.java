package ejercicio3;

import java.util.LinkedList;
import java.util.Scanner;

public class AppMatricula {
	private LinkedList<Alumno> preinscritos;
	private LinkedList<Alumno> matriculados;
	
	public AppMatricula() {
		this.preinscritos=new LinkedList<>();
		this.matriculados=new LinkedList<>();
	}
	
	public LinkedList<Alumno> getPreinscritos() {
		return preinscritos;
	}

	public void setPreinscritos(LinkedList<Alumno> preinscritos) {
		this.preinscritos = preinscritos;
	}

	public LinkedList<Alumno> getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(LinkedList<Alumno> matriculados) {
		this.matriculados = matriculados;
	}

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int op=0;
		String cadena;
		
		AppMatricula app=new AppMatricula(); //RESERVO MEMORIA PARA LAS LISTAS
		app.getPreinscritos().add(new Alumno("123","1111H","marga@ribera","Margarita"));
		app.getPreinscritos().add(new Alumno("124","2222H","marta@ribera","Marta"));
		app.getPreinscritos().add(new Alumno("125","3333H","mario@ribera","Mario"));
		app.getPreinscritos().add(new Alumno("126","4444H","marcos@ribera","Marcos"));
		
		do {
			app.menu();
			op=t.nextInt();
			
			switch (op) {
			case 1:
				if (app.getPreinscritos().size()>0) {
					app.getMatriculados().addLast(app.getPreinscritos().removeFirst());
				} else {
					System.out.println("No quedan alumnos preinscritos");
				}
//				app.matricular();
				break;
			case 2:
				System.out.println("Dime el DNI");
				cadena=t.next();
				for (int i=0; i<app.getMatriculados().size(); i++) {
					if (app.getMatriculados().get(i).getDni().equals(cadena)) {
						app.getMatriculados().remove(i);
					}
				}
//				for (Alumno i : app.getMatriculados()) {
//					if (i.getDni().equals(cadena)) {
//						app.getMatriculados().remove(i);
//					}
//				}
				break;
			case 3:
				System.out.println(app.getMatriculados().getLast().getNombre());
				break;
			case 4:
				for (Alumno i:app.getMatriculados()) {
					System.out.println(i.getNombre());
				}
				break;
			case 5:
				System.out.println("Bye bye!!!");
				break;
			}
			
		} while (op!=5);
		
		t.close();
	}

//	private void matricular() {
//		this.matriculados.addLast(this.preinscritos.getFirst());
//		this.preinscritos.removeFirst();
//	}

	private void menu() {
		System.out.println("1. Matricular alumnos");
		System.out.println("2. Borrar alumno matriculado con DNI");
		System.out.println("3. Mostrar ultimo alumno matriculado");
		System.out.println("4. Mostar alumnos matriculados");
		System.out.println("5.salir");
		System.out.println("Elige una opcion:");
	}

}

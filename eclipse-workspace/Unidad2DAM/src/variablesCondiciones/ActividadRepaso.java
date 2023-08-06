package variablesCondiciones;

import java.util.Scanner;

public class ActividadRepaso {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int emp=0, dias=0, ec=0, sueldob=0, sueldod=0, sueldobr=0, irpf=0;
		float sueldof=0.0f, sueldoirpf=0.0f;
		boolean correcto=true;
		
		System.out.println("****************************");
		System.out.println("Calculo de nomina");
		System.out.println("****************************");
		System.out.println("1)Programador Junior");
		System.out.println("2)Programador Senior");
		System.out.println("3)Jefe de proyecto");
		System.out.println("Introduzca el cargo de empleado");
		emp=teclado.nextInt();
		
		switch (emp) {
			case 1: sueldob=950; break;
			case 2: sueldob=1200; break;
			case 3: sueldob=1600; break;
			default: 
				System.out.println("Ese no es un cargo");
				correcto=false;
		}
		
		System.out.println("Cuantos dias ha estado de viaje visitando clientes");
		dias=teclado.nextInt();
		
		sueldod=dias*30;
		sueldobr=sueldob+sueldod;
		
		System.out.println("introduzca su estado civil (1 - soltero, 2 - casado)");
		ec=teclado.nextInt();
		
		switch (ec) {
			case 1: irpf=25; break;
			case 2: irpf=20; break;
			default: 
				System.out.println("Ese no es un estado");
				correcto=false;
		}
		
		if (correcto) {
			sueldoirpf=(float) (sueldobr*(irpf*0.01));
			sueldof=sueldobr-sueldoirpf;
			System.out.println("---------------------------");
			System.out.println("Sueldo base "+sueldob+"€");
			System.out.println("Dietas ("+dias+" viajes): "+sueldod+"€");
			System.out.println("---------------------------");
			System.out.println("Sueldo bruto "+sueldobr+"€");
			System.out.println("Retendion IRPF ("+irpf+"):"+sueldoirpf);
			System.out.println("---------------------------");
			System.out.println("sueldo neto: "+sueldof+"€");
		} else {
			System.out.println("No se ha podido realizar el calculo");
		}
		
		teclado.close();
	}

}

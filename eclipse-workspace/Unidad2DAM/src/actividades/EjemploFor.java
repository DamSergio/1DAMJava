package actividades;

public class EjemploFor {

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++) {
			System.out.println(i);
		}
		//numeros pares entre 10 y 20
		
		for (int i=10; i<=20; i+=2) {
			System.out.println(i);
		}
		//tablas de multiplicar
		
		for (int i=1; i<=10; i++) {
			System.out.println("tabla de multiplicar de "+i);
			for (int j=1; j<=10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}

}

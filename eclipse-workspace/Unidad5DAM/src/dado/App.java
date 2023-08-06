package dado;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int suma=0;
		Dado misDados[]=new Dado[6];
		
		for (int i=0; i<misDados.length; i++) {
			misDados[i]=new Dado();
			misDados[i].lanzar();
			System.out.println("El dado "+(i+1)+" es "+misDados[i]);
			suma+=misDados[i].getCara();
		}
		
		System.out.println(Arrays.toString(misDados));
		System.out.println("La suma es: "+suma);
	}

}

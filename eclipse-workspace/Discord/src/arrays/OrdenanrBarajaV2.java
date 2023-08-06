package arrays;

import java.util.Arrays;

public class OrdenanrBarajaV2 {

	public static void main(String[] args) {
		int numeros[]={6,5,3,1,8,7,2,4};
		int aux, p;
		
		for (int i=1; i<numeros.length; i++) {
			aux=numeros[i];
			p=i-1;
			while (p>=0 && aux<numeros[p]) {
				numeros[p+1]=numeros[p];
				p--;
			}
			numeros[p+1]=aux;
		}
		System.out.println(Arrays.toString(numeros));

	}

}

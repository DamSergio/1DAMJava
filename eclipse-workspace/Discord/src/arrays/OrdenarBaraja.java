package arrays;

import java.util.Arrays;

public class OrdenarBaraja {

	public static void main(String[] args) {
		int numeros[]={6,5,3,1,8,7,2,4};
		int n;
		boolean mayor=true;
		
		for (int i=1; i<numeros.length; i++) {
			n=numeros[i];
			mayor=true;
			for (int j=i; j>=1 && mayor; j--) {
				mayor=false;
				if (numeros[j]<numeros[j-1]) {
					numeros[j]=numeros[j-1];
					numeros[j-1]=n;
					mayor=true;
				}
			}
		}
		System.out.println(Arrays.toString(numeros));
	}

}

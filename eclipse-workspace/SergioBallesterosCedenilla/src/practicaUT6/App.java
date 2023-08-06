package practicaUT6;

import java.util.Arrays;

public class App implements PracticaUT6{

	public static void main(String[] args) {
		App a=new App();
		int m[][]=new int[3][4];
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[0].length; j++) {
				int n=(int)(1+Math.random()*10);
				m[i][j]=n;
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println(Arrays.toString(a.sumaColumnasMatriz(m)));
		
		int array[]= {1,5,3,5,5,5,5,5,7,7,3,2,7,3,5,5,5,5,5,5};
		System.out.println(a.secuenciaMayor(array));
		
		System.out.println(a.mediaImparesDesdePrimerPar(array));
		
		
	}

	@Override
	public int[] sumaColumnasMatriz(int[][] m) {
		int suma[]=new int[m[0].length];
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[0].length; j++) {
				suma[j]+=m[i][j];
			}
		}
		return suma;
	}

	@Override
	public int secuenciaMayor(int[] v) {
		int cont=1, max=1;
		for (int i=1; i<v.length; i++) {
			if (v[i]==v[i-1]) {
				cont++;
				if (cont>max) {
					max=cont;
				}
			} else {
				cont=1;
			}
		}
		return max;
	}

	@Override
	public int mediaImparesDesdePrimerPar(int[] v) {
		int cont=0, suma=0;
		boolean start=false;
		for (int i=0; i<v.length;i++) {
			if (v[i]%2==0) {
				start=true;
			}
			if (start) {
				if(v[i]%2==1) {
					cont++;
					suma+=v[i];
				}
			}
		}
		if (start) {
			return suma/cont;
		} else {
			return 0;
		}
	}

}

package bucles;

public class Ejercicio17 {

	public static void main(String[] args) {
		int i1=10, i2=10, n1=1, n2=1;
		
		while (i1>0) {
			System.out.println("tabla del "+n1);
			while (i2>0) {
				System.out.println(n1+" * "+n2+" = "+(n1*n2));
				n2++;
				i2--;
			}
			n1++;
			i1--;
			i2=10;
			n2=1;
		}

	}

}

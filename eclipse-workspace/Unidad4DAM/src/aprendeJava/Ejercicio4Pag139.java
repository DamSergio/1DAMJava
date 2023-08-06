package aprendeJava;

public class Ejercicio4Pag139 {

	public static void main(String[] args) {
		int n[]=new int[20];
		int cua[]=new int[20];
		int cub[]=new int[20];
		System.out.println("numero \tcuad \tcubo");
		for (int i=0; i<n.length;i++) {
			n[i]=(int)(Math.random()*101);
			cua[i]=(int) Math.pow(n[i], 2);
			cub[i]=(int) Math.pow(n[i], 3);
			System.out.println(n[i]+"\t"+cua[i]+"\t"+cub[i]);
		}
//		System.out.println(Arrays.toString(n));
//		System.out.println(Arrays.toString(cua));
//		System.out.println(Arrays.toString(cub));

	}

}

package nose;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=t.nextInt(), n2=n-1;
		
		for (int i=1; i<=n; i++) {
			for (int j=n2; j>0; j--) {
				System.out.print(" ");
			}
			for (int j=(i*2)-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
			n2--;
		}
		t.close();
	}

}

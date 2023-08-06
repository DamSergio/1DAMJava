package arrays;

import java.util.Arrays;

public class Barajar {

	public static void main(String[] args) {
		int baraja[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		barajar(baraja);
		System.out.println(Arrays.toString(baraja));
	}

	private static void barajar(int[] baraja) {
		for (int i=0; i<baraja.length; i++) {
			int r=(int)(Math.random()*20);
			int n=baraja[i];
			for(int j=i; j<baraja.length-1; j++) {
				baraja[j]=baraja[j+1];
			}
			baraja[19]=0;
			for (int j=baraja.length-1; j>=r; j--) {
				if (j==0) {
					baraja[j]=0;
				} else {
					baraja[j]=baraja[j-1];
				}
			}
			baraja[r]=n;
		}
		
	}

}

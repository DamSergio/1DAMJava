package arrays;

import java.util.Arrays;
import java.util.Random;

public class Barajar2 {

	public static void main(String[] args) {
		int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int index;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--) {
	        index = random.nextInt(i + 1);
	        if (index != i) {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }
	    
	    System.out.println(Arrays.toString(array));
	}

}

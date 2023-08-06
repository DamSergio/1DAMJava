package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement app = new RemoveElement();
		int a[] = {0,1,2,2,3,0,4,2};
		
		System.out.println(app.removeElement2(a, 2));
	}
	
	public int removeElement(int[] nums, int val) {
		int nPos = nums.length;
		ArrayList<Integer> nuevoArray = new ArrayList<>();
		int cont = 0;
		
		for (int pos = 0; pos < nPos; pos++ ) {
			if (nums[pos] != val) {
				nuevoArray.add(nums[pos]);
				cont++;
			}
		}
		
		for (int pos = 0; pos < nuevoArray.size(); pos++ ) {
			nums[pos] = nuevoArray.get(pos);
		}
		
		System.out.println(Arrays.toString(nums));
		
		return cont;
    }
	
	public int removeElement2(int[] nums, int val) {
		int nPos = nums.length;
		int cont = 0;
		
		for(int pos = 0; pos < nPos; pos++) {
			if (nums[pos] != val) {
				nums[cont] = nums[pos];
				cont++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		return cont;
    }

}

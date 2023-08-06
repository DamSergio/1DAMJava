package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates app = new RemoveDuplicates();
		int n[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(app.removeDuplicates(n));
	}
	
	public int removeDuplicates (int[] nums) {
		int cont = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[cont]) {
				nums[cont+1] = nums[i];
				cont++;
			}
		}
		
		return cont+1;
	}

}

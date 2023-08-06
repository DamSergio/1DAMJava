package arrays;

import java.util.ArrayList;

public class ContainsDuplicate {

	public static void main(String[] args) {
		String cad="pwwkew";
		
		System.out.println(lengthOfLongestSubstring(cad));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int max=0;
        int maxmax=0;
        ArrayList<Character> c = new ArrayList<>();

        for (int i=0; i<s.length(); i++){
            if(!c.contains(s.charAt(i))){
                c.add(s.charAt(i));
                max++;
            } else {
                if (max>maxmax){
                    maxmax=max;
                }
                max=1;
                c.clear();
                c.add(s.charAt(i));
            }
        }

        return maxmax;
	}
	
	public static int lengthOfLongestSubstring2(String s) {
		int max=0;
        int maxmax=0;
        ArrayList<Character> c = new ArrayList<>();

        for (int i=0; i<s.length(); i++){
            if(!c.contains(s.charAt(i))){
                c.add(s.charAt(i));
                max++;
            } else {
                if (max>maxmax){
                    maxmax=max;
                }
                max=1;
                c.clear();
                c.add(s.charAt(i));
            }
        }

        return maxmax;
	}
	
	public static boolean containsDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

}

package arrays;

import java.util.Arrays;

public class PlusOne{
	public static void main(String[] args) {
		int n[] = {1,9};
		System.out.println(Arrays.toString(plusOne(n)));
		System.out.println(Arrays.toString(plusOne2(n)));
		System.out.println(Arrays.toString(plusOne3(n)));
	}
	
	public static int[] plusOne(int[] digits) {
		long sum = 0;
		
        for (Integer n : digits) {
        	sum *= 10;
        	sum += n;
        	
        }
        sum++;
        
        String cad = sum+"";
        int newArray[] = new int[cad.length()];
        
        for (int i = 0; i < cad.length(); i++) {
        	newArray[i] = Integer.parseInt(cad.charAt(i)+"");
        }
		return newArray;
    }
	
	public static int[] plusOne2(int[] digits) {
		String num = "";
		
        for (Integer n : digits) {
        	num += n+"";
        }
        
        //System.out.println(num);
        
        int n = 0;
        int pos = 1;
        do {
        	n = Integer.parseInt(num.charAt(digits.length-pos)+"")+1;
        	if (n == 10 && pos != num.length()) {
        		n %=10;
        		num = num.substring(0, digits.length-pos) + n + num.substring(digits.length-pos+1);
        		pos++;
        	} else {
        		num = num.substring(0, digits.length-pos) + n + num.substring(digits.length-pos+1);
        	}
        } while (n == 0);
        
        int newArray[] = new int[num.length()];
        
        for (int i = 0; i < num.length(); i++) {
        	newArray[i] = Integer.parseInt(num.charAt(i)+"");
        }
        
        return newArray;
    }
	
	public static int[] plusOne3(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			
			digits[i] = 0;
		}
		
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
    }
}
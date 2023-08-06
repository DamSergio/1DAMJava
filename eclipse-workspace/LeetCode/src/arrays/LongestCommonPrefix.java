package arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix app = new LongestCommonPrefix();
		
		String c[] = {"ab", "a"};
		
		System.out.println(app.longestCommonPrefix2(c));
	}
	
	public String longestCommonPrefix(String[] strs) {
		String start = strs[0];
		boolean valido;
		
		for (int i = start.length(); i >=0 ; i--) {
			String pre = start.substring(0, i);
			valido = true;
			
			for (int j = 1; j < strs.length && valido; j++) {
				if (strs[j].length() < i) {
					valido = false;
				} else {
					if (!pre.equals(strs[j].substring(0, i))) {
						valido = false;
					}
				}
			}
			
			if (valido) {
				return pre;
			}
		}
		
        return "";
    }
	
	public String longestCommonPrefix2(String[] strs) {
		String pre = strs[0];
		
		if (strs.length == 0) {
			return "";
		}
		
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(pre)) {
				pre = pre.substring(0, pre.length()-1);
				if (pre.equals("")) {
					return "";
				}
			}
		}
		
        return pre;
    }
}

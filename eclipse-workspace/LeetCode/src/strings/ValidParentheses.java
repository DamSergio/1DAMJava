package strings;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("[](){(})"));
		System.out.println(isValid("[()]"));

	}
	
	public static boolean isValid(String s) {
		Stack<Character> sim = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				sim.add(s.charAt(i));
			} else {
				if (sim.isEmpty()) {
					return false;
				}
				if (sim.peek() == '(' && s.charAt(i) == ')') {
					sim.pop();
				} else {
					if (sim.peek() == '[' && s.charAt(i) == ']') {
						sim.pop();
					} else {
						if (sim.peek() == '{' && s.charAt(i) == '}') {
							sim.pop();
						} else {
							return false;
						}
					}
				}
			}
				
		}
		
		return sim.isEmpty();
    }
}

package edd;

import java.util.Stack;

public class EjemploExpresion {

	public static void main(String[] args) {
		String expresion="((3+5)(8/4))*(-2)";
		Stack<String> stack=new Stack<>();
		boolean bien=true;
		
		for (int i=0; i<expresion.length(); i++) {
			if (expresion.charAt(i)=='(') {
				stack.push("(");
			}
			if (expresion.charAt(i)==')') {
				if (stack.isEmpty()) {
					bien=false;
				} else {
					stack.pop();
				}
			}
		}
		
		if (stack.isEmpty() && bien) {
			System.out.println("La expresion: "+expresion+" es correcta");
		} else {
			System.out.println("La expresion: "+expresion+" no es correcta");
		}
	}

}

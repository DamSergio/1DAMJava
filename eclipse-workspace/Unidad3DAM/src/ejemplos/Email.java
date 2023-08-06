package ejemplos;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String cad=t.next();
		
		System.out.println(email(cad));;
		
		t.close();
	}
	private static boolean email (String cad) {
		return cad.matches("^[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
		//return cad.matches("[-\\w\\.]+@\\w+\\.\\w+");
	}
}

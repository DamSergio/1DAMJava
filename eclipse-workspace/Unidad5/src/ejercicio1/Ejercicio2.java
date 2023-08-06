package ejercicio1;

public class Ejercicio2 {

	public static void main(String[] args) {
		Password p1=new Password("pepito");
		Password p2=new Password("grillo");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.getLongitud()==p2.getLongitud()) {
			System.out.println("misma longitud");
		} else {
			System.out.println("tus muertos");
		}
	}

}

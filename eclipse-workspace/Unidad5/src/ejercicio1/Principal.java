package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Perro p1=new Perro("Drako", "Pomelanian", 7);
		Perro p2=new Perro("Lori", "Gran Danes", 5, true);

		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("-------------------------------------------------------");
		
		if (p1.isSobrepeso()) {
			System.out.println(p1.getNombre()+" esta goldo");
		}
		if (p2.isSobrepeso()) {
			System.out.println(p2.getNombre()+" esta goldo");
		}
		
		System.out.println("-------------------------------------------------------");
		
		
	}

}

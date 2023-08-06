package actividades;

public class Principal {

	public static void main(String[] args) {
		Perro p1=new Perro("Drako", "Pomelanian", 7);
		Perro p2=new Perro("Cholo", "Pomelanian", 1, true);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.getEdad()>p2.getEdad()) {
			System.out.println(p1.getNombre()+" es mayor");
		} else {
			if (p2.getEdad()>p1.getEdad()) {
				System.out.println(p2.getNombre()+" es mayor");
			} else {
				System.out.println("tienen la misma edad");
			}
		}
		
		if (p1.isSobrepeso()) {
			System.out.println(p1.getNombre()+" tiene sobrepeso");
		} else {
			System.out.println(p1.getNombre()+" no tiene sobrepeso");
		}
		
		if (p2.isSobrepeso()) {
			System.out.println(p2.getNombre()+" tiene sobrepeso");
		} else {
			System.out.println(p2.getNombre()+" no tiene sobrepeso");
		}
		
		System.out.println(p1.getNombre().length());
		System.out.println(p2.getNombre().length());
		
		System.out.println(p1.getId());
		System.out.println(p2.getId());
	}

}

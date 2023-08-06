package racional;

public class CalculadoraRacional {

	public static void main(String[] args) {
		Racional r=new Racional(1, 2);
		Racional q=new Racional(3, 2);
		Racional t=new Racional(36, 60);
		Racional w=new Racional(2, 4);
		System.out.println(r);
		System.out.println(q);
		
		System.out.println("\nCalculadora\n");
		
		System.out.println(r+" * "+q+" = "+r.producto(q));
		System.out.println(r+" + "+q+" = "+r.suma(q));
		System.out.println(r+" - "+q+" = "+r.resta(q));
		System.out.println(r+" / "+q+" = "+r.division(q));
		System.out.println(t.simpli());
		
		w=w.simpli();
		
		if (r.equals(w)) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}
	}

}

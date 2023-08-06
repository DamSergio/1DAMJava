package actividades;

public class Ejercicio3 {

	public static void main(String[] args) {
		Libro l1=new Libro("1234-B", "mobi dick", "pos no se la verdad", 900);
		Libro l2=new Libro("1234-A", "narnia", "pos no se la verdad", 800);
		
		System.out.println(l1);
		System.out.println(l2);
		
		if (l1.getNumeroPag()>l2.getNumeroPag()) {
			System.out.println(l1.getTitulo()+" tiene mas paginas");
		} else {
			if (l1.getNumeroPag()==l2.getNumeroPag()) {
				System.out.println("tienen las mismas paginas");
			} else {
				System.out.println(l2.getTitulo()+" tiene mas paginas");
			}
		}
	}

}

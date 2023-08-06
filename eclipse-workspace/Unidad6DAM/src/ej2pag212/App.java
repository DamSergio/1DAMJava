package ej2pag212;

public class App {

	public static void main(String[] args) {
		Gato gardfield=new Gato(3, 2, "omnivoro", "Gardfield", "comun", "naranja", 7);
		System.out.println(gardfield.getNombre());
		System.out.println(gardfield.getEdad());
		gardfield.setNvidas(6);
		System.out.println(gardfield.getNvidas());
		System.out.println(gardfield.maulla());
		Gato tom=new Gato(4, 2, "omnovoro", "Tom", "comun", "gris", 3);
		System.out.println(tom.getNombre());
		System.out.println(tom.getColor());
		System.out.println(tom.maulla());
		Perro pluto=new Perro(2, 3, "omnivoro", "Pluto", "labrador", "123H");
		System.out.println(pluto.getNombre());
		System.out.println(pluto.ladra());
	}

}

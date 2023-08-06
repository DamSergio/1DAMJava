package ejemplo;

public class App {

	public static void main(String[] args) {
		//Scanner t=new Scanner(System.in);
		Persona p=new Persona("Paco", "Fernandez", "12345678J", 24);
		System.out.println(p);
		p.setNombre("Francisco");
		System.out.println(p);
		System.out.println("Edad "+p.getEdad());
		
		Persona q=new Persona();
		q.setDNI("11111111A");
		q.setNombre("Luis");
		q.setApellidos("Pelaez");
		q.setEdad(23);
		System.out.println(q);
		
		if (q.getEdad()>p.getEdad()) {
			System.out.println(q.getNombre()+" es mayor");
		} else {
			if (q.getEdad()==p.getEdad()) {
				System.out.println("Son la misma edad");
			} else {
				System.out.println(p.getNombre()+" es mayor");
			}
		}
		Persona [] claseDAM=new Persona[28];
		claseDAM[0]=new Persona("Cesar", "Alamenda", "12345678A", 19);
	}

}

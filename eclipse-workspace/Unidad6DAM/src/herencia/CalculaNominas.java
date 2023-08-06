package herencia;

public class CalculaNominas {

	public static void main(String[] args) {
		Empleado e=new Empleado("11111111H", "Patricia", "Perez", "12345", 10000);
		Empleado e2=new Empleado("22222222H", "Laura", "Ramirez", "12445", 40000);
		Consultor c=new Consultor("33333333J", "Luis", "Martin", "12345", 30, 10);
		Trabajador misEmpleados[]=new Trabajador[3];
		
		misEmpleados[0]=e;
		misEmpleados[1]=e2;
		misEmpleados[2]=c;
		
		for (int i=0; i<misEmpleados.length; i++) {
			if (misEmpleados[i] instanceof Empleado) {
				System.out.println("Empleado");
			} 
			if (misEmpleados[i] instanceof Consultor) {
				System.out.println("Consultor");
			}
			System.out.println("\t"+misEmpleados[i].getNombre()+" "+misEmpleados[i].getApellidos()+" cobra: "+misEmpleados[i].calcularPaga());
		}
	}

}

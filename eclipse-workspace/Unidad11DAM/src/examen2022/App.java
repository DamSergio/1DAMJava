package examen2022;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		ArrayList<Empleado> empleados= BD.getInstance().cargarEmpleados();
		
		if (args.length > 0) {
			if (args[0].contains("--empleado=")) {
				String dni = args[0].split("=")[1];
				
				for (Empleado e : empleados) {
					if (e.getDni().equals(dni)) {
						e.generarFicheroFactura();
						System.out.println("El empleado con dni "+e.getDni()+" prepara "+e.getPedidosAsignados().size()+" pedidos");
					}
				}
			}
		} else {
			for (Empleado e : empleados) {
				e.generarFicheroFactura();
				System.out.println("El empleado con dni "+e.getDni()+" prepara "+e.getPedidosAsignados().size()+" pedidos");
			}
		}
	}

}

package examen1ºOrdinaria2022;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		ArrayList<Empleado> empleados = BD.getInstance().cargarEmpleados();
		
		if (args.length != 0 && args[0].startsWith("--empleado=")) {
			String dni = args[0].split("=")[1];
			
			for (Empleado empleado:empleados) {
				if (empleado.getDni().equals(dni)) {
					empleado.generarFicheroFactura();
					System.out.println("El empleado "+empleado.getNombre()+" con DNI "+empleado.getDni()+" prepara "+empleado.getPedidosAsignados().size()+" pedidos");
				}
			}
		} else {
			for (Empleado empleado:empleados) {
				empleado.generarFicheroFactura();
				System.out.println("El empleado "+empleado.getNombre()+" con DNI "+empleado.getDni()+" prepara "+empleado.getPedidosAsignados().size()+" pedidos");
			}
		}
	}

}

package examen;

import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		Gerente yo = new Gerente("", "Sergio", "Ballesteros", "", "", "");
		
		String codigo = "";
		String pass = "";
		String mes = "";
		
		for (int pos = 0; pos < args.length; pos++) {
			String line = args[pos];
			
			if (line.contains("codigo")) {
				codigo = line.split("=")[1];
			}
			
			if (line.contains("pass")) {
				pass = line.split("=")[1];
			}
			
			if (line.contains("mes")) {
				mes = line.split("=")[1];
			}
		}
		
		if (args.length == 1) {
			ArrayList<Monitor> m = new ArrayList<>();
			ResultSet monitores = BD.getInstance().consultaBD("SELECT * FROM monitor");
			
			while (monitores.next()) {
				m.add(new Monitor(monitores.getString(1), monitores.getString(2), monitores.getString(3), monitores.getString(4), monitores.getString(5), monitores.getInt(6), monitores.getString(7)));
			}
			
			for (Monitor mon:m) {
				yo.pagoMonitor(mon, mes, 2023);
			}
		} else {
			boolean existe_monitor = false;
			ResultSet monitor = BD.getInstance().consultaBD("SELECT * FROM monitor WHERE codigomonitor='"+codigo+"' AND clave='"+pass+"'");
			Monitor m = new Monitor();
			
			while (monitor.next()) {
				m = new Monitor(monitor.getString(1), monitor.getString(2), monitor.getString(3), monitor.getString(4), monitor.getString(5), monitor.getInt(6), monitor.getString(7));
				existe_monitor = true;
			}
			
			if (existe_monitor) {
				m.clasesMonitor(mes, 2023);
				m.calculaComplementoClases(mes);
				
				System.out.println("******************************************************");
				System.out.println("MES: "+mes.toUpperCase());
				System.out.println("MONITOR: "+m.getNombre()+" "+m.getApellido());
				System.out.println("Complemento por clases: "+m.getExtraClases()+"€");
				System.out.println("Complemento por alumnos: "+m.getExtraAlumnos()+"€");
				System.out.println("Indormacion detallada por dia en Complemento"+mes+m.getNombre()+m.getApellido()+".txt");
				System.out.println("******************************************************");
			}
		}
	}

}

package bd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		String parametros[] = BD.getInstance().cargarParámetrosConexion();
		
//		System.out.println(parametros[0]);
//		System.out.println(parametros[1]);
//		System.out.println(parametros[2]);
		
		BD.getInstance().setCadenaConexion(parametros[0]);
		BD.getInstance().setUsuario(parametros[1]);
		BD.getInstance().setPassword(parametros[2]);
		
		int argumentos = args.length;
		String cadena = "";
		
		if (argumentos > 0) {
			cadena = "WHERE ";
			
			for (int i = 0; i < args.length; i++) {
				String split[] = args[i].split("=");
				
//				System.out.println(split[0]);
//				System.out.println(split[1]);
				
				switch (split[0]) {
				case "--origen":
					cadena += "origen_vuelo = '"+split[1]+"'";
					
					break;
				case "--destino":
					cadena += "destino_vuelo = '"+split[1]+"'";
					
					break;
				case "--codavion":
					cadena += "cod_avion = "+split[1];
					
					break;
				}
				
				if (i+1 != argumentos) {
					cadena += " AND ";
				}
			}
		}
		
		System.out.println("SELECT * FROM vuelos "+cadena);
		
		ResultSet rset = BD.getInstance().consultaBD("SELECT * FROM vuelos "+cadena);
		ResultSetMetaData metadata = rset.getMetaData();
		
		//System.out.println(metadata.getColumnCount());
		
		PrintWriter out = new PrintWriter(new File("consulta.csv"));
		
		while (rset.next()) {
			for (int i = 1; i < metadata.getColumnCount(); i++) {
				out.print(rset.getString(i)+"; ");
			}
			out.println("");
		}
		
		out.flush();
		out.close();
	}
	
	public static void get_args(String cad) {
		
	}

}

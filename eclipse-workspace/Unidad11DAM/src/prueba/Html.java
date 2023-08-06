package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;

public class Html {

	public static void main(String[] args) throws SQLException{
		//CREAR DRIVER
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		//CREAR LA CONEXION A LA DB ORACLE
		//URL, USUARIO, CONTRASEÑA
		Connection db_conection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "jardineria", "jardineria");
		
		//CREAR Y EJECUTAR LA CONSULTA
		Statement db_statement = db_conection.createStatement();
		ResultSet table = db_statement.executeQuery("SELECT CODIGOCLIENTE, NOMBRECONTACTO, APELLIDOCONTACTO, TELEFONO FROM Clientes");
		
		int numero_columnas = table.getMetaData().getColumnCount();
		
		try {
			PrintWriter html = new PrintWriter(new File("index.html"));
			PrintWriter csv = new PrintWriter(new File("clientes.csv"));
			
			html.println("<!DOCTYPE html>");
			html.println("<html lang=\"en\">");
			html.println("\t<head>");
			html.println("\t\t<meta charset=\"UTF-8\">");
			html.println("\t\t<title>Tabla Java</title>");
			html.println("\t</head>");
			html.println("\t<body>");
			html.println("\t\t<h1>Contacto de clientes</h1>");
			html.println("\t\t<table border=1>");
			html.println("\t\t\t<tr>");
			
			for (int columna = 1; columna <= numero_columnas; columna++) {
				String nombre_columna = table.getMetaData().getColumnLabel(columna);
				
				html.println("\t\t\t\t<th>"+nombre_columna+"</th>");
			}
			
			html.println("\t\t\t</tr>");
			
			while (table.next()) {
				html.println("\t\t\t<tr>");
				
				for (int columna = 1; columna <= numero_columnas; columna++) {
					String valor_columna = table.getString(columna);
					
					html.println("\t\t\t\t<td>"+valor_columna+"</td>");
					csv.print(valor_columna+";");
				}
				
				csv.println();
				html.println("\t\t\t</tr>");
			}
			
			html.println("\t\t</table>");
			html.println("\t</body>");
			html.println("</html>");
			
			html.flush();
			html.close();
			csv.flush();
			csv.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CERRAR CONEXION
		db_statement.close();

	}

}

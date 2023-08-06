package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {
	public static void main(String[] args) throws SQLException{
		//CREAR DRIVER
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		//CREAR LA CONEXION A LA DB ORACLE
		//URL, USUARIO, CONTRASEÑA
		Connection db_conection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "jardineria", "jardineria");
		
		//CREAR Y EJECUTAR LA CONSULTA
		Statement db_statement = db_conection.createStatement();
		ResultSet table = db_statement.executeQuery("SELECT codigoCliente, nombreCliente FROM Clientes");
		
		//RECORRER LA TABLA
		//MIENTRAS EXISTAN FILAS EN LA TABLA
		while (table.next()) {
			//UNICO OBJETO QUE SE EMPIEZA A CONTAR EN 1
			System.out.println("codigo = "+table.getString(1)+" || nombre = "+table.getString(2));
		}
		
		//CERRAR CONEXION
		db_statement.close();
	}
}

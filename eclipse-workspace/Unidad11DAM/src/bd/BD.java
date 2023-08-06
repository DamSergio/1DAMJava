package bd;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BD {
	private static BD miInstancia=null;
	private static boolean permitirInstancianueva;
	private String cadenaConexion;
	private String usuario;
	private String password;
	private Connection conn;
	private Statement stmt;


	BD() throws Exception {
		if (!permitirInstancianueva) {
			throw new Exception("No se puede crear otro objeto de la clase. usa getInstance");
		} else {
			
		}
	}

	public static BD getInstance() {
		if (miInstancia == null) {
			permitirInstancianueva = true;
			try {
				miInstancia = new BD();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			permitirInstancianueva = false;
		}
		return miInstancia;
	}



	 public  ResultSet consultaBD(String consulta) throws SQLException, FileNotFoundException {
		 cargarParámetrosConexion();
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);
		 
//		 System.out.println(this.cadenaConexion);
//		 System.out.println(this.usuario);
//		 System.out.println(this.password);


		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
		 /*  while (rset.next())
				 System.out.println ("Son: "+rset.getString(1));   // Print col 1*/
		  //  stmt.close();
			return rset;

	 }

	 public String[] cargarParámetrosConexion() throws FileNotFoundException {
		 Scanner params = new Scanner(new File("configprueba.txt"));
		 String parametros_conexion[] = new String[3];
		 int cont = 0;
		 
		 while (params.hasNext() && cont < 3) {
			 String line = params.nextLine();
			 
			 //System.out.println(line);
			 
			 if (line.contains("=")) {
				 parametros_conexion[cont] = line.split("=")[1];
				 
				 cont++;
			 }
		 }
		 
		 return parametros_conexion;
	 }
	 

	 public void cerrarConsulta() throws SQLException {
		stmt.close();
	 }

	

	public String getCadenaConexion() {
		return cadenaConexion;
	}

	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
}

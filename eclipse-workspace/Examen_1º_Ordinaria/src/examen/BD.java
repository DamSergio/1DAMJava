package examen;

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

	public void cargarParametrosConexion() throws FileNotFoundException {
		Scanner in = new Scanner(new File("configGim.xml"));
		
		String driver = "";
		String server = "";
		String port = "";
		String sid = "";
		String user = "";
		String pass = "";
		
		
		while (in.hasNext()) {
			String line = in.nextLine();
			
			if (line.contains("DRIVER")) {
				driver = line.split(">")[1].split("<")[0];
			}
			
			if (line.contains("SERVIDOR")) {
				server = line.split(">")[1].split("<")[0];
			}
			
			if (line.contains("PUERTO")) {
				port = line.split(">")[1].split("<")[0];
			}
			
			if (line.contains("SID")) {
				sid = line.split(">")[1].split("<")[0];
			}
			
			if (line.contains("USUARIO")) {
				user = line.split(">")[1].split("<")[0];
			}
			
			if (line.contains("CLAVE")) {
				pass = line.split(">")[1].split("<")[0];
			}
		}
		
		this.cadenaConexion = driver+server+":"+port+":"+sid;
		this.usuario = user;
		this.password = pass;
	}

	 public  ResultSet consultaBD(String consulta) throws SQLException, FileNotFoundException {
		 this.cargarParametrosConexion();
		 //"jdbc:oracle:thin:@localhost:1521:XE","jardineria","jardineria"
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);


		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
		 /*  while (rset.next())
				 System.out.println ("Son: "+rset.getString(1));   // Print col 1*/
		  //  stmt.close();
			return rset;

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

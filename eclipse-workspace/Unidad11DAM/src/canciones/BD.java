package canciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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



	 public  ResultSet consultaBD(String consulta) throws SQLException {
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

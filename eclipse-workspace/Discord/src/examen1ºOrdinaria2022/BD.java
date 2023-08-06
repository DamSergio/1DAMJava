package examen1ºOrdinaria2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		 //"jdbc:oracle:thin:@localhost:1521:XE","jardineria","jardineria"
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 this.cargarParametrosConexion();
		 
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);


		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
		 /*  while (rset.next())
				 System.out.println ("Son: "+rset.getString(1));   // Print col 1*/
		  //  stmt.close();
			return rset;

	 }

	 public void cargarParametrosConexion() throws FileNotFoundException {
		 Scanner in = new Scanner(new File("configTienda.txt"));
		 
		 String parametros[] =  in.nextLine().split("-");
		 
		 this.cadenaConexion = parametros[0];
		 this.usuario = parametros[1];
		 this.password = parametros[2];
	 }
	 
	 public ArrayList<Empleado> cargarEmpleados() throws SQLException, FileNotFoundException {
		 ArrayList<Empleado> empleados = new ArrayList<>();
		 ResultSet tabla_empleados = this.consultaBD("SELECT * FROM persona WHERE turno != 0");
		 
		 while (tabla_empleados.next()) {
			 empleados.add(new Empleado(tabla_empleados.getString(1), tabla_empleados.getString(2), tabla_empleados.getString(3), tabla_empleados.getString(4), tabla_empleados.getInt(5)));
		 }
		 
		 return empleados;
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

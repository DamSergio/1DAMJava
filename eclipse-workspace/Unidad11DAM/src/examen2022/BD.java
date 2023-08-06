package examen2022;

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
		 cargarParámetrosConexion();
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);


		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
		 /*  while (rset.next())
				 System.out.println ("Son: "+rset.getString(1));   // Print col 1*/
		  //  stmt.close();
			return rset;

	 }

	 public void cargarParámetrosConexion() throws FileNotFoundException {
		 Scanner params = new Scanner(new File("configTienda.txt"));
		 String line[] = params.next().split("-");
		 
		 this.cadenaConexion = line[0];
		 this.usuario = line[1];
		 this.password = line[2];
	 }
	 
//	 public String[] cargarParámetrosConexion() throws FileNotFoundException {
//		 Scanner params = new Scanner(new File("configprueba.txt"));
//		 String parametros_conexion[] = new String[3];
//		 int cont = 0;
//		 
//		 while (params.hasNext() && cont < 3) {
//			 String line = params.nextLine();
//			 if (line.contains("=")) {
//				 parametros_conexion[cont] = line.split("=")[1];
//				 
//				 cont++;
//			 }
//		 }
//		 
//		 return parametros_conexion;
//	 }
	 
	 public ArrayList<Empleado> cargarEmpleados() throws SQLException, FileNotFoundException {
		 ArrayList<Empleado> empleados = new ArrayList<>();
		 ResultSet table = BD.getInstance().consultaBD("SELECT * FROM persona");
		 
		 while (table.next()) {
			 boolean es_Empleado = !table.getString(5).equals("0");
			 
			 if (es_Empleado) {
				 empleados.add(new Empleado(table.getString(1), table.getString(2), table.getString(3), table.getString(4), table.getInt(5)));
			 }
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

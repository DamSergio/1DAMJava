package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Producto> productos;
	
	public Menu() throws SQLException {
		this.productos = new ArrayList<>();

	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Menu [productos=" + productos + "]";
	}

	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		Menu app = new Menu();
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection db_conection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "jardineria", "jardineria");
		Statement db_statement = db_conection.createStatement();
		
		int op = 0;
		do {
			app.menu();
			op = teclado.nextInt();
			
			switch (op) {
			case 1:
				app.crearCsv("SELECT CODIGOPEDIDO, ESTADO, CODIGOCLIENTE FROM Pedidos", "pedidos.csv", db_statement);
				break;
			case 2:
				app.crearCsv("SELECT * FROM Detallepedidos", "detalle.csv", db_statement);
				break;
			case 3:
				app.cargarProductos("SELECT * FROM Productos", db_statement);
				break;
			case 4:
				app.consultarPedidos2(db_statement);
				break;
			case 5:
				System.out.println("Adios!!!");
				break;
			}
		} while (op != 5);
		
		teclado.close();
	}

	private void consultarPedidos(Statement db_statement) throws SQLException {
		try {
			PrintWriter out = new PrintWriter(new File("pedidos.txt"));
			
			for (Producto producto:this.productos) {
				ResultSet table = db_statement.executeQuery("SELECT * FROM Detallepedidos WHERE codigoproducto='"+producto.getCodigo()+"'");
				int numero_columnas = table.getMetaData().getColumnCount();
				
				while(table.next()) {
					out.println("Pedido: "+producto.getNombre());
					
					for (int columna = 1; columna <= numero_columnas; columna++) {
						String nombre_columna = table.getMetaData().getColumnLabel(columna);
						out.println("\t"+nombre_columna+": "+table.getString(columna));
					}
					
					out.println("");
				}
			}
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void consultarPedidos2(Statement db_statement) throws SQLException {
		try {
			PrintWriter out = new PrintWriter(new File("pedidos.txt"));
			
			int pedido = 1;
			ResultSet table = db_statement.executeQuery("SELECT * FROM Detallepedidos WHERE codigoproducto='"+pedido+"'");
			
			while (table.next()) {
				this.productos.stream().filter(i->{
					try {
						return i.getCodigo().equals(table.getString(2));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return false;
				}).forEach(i->out.println("\tPedido: "+i.getNombre()));
				out.println("\t.");
			}
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private void cargarProductos(String consulta, Statement db_statement) throws SQLException {
		ResultSet table = db_statement.executeQuery(consulta);
		
		while (table.next()) {
			this.productos.add(new Producto(table.getString(1),table.getString(2),table.getString(3),table.getString(4),table.getString(5),table.getString(6),table.getInt(7),table.getDouble(8),table.getDouble(9)));
		}
		
		crearCsv(consulta, "productos.csv", db_statement);
	}

	private void crearCsv(String consulta, String filename, Statement db_statement) throws SQLException {
		ResultSet table = db_statement.executeQuery(consulta);
		
		int numero_columnas = table.getMetaData().getColumnCount();
		
		try {
			PrintWriter out = new PrintWriter(new File(filename));
			
			while (table.next()) {
				for (int columna = 1; columna <= numero_columnas; columna++) {
					out.print(table.getString(columna)+";");
				}
				out.println();
			}
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void menu() {
		System.out.println("1. Crear pedidos (csv)");
		System.out.println("2. Crear detalle (csv)");
		System.out.println("3. Cargar productos");
		System.out.println("4. Consultar pedidos (txt)");
		System.out.println("5. Salir");
		System.out.println("Elige una opcion");
	}

}

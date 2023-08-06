package canciones;

import java.sql.SQLException;
import java.util.Scanner;

import singleton.BD;

public class Programa {
	public static void main(String[] args) throws SQLException {
		Scanner t = new Scanner(System.in);
		Programa app = new Programa();
		
		BD.getInstance().setUsuario("canciones");
		BD.getInstance().setPassword("1234");
		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		
		int op = 0;
		do {
			app.menu();
			op = t.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Dime el codigo del grupo");
				String cod = t.next();
				System.out.println("Dime el nombre del grupo");
				String nombre = t.next();
				System.out.println("Dime la fecha de creacion");
				String fecha = t.next();
				System.out.println("Dime el tipo de musica");
				String tipo = t.next();
				
				BD.getInstance().consultaBD("insert into grupos values('"+cod+"','"+nombre+"','"+fecha+"','"+tipo+"')");
				break;
			case 2:
				System.out.println("Dime el codigo del grupo");
				String codGroup = t.next();
				
				BD.getInstance().consultaBD("delete from grupos where codigo='"+codGroup+"'");
				BD.getInstance().consultaBD("delete from canciones where codigo_grupo='"+codGroup+"'");
				break;
			case 3:
				System.out.println("Dime el nombre de la cancion");
				
				BD.getInstance().consultaBD("delete from canciones where titulo='"+t.next()+"'");
				break;
			case 4:
				System.out.println("Dime el codigo del grupo");
				
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Adios!!! 🖐🖐🖐");
				break;
			}
		} while (op != 8);
		
		t.close();
	}

	private void menu() {
		System.out.println("1. Dar de alta nuevo grupo en la BD.");
		System.out.println("2. Dar de baja un grupo borrando todas sus canciones.");
		System.out.println("3. Dar de baja una canción de un grupo.");
		System.out.println("4. Dar de alta canción de un grupo.");
		System.out.println("5. Consultar usuarios: Donde se genera un fichero .txt con los datos de los usuarios de la aplicación. ");
		System.out.println("6. Generar grupos.csv: Crea un fichero csv con todos los grupos de la BD");
		System.out.println("7. Generar canciones.csv: Crea un fichero csv con todos las canciones disponibles en la BD");
		System.out.println("8. Salir");
		System.out.println("Elige una opcion");
	}
}

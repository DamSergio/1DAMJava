package singleton;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
				
		BD.getInstance().setUsuario("jardineria");
		BD.getInstance().setPassword("jardineria");
		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
			
			try {
				ResultSet rset=BD.getInstance().consultaBD("select count(*) from pedidos");
				
				 while (rset.next())
			         System.out.println ("Son: "+rset.getString(1)); 
				 BD.getInstance().cerrarConsulta();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
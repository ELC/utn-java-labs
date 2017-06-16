package labsExercises.ejercicio5.data;

import java.sql.*;

public class FactoryConexion {
	
	private static FactoryConexion instancia;
	
	private Connection conn;
		
	private FactoryConexion(){
		try {
			Class.forName("new com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
	public static FactoryConexion getInstancia(){
		if (FactoryConexion.instancia == null){
			FactoryConexion.instancia = new FactoryConexion();
		}
		return FactoryConexion.instancia;
	
	}

	public Connection getConn(){
		return new Connection();
	}
	
}

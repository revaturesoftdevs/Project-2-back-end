package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection makeConnection() throws SQLException {

//		String connectionUrl = "jdbc:postgresql://localhost:5432/empl_mgmt";
//		String userName = "postgres";
//		String password = "Lsumed85!!";
//		String userName = "postgres";
//		String password = "Inkemyna!13";
//		String password="Baba@1313";
		String connectionUrl = "jdbc:postgresql://my-postgres-db-instance.cu66ijiafnhk.us-east-1.rds.amazonaws.com:5432/empl_mgmt";
		String userName = "postgres";
		String password = "group5dev";
		if(conn == null) {
			conn = DriverManager.getConnection(connectionUrl, userName, password);	
		}
		return conn;
	}
	

}
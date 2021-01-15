package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int[] ids = {0, 1, 2};
		String[] names = {"Sue", "Bob", "Charley"};
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dbUrl = "jdbc:mysql://localhost:3306/people";
		
		Connection conn = DriverManager.getConnection(dbUrl,"root", "Shebza@3049176");
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		
		String sql = "insert into user (id, name) values (?, ?)";
		PreparedStatement insertStmt = conn.prepareStatement(sql);
		
		for(int i  = 0; i < ids.length; i++) {
			insertStmt.setInt(1, ids[i]);
			insertStmt.setString(2, names[i]);
			
			insertStmt.executeUpdate();
		}
		
		conn.commit();
		
		insertStmt.close();
		
		sql = "select id, name from user";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			System.out.println(id + ":" + name);
		}
		
		stmt.close();
		
		conn.close();
	}

}

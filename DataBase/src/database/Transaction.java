package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
	public static final String DB_URL = "jdbc:mysql://localhost/university";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "";

	public static void main(String[] args) {
		Connection connect = null;
		
		try {
			connect = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
			connect.setAutoCommit(false);//transaction 			
			
			PreparedStatement pr = connect.prepareStatement("Insert into student (student_name, student_class) values (?,?)");
			pr.setString(1, "John");
			pr.setInt(2, 1);
			pr.execute();//we can use executeUpdate()
			
			if(true) {
				throw new SQLException();
			}
			
			pr.setString(1, "Ahmet");
			pr.setInt(2, 3);
			pr.executeUpdate();
			
			connect.commit(); //********** important
			
			
			
			
		} catch (SQLException e) {
			
			if(connect != null) {//** important
				try {
					connect.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			System.out.println(e.getMessage());
		}
		
	}

}

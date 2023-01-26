package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
//	String url = "jdbc:mysql://localhost/university?user=root&password=";
	public static final String DB_URL = "jdbc:mysql://localhost/university";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "";

	public static void main(String[] args) {
		Connection connect = null;
		String insertSql = "insert into student(student_name,student_class) values ('Damla' , 4)";
		String prSql = "insert into student(student_name,student_class) values (? , ?)";
		
		try {
			connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//			Statement st = connect.createStatement();
//			ResultSet data = st.executeQuery("Select * from student");//sql query
			
			
//			data.first(); gets first data! but needs that : 
//			st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
//			data.absolute(2); gets 2. row
			
/*			while(data.next()) {
				System.out.println("ID : "+data.getInt("student_id"));//we can use index 
				System.out.println("Name : "+data.getString("student_name"));
				System.out.println("Class : "+data.getInt("student_class"));
				
			}
*/			
//		System.out.println(st.executeUpdate(insertSql));//if gets 1, its succeeded!
			PreparedStatement preparedSt = connect.prepareStatement(prSql); // use that for inserting
			preparedSt.setString(1, "Ahmet");
			preparedSt.setInt(2, 5);
			preparedSt.executeUpdate();
			
			preparedSt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

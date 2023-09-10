package g.a.w;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Myclass {
	
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/EMP_DETAILS";
	
	static final String user="root";
	static final String pass="";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn=null;
		Statement stmt=null;
		
		Class.forName(JDBC_DRIVER);
		
		System.out.println("connecting to database");
		
		conn=DriverManager.getConnection(DB_URL,user,pass);
		
		System.out.println("creating database");
		
		stmt=conn.createStatement();
		 String sql="DROP DATABASE emp_details";
		            
		 stmt.executeUpdate(sql);
		 System.out.println("database has been deleted");
		
		
		
		
		
		
		
	}	

}

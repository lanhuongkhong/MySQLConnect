package lan.dev;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		final String BD_URL = "jdbc:mysql://localhost:3306/shop";
		final String USER = "root";
		final String PASS = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(BD_URL, USER, PASS);
			System.out.println("Ket noi thanh cong");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

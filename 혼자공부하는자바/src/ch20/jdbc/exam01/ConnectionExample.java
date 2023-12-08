package ch20.jdbc.exam01;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {

	public static void main(String[] args) {
	
		String driverName = "org.mariadb.jdbc.Driver";
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/thisisjava", "root", "mariadb");
			System.out.println("mariadb 연결 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}

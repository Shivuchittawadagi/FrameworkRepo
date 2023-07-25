package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Testscript {

	@Test
	public void script() throws SQLException, InterruptedException
	{
		String url="jdbc:mysql://localhost:3306/shivu";
		String un="root";
		String pass="root";
		Connection conn = DriverManager.getConnection(url, un, pass);
		Thread.sleep(1500);
		Statement state = conn.createStatement();
		ResultSet res = state.executeQuery("select * from credentials");
		res.next();
		String usrn = res.getString("username");
		System.out.println(usrn);
		String upass = res.getString("pass");
		System.out.println(upass);
		
	}
}

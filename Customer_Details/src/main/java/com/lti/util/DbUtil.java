package com.lti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public Connection getDataSource() 
	{			
			Connection conn=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");			
					conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
					if(conn != null)
					{
					System.out.println("connected in dbUtil");
					}
				} catch (ClassNotFoundException | SQLException e)
				{
					System.out.println("error2" +e.getMessage());
				}			
			return conn;
}
}

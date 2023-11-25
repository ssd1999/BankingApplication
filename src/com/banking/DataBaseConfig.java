package com.banking;

import java.sql.*;

public class DataBaseConfig {

	static Connection con; // Global Connection Object

	public static Connection getConnection() {
		try {

			String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; // jdbc driver	
			String url = "jdbc:mysql://localhost:3306/bankdb"; // mysql url
			String user = "root"; // mysql username
			String pass = "Sachin@98"; // mysql passcode
			Class.forName(mysqlJDBCDriver);
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection passed!");
		} catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}

package com.diworksdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/ecsite";
=======
	private static String url = "jdbc:mysql://localhost/testdb";
>>>>>>> d8cbf63c03156806f52c71177d254ac904df71ff
	private static String user = "root";
	private static String password = "";

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}

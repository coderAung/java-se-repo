package org.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DatabaseManager {
	static final String URL = "jdbc:mysql://localhost:3306/jdbc_3";
	static final String USER = "root";
	static final String PASSWORD = "admin";

	Connection getConnection() throws SQLException;
	
	static DatabaseManager getInstance() {
		return () -> DriverManager.getConnection(URL, USER, PASSWORD);
	}
}

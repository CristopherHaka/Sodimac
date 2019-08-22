package com.sodimac.automation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba {

	public static void main(String[] args) {
		try {				
			String dbURL = "jdbc:postgresql://35.247.198.74/BUC";
			String user = "gochoa";
			String pass = "Oracle123";
			Connection connection = DriverManager.getConnection(dbURL, user, pass);
//			Connection connection = DriverManager.getConnection("jdbc:postgresql:sodimac"); 
		
			 
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver"); 
 
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM information_schema.columns WHERE table_schema = 'public' AND table_name = 'ADDRESS';");
            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", "column_name ="+resultSet.getString("column_name"), "is_nullable ="+resultSet.getString("is_nullable"));
            }
 
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
	}

}

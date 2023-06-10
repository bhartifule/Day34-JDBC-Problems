package com.bridglabz.mysql.Day34JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpPayRollDBService
{
	  /**
     * Declaring Main Method Here
     * For Getting The Connection Of DataBase
     */
    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?userSSL=false";
        String userName = "root";
        String password = "Maggie@123";
        Connection connection;
        System.out.println("connecting to database : " + jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("Connection to the Database Successfully! :" + connection);
        return connection;
    }

}

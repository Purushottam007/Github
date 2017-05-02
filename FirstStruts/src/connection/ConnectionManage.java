package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManage
{
	private static String url="jdbc:mysql://localhost:3306/first";
	private static String driverName="com.mysql.jdbc.Driver";
	private static String username="root";
	private static String password="root";
	public static Connection con;
	
	  //creating static method for connection
    public static Connection getConnection() {
    	//loading a driver
        try {
            Class.forName(driverName);
            System.out.println("Driver loaded");
            //get connection from data base
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
           ex.getMessage();
            System.out.println("Driver not found. " + ex.getMessage()); 
        }
        return con;
    }

}

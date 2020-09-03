package Basic.Selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opencsv.CSVWriter;

public class JDBCUtility {

	// Declare a private static connection obj of Connection Class
	
	private static Connection connection; // connect our script to DB
	
	// Declare a private static Statement obj of Statement Class
	private static Statement statement;
	
	// Declare a private static ResultSet obj of ResultSet Class 
	private static ResultSet resultSet;
	
	//Syntax for postgresql url : jdbc:postgresql://host:port/databaseName
	
	private static String url = "jdbc:postgresql://localhost:5432/dvdrental";
	
	//user name for DB
	private static String username = "postgres";
	
	//password for DB
	private static String password = "root";
	
	// create Connecction for DB
	
	public static void setupDBConnection() {
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			
			
		}catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public static ResultSet runQuery(String query) {
		
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public static void  returnResult() {
		
		try {
			while (resultSet.next()) {
				// write any code to work w result
				// you can print it to console 
				// you can store it in an obj array 
				// write it to excel or csv file 
				
				
				CSVWriter csvWriter;
				
				File file = new File ("C:\\Users\\Ghezal\\eclipse-workspace\\SeleniumProjectFeb2020\\testdataOutput\\book.csv");
				
				try {
					// Filewriter class to wrtite in csv file 
					FileWriter filewriter = new FileWriter(file);
				
				csvWriter = new CSVWriter(filewriter);
				
				csvWriter.writeAll(resultSet, true);
				
				}catch(SQLException e){
					
				}catch(IOException e){
					
				}
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void closeDBConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

	}

}

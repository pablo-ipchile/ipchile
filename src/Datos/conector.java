package Datos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;



public class conector {

	
	private Connection connection = null;
	
	public Connection traerConeccion(){
		if (connection == null){

try { Driver driver = new com.mysql.jdbc.Driver();
             DriverManager.registerDriver(driver); 
connection = DriverManager.getConnection("jdbc:mysql//https://mysql.betatest.cl:3306/","root","root");
             }catch (Exception e ) { 
	
}
} return connection; } 

	
}

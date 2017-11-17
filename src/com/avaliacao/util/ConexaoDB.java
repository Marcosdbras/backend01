package com.avaliacao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConexaoDB {
	public Connection conn;
	public Statement stm;
	public ResultSet rst;
	private String driver = "com.mysql.jdbc.Driver";
	private String caminho = "jdbc:mysql://localhost:3306/dbteste";
	private String usuario = "Admin";
	private String pw = "wLFeErrPjJgb6G8k";
	
	
	public boolean acessoDB(){
		
		
		
			
			try {
				
				Class.forName(driver);
				conn = (Connection) DriverManager.getConnection(caminho, usuario, pw);
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				return false;
				
			} catch (SQLException e){
				
				e.printStackTrace();
				return false;
				
			} 
			
			return true;
			
		
			
		
		
		
	}
	
	public boolean fecharDB(){
		
		try{
		  conn.close();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
}


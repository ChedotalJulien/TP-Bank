
package co.simplon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class TestDao {

	private static int CodeClients;
	private String FirstName;
	private String Name;

	TestDao(int CodeClient, String FirstName, String Name){

		this.CodeClients = CodeClients;
		this.FirstName = FirstName;
		this.Name = Name;


		public static ClientDao getInstance() {

			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {

			}

			ClientDao instance = new ClientDao(
					CodeClients, "jdbc:mariadb://localhost:3306/Bank", "root");
		}
		
	public Connection getConnection() throws SQLException{
		return DriveManager.getconnection(url, username, password);
	}
}
package co.simplon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/Bank";
		String username = "root";
		String password = "keisi";

		try {
			Class.forName (driver);
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			Statement statement = connection.createStatement();


			//String Delete = "DELETE FROM T_Clients where CodeCli=3 ; ";

			//String str = "INSERT INTO T_Clients ( CodeCli, Nom , Prenom ) values ( 1 ,'Lassalle', 'Cathy' );";

			//String sti = "INSERT INTO T_Clients ( CodeCli, Nom , Prenom ) values ( 2,'Yim', 'sreyneang' );";

			String sta = "INSERT INTO T_Clients ( CodeCli, Nom , Prenom ) values ( 4, 'Birrer', 'Hugo' );";

			//String update = "UPDATE T_Clients set Prenom = 'christiane' where CodeCli = 1;";

			//String compte = "INSERT INTO T_Comptes ( NumCpte, Solde, CodeCli ) values ( 205000, 1200, 1 );";
			//String ncs = "INSERT INTO T_Comptes ( NumCpte, Solde, CodeCli ) values ( 654321	, 500000, 2 );";

			//String mimi= "SELECT * FROM T_Comptes INNER JOIN T_Clients ON T_Comptes.CodeCli =T_Clients.CodeCli where T_Clients.CodeCli=1; ";

			statement.executeQuery(sta);

			ResultSet result = statement.executeQuery(sta);
			while (result.next()) {
				System.out.println(result.getInt(1)+" "+result.getDouble(2)+" "+result.getInt(3));
			}
		}	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	/** Constructeur privé pattern */
	private TestBank()
	{

	}
	/** Instance unique pré-initialisée */
	private static final TestBank INSTANCE = new TestBank();

	/** Point d'accès pour l'instance unique du singleton */
	public TestBank getInstance()
	{ return INSTANCE;
	}
}


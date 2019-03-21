package co.simplon.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientsDao {
	private int NumCpte = NumCpte;
	private int Solde = Solde;
	private int CodeClients = CodeClients;


	public ClientsDao(int NumCpte int Solde int CodeClients) {
		this.NumCpte = Cpte;
		this.Solde = Solde;
		this.CodeClients = CodeClients;

	}

	public int getNumCpte() {
		return NumCpte;
	}

	public void setNumCpte(int numCpte) {
		NumCpte = numCpte;
	}

	public int getSolde() {
		return Solde;
	}

	public void setSolde(int solde) {
		Solde = solde;
	}

	public int getCodeClients() {
		return CodeClients;
	}

	public void setCodeClients(int codeClients) {
		CodeClients = codeClients;
	}

	@Override
	public String toString() {
		return "ClientsDao [NumCpte=" + NumCpte + ", Solde=" + Solde + ", CodeClients=" + CodeClients + "]";
	}


	}

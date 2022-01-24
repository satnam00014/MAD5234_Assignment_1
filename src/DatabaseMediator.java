/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satnam
 */
import java.sql.ResultSet;

class DatabaseMediator {
	public String DatabaseConnection;
	public String DBLoginName;
	public String DBUserPassword;
	private static String SQLStatement;
	public static ResultSet DoSQLQuery(String sqlStmt)
	{
		DatabaseMediator.SQLStatement = sqlStmt;
            return null;
		
	}

}


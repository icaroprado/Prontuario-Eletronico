package model;

import java.sql.*;

public	class	ConnectionFactory	{
	public	Connection	getConnection() throws ClassNotFoundException	{
		
		try	{
			Class.forName("org.postgresql.Driver");
			return	DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/ProntuarioDB","icaro","brook1norris2");
			}
		catch	(SQLException	e)	{
			throw	new	RuntimeException(e);
				}
	}
}
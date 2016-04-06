package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryDao {
	
	private String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=root";
	
	public List<String> load(){
		List<String> dictionary = new ArrayList <String> ();
		
		try {
			
			Connection conn = DriverManager.getConnection(jdbcURL);
			String sql = "select nome from parola";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			while(res.next()){
				dictionary.add(res.getString("nome"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return dictionary;
	}

}

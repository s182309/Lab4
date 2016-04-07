package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {
	
	List<String> parola;
	
	public Parola (Integer lunghezza){
		
		parola = new ArrayList <String> ();
		
		
	}
	
	public boolean contains(String s){
		return parola.contains(s);
	}
	
	public void set(Integer index , String s){
			parola.remove(index);
			parola.add(s);
		
//		else
//		throw new RuntimeException("Casella occupata");
//		
	}
	
	public String get(Integer index){
		if(index < parola.size())
		return parola.get(index);
		else 
			return null;
	}
	
	public Integer getIndex(String s){
		return parola.indexOf(s);
	}
	
	public void remove(String s){
		
		parola.remove(s)  ;
		
//		else
//			throw new RuntimeException("Casella vuota");
	}
	
	public String toString(){
		String stringa = "";
		for(String s : parola)
			stringa = stringa + s ;
			return stringa;
	}

}

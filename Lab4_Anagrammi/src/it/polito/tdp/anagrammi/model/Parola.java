package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {
	
	private List<String> parola;
	private String stringa;
	
	public Parola (String stringa){
		
		parola = new ArrayList <String> ();
		this.stringa = stringa;
		
		
	}
	
	public boolean canInsert(String s){
		int qtaStringa = 0;
		int qtaLista = 0;
		
		for(int i = 0; i< stringa.length() ; i++ ){
			if(s.compareTo(String.valueOf(stringa.charAt(i))) == 0)
				qtaStringa++;
		}
		
		for(String st : parola){
			if(st.compareTo(s)==0)
				qtaLista ++;
		}
		if(qtaLista < qtaStringa)
		return true;
		else
			return false;
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

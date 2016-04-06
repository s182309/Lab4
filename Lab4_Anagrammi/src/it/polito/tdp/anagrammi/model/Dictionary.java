package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.dao.DictionaryDao;

public class Dictionary {
	
	List <String> dictionary;
	DictionaryDao dao;
	
	
	public Dictionary() {
		
		dao = new DictionaryDao();
	}


	public void load(){
		
		dictionary = new ArrayList <String> (dao.load());
	}
	
	public boolean contains(String s){
		return dictionary.contains(s);
	}

}

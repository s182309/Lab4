package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class AnagrammiModel {

	Dictionary dictionary;

	public AnagrammiModel() {
		dictionary = new Dictionary();
		dictionary.load();
	}

	public Dictionary getDictionary() {
		return dictionary;
	}


	public List <String>  calcolaAnagramma ( String s ){
		RicercaAnagramma r = new RicercaAnagramma(s);
		return r.calcolaAnagrammi(s);
	}
	

	public static void main(String[] args) {
		AnagrammiModel an = new AnagrammiModel();
		an.calcolaAnagramma("eat");
	}

}

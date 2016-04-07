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

	public List<String> calcolaAnagrammi(String s) {
		List< List <String >> anagrammi = new ArrayList< List <String > >();
		List <String> result = new ArrayList <String> () ;

		int step = 0;
		int numeroAnagrammi = 0;
		
		trovaAnagrammi(s, step, anagrammi , numeroAnagrammi );
		
		for(int i = 0 ; i < anagrammi.size() ; i++){
			String daAggiungere = "";
			for(String str : anagrammi.get(i))
				daAggiungere = daAggiungere+str; 
			
			result.add(daAggiungere);
		}

		return result;

	}

	private void trovaAnagrammi(String s, int step, List<List<String>> anagrammi , int numeroAnagrammi ) {
		if (step == s.length()) {
			numeroAnagrammi++;
			return;
		} else {
			
			for (int i = 0; i < s.length(); i++) {
				List<String> stringa = anagrammi.get(numeroAnagrammi);
				//se lettera non presente e casella non vuota aggiungo
				if (stringa.contains(String.valueOf(s.charAt(i) ) )==false &&
						stringa.get(step) == null) {
					 anagrammi.get(numeroAnagrammi).add(step, String.valueOf(s.charAt(i) ) ) ;
					trovaAnagrammi(s, step + 1, anagrammi , numeroAnagrammi);
					anagrammi.get(numeroAnagrammi).remove(step);
					

				}
				
			}

		}
	}
	
	

	public static void main(String[] args) {
		AnagrammiModel an = new AnagrammiModel();
		System.out.println(an.calcolaAnagrammi("eat"));
	}

}

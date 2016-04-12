package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class RicercaAnagramma {
	
	 private int numeroAnagrammi;
	private String stringa;
	private List <String> result;
	
	public RicercaAnagramma (String s) {
		this.stringa = s;
		numeroAnagrammi = 0;
		result = new ArrayList <String> () ;
	} 
	
	public List<String> calcolaAnagrammi(String s) {
		
		Parola p = new Parola (s);
		
		int step = 0;
		
		trovaAnagrammi(step , p);
		

		return result;

	}

	private void trovaAnagrammi(int step , Parola p) {
		if (step ==stringa.length()) {
			
			numeroAnagrammi++;
			
			if(result.contains(p.toString())==false)
			result.add(p.toString());
			
			return;
		} 
		
		else {
			
			for (int i = 0; i < stringa.length(); i++) {
				
				//se lettera non presente e casella vuota aggiungo
				if ( p.get(step)==null &&
						p.canInsert(String.valueOf(stringa.charAt(i) ) ) == true) {
					
					p.set(step, String.valueOf(stringa.charAt(i) ) ) ;
					trovaAnagrammi(step+1 , p);
					p.remove(p.get(step));
					
				}
				
			}

		}
	}

}

package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private TextArea txtOutput;
    
    private AnagrammiModel model;
    
    public void setModel(AnagrammiModel model){
    	this.model = model;
    }

    @FXML
    void doCalcolaAnagramma(ActionEvent event) {
    	String text = txtInput.getText().trim().toLowerCase();
    	for(int i =0 ; i< text.length() ; i++)
    	if(Character.isLetter(text.charAt(i))==false){
    		txtOutput.setText("Insert alphabetic characters!");
    		return;
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtInput.clear();
    	txtOutput.clear();

    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}


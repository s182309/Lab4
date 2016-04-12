package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class AnagrammiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private TextFlow txtOutput;
    
    private AnagrammiModel model;
    
    public void setModel(AnagrammiModel model){
    	this.model = model;
    }

    @FXML
    void doCalcolaAnagramma(ActionEvent event) {
    	txtOutput.getChildren().clear();
    	
    	String text = txtInput.getText().trim().toLowerCase();
    	for(int i =0 ; i< text.length() ; i++)
    	if(Character.isLetter(text.charAt(i))==false){
    		Text txt = new Text("Insert alphabetic characters!");
    		txtOutput.getChildren().add(txt);
    		return;
    	}
    	
    	else{
    	
    		for(String s : model.calcolaAnagramma(text)){
    		
       			Text temp = new Text(s+"\n");
    			
   			if(model.getDictionary().contains(s) ==true)
   				temp.setFill(Color.BLACK);
   			else
   				temp.setFill(Color.RED);
   			
   			txtOutput.getChildren().add(temp);
    		       }
    		return;
            }
  }

  
    @FXML
    void doReset(ActionEvent event) {
    	
    	txtInput.clear();
    	txtOutput.getChildren().clear();

    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}


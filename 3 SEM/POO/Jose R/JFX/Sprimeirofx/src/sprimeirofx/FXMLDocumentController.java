/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sprimeirofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Informatica
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button Cadastrar;
    
    @FXML
    private TextField Tnome;
    
    @FXML
    private TextField Tsnome;
            
    @FXML 
    private TextField Tfone;
    
    public void clickbutton(){
        System.out.println("Bem Vindo " + Tnome.getText());
    }
           
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}

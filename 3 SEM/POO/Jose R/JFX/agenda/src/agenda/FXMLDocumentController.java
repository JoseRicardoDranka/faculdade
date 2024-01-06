/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package agenda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Informatica
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label Tnome;
    
    @FXML
    private Label Tsnome;
    
    @FXML
    private Label Tfone;
    
    public void clickbutton(){
        
    }
    private void agenda(){
        Tnome.setText("Jose");
        Tsnome.setText("Ricardo");
        Tfone.setText("33333333");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

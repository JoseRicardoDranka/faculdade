/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import com.sun.javafx.scene.control.skin.TextFieldSkin;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;


/**
 *
 * @author Informatica
 */
public class FXMLDocumentController implements Initializable {
    
    
    private String msenha2;
    private boolean mostrars = false;
    @FXML
    private Label label;
    
    @FXML
    private Button botaosenha;
    @FXML
    private TextField login;
    
    @FXML
    private PasswordField senha;
    PasswordField passwordField = new PasswordField();
          
    private String loginPadrao = "tiago";
    
    private String senhaPadrao = "12345";
    
  
    public void clicarBotao(){
        String loginDigitado = login.getText();
        String senhaDigitada = senha.getText();
     
        
        if ((loginDigitado.equals(loginPadrao)) && (senhaDigitada.equals(senhaPadrao ))){
                System.out.println("Parabens!");
                JOptionPane.showMessageDialog(null,"logado com sucesso");
            }else {
                System.out.println("Login ou senha errado. Tente novamente.");
                JOptionPane.showMessageDialog(null,"falha no login");
            
        }
    }
    
     public void mostrarSenha(){
         String msenha = senha.getText();
         String ocultar = "Ocultar Senha";
         if (botaosenha.getText().equals(ocultar)){
              senha.setPromptText("");
              senha.setText(msenha2);
              botaosenha.setText("Mostrar Senha");
              
         }else{
            senha.setText("");
            msenha2 = msenha;
            senha.setPromptText(msenha);
            botaosenha.setText("Ocultar Senha");
        }
     }
        
        

      //JOptionPane.showMessageDialog(null,""+msenha);

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


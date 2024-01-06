/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package crudcliente;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.ResultSet;

/**
 *
 * @author Informatica
 */
public class CrudCliente extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*launch(args);
        Conector conexao = new Conector();
        ResultSet resultado = conexao.select();
        }*/
    }
    
        
  /* public void Ler(){
            while(resultado.next()){
            System.out.println("-------------------");
            System.out.println("ID: " + resultado.getInt("id"));
            System.out.println("NOME: " + resultado.getString("nome"));
            System.out.println("SOBRENOME: " + resultado.getString("sobrenome"));
            System.out.println("-------------------");
            }
        }*/
}

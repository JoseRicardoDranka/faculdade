
package crudcliente;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.sql.ResultSet;


public class FXMLDocumentController implements Initializable {
    @FXML
    public TextField nomeTF;
    private Conector conexao;
    private ResultSet resultado;
    private Connection connection;
    
    public TextField getNomeTF() {
        return nomeTF;
    }

    public void setNomeTF(TextField nomeTF) {
        this.nomeTF = nomeTF;
    }
    
    @FXML
    public TextField sobrenomeTF;

    public TextField getSobrenomeTF() {
        return sobrenomeTF;
    }

    public void setSobrenomeTF(TextField sobrenomeTF) {
        this.sobrenomeTF = sobrenomeTF;
    }
    
    @FXML
    public TextField telefoneTF;

    public TextField getTelefoneTF() {
        return telefoneTF;
    }

    public void setTelefoneTF(TextField telefoneTF) {
        this.telefoneTF = telefoneTF;
    }
    
    @FXML
    public TextField logradouroTF;

    public TextField getLogradouroTF() {
        return logradouroTF;
    }

    public void setLogradouroTF(TextField logradouroTF) {
        this.logradouroTF = logradouroTF;
    }
    
    @FXML
    public TextField numeroTF;

    public TextField getNumeroTF() {
        return numeroTF;
    }

    public void setNumeroTF(TextField numeroTF) {
        this.numeroTF = numeroTF;
    }
    
    @FXML
    public TextField bairroTF;

    public TextField getBairroTF() {
        return bairroTF;
    }

    public void setBairroTF(TextField bairroTF) {
        this.bairroTF = bairroTF;
    }
    
    @FXML
    public TextField idcidadeTF;

    public TextField getIdcidadeTF() {
        return idcidadeTF;
    }

    public void setIdcidadeTF(TextField idcidadeTF) {
        this.idcidadeTF = idcidadeTF;
    }
    @FXML
    public TextField nomeTF1;
    public TextField getNomeTF1() {
        return nomeTF1;
    }

    public void setNomeTF1(TextField nomeTF1) {
        this.nomeTF1 = nomeTF1;
    }
    
    @FXML
    public TextField sobrenomeTF1;

    public TextField getSobrenomeTF1() {
        return sobrenomeTF1;
    }

    public void setSobrenomeTF1(TextField sobrenomeTF1) {
        this.sobrenomeTF1 = sobrenomeTF1;
    }
    
    @FXML
    public TextField telefoneTF1;

    public TextField getTelefoneTF1() {
        return telefoneTF1;
    }

    public void setTelefoneTF1(TextField telefoneTF1) {
        this.telefoneTF1 = telefoneTF1;
    }
    
    @FXML
    public TextField logradouroTF1;

    public TextField getLogradouroTF1() {
        return logradouroTF1;
    }

    public void setLogradouroTF1(TextField logradouroTF1) {
        this.logradouroTF = logradouroTF1;
    }
    
    @FXML
    public TextField numeroTF1;

    public TextField getNumeroTF1() {
        return numeroTF1;
    }

    public void setNumeroTF1(TextField numeroTF1) {
        this.numeroTF1 = numeroTF1;
    }
    @FXML
    public TextField IDTF;
    
    public TextField getIDTF(){
        return IDTF;
    }
    @FXML
    public TextField bairroTF1;

    public TextField getBairroTF1() {
        return bairroTF1;
    }

    public void setBairroTF1(TextField bairroTF1) {
        this.bairroTF1 = bairroTF1;
    }
    
    @FXML
    public TextField idcidadeTF1;

    public TextField getIdcidadeTF1() {
        return idcidadeTF1;
    }

    public void setIdcidadeTF1(TextField idcidadeTF1) {
        this.idcidadeTF1 = idcidadeTF1;
    }
    
    @FXML
    public void inserirCliente() throws ClassNotFoundException, SQLException{
        Cliente cliente = new Cliente(nomeTF.getText(), sobrenomeTF.getText(), telefoneTF.getText(), logradouroTF.getText(), numeroTF.getText(), bairroTF.getText(), Integer.parseInt(idcidadeTF.getText()));
        this.conexao = new Conector();
        conexao.inserirCliente(cliente);
    }
    @FXML
    public void editar(String sql) throws SQLException{
        sql = "UPDATE cliente SET(nome, sobrenome,telefone,logradouro,numero,bairro,Id_cidade),where(id) values(?,?,?,?,?,?,?),(?);";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, nomeTF1.getText());
            stm.setString(2, sobrenomeTF1.getText());
            stm.setString(3, telefoneTF1.getText());
            stm.setString(4, logradouroTF1.getText());
            stm.setString(5, numeroTF1.getText());
            stm.setString(6, bairroTF1.getText());
            stm.setInt(7, Integer.parseInt(idcidadeTF1.getText()));
            stm.setInt(8, Integer.parseInt(IDTF.getText()));
            stm.execute();
            connection.commit();
    }
    @FXML
    public void listar() throws SQLException{
        while(resultado.next()){
            System.out.println("-------------------");
            System.out.println("ID: " + resultado.getInt("id"));
            System.out.println("NOME: " + resultado.getString("nome"));
            System.out.println("SOBRENOME: " + resultado.getString("sobrenome"));
            System.out.println("TELEFONE:"+ resultado.getString("Telefone"));
            System.out.println("LOGRADOURO:"+ resultado.getString("logradouro"));
            System.out.println("NUMERO:"+ resultado.getString("Numero"));
            System.out.println("BAIRRO:"+ resultado.getString("Bairro"));
            System.out.println("ID_CIDADE:"+ resultado.getInt("Id_cidade"));    
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Cliente cliente = new Cliente();
        try {
            Conector conexao = new Conector();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
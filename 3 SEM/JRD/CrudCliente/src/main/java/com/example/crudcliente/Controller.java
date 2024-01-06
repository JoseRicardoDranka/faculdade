package com.example.crudcliente;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class Controller {
     @FXML
     private TextField tfId;
     @FXML
     private TextField tfNome;
     @FXML
     private TextField tfSobrenome;
     @FXML
     private TextField tfTelefone;
     @FXML
     private TextField tfLogradouro;
     @FXML
     private TextField tfNumero;
     @FXML
     private TextField tfBairro;
     @FXML
     private TextField tfCidade;
     @FXML
     private Button btListar;
     @FXML
     private Button btInserir;
     @FXML
     private Button btEditar;
     @FXML
     private Button btDeletar;
     @FXML
     private TableColumn<Cliente , Integer> colId;
     @FXML
     private TableColumn<Cliente , String> colNome;
     @FXML
     private TableColumn<Cliente , String> colSobrenome;
     @FXML
     private TableColumn<Cliente , String> colTelefone;
     @FXML
     private TableColumn<Cliente , String> colLogradouro;
     @FXML
     private TableColumn<Cliente , String> colNumero;
     @FXML
     private TableColumn<Cliente , String> colBairro;
     @FXML
     private TableColumn<Cliente , String> colCidade;
     @FXML
     TableView<Cliente> tbvLista;
     @FXML
     Conector conexao;
     /*---------------------------------------------------------------------------------------------------*/
     @FXML
     public void initialize(){
          try {
               this.ListarBanco();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          } catch (SQLException e) {
               e.printStackTrace();
          }
     }
     @FXML
     private void ListarBanco() throws ClassNotFoundException, SQLException {
          conexao = new Conector();
          ObservableList<Cliente> listaCliente = conexao.getClienteList();

          colId.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id"));
          colNome.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome"));
          colSobrenome.setCellValueFactory(new PropertyValueFactory<Cliente, String>("sobrenome"));
          colTelefone.setCellValueFactory(new PropertyValueFactory<Cliente, String>("telefone"));
          colLogradouro.setCellValueFactory(new PropertyValueFactory<Cliente, String>("logradouro"));
          colNumero.setCellValueFactory(new PropertyValueFactory<Cliente, String>("numero"));
          colBairro.setCellValueFactory(new PropertyValueFactory<Cliente, String>("bairro"));
          colCidade.setCellValueFactory(new PropertyValueFactory<Cliente, String>("cidade"));

          tbvLista.setItems(listaCliente);
     }

     @FXML
     private void InserirBanco() throws Exception {
          conexao = new Conector();
          conexao.inserirDados(tfNome.getText(),tfSobrenome.getText(), tfTelefone.getText(), tfLogradouro.getText(), tfNumero.getText(),tfBairro.getText(), Integer.parseInt(tfCidade.getText()));
          this.ListarBanco();
     }

     @FXML
     private void EditarBanco() throws Exception {
          conexao = new Conector();
          conexao.update(Integer.parseInt(tfId.getText()),tfNome.getText(),tfSobrenome.getText(), tfTelefone.getText(), tfLogradouro.getText(), tfNumero.getText(), tfBairro.getText(), Integer.parseInt(tfCidade.getText()));
          this.ListarBanco();
     }

     @FXML
     private void DeletarBanco() throws Exception {
          conexao = new Conector();
          conexao.delete(Integer.parseInt(tfId.getText()));
          this.ListarBanco();
     }

     @FXML
     public void handleMouseAction(javafx.scene.input.MouseEvent mouseEvent) {
          Cliente cliente = tbvLista.getSelectionModel().getSelectedItem();
          tfId.setText(""+cliente.getId());
          tfNome.setText(cliente.getNome());
          tfSobrenome.setText(cliente.getSobrenome());
          tfTelefone.setText(cliente.getTelefone());
          tfLogradouro.setText(cliente.getLogradouro());
          tfNumero.setText(cliente.getNumero());
          tfBairro.setText(cliente.getBairro());
          tfCidade.setText(""+cliente.getCidade());
     }

     /*---------------------------------------------------------------------------------------------------*/

     public TextField getTfNome() {
          return tfNome;
     }

     public void setTfNome(TextField tfNome) {
          this.tfNome = tfNome;
     }

     public TextField getTfId() {
          return tfId;
     }

     public void setTfId(TextField tfId) {
          this.tfId = tfId;
     }

     public TextField getTfSobrenome() {
          return tfSobrenome;
     }

     public void setTfSobrenome(TextField tfSobrenome) {
          this.tfSobrenome = tfSobrenome;
     }

     public TextField getTfTelefone() {
          return tfTelefone;
     }

     public void setTfTelefone(TextField tfTelefone) {
          this.tfTelefone = tfTelefone;
     }

     public TextField getTfLogradouro() {
          return tfLogradouro;
     }

     public void setTfLogradouro(TextField tfLogradouro) {
          this.tfLogradouro = tfLogradouro;
     }

     public TextField getTfNumero() {
          return tfNumero;
     }

     public void setTfNumero(TextField tfNumero) {
          this.tfNumero = tfNumero;
     }

     public TextField getTfBairro() {
          return tfBairro;
     }

     public void setTfBairro(TextField tfBairro) {
          this.tfBairro = tfBairro;
     }

     public TextField getTfCidade() {
          return tfCidade;
     }

     public void setTfCidade(TextField tfCidade) {
          this.tfCidade = tfCidade;
     }

     public Button getBtListar() {
          return btListar;
     }

     public void setBtListar(Button btListar) {
          this.btListar = btListar;
     }

     public Button getBtInserir() {
          return btInserir;
     }

     public void setBtInserir(Button btInserir) {
          this.btInserir = btInserir;
     }

     public Button getBtEditar() {
          return btEditar;
     }

     public void setBtEditar(Button btEditar) {
          this.btEditar = btEditar;
     }

     public Button getBtDeletar() {
          return btDeletar;
     }

     public void setBtDeletar(Button btDeletar) {
          this.btDeletar = btDeletar;
     }
}
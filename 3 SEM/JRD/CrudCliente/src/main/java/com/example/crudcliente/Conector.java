package com.example.crudcliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class Conector {
     private final String url;
     private final String user;
     private final String senha;
     private Connection connection;

     public Conector() throws ClassNotFoundException {
          this.url = "jdbc:mysql://localhost:3306/livraria?useTimezone=true&serverTimezone=UTC";
          this.user = "root";
          this.senha = "12345";
          this.connection = null;
          conectar();
     }

     private void conectar() throws ClassNotFoundException {
          try {
               if(this.connection == null) {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    this.connection = DriverManager.getConnection(this.url, this.user, this.senha);
                    this.connection.setAutoCommit(false);
               }
          }catch(SQLException e) { //Erro de conexão com o banco de dados
               e.printStackTrace();
          }
     }

     public Connection getConnection() {

          return this.connection;
     }


     public ResultSet select(String sql) throws Exception {
          PreparedStatement stm = connection.prepareStatement(sql);
          ResultSet resultado = stm.executeQuery();
          return resultado;
     }

     public void inserir(String sql) throws Exception {
          PreparedStatement stm = connection.prepareStatement(sql);
          stm.execute(sql);
          connection.commit();
     }

     //inserção de dados no banco, sem a passagem de id.
     public void inserirDados(String nome, String sobrenome, String telefone, String logradouro, String numero,String bairro, int cidade) throws SQLException {
          String sql = "INSERT INTO cliente(nome, sobrenome, telefone, logradouro, numero, bairro, id_cidade) VALUES (?,?,?,?,?,?,?);";
          PreparedStatement stm = connection.prepareStatement(sql);
          stm.setString(1, nome);
          stm.setString(2, sobrenome);
          stm.setString(3, telefone);
          stm.setString(4, logradouro);
          stm.setString(5, numero);
          stm.setString(6, bairro);
          stm.setInt(7, cidade);
          stm.execute();
          connection.commit();
     }

     // Método de listagem do banco na tableview
     public ObservableList<Cliente> getClienteList() throws SQLException {
          ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
          String sql = "SELECT * FROM cliente;";
          Statement st;
          ResultSet rs;

          try {
               st = connection.createStatement();
               rs = st.executeQuery(sql);
               Cliente cliente;
               while(rs.next()){
                    cliente = new Cliente(rs.getString("nome"),
                            rs.getString("sobrenome"), rs.getString("telefone"),
                            rs.getString("logradouro"), rs.getString("numero"),
                            rs.getString("bairro"), rs.getString("id_cidade"));
                    cliente.setId(rs.getInt("id"));
                    listaClientes.add(cliente);
               }
          }catch (Exception ex){
               ex.printStackTrace();
          }
          return listaClientes;
     }

     //Método de editar registro
     public void update(int id, String nome, String sobrenome, String telefone, String logradouro, String numero,String bairro, int cidade) throws Exception {
          String sql = "UPDATE cliente SET nome = '" + nome +"', sobrenome = '" + sobrenome +
                  "', telefone = '" + telefone + "', logradouro = '" + logradouro +"', numero = '"+ numero + "', bairro = '" + bairro + "', id_cidade = " + cidade + " WHERE id = " + id + ";";
          inserir(sql);
     }

     public void delete(int id) throws Exception {
          String sql = "DELETE FROM cliente WHERE id = " + id +";";
          inserir(sql);
     }

}
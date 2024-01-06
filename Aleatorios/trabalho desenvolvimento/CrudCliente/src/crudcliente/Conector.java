package crudcliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conector {
	private final String url;
	private final String user;
	private final String senha;
	private Connection connection;
        
	public Conector() throws ClassNotFoundException {
            this.url = "jdbc:mysql://localhost:3306/livraria?useTimezone=true&serverTimezone=UTC";
            this.user = "root";
            this.senha = "info2k21";
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
            stm.execute();
            connection.commit();
	}
        
        //exemplo de PreparedStatement com substituição por ?
        /*public void exemploMontagemSql() throws SQLException{ 
            String sql = "insert into contato(nome, sobrenome, idade) values(?,?,?);";
            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setString(1, object.getValue1()); //substitui o primeiro ? pelo valor do objeto
//            stm.setString(2, object.getValue2()); //substitui o segundo ? pelo valor do objeto
//            stm.setInt(3, object.getValue3()); //substitui o terceiro ? pelo valor do objeto
            stm.execute();
            connection.commit();
        }
        */
        
        //exemplo de insert com passagem de objeto por parametro
         public void inserirCliente(Cliente cliente) throws SQLException{
            String sql = "insert into cliente(nome, sobrenome, telefone, logradouro, numero, bairro, id_cidade) values(?,?,?,?,?,?,?);";
                PreparedStatement stm = connection.prepareStatement(sql);
                stm.setString(1, cliente.getNome()); //substitui o primeiro ? pelo valor do objeto
                stm.setString(2, cliente.getSobrenome()); //substitui o segundo ? pelo valor do objeto
                stm.setString(3, cliente.getTelefone());
                stm.setString(4, cliente.getLogradouro());
                stm.setString(5, cliente.getNumero());
                stm.setString(6, cliente.getBairro());
                stm.setInt(7, cliente.getId_cidade());
                stm.execute();
                connection.commit();
            }
}
     //"UPDATE cliente SET Nome ="+this.getNomeTF1()",Sobrenome ="+this.getSobrenomeTF1()",telefone="+this.getTelefoneTF1()",logradouro="+this.getLogradouroTF1()",numero="this.getNumeroTF1()",bairro="+this.getBairroTF1()",Id_cidade="+this.getIdcidadeTF1()"WHERE id="+this.getIDTF()";"

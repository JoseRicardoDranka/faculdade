package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.User;

public class Conector {
	private String url;
	private String user;
	private String senha;
	private Connection connection;
        
	public Conector() throws ClassNotFoundException {
            this.url = "jdbc:mysql://localhost:3306/user?useTimezone=true&serverTimezone=UTC";
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
        public void exemploMontagemSql() throws SQLException{ 
            String sql = "insert into contato(nome, sobrenome, idade) values(?,?,?);";
            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setString(1, object.getValue1()); //substitui o primeiro ? pelo valor do objeto
//            stm.setString(2, object.getValue2()); //substitui o segundo ? pelo valor do objeto
//            stm.setInt(3, object.getValue3()); //substitui o terceiro ? pelo valor do objeto
            stm.execute();
            connection.commit();
        }
        
        public void inserirUser(User usuario) throws SQLException{
            String sql = "insert into usuario (nome, sobrenome) values(?,?);";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, usuario.getNome()); //substitui o primeiro ? pelo valor do objeto
            stm.setString(2, usuario.getSobrenome()); //substitui o segundo ? pelo valor do objeto
            stm.execute();
            connection.commit();
        }
        
}
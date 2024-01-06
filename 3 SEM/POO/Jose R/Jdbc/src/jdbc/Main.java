/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import Jdbc.Conector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.Transport;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author Informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        User u;
        u= new User("Jose", "Ricardo", 22);
        
        Conector conexao= new Conector();
        conexao.inserirUser(u);
    }
            
}

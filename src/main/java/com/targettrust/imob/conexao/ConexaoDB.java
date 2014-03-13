package com.targettrust.imob.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mauricionb
 */
public class ConexaoDB{ 
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    Connection con = null;
       try {    
            System.out.println("chegou na conexao!!");
            String url = "jdbc:postgresql://localhost:5432/Rossi";
            String usuario = "postgres";
            String senha = "chica";  
            
            Class.forName("org.postgresql.Driver").newInstance();  
            con = (Connection) DriverManager.getConnection(url, usuario, senha); 
            System.out.println("Conexão realizada com sucesso.");  

        } catch (SQLException e) {
            System.out.println(e);
        }
       return con;
    }
    
}

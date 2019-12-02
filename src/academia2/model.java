/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package academia2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AntonioRony
 */
public class model {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author AntonioRony1
 */

    public ResultSet rs;
    Connection connection;
    public Connection getConexao() throws SQLException {
            
              try {  
             // Carregando o JDBC Driver padrão  
             String driverName = "com.mysql.jdbc.Driver";                          
             Class.forName(driverName);  
            // Configurando a nossa conexão com um banco de dados//  
          String serverName = "localhost";    //caminho do servidor do BD  
            String mydatabase ="academia2";        //nome do seu banco de dados  
             String url = "jdbc:mysql://" + "localhost" + "/" + "academia2";  
            String username = "root";        //nome de um usuário de seu BD        
            String password = "admin";      //sua senha de acesso  
             connection = DriverManager.getConnection(url, username, password);  
            return connection;  
         }  catch (ClassNotFoundException e) {  //Driver não encontrado  
            JOptionPane.showMessageDialog(null,"O driver expecificado nao foi encontrado.");
            return null;  
         } catch (SQLException e) {  
            //Não conseguindo se conectar ao banco  
             JOptionPane.showMessageDialog(null,"Nao foi possivel conectar ao Banco de Dados.");
           
             
             return null;  

    }
}
    
    public void execultar(String sql) throws SQLException{
        
         java.sql.PreparedStatement stmt;
   
   stmt = this.getConexao().prepareStatement(sql);
        
        rs= stmt.executeQuery();
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anton
 */
public class Conexao1 {
public Conexao1 () {    } //Possibilita instancias
public static Connection con = null;
 
public static void Conectar() {
System.out.println("Conectando ao banco...");
try {
  Class.forName("com.mysql.jdbc.Driver");
  con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/academia2","root","admin");
  System.out.println("Conectado.");
} catch (ClassNotFoundException ex) {
    System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
  Logger.getLogger(Conexao1.class.getName()).log(Level.SEVERE, null, ex);
  } catch(SQLException e) {
    System.out.println(e);
    throw new RuntimeException(e);
}
 
}
 
   
}

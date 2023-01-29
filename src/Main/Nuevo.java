/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author USUARIO
 */
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Nuevo {
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
         try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
            String myDB = "jdbc:oracle:thin:@192.168.1.5:1521/xepdb1";//URL DE SQL DEVELOPER
            
            
            String usuario="secretaria";
            String password="123456";
            Connection cnx = DriverManager.getConnection(myDB,usuario,password);
                 System.out.println("Conectado");
          
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("no ubo coneccion");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nuevo.class.getName()).log(Level.SEVERE, null, ex);
            
              System.out.println("tenemos erros");
        }
             
    }
    
}

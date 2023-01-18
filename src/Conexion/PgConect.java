package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PgConect {
    
    public static Connection getConetion(){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
//           Para el controlador ligero: jdbc:oracle:thin:@// nombre de host: 1521/myDatabase
//Para el controlador grueso (OCI): jdbc: oracle: oci:@tnsname1
            String myBD="jdbc:oracle:thin:@localhost:1521:xe";
            String usuario="farmacia";
            String pass="1234";
            
            Connection cnx=DriverManager.getConnection(myBD, usuario, pass);
            
            System.out.println("conexion exitosa");
            return cnx;
         
        }catch(SQLException ex){
            System.out.println(ex.getMessage());  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

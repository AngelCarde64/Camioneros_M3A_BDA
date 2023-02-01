package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PgConect {

    //--> Link de descarga de driver: https://www.oracle.com/database/technologies/appdev/jdbc.html
    Connection con;
    Statement st;
    //192.168.43.211=localhost
    String cadenaConexion = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    // ---> CAMBIAR POR UN USUARIO CON MENOS PRIVILEGIOS
    String pgUsuario = "secretaria";
    String pgPassword = "123456";

    public PgConect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(cadenaConexion, pgUsuario, pgPassword);
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SQLException accion(String nsql) {
        System.out.println(nsql);
        try {
            st = con.createStatement();
            st.execute(nsql);
            st.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public ResultSet consulta(String sql) {
        System.out.println(sql);
        try {
            st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Connection getCon() {
        return con;
    }
}

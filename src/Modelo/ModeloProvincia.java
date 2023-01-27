package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloProvincia extends Provincia {

    PgConect conpg = new PgConect();

    public ModeloProvincia() {
    }

    public ModeloProvincia(String cod_paquete, String nombre) {
        super(cod_paquete, nombre);
    }

    public List<Provincia> ListarProvincia(String filtro) {
        String sql = "select * from Provincia where ";
        sql += " UPPER(pro_codigo_provincia) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(pro_nombre) like UPPER('%" + filtro + "%') ";
        ResultSet rs = conpg.consulta(sql);
        List<Provincia> lista = new ArrayList<Provincia>();
        try {
            while (rs.next()) {
                Provincia provincia = new Provincia();
                provincia.setCod_provincia(rs.getString("pro_codigo_provincia"));
                provincia.setNombre(rs.getString("pro_nombre"));
                lista.add(provincia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProvincia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException CrearProvincia() {
        String sql = "INSERT INTO Provincia (pro_nombre)";
        sql += " VALUES ('" + getNombre() + "','" + "')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarProvincia() {
        String sql = "UPDATE Provincia SET pro_nombre = '" + getNombre() + "';";
        sql += "WHERE pro_codigo_provincia = '" + getCod_provincia() + "';";
        return conpg.accion(sql);
    }

    public SQLException DeleteProvincia() {
        String sql = "DELETE FROM Provincia WHERE pro_codigo_provincia ='" + getCod_provincia() + "';";
        return conpg.accion(sql);
    }

    public ModeloProvincia MostrarDatosProvincia(String id) {
        String sql = "select * from Provincia where pro_codigo_provincia = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloProvincia MProvincia = new ModeloProvincia();
        try {
            while (rs.next()) {
                MProvincia.setCod_provincia(rs.getString("pro_codigo_provincia"));
                MProvincia.setCod_provincia(rs.getString("pro_nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MProvincia;
    }
}

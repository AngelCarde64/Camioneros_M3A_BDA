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

    public ModeloProvincia(int cod_paquete, String nombre) {
        super(cod_paquete, nombre);
    }

    public List<Provincia> ListarProvincia(String filtro) {
        String sql="";
        if(filtro.isEmpty()){
             sql = "select * from PROVINCIA  ";
        }else{
        
        sql = "select * from PROVINCIA where ";
        sql += " UPPER(pro_codigo_provincia) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(pro_nombre) like UPPER('%" + filtro + "%') ";
        }
        ResultSet rs = conpg.consulta(sql);
        List<Provincia> lista = new ArrayList<Provincia>();
        try {
            while (rs.next()) {
                Provincia provincia = new Provincia();
                provincia.setCod_provincia(rs.getInt("pro_codigo_provincia"));
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
        String sql = "INSERT INTO PROVINCIA (pro_nombre)";
        sql += " VALUES ('" + getNombre() +"')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarProvincia() {
        String sql = "UPDATE PROVINCIA SET pro_nombre = '" + getNombre() + "'";
        sql += "WHERE pro_codigo_provincia = '" + getCod_provincia() + "'";
        return conpg.accion(sql);
    }

    public SQLException DeleteProvincia() {
        String sql = "DELETE FROM PROVINCIA WHERE pro_codigo_provincia ='" + getCod_provincia() + "'";
        return conpg.accion(sql);
    }

    public ModeloProvincia MostrarDatosProvincia(String id) {
        String sql = "select * from PROVINCIA where pro_codigo_provincia = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloProvincia MProvincia = new ModeloProvincia();
        try {
            while (rs.next()) {
                MProvincia.setCod_provincia(rs.getInt("pro_codigo_provincia"));
                MProvincia.setNombre(rs.getString("pro_nombre"));
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

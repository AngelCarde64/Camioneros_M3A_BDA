package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloProvincia extends Provincia {

    ConectPG conpg = new ConectPG();

    public ModeloProvincia() {
    }

    public ModeloProvincia(String cod_paquete, String nombre) {
        super(cod_paquete, nombre);
    }

    public List<Provincia> ListarProvincia(String filtro) {
        //--> No es recomendable usar un select *. Solo sacar  la informacion que es necesaria mostrar.
        String sql = "select * from Provincia where "; //Campos de la base de datos.
        sql += " UPPER(pro_codigo_provincia) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(pro_nombre) like UPPER('%" + filtro + "%') ";
        ResultSet rs = conpg.consulta(sql);
        List<Provincia> lista = new ArrayList<Provincia>();
        try {
            while (rs.next()) {
                Provincia provincia = new Provincia();
                provincia.setCod_paquete(rs.getString("pro_codigo_provincia"));
                provincia.setNombre(rs.getString("pro_nombre"));
                lista.add(provincia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean CrearProvincia() {
        String sql = "INSERT INTO Provincia (pro_nombre)";
        sql += " VALUES ('" + getNombre() + "','" + "')";
        return conpg.accion(sql);
    }

    public boolean ActualizarProvincia() {
        String sql = "UPDATE Provincia SET pro_nombre = '" + getNombre() + "';";
        return conpg.accion(sql);
    }

    public boolean DeleteProvincia() {
        String sql = "DELETE FROM Provincia WHERE pro_codigo_provincia ='" + getCod_paquete() + "';";
        return conpg.accion(sql);
    }

    public ModeloProvincia MostrarDatosProvincia(String id) {
        String sql = "select * from Provincia where pro_codigo_provincia = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloProvincia MProvincia = new ModeloProvincia();
        try {
            while (rs.next()) {
                MProvincia.setCod_paquete(rs.getString("pro_codigo_provincia"));
                MProvincia.setCod_paquete(rs.getString("pro_nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MProvincia;
    }
}

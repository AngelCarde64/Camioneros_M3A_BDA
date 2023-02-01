package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloDirrecciones extends Dirrecciones {

    PgConect conpg = new PgConect();

    public ModeloDirrecciones() {
    }

    public ModeloDirrecciones(int id, String calle_P, String calle_S) {
        super(id, calle_P, calle_S);
    }

    public List<Dirrecciones> ListarDirrecciones(String filtro) {
        String sql = "";
        if (filtro.isEmpty()) {
            sql = "select * from Dirrecciones";
        } else {
            sql = "select * from Dirrecciones where UPPER(dir_id) like UPPER('%" + filtro + "%') ";
            sql += "OR UPPER(dir_calle_P) like UPPER('%" + filtro + "%') ";
            sql += "OR UPPER(dir_calle_S) like UPPER('%" + filtro + "%') ";
        }
        ResultSet rs = conpg.consulta(sql);
        List<Dirrecciones> lista = new ArrayList<Dirrecciones>();
        try {
            while (rs.next()) {
                Dirrecciones dirrecciones = new Dirrecciones();
                dirrecciones.setId(rs.getInt("dir_id"));
                dirrecciones.setCalle_P(rs.getString("dir_calle_P"));
                dirrecciones.setCalle_S(rs.getString("dir_calle_S"));
                lista.add(dirrecciones);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDirrecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDirrecciones.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException CrearDirrecciones() {
        String sql = "INSERT INTO Dirrecciones (dir_calle_p, dir_calle_s)";
        sql += " VALUES ('" + getCalle_P() + "','" + getCalle_S() + "')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarDirrecciones() {
        String sql = "UPDATE Dirrecciones SET dir_calle_P = '" + getCalle_P() + "', dir_calle_S = '" + getCalle_S() + "'";
        sql += "WHERE dir_id = '" + getId() + "';";
        return conpg.accion(sql);
    }

    public SQLException DeleteDirrecciones() {
        String sql = "DELETE FROM Dirrecciones WHERE dir_id ='" + getId() + "'";
        return conpg.accion(sql);
    }

    public ModeloDirrecciones MostrarDatosDirrecciones(String id) {
        String sql = "select * from Dirrecciones where dir_id = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloDirrecciones MDirrecciones = new ModeloDirrecciones();
        try {
            while (rs.next()) {
                MDirrecciones.setId(rs.getInt("dir_id"));
                MDirrecciones.setCalle_P(rs.getString("dir_calle_P"));
                MDirrecciones.setCalle_S(rs.getString("dir_calle_S"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDirrecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDirrecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MDirrecciones;
    }
}

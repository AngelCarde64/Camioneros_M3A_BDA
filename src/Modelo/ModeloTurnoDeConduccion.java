package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloTurnoDeConduccion extends TurnoDeConduccion {

    PgConect conpg = new PgConect();

    public ModeloTurnoDeConduccion() {
    }

    public ModeloTurnoDeConduccion(int id, java.sql.Date fechaInicio, java.sql.Date fechaFin, int tur_cami_id, int tur_cam_id) {
        super(id, fechaInicio, fechaFin, tur_cami_id, tur_cam_id);
    }

    public List<TurnoDeConduccion> ListarTConduccion(String filtro) {
        String sql="";
        if(filtro.isEmpty()){
            sql = "select * from Turno_de_conduccion ";
        }else{
         sql = "select * from Turno_de_conduccion where ";
        sql += " UPPER(tur_id_turno) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(tur_fecha_inicio) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(tur_fecha_fin) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(tur_cami_id) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(tur_cam_id) like UPPER('%" + filtro + "%') ";
         }
        ResultSet rs = conpg.consulta(sql);
        List<TurnoDeConduccion> lista = new ArrayList<TurnoDeConduccion>();
        try {
            while (rs.next()) {
                TurnoDeConduccion TConduccion = new TurnoDeConduccion();
                TConduccion.setId(rs.getInt("tur_id_turno"));
                TConduccion.setFechaInicio(rs.getDate("tur_fecha_inicio"));
                TConduccion.setFechaFin(rs.getDate("tur_fecha_fin"));
                TConduccion.setCami_id(rs.getInt("tur_cami_id"));
                TConduccion.setCam_id(rs.getInt("tur_cam_id"));
                lista.add(TConduccion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloTurnoDeConduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloTurnoDeConduccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException CrearTConduccion() {
        String sql = "INSERT INTO Turno_de_conduccion (tur_fecha_inicio, tur_fecha_fin, tur_cami_id, tur_cam_id)";
        sql += " VALUES (to_date('" + getFechaInicio() + "', 'YYYY-MM-DD'), to_date('" + getFechaFin() + "', 'YYYY-MM-DD'), '" + getCami_id() + "', '" + getCam_id() + "')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarTConduccion() {
        String sql = "UPDATE Turno_de_conduccion SET tur_fecha_inicio = " + "to_date('" + getFechaInicio() + "', 'YYYY-MM-DD')" + ", tur_fecha_fin = " + "to_date('" + getFechaFin()+ "', 'YYYY-MM-DD')"
                + ", tur_cami_id = '" + getCami_id() + "', tur_cam_id = '" + getCam_id() + "'";
        sql += "WHERE tur_ID_turno = '" + getId() + "'";
        return conpg.accion(sql);
    }

    public SQLException DeleteTConduccion() {
        String sql = "DELETE FROM Turno_de_conduccion WHERE tur_id_turno ='" + getId() + "'";
        return conpg.accion(sql);
    }

    public ModeloTurnoDeConduccion MostrarDatosTConduccion(String id) {
        String sql = "select * from Turno_de_conduccion where tur_id_turno = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloTurnoDeConduccion MCamionero = new ModeloTurnoDeConduccion();
        try {
            while (rs.next()) {
                MCamionero.setId(rs.getInt("tur_id_turno"));
                MCamionero.setFechaInicio(rs.getDate("tur_fecha_inicio"));
                MCamionero.setFechaFin(rs.getDate("tur_fecha_fin"));
                MCamionero.setCami_id(rs.getInt("tur_cami_id"));
                MCamionero.setCam_id(rs.getInt("tur_cam_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloTurnoDeConduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloTurnoDeConduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MCamionero;
    }
}

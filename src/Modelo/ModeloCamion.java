package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCamion extends Camion {

    PgConect conpg = new PgConect();

    public ModeloCamion() {
    }

    public ModeloCamion(int id, String nro_Placa, String modelo, String tipo, String potencia) {
        super(id, nro_Placa, modelo, tipo, potencia);
    }

    public List<Camion> ListarDirrecciones(String filtro) {
        String sql = "select * from Camion where ";
        sql += " UPPER(cam_id) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cam_nro_Placa) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cam_modelo) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cam_tipo) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cam_potencia) like UPPER('%" + filtro + "%') ";
        ResultSet rs = conpg.consulta(sql);
        List<Camion> lista = new ArrayList<Camion>();
        try {
            while (rs.next()) {
                Camion camion = new Camion();
                camion.setId(rs.getInt("cam_id"));
                camion.setNro_Placa(rs.getString("cam_nro_Placa"));
                camion.setModelo(rs.getString("cam_modelo"));
                camion.setTipo(rs.getString("cam_tipo"));
                camion.setPotencia(rs.getString("cam_potencia"));
                lista.add(camion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException CrearDirrecciones() {
        String sql = "INSERT INTO Camion (cam_nro_Placa, cam_modelo, cam_tipo, cam_potencia)";
        sql += " VALUES ('" + getNro_Placa() + "','" + getModelo() + "','" + getTipo() + "','" + getPotencia() + "')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarDirrecciones() {
        String sql = "UPDATE Camion SET cam_nro_Placa = '" + getNro_Placa() + "', cam_modelo = '" + getModelo()
                + "', cam_tipo = '" + getTipo() + "', cam_potencia = '" + getPotencia() + "'";
        sql += "WHERE cam_id = '" + getId() + "';";
        return conpg.accion(sql);
    }

    public SQLException DeleteDirrecciones() {
        String sql = "DELETE FROM Camion WHERE cam_id ='" + getId() + "';";
        return conpg.accion(sql);
    }

    public ModeloCamion MostrarDatosDirrecciones(String id) {
        String sql = "select * from Camion where cam_id = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloCamion MCamion = new ModeloCamion();
        try {
            while (rs.next()) {
                MCamion.setId(rs.getInt("cam_id"));
                MCamion.setNro_Placa(rs.getString("cam_nro_Placa"));
                MCamion.setModelo(rs.getString("cam_modelo"));
                MCamion.setTipo(rs.getString("cam_tipo"));
                MCamion.setPotencia(rs.getString("cam_potencia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MCamion;
    }
}

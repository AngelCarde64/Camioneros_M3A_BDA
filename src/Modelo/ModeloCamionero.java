package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCamionero extends Camionero {

    PgConect conpg = new PgConect();

    public ModeloCamionero() {
    }

    public ModeloCamionero(int id, String dni, String nombre, String telefono, String poblacion, String id_Direccion, double sueldo, String correo) {
        super(id, dni, nombre, telefono, poblacion, id_Direccion, sueldo, correo);
    }

    public List<Camionero> ListarCamioneros(String filtro) {
        String sql = "select * from Camionero where ";
        sql += " UPPER(cami_id) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_dni) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_nombre) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_telefono) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_id_Direccion) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_sueldo) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cami_poblacion) like UPPER('%" + filtro + "%') ";
//        sql += "OR UPPER(cami_correo) like UPPER('%" + filtro + "%') ";
        ResultSet rs = conpg.consulta(sql);
        List<Camionero> lista = new ArrayList<Camionero>();
        try {
            while (rs.next()) {
                Camionero camionero = new Camionero();
                camionero.setId(rs.getInt("cami_id"));
                camionero.setDni(rs.getString("cami_dni"));
                camionero.setNombre(rs.getString("cami_nombre"));
                camionero.setTelefono(rs.getString("cami_telefono"));
                camionero.setId_Direccion(rs.getString("cami_id_Direccion"));
                camionero.setSueldo(rs.getDouble("cami_sueldo"));
                camionero.setPoblacion(rs.getString("cami_poblacion"));
//                camionero.setCorreo(rs.getString("cami_correo"));
                lista.add(camionero);
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

    public SQLException CrearCamionero() {
        String sql = "INSERT INTO Camionero (cami_dni, cami_nombre, cami_telefono, cami_id_Direccion, cami_sueldo, cami_poblacion, cami_correo)";
        sql += " VALUES ('" + getDni() + "','" + getNombre() + "','" + getTelefono() + "','" + getId_Direccion()
                + "','" + getId_Direccion() + "','" + getSueldo() + "','" + getPoblacion() + "','" + getCorreo() + "')";
        return conpg.accion(sql);
    }

    public SQLException ActualizarCamionero() {
        String sql = "UPDATE Camionero SET cami_dni = '" + getDni() + "', cami_nombre = '" + getNombre() + "', cami_telefono = '" + getTelefono()
                + "', cami_id_Direccion = '" + getId_Direccion() + "', cami_sueldo = '" + getSueldo()
                + "', cami_poblacion = '" + getPoblacion() + "', cami_correo = '" + getCorreo() + "'";
        sql += "WHERE cami_id = '" + getId() + "';";
        return conpg.accion(sql);
    }

    public SQLException DeleteCamionero() {
        String sql = "DELETE FROM Camionero WHERE cami_id ='" + getId() + "';";
        return conpg.accion(sql);
    }

    /**
     * ---> Para buscar al camionero segun el id y obtener los datos para poner
     * en los jtexfield.
     */
    public ModeloCamionero MostrarDatosCamionero(String id) {
        String sql = "select * from Camionero where cami_id = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloCamionero MCamionero = new ModeloCamionero();
        try {
            while (rs.next()) {
                MCamionero.setId(rs.getInt("cami_id"));
                MCamionero.setDni(rs.getString("cami_dni"));
                MCamionero.setNombre(rs.getString("cami_nombre"));
                MCamionero.setTelefono(rs.getString("cami_telefono"));
                MCamionero.setId_Direccion(rs.getString("cami_id_Direccion"));
                MCamionero.setSueldo(rs.getDouble("cami_sueldo"));
                MCamionero.setPoblacion(rs.getString("cami_poblacion"));
                MCamionero.setCorreo(rs.getString("cami_correo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MCamionero;
    }
}

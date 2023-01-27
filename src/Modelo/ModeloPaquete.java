package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPaquete extends Paquete {

    ConectPG conpg = new ConectPG();

    public ModeloPaquete() {
    }

    public ModeloPaquete(int id, String cod_paquete, String descripcion, String destinatario, String direccion) {
        super(id, cod_paquete, descripcion, destinatario, direccion);
    }

    public List<Paquete> ListarPaquete(String filtro) {
        //--> No es recomendable usar un select *. Solo sacar  la informacion que es necesaria mostrar.
        String sql = "select * from Paqueteria where "; //Campos de la base de datos.
        sql += " UPPER(paq_id_paquetes) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(paq_codigo_paquete) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(paq_id_direccion) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(paq_descripcion) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(paq_destinatario) like UPPER('%" + filtro + "%') ";
        ResultSet rs = conpg.consulta(sql);
        List<Paquete> lista = new ArrayList<Paquete>();
        try {
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setId(rs.getInt("paq_id_paquetes"));
                paquete.setCod_paquete(rs.getString("paq_codigo_paquete"));
                paquete.setDireccion(rs.getString("paq_id_direccion"));
                paquete.setDescripcion(rs.getString("paq_descripcion"));
                paquete.setDestinatario(rs.getString("paq_destinatario"));
                lista.add(paquete);
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

    public boolean CrearPaquete() {
        String sql = "INSERT INTO Paqueteria (paq_codigo_paquete, paq_id_direccion, paq_descripcion, paq_destinatario)";
        sql += " VALUES ('" + getCod_paquete() + "','" + getDireccion() + "','" + "','" + getDescripcion() + "','" + getDestinatario() + "','" + "')";
        return conpg.accion(sql);
    }

    public boolean ActualizarPaquete() {
        String sql = "UPDATE Paqueteria SET paq_codigo_paquete = '" + getCod_paquete() + "', paq_id_direccion = '" + getDireccion()
                + "', paq_descripcion = '" + getDescripcion() + "', paq_destinatario = '" + getDestinatario() + "'";
        sql += "WHERE paq_id_paquetes = '" + getId() + "';";
        System.out.println("SENTENCIA " + sql);
        return conpg.accion(sql);
    }

    public boolean DeletePaquete() {
        String sql = "DELETE FROM Paqueteria WHERE paq_id_paquetes ='" + getId() + "';";
        return conpg.accion(sql);
    }

    public ModeloPaquete MostrarDatosPaquete(String id) {
        String sql = "select * from Paqueteria where paq_id_paquetes = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloPaquete MPaquete = new ModeloPaquete();
        try {
            while (rs.next()) {
                MPaquete.setId(rs.getInt("paq_id_paquetes"));
                MPaquete.setCod_paquete(rs.getString("paq_codigo_paquete"));
                MPaquete.setDireccion(rs.getString("paq_id_direccion"));
                MPaquete.setDescripcion(rs.getString("paq_descripcion"));
                MPaquete.setDestinatario(rs.getString("paq_destinatario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MPaquete;
    }
}

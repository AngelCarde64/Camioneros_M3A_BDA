package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCliente extends Cliente {

    PgConect conpg = new PgConect();

    public ModeloCliente() {
    }

    public ModeloCliente(int id, String dni, String nombre, String telefono) {
        super(id, dni, nombre, telefono);

    }

    public List<Cliente> ListarCliente(String filtro) {
        String sql = "select * from cliente where ";
        sql += " UPPER(cli_id) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cli_dni) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cli_nombre) like UPPER('%" + filtro + "%') ";
        sql += "OR UPPER(cli_telefono) like UPPER('%" + filtro + "%') ";

        ResultSet rs = conpg.consulta(sql);
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("cli_id"));
                cliente.setDni(rs.getString("cli_dni"));
                cliente.setNombre(rs.getString("cli_nombre"));
                cliente.setTelefono(rs.getString("cli_telefono"));
                
                lista.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException CrearCliente() {

        String sql = "INSERT INTO Cliente (cli_DNI, cli_nombre, cli_telefono)";
        sql += " VALUES ('" + getDni() + "','" + getNombre() + "','" + getTelefono()
                + "')";

//        String sql = "INSERT INTO Camionero (cami_dni, cami_nombre, cami_telefono, cami_id_Direccion, cami_sueldo, cami_poblacion)";
//        sql += " VALUES ('" + getDni() + "','" + getNombre() + "','" + getTelefono() + "','" + getId_Direccion()
//                + "','" + getSueldo() + "','" + getPoblacion() + "')";
////        + "','" + getCorreo() - cami_correo
        return conpg.accion(sql);
    }

    public SQLException ActualizarCliente() {
        String sql = "UPDATE Cliente SET cli_DNI = '" + getDni() + "', cli_nombre = '" + getNombre() + "', cli_telefono = '" + getTelefono();
        sql += " WHERE cli_id = '" + getId() + "'";
        return conpg.accion(sql);
    }

    public SQLException BorrarCliente() {
        String sql = "DELETE FROM Cliente WHERE cli_id ='" + getId() + "'";
        return conpg.accion(sql);
    }

    /**
     * ---> Para buscar al camionero segun el id y obtener los datos para poner
     * en los jtexfield.
     */
    public ModeloCliente MostrardatosCliente (String id) {
        String sql = "select * from Cliente where cli_id = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloCliente Mcliente = new ModeloCliente();
        try {
            while (rs.next()) {
                Mcliente.setId(rs.getInt("cli_id"));
                Mcliente.setDni(rs.getString("cli_dni"));
                Mcliente.setNombre(rs.getString("cli_nombre"));
                Mcliente.setTelefono(rs.getString("cli_telefono"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();//cierro conexion BD
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Mcliente;
    }
}

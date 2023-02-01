package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ControlCliente {

    private VistaRegistroCliente vistaCli;
    private ModeloCliente modeloCliente;

    private Validaciones validaciones = new Validaciones();
    private String criterio = "", mssDEError = "";
    private int seleccionado = -1;
    private List<Cliente> listaClientes;

    public ControlCliente(VistaRegistroCliente vistaCli, ModeloCliente modeloCliente) {
        this.vistaCli = vistaCli;
        this.modeloCliente = modeloCliente;
    }

    public void iniciarControl() {

        // --> Obtener ID de Direcciones
        // --> Add listeners MOUSE LISTENER
        CargarClientes();

        vistaCli.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });

        vistaCli.getjButtonActualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarClientes();
            }
        });

        vistaCli.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        vistaCli.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        vistaCli.getTablaR().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        vistaCli.getjTextFieldBuscar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vistaCli.getjTextFieldBuscar().getText().contains("Buscar")) {
                    vistaCli.getjTextFieldBuscar().setText("");
                    vistaCli.getjTextFieldBuscar().setForeground(Color.black);
                }
            }
        });

        // --> Key Listener
        vistaCli.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    Buscar();
                }
            }
        });

        vistaCli.getjFieldDNI().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });
        vistaCli.getjFieldNombre().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloLetras(evt);
            }

        });

        vistaCli.getjFieldtelefono().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });

        // --> Desactivar elementos que van a estar ocultos al principio
        vistaCli.getjLabelSinCoincidencias().setVisible(false);
    }

    // --> Se llenaran todos los datos en la tabla
    public void LlenarTablaBusqueda() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaCli.getTablaR().getModel();
        mTabla.setNumRows(0);
        listaClientes = modeloCliente.ListarCliente(criterio);
        // Uso de una expresion landa
//        listap.stream().forEach(cam -> {
//            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
//                cam.getPoblacion(), cam.getTelefono(), String.valueOf(cam.getSueldo()),String.valueOf(cam.getId_Direccion()),cam.getCorreo()};
//            mTabla.addRow(filaNueva);
//        });

        if (!listaClientes.isEmpty()) {
            listaClientes.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                    cam.getTelefono()};
                mTabla.addRow(filaNueva);
            });
        } else {
            vistaCli.getjLabelSinCoincidencias().setVisible(true);
        }

    }

    public void CargarClientes() {
        // Para darle forma al modelo de la tabla

        DefaultTableModel pTabla = (DefaultTableModel) vistaCli.getTablaR().getModel();
        pTabla.setNumRows(0);

        listaClientes = modeloCliente.ListarCliente("");

        // Uso de una expresion landa
//        listap.stream().forEach(cam -> {
//             String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
//                cam.getPoblacion(), cam.getTelefono(), String.valueOf(cam.getSueldo()),String.valueOf(cam.getId_Direccion()),cam.getCorreo()};
        listaClientes.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getTelefono()};

            pTabla.addRow(filaNueva);

        });

    }

    public void Insertar() {
        ModeloCliente MCliente = new ModeloCliente();
        MCliente = RecuperarDatos(MCliente,false);

        if (MCliente.CrearCliente() == null) {
//            crearEmail();
//                    sendEmail();
            JOptionPane.showMessageDialog(null,
                    "Cliente creado satisfactoriamente.");

            CargarClientes();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Cliente!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {
        ModeloCliente MCliente = new ModeloCliente();
        MCliente = RecuperarDatos(MCliente,true);
        MCliente.setId(listaClientes.get(seleccionado).getId());

        if (MCliente.ActualizarCliente() == null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente modificado satisfactoriamente.");
            CargarClientes();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Cliente!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        int respuesta = 0;
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloCliente MCliente = new ModeloCliente(listaClientes.get(seleccionado).getId(), "", "", "");

                if (MCliente.BorrarCliente() == null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    seleccionado = -1;
                    CargarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!",
                            "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
                    seleccionado = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                seleccionado = 0;
            }
        }
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public ModeloCliente RecuperarDatos(ModeloCliente MCli,boolean isUpdate) {
        mssDEError = "";
        if (isUpdate) {
            MCli.setId(listaClientes.get(seleccionado).getId());
        } else {
            boolean ValiCRepetida = !MCli.ListarCliente(vistaCli.getjFieldDNI().getText()).isEmpty();

            if (ValiCRepetida) {
                mssDEError += "\n - El DNI ya existe ya existe";
                return null;
            }
        }
        MCli.setDni(vistaCli.getjFieldDNI().getText());
        MCli.setNombre(vistaCli.getjFieldNombre().getText());
        MCli.setTelefono(vistaCli.getjFieldtelefono().getText());

        return MCli;
    }

    

    public void MostrarDatos() {
        vistaCli.getjLabelID().setText(String.valueOf(listaClientes.get(seleccionado).getId()));
        vistaCli.getjFieldDNI().setText(listaClientes.get(seleccionado).getDni());
        vistaCli.getjFieldNombre().setText(listaClientes.get(seleccionado).getNombre());
        vistaCli.getjFieldtelefono().setText(listaClientes.get(seleccionado).getTelefono());

    }

    public void LimpiarDatos() {
        vistaCli.getjFieldDNI().setText("");
        vistaCli.getjFieldNombre().setText("");
        vistaCli.getjFieldtelefono().setText("");
    }

    public void Buscar() {
        criterio = vistaCli.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vistaCli.getjLabelSinCoincidencias().setVisible(false);
            CargarClientes();
        }
    }

    private void ObtenerIDTable() {
        seleccionado = vistaCli.getTablaR().convertRowIndexToModel(vistaCli.getTablaR().getSelectedRow());
        vistaCli.getTablaR().removeAll();
        MostrarDatos();
    }
}

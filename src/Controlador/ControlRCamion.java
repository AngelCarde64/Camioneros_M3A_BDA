package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRCamion {

    private VistaRCamion VRCamion;
    private ModeloCamion MCamion;

    private Validaciones validaciones = new Validaciones();
    private String criterio = "", mssDEError = "";
    private int id_Camion;

    private List<Camion> listaCamiones;

    public ControlRCamion(VistaRCamion VRCamion, ModeloCamion MCamion) {
        this.VRCamion = VRCamion;
        this.MCamion = MCamion;
    }

    public void iniciarControl() {
        CargarCamiones();
        
        // --> Add listeners MOUSE LISTENER
        VRCamion.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });

        VRCamion.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        VRCamion.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        VRCamion.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        VRCamion.getjTextFieldBuscar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (VRCamion.getjTextFieldBuscar().getText().contains("Buscar")) {
                    VRCamion.getjTextFieldBuscar().setText("");
                    VRCamion.getjTextFieldBuscar().setForeground(Color.black);
                }
            }
        });

        // --> Key Listener
        VRCamion.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    Buscar();
                }
            }
        });

        VRCamion.getjFieldnro_Placa().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });

        VRCamion.getjFieldpotencia().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });

        // --> Desactivar elementos que van a estar ocultos al principio
        VRCamion.getjLabelSinCoincidencias().setVisible(false);
    }

    // --> Se llenaran todos los datos en la tabla
    public void LlenarTablaBusqueda() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) VRCamion.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaCamiones = MCamion.ListarCamion(criterio);
        // Uso de una expresion landa

        if (!listaCamiones.isEmpty()) {
            listaCamiones.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getId()), cam.getNro_Placa(), cam.getTipo(), cam.getPotencia(), cam.getModelo()};
                mTabla.addRow(filaNueva);
            });
        } else {
            VRCamion.getjLabelSinCoincidencias().setVisible(true);
        }

    }

    public void CargarCamiones() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) VRCamion.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaCamiones = MCamion.ListarCamion("");
        // Uso de una expresion landa

        listaCamiones.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getId()), cam.getNro_Placa(), cam.getTipo(), cam.getPotencia(), cam.getModelo()};
                mTabla.addRow(filaNueva);
        });
    }

    public void Insertar() {
        ModeloCamion MCamion = new ModeloCamion();
        MCamion = RecuperarDatos(MCamion);

        if (!mssDEError.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error al crear al Camion!\n"
                    + "Por favor corriga estos errores:" + mssDEError,
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (MCamion.CrearCamion()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camion creado satisfactoriamente.");

            CargarCamiones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Camion!\n"
                    + "¡¡Error al intentar crear al camion!!",
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {
        ModeloCamion MCamion = new ModeloCamion();
        MCamion = RecuperarDatos(MCamion);

        if (MCamion.ActualizarCamion()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero modificado satisfactoriamente.");
            CargarCamiones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camion!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        if (id_Camion == 0) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al Camion!\n"
                    + "Por favor Selecciona un camion",
                    "Error al eliminar al Camion", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = 0;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloCamionero MCamionero = new ModeloCamionero(id_Camion, "", "", "", "", 0, 0, "");

                if (MCamionero.DeleteCamionero() == null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    id_Camion = 0;
                    CargarCamiones();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!",
                            "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
                    id_Camion = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                id_Camion = 0;
            }
        }
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public ModeloCamion RecuperarDatos(ModeloCamion MCami) {
        mssDEError = "";
        boolean ValiCRepetida = !MCami.ListarCamion(VRCamion.getjFieldnro_Placa().getText()).isEmpty();

            if (ValiCRepetida) {
                mssDEError += "\n - El numero de placa ingresada ya existe";
                return null;
            }
            MCami.setNro_Placa(VRCamion.getjFieldnro_Placa().getText());
            
        if (!VRCamion.getjFieldModelo().getText().isEmpty()) {
            MCami.setModelo(VRCamion.getjFieldModelo().getText());
        } else {
            mssDEError += "\n - Ingrese un modelo.";
            return null;
        }

        if (!VRCamion.getjFieldTipo().getText().isEmpty()) {
            MCami.setTipo(VRCamion.getjFieldTipo().getText());
        } else {
            mssDEError += "\n - Ingrese un valor de tipo.";
            return null;
        }

        if (!VRCamion.getjFieldpotencia().getText().isEmpty()) {
            MCami.setPotencia(VRCamion.getjFieldpotencia().getText());
        } else {
            mssDEError += "\n - Ingrese un valor para la potencia.";
            return null;
        }

        return MCami;
    }

    public void MostrarDatos() {
        VRCamion.getjLabelID().setText(String.valueOf(listaCamiones.get(id_Camion).getId()));
        VRCamion.getjFieldnro_Placa().setText(listaCamiones.get(id_Camion).getNro_Placa());
        VRCamion.getjFieldModelo().setText(listaCamiones.get(id_Camion).getModelo());
        VRCamion.getjFieldTipo().setText(listaCamiones.get(id_Camion).getTipo());
        VRCamion.getjFieldpotencia().setText(listaCamiones.get(id_Camion).getPotencia());
    }

    public void LimpiarDatos() {
        VRCamion.getjFieldnro_Placa().setText("");
        VRCamion.getjFieldModelo().setText("");
        VRCamion.getjFieldTipo().setText("");
        VRCamion.getjFieldpotencia().setText("");
    }

    public void Buscar() {
        criterio = VRCamion.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            VRCamion.getjLabelSinCoincidencias().setVisible(false);
            CargarCamiones();
        }
    }

    private void ObtenerIDTable() {
        id_Camion = VRCamion.getTablaDeRegistros().convertRowIndexToModel(VRCamion.getTablaDeRegistros().getSelectedRow());
        VRCamion.getTablaDeRegistros().removeAll();
        MostrarDatos();
    }
}

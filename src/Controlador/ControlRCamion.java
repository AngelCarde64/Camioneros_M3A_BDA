package Controlador;

import Modelo.*;
import Vista.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRCamion {

    private VistaRCamion VRCamion;
    private ModeloCamion MCamion;

    private Validaciones vali = new Validaciones();
    private String criterio = "";
    private int id_Camion;

    public ControlRCamion(VistaRCamion VRCamion, ModeloCamion MCamion) {
        this.VRCamion = VRCamion;
        this.MCamion = MCamion;
    }

    public void iniciarControl() {
        CargarCamiones();
        // --> Add listeners
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
        VRCamion.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar();
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

        List<Camion> listap = MCamion.ListarCamion(criterio);
        // Uso de una expresion landa
        listap.stream().forEach(cami -> {
            String[] filaNueva = {String.valueOf(cami.getId()), cami.getModelo(), cami.getNro_Placa(), cami.getPotencia(), cami.getTipo()};
            mTabla.addRow(filaNueva);
        });
    }

    public void CargarCamiones() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) VRCamion.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Camion> listap = MCamion.ListarCamion("");
        // Uso de una expresion landa
        listap.stream().forEach(cami -> {
            String[] filaNueva = {String.valueOf(cami.getId()), cami.getModelo(), cami.getNro_Placa(), cami.getPotencia(), cami.getTipo()};
            mTabla.addRow(filaNueva);
            mTabla.addRow(filaNueva);
        });
    }

    public void Insertar() {
        ModeloCamion MCamion = new ModeloCamion();
        MCamion = RecuperarDatos(MCamion);

        if (MCamion.CrearCamion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camion creado satisfactoriamente.");
            CargarCamiones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Camion!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {
        ModeloCamion MCamion = new ModeloCamion();
        MCamion = RecuperarDatos(MCamion);

        if (MCamion.ActualizarCamion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camion modificado satisfactoriamente.");
            CargarCamiones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camion!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        if (id_Camion == 0) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!\n"
                    + "Por favor Selecciona un camionero",
                    "Error al eliminar al Camionero", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = 0;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
<<<<<<< HEAD
                ModeloCamionero MCamionero = new ModeloCamionero(id_Camion, "", "", "", "", 0, 0, "");
=======
                ModeloCamion MCamion = new ModeloCamion(id_Camion, "", "", "", "");
>>>>>>> 19986e3e5f62ff177a1b72eb5c384f3d832c0017

                if (MCamion.DeleteCamion() == null) {
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

    public ModeloCamion RecuperarDatos(ModeloCamion MCamion) {
        MCamion.setNro_Placa(VRCamion.getjFieldnro_Placa().getText());
        MCamion.setModelo(VRCamion.getjFieldModelo().getText());
        MCamion.setPotencia(VRCamion.getjFieldpotencia().getText());
        MCamion.setTipo(VRCamion.getjFieldTipo().getText());
        return MCamion;
    }

    public ModeloCamion MostrarDatos(ModeloCamion MCamion) {
        VRCamion.getjLabelID().setText("");
        VRCamion.getjFieldnro_Placa().setText("");
        VRCamion.getjFieldModelo().setText("");
        VRCamion.getjFieldpotencia().setText("");
        VRCamion.getjFieldTipo().setText("");
        return MCamion;
    }

    public ModeloCamion LimpiarDatos(ModeloCamion MCamion) {
        VRCamion.getjLabelID().setText("");
        VRCamion.getjFieldnro_Placa().setText("");
        VRCamion.getjFieldModelo().setText("");
        VRCamion.getjFieldpotencia().setText("");
        VRCamion.getjFieldTipo().setText("");
        return MCamion;
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
        id_Camion = 0;
        DefaultTableModel tm = (DefaultTableModel) VRCamion.getTablaDeRegistros().getModel();
        id_Camion = (int) tm.getValueAt(VRCamion.getTablaDeRegistros().getSelectedRow(), 0);
    }
}

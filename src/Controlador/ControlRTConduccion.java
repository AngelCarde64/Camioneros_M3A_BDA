package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRTConduccion {

    private VistaRegistroTConduccion vistaTC;
    private ModeloTurnoDeConduccion modeloTC;

    private Validaciones validaciones = new Validaciones();
    private String criterio = "", mssDEError = "";
    private int id_TC;

    private List<TurnoDeConduccion> listaTC;
    private List<Camion> listaCamion;
    private List<Camionero> listaCamioneros;

    public ControlRTConduccion(VistaRegistroTConduccion vistaTC, ModeloTurnoDeConduccion modeloTC) {
        this.vistaTC = vistaTC;
        this.modeloTC = modeloTC;
    }

    public void iniciarControl() {
        CargarCamioneros();

        // --> Obtener ID de camionero y camion
        ModeloCamion MCam = new ModeloCamion();
        ModeloCamionero MCami = new ModeloCamionero();

        listaCamion = MCam.ListarCamion("");
        listaCamioneros = MCami.ListarCamioneros("");

        vistaTC.getjCBoxIDCamion().removeAllItems();
        vistaTC.getjCBoxIDCamionero().removeAllItems();
        listaCamion.forEach(listC -> vistaTC.getjCBoxIDCamion().addItem(String.valueOf(listC.getId()
                + " - " + listC.getNro_Placa())));
        listaCamioneros.forEach(listC -> vistaTC.getjCBoxIDCamionero().addItem(String.valueOf(listC.getId()
                + " - " + listC.getDni())));

        // --> Add listeners MOUSE LISTENER
        vistaTC.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });

        vistaTC.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        vistaTC.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        vistaTC.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        vistaTC.getjTextFieldBuscar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vistaTC.getjTextFieldBuscar().getText().contains("Buscar")) {
                    vistaTC.getjTextFieldBuscar().setText("");
                    vistaTC.getjTextFieldBuscar().setForeground(Color.black);
                }
            }
        });

        // --> Key Listener
        vistaTC.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    Buscar();
                }
            }
        });
        // --> Desactivar elementos que van a estar ocultos al principio
        vistaTC.getjLabelSinCoincidencias().setVisible(false);
    }

    // --> Se llenaran todos los datos en la tabla
    public void LlenarTablaBusqueda() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaTC.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaTC = modeloTC.ListarTConduccion(criterio);
        // Uso de una expresion landa

        if (!listaTC.isEmpty()) {
            listaTC.stream().forEach(tc -> {
                String[] filaNueva = {String.valueOf(tc.getId()), String.valueOf(tc.getCam_id()), String.valueOf(tc.getCami_id()), String.valueOf(tc.getFechaInicio()), String.valueOf(tc.getFechaFin())};
                mTabla.addRow(filaNueva);
            });
        } else {
            vistaTC.getjLabelSinCoincidencias().setVisible(true);
        }

    }

    public void CargarCamioneros() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaTC.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaTC = modeloTC.ListarTConduccion("");
        // Uso de una expresion landa

        listaTC.stream().forEach(tc -> {
            String[] filaNueva = {String.valueOf(tc.getId()), String.valueOf(tc.getCam_id()), String.valueOf(tc.getCami_id()), String.valueOf(tc.getFechaInicio()), String.valueOf(tc.getFechaFin())};
            mTabla.addRow(filaNueva);
        });
    }

    public void Insertar() {
        ModeloTurnoDeConduccion MTC = new ModeloTurnoDeConduccion();
        MTC = RecuperarDatos(MTC);

        if (!mssDEError.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error al crear al turno conducción!\n"
                    + "Por favor corriga estos errores:" + mssDEError,
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (MTC.CrearTConduccion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero creado satisfactoriamente.");

            CargarCamioneros();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al turno conducción!\n"
                    + "¡¡Error al intentar crear al turno conducción!!",
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {
        ModeloTurnoDeConduccion MTC = new ModeloTurnoDeConduccion();
        MTC = RecuperarDatos(MTC);

        if (MTC.ActualizarTConduccion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Turno conducción fue modificado satisfactoriamente.");
            LimpiarDatos();
            CargarCamioneros();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al turno conducción!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        if (id_TC == 0) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al turno conducción!\n"
                    + "Por favor Selecciona un turno conducción",
                    "Error al eliminar al turno conducción", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = 0;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloCamionero MCamionero = new ModeloCamionero(id_TC, "", "", "", "", 0, 0, "");

                if (MCamionero.DeleteCamionero() == null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    id_TC = 0;
                    CargarCamioneros();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar al turno conducción!",
                            "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
                    id_TC = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                id_TC = 0;
            }
        }
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public ModeloTurnoDeConduccion RecuperarDatos(ModeloTurnoDeConduccion MTC) {
        mssDEError = "";
        if (!vistaTC.getjDateChooserFechaInicio().getDate().toString().isEmpty()) {
            MTC.setFechaInicio(vistaTC.getjDateChooserFechaInicio().getDate());
        } else {
            mssDEError += "\n - Ingrese un valor para Fecha Inicio.";
            return null;
        }

        if (!vistaTC.getjDateChooserFechaFin().getDate().toString().isEmpty()) {
            MTC.setFechaFin(vistaTC.getjDateChooserFechaFin().getDate());
        } else {
            mssDEError += "\n - Ingrese un valor para Fecha fin";
            return null;
        }

        MTC.setCam_id((listaCamioneros.get(vistaTC.getjCBoxIDCamion().getSelectedIndex()).getId()));
        MTC.setCami_id((listaCamioneros.get(vistaTC.getjCBoxIDCamionero().getSelectedIndex()).getId()));
        return MTC;
    }

    public void MostrarDatos() {
        vistaTC.getjLabelID().setText(String.valueOf(listaTC.get(id_TC).getId()));
        vistaTC.getjCBoxIDCamion().setSelectedItem(listaCamion.get(id_TC).getId());
        vistaTC.getjCBoxIDCamionero().setSelectedItem(listaCamioneros.get(id_TC).getId());
        vistaTC.getjDateChooserFechaInicio().setDate(listaTC.get(id_TC).getFechaInicio());
        vistaTC.getjDateChooserFechaFin().setDate(listaTC.get(id_TC).getFechaFin());
    }

    public void LimpiarDatos() {
        vistaTC.getjCBoxIDCamion().setSelectedIndex(0);
        vistaTC.getjCBoxIDCamionero().setSelectedIndex(0);
        vistaTC.getjDateChooserFechaInicio().setDate(null);
        vistaTC.getjDateChooserFechaFin().setDate(null);
    }

    public void Buscar() {
        criterio = vistaTC.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vistaTC.getjLabelSinCoincidencias().setVisible(false);
            CargarCamioneros();
        }
    }

    private void ObtenerIDTable() {
        id_TC = vistaTC.getTablaDeRegistros().convertRowIndexToModel(vistaTC.getTablaDeRegistros().getSelectedRow());
        vistaTC.getTablaDeRegistros().removeAll();
        MostrarDatos();
    }
}

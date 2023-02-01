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
    private int seleccionado=-1;

    private List<TurnoDeConduccion> listaTC;
    private List<Camion> listaCamion;
    private List<Camionero> listaCamioneros;

    public ControlRTConduccion(VistaRegistroTConduccion vistaTC, ModeloTurnoDeConduccion modeloTC) {
        this.vistaTC = vistaTC;
        this.modeloTC = modeloTC;
    }

    public void iniciarControl() {
        CargarRT();

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
        vistaTC.getjButtonActualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarRT();
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

    public void CargarRT() {
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
        MTC = RecuperarDatos(MTC,false);

        if (!mssDEError.isEmpty() && MTC==null) {
            JOptionPane.showMessageDialog(null, "Error al crear al turno conducción!\n"
                    + "Por favor corriga estos errores:" + mssDEError,
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (MTC.CrearTConduccion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero creado satisfactoriamente.");

            CargarRT();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al turno conducción!\n"
                    + "¡¡Error al intentar crear al turno conducción!!",
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {

        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Error al modificar al paquete!\n"
                    + "Por favor seleccione una tabla" + mssDEError,
                    "Error al modificar al paquete", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        ModeloTurnoDeConduccion MTC = new ModeloTurnoDeConduccion();
        MTC = RecuperarDatos(MTC,true);
        MTC.setId(listaTC.get(seleccionado).getId());
        if (MTC.ActualizarTConduccion() == null) {
            JOptionPane.showMessageDialog(null,
                    "Turno conducción fue modificado satisfactoriamente.");
           
            CargarRT();
             LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al turno conducción!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al turno conducción", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al turno conducción!\n"
                    + "Por favor Selecciona un turno conducción",
                    "Error al eliminar al turno conducción", JOptionPane.ERROR_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                String cedula;
                cedula = vistaTC.getTablaDeRegistros().getValueAt(seleccionado, 0).toString();
                modeloTC.setId(Integer.parseInt(cedula));

                if (modeloTC.DeleteTConduccion()== null) {
                    JOptionPane.showMessageDialog(null, "La persona fue eliminada exitosamente");
                    CargarRT();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public ModeloTurnoDeConduccion RecuperarDatos(ModeloTurnoDeConduccion MTC,boolean isUpdate) {
        mssDEError = "";
         
        if (vistaTC.getjDateChooserFechaInicio().getDate() == null) {
            mssDEError += "\n - Ingrese un valor para Fecha Inicio.";
            return null;
        } else {
        java.sql.Date fechaInicioSQL = new java.sql.Date(vistaTC.getjDateChooserFechaInicio().getDate().getTime());
            MTC.setFechaInicio(fechaInicioSQL);
        }

        if (vistaTC.getjDateChooserFechaFin().getDate() == null) {
            mssDEError += "\n - Ingrese un valor para Fecha fin";
            return null;
        } else {
        java.sql.Date fechaFinSQL = new java.sql.Date(vistaTC.getjDateChooserFechaFin().getDate().getTime());
            MTC.setFechaFin(fechaFinSQL);
        }
         if (isUpdate) {
            MTC.setId(listaTC.get(seleccionado).getId());
        } 

        MTC.setCam_id((listaCamion.get(vistaTC.getjCBoxIDCamion().getSelectedIndex()).getId()));
        MTC.setCami_id((listaCamioneros.get(vistaTC.getjCBoxIDCamionero().getSelectedIndex()).getId()));
        return MTC;
    }

    public void MostrarDatos() {
        vistaTC.getjLabelID().setText(String.valueOf(listaTC.get(seleccionado).getId()));
        vistaTC.getjCBoxIDCamion().setSelectedItem(listaCamion.get(seleccionado).getId());
        vistaTC.getjCBoxIDCamionero().setSelectedItem(listaCamioneros.get(seleccionado).getId());
        vistaTC.getjDateChooserFechaInicio().setDate(listaTC.get(seleccionado).getFechaInicio());
        vistaTC.getjDateChooserFechaFin().setDate(listaTC.get(seleccionado).getFechaFin());
    }

    public void LimpiarDatos() {
        vistaTC.getjCBoxIDCamion().setSelectedIndex(0);
        vistaTC.getjCBoxIDCamionero().setSelectedIndex(0);
        vistaTC.getjDateChooserFechaInicio().setDate(null);
        vistaTC.getjDateChooserFechaFin().setDate(null);
        vistaTC.getjLabelID().setText(null);
    }

    public void Buscar() {
        criterio = vistaTC.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vistaTC.getjLabelSinCoincidencias().setVisible(false);
            CargarRT();
        }
    }

    private void ObtenerIDTable() {
        seleccionado = vistaTC.getTablaDeRegistros().convertRowIndexToModel(vistaTC.getTablaDeRegistros().getSelectedRow());
        vistaTC.getTablaDeRegistros().removeAll();
        MostrarDatos();
    }
}

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
        CargarCamioneros();
        // --> Obtener ID de Direcciones
        ModeloDirrecciones MDirreciones = new ModeloDirrecciones();
//        listaDirecciones = MDirreciones.ListarDirrecciones("");
        System.out.println("LISTAA: " + MDirreciones.ListarDirrecciones("").get(0).getCalle_P());
        ModeloCamion mo = new ModeloCamion();
        System.out.println("Lista de camiones:   " + mo.ListarCamion(""));
//        vistaCam.getjCBoxIDDirecciones().removeAllItems();
//
//        for (Dirrecciones listD : listaDirecciones) {
//            vistaCam.getjCBoxIDDirecciones().addItem(String.valueOf(listD.getId()));
//        }

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

    public void CargarCamioneros() {
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
        ModeloCamionero MCamionero = new ModeloCamionero();
        MCamionero = RecuperarDatos(MCamionero);

        if (MCamionero.CrearCamionero() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero creado satisfactoriamente.");
            CargarCamioneros();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Modificar() {
        ModeloCamionero MCamionero = new ModeloCamionero();
        MCamionero = RecuperarDatos(MCamionero);

        if (MCamionero.ActualizarCamionero() == null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero modificado satisfactoriamente.");
            CargarCamioneros();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
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
                ModeloCamionero MCamionero = new ModeloCamionero(id_Camion, "", "", "", "", "", 0, "");

                if (MCamionero.DeleteCamionero() == null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    id_Camion = 0;
                    CargarCamioneros();
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
    public ModeloCamionero RecuperarDatos(ModeloCamionero MCami) {
        MCami.setDni(VRCamion.getjFieldDNI().getText());
        MCami.setNombre(VRCamion.getjFieldNombre().getText());
        MCami.setTelefono(VRCamion.getjFieldtelefono().getText());
        MCami.setPoblacion(VRCamion.getjSpinnerPoblacion().getValue().toString());
        MCami.setSueldo((Double.parseDouble(VRCamion.getjFieldsueldo().toString())));
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        return MCami;
    }

    public void Buscar() {
        criterio = VRCamion.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            VRCamion.getjLabelSinCoincidencias().setVisible(false);
            CargarCamioneros();
        }
    }

    private void ObtenerIDTable() {
        id_Camion = 0;
        DefaultTableModel tm = (DefaultTableModel) VRCamion.getTablaDeRegistros().getModel();
        id_Camion = (int) tm.getValueAt(VRCamion.getTablaDeRegistros().getSelectedRow(), 0);
    }
}

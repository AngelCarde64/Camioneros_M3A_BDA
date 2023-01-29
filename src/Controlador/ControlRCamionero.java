package Controlador;

import Modelo.*;
import Vista.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRCamionero {

    private VistaRCamionero vistaCam;
    private ModeloCamionero modeloCamionero;

    private Validaciones vali = new Validaciones();
    private String criterio = "";
    private int id_Camionero;
    // --> Sera usado para mostrar en uin combo box todas los ID de dirreciones disponibles
    private List<Dirrecciones> listaDirecciones;

    public ControlRCamionero(VistaRCamionero vistaCam, ModeloCamionero modeloCamionero) {
        this.vistaCam = vistaCam;
        this.modeloCamionero = modeloCamionero;
    }

    public void iniciarControl() {
        CargarCamioneros();
        // --> Obtener ID de Direcciones
        ModeloDirrecciones MDirreciones = new ModeloDirrecciones();
//        listaDirecciones = MDirreciones.ListarDirrecciones("");
        System.out.println("LISTAA: " + MDirreciones.ListarDirrecciones(""));
        vistaCam.getjCBoxIDDirecciones().removeAllItems();

        for (Dirrecciones listD : listaDirecciones) {
            vistaCam.getjCBoxIDDirecciones().addItem(String.valueOf(listD.getId()));
        }

        // --> Add listeners
        vistaCam.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });

        vistaCam.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        vistaCam.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        vistaCam.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        vistaCam.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar();
            }
        });
        // --> Desactivar elementos que van a estar ocultos al principio
        vistaCam.getjLabelSinCoincidencias().setVisible(false);
    }

    // --> Se llenaran todos los datos en la tabla
    public void LlenarTablaBusqueda() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Camionero> listap = modeloCamionero.ListarCamioneros(criterio);
        // Uso de una expresion landa
        listap.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getTelefono(), cam.getPoblacion(), cam.getId_Direccion(), String.valueOf(cam.getSueldo()), cam.getId_Direccion()};
            mTabla.addRow(filaNueva);
        });
    }

    public void CargarCamioneros() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Camionero> listap = modeloCamionero.ListarCamioneros("");
        // Uso de una expresion landa
        listap.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getTelefono(), cam.getPoblacion(), cam.getId_Direccion(), String.valueOf(cam.getSueldo()), cam.getId_Direccion()};
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
        if (id_Camionero == 0) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!\n"
                    + "Por favor Selecciona un camionero",
                    "Error al eliminar al Camionero", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = 0;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloCamionero MCamionero = new ModeloCamionero(id_Camionero, "", "", "", "", "", 0, "");

                if (MCamionero.DeleteCamionero() == null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    id_Camionero = 0;
                    CargarCamioneros();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!",
                            "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
                    id_Camionero = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                id_Camionero = 0;
            }
        }
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public ModeloCamionero RecuperarDatos(ModeloCamionero MCami) {
        MCami.setDni(vistaCam.getjFieldDNI().getText());
        MCami.setNombre(vistaCam.getjFieldNombre().getText());
        MCami.setTelefono(vistaCam.getjFieldtelefono().getText());
        MCami.setPoblacion(vistaCam.getjSpinnerPoblacion().getValue().toString());
        MCami.setSueldo((Double.parseDouble(vistaCam.getjFieldsueldo().toString())));
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        return MCami;
    }

    public void Buscar() {
        criterio = vistaCam.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vistaCam.getjLabelSinCoincidencias().setVisible(false);
            CargarCamioneros();
        }
    }

    private void ObtenerIDTable() {
        id_Camionero = 0;
        DefaultTableModel tm = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        id_Camionero = (int) tm.getValueAt(vistaCam.getTablaDeRegistros().getSelectedRow(), 0);
    }
}

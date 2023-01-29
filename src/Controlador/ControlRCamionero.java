package Controlador;

import Modelo.Camionero;
import Modelo.ModeloCamionero;
import Vista.VistaRCamionero;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControlRCamionero {
    
    private VistaRCamionero vistaCam;
    private ModeloCamionero modeloCamionero;
    
    private Validaciones vali = new Validaciones();
    private String id_Camionero = "", criterio = "";
    
    public ControlRCamionero(VistaRCamionero vistaCam, ModeloCamionero modeloCamionero) {
        this.vistaCam = vistaCam;
        this.modeloCamionero = modeloCamionero;
    }
    
    public void iniciarControl() {
        CargarCamioneros();
        // --> Add listeners
        vistaCam.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable(evt);
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
        
    }
    
    public void Modificar() {
        
    }
    
    public void Eliminar() {
        
    }

    /**
     * ---> Cuando se le da click en un elemento de la tabla en la parte derecha
     * se llenaran los datos.
     */
    public void RecuperarDatos() {
        vistaCam.getjFieldDNI().setText(criterio);
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
    
    private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        id_Camionero = "";
        DefaultTableModel tm = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        id_Camionero = String.valueOf(tm.getValueAt(vistaCam.getTablaDeRegistros().getSelectedRow(), 0));
    }
}

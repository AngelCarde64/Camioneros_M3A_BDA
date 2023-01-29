package Controlador;

import Modelo.ModeloCamionero;
import Vista.VistaRegistroCamionero;
import javax.swing.table.DefaultTableModel;

public class ControlRegistroCamionero {

    private VistaRegistroCamionero vistaCam;
    private ModeloCamionero modeloCamionero;

    private Validaciones vali = new Validaciones();
    private String id_Camionero = "", criterio = "";

    public ControlRegistroCamionero(VistaRegistroCamionero vistaCam, ModeloCamionero modeloCamionero) {
        this.vistaCam = vistaCam;
        this.modeloCamionero = modeloCamionero;
    }

    public void iniciarControl() {

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
    }

    public void LlenarTabla() {

    }

    public void Insertar() {

    }

    public void Modificar() {

    }

    public void Eliminar() {

    }

    public void Buscar() {
        criterio = vistaCam.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTabla();
        } else {
            vistaCam.getjLabelSinCoincidencias().setVisible(false);
//            CargarPersonas();
        }
    }

    private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        id_Camionero = "";
        DefaultTableModel tm = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        id_Camionero = String.valueOf(tm.getValueAt(vistaCam.getTablaDeRegistros().getSelectedRow(), 0));
    }
}

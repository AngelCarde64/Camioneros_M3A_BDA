/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dirrecciones;
import Modelo.ModeloDirrecciones;
import Vista.VistaRegistroDirrecciones;
import Vista.VistaRegistroPaquetes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ControladorDirecciones {
    private VistaRegistroDirrecciones VistaDirecciones;
    private ModeloDirrecciones modelo;
    private Validaciones vali = new Validaciones();
    private String id_Direccion = "", criterio = "";

    public ControladorDirecciones(VistaRegistroDirrecciones VistaPaquetes, ModeloDirrecciones modelo) {
        this.VistaDirecciones = VistaPaquetes;
        this.modelo = modelo;
    }
    public void LlenarTablaBusqueda() {

    }
    public void iniciarControl() {
        CargarDirecciones();
        // --> Add listeners
        VistaDirecciones.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable(evt);
            }
        });
        VistaDirecciones.getJtextFieldBuscarPaquete().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar();
            }
        });
        // --> Desactivar elementos que van a estar ocultos al principio
        VistaDirecciones.getjLabelSinCoincidencias().setVisible(false);
    }
    
    public void CargarDirecciones() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) VistaDirecciones.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Dirrecciones> listap = modelo.ListarDirrecciones("");

        // Uso de una expresion landa
        listap.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getCalle_P(),cam.getCalle_S()};
            mTabla.addRow(filaNueva);
        });
    }
    
    
    public void Buscar() {
        criterio = VistaDirecciones.getJtextFieldBuscarPaquete().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            VistaDirecciones.getjLabelSinCoincidencias().setVisible(false);
            CargarDirecciones();
        }
    }
    
     public void Insertar() {
        ModeloDirrecciones MCamionero = new ModeloDirrecciones();
        MCamionero = RecuperarDatos(MCamionero);

        if (MCamionero.CrearDirrecciones()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero creado satisfactoriamente.");
            CargarDirecciones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public ModeloDirrecciones RecuperarDatos(ModeloDirrecciones MCami) {
        MCami.setCalle_P(VistaDirecciones.getjFieldNombreRA1().getText());
        MCami.setCalle_S(VistaDirecciones.getjFieldCalleS().getText());
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        return MCami;
    }
     
     private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        id_Direccion = "";
        DefaultTableModel tm = (DefaultTableModel) VistaDirecciones.getTablaDeRegistros().getModel();
        id_Direccion = String.valueOf(tm.getValueAt(VistaDirecciones.getTablaDeRegistros().getSelectedRow(), 0));
    }
}

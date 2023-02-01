/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloProvincia;
import Modelo.Provincia;
import Vista.VistaRegistroProvincia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ControlProvincias {
    private VistaRegistroProvincia vistaProvincias;
    private ModeloProvincia modeloProv;
     private Validaciones vali = new Validaciones();
    private String id_Direccion = "", criterio = "";

    public ControlProvincias(VistaRegistroProvincia vistaProvincias, ModeloProvincia modeloProv) {
        this.vistaProvincias = vistaProvincias;
        this.modeloProv = modeloProv;
    }
    
    public void iniciarControl(){
        CargarDirecciones();
        // --> Add listeners
        vistaProvincias.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable(evt);
            }
        });
        vistaProvincias.getJtextFieldBuscarPaquete().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar();
            }
        });
        // --> Desactivar elementos que van a estar ocultos al principio
        vistaProvincias.getjLabelSinCoincidencias().setVisible(false);
        
        vistaProvincias.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });
    }
    
    public void CargarDirecciones() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaProvincias.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Provincia> listap = modeloProv.ListarProvincia("");

        // Uso de una expresion landa
        listap.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getCod_provincia()), cam.getNombre()};
            mTabla.addRow(filaNueva);
        });
    }
    
    
    public void Buscar() {
        criterio = vistaProvincias.getJtextFieldBuscarPaquete().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vistaProvincias.getjLabelSinCoincidencias().setVisible(false);
            CargarDirecciones();
        }
    }
    
    public void LlenarTablaBusqueda() {

    }
    
     public void Insertar() {
        ModeloProvincia MCamionero = new ModeloProvincia();
        MCamionero = RecuperarDatos(MCamionero);

        if (MCamionero.CrearProvincia()== null) {
            JOptionPane.showMessageDialog(null,
                    "Provincia creada satisfactoriamente.");
            CargarDirecciones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la Provincia!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear la Provincia", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public ModeloProvincia RecuperarDatos(ModeloProvincia MCami) {
        MCami.setNombre(vistaProvincias.getjFieldNombreRA().getText());
       
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        return MCami;
    }
     
     private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        id_Direccion = "";
        DefaultTableModel tm = (DefaultTableModel) vistaProvincias.getTablaDeRegistros().getModel();
        id_Direccion = String.valueOf(tm.getValueAt(vistaProvincias.getTablaDeRegistros().getSelectedRow(), 0));
    }
}

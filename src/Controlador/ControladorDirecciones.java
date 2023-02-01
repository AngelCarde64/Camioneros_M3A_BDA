/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dirrecciones;
import Modelo.ModeloDirrecciones;
import Vista.VistaRegistroDirecciones;
import Vista.VistaRegistroPaquetes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ControladorDirecciones {
    private VistaRegistroDirecciones VistaDirecciones;
    private ModeloDirrecciones modelo;
    private Validaciones vali = new Validaciones();
    private String id_Direccion = "", criterio = "";
    int seleccionado;
    private List<Dirrecciones> listadirecciones;
    
    public ControladorDirecciones(VistaRegistroDirecciones VistaPaquetes, ModeloDirrecciones modelo) {
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
        VistaDirecciones.getJtextFieldBuscarDirecciones().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar();
            }
        });
        // --> Desactivar elementos que van a estar ocultos al principio
        VistaDirecciones.getjLabelSinCoincidencias().setVisible(false);
        
        VistaDirecciones.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });
        
        VistaDirecciones.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
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
        criterio = VistaDirecciones.getJtextFieldBuscarDirecciones().getText().trim();

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
                    "Dirección creada satisfactoriamente.");
            CargarDirecciones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public ModeloDirrecciones RecuperarDatos(ModeloDirrecciones MCami) {
        MCami.setCalle_P(VistaDirecciones.getjFieldNombreRA().getText());
        MCami.setCalle_S(VistaDirecciones.getjTextFieldCalleSe().getText());
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        return MCami;
    }
     
     private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        id_Direccion = "";
        DefaultTableModel tm = (DefaultTableModel) VistaDirecciones.getTablaDeRegistros().getModel();
        id_Direccion = String.valueOf(tm.getValueAt(VistaDirecciones.getTablaDeRegistros().getSelectedRow(), 0));
    }
     
    public void Eliminar() {
        int respuesta = 0;
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloDirrecciones MCliente = new ModeloDirrecciones(listadirecciones.get(seleccionado).getId(), "", "");

                if (MCliente.DeleteDirrecciones()== null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    seleccionado = -1;
                    CargarDirecciones();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Direccion!",
                            "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
                    seleccionado = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                seleccionado = 0;
            }
        }
    }
     
     public void MostrarDatos() {
         VistaDirecciones.getjFieldNombreRA().setText(String.valueOf(listadirecciones.get(seleccionado).getId()));
        VistaDirecciones.getjFieldNombreRA().setText(String.valueOf(listadirecciones.get(seleccionado).getCalle_P()));
        VistaDirecciones.getjTextFieldCalleSe().setText(listadirecciones.get(seleccionado).getCalle_S());
    }
}

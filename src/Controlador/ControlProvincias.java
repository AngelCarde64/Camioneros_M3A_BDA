/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloProvincia;
import Modelo.Provincia;
import Vista.VistaRegistroProvincia;
import java.awt.Color;
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
    private String id_Direccion = "", criterio = "", mssDEError = "";
    private int seleccionado = -1;
    private List<Provincia> listaprovincia;

    public ControlProvincias(VistaRegistroProvincia vistaProvincias, ModeloProvincia modeloProv) {
        this.vistaProvincias = vistaProvincias;
        this.modeloProv = modeloProv;
    }

    public void iniciarControl() {
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
        vistaProvincias.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        vistaProvincias.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        vistaProvincias.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable(evt);
            }
        });
        vistaProvincias.getJtextFieldBuscarPaquete().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vistaProvincias.getJtextFieldBuscarPaquete().getText().contains("Buscar")) {
                    vistaProvincias.getJtextFieldBuscarPaquete().setText("");
                    vistaProvincias.getJtextFieldBuscarPaquete().setForeground(Color.black);
                }
            }
        });
    }

    public void CargarDirecciones() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaProvincias.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaprovincia = modeloProv.ListarProvincia("");

        // Uso de una expresion landa
        listaprovincia.stream().forEach(cam -> {
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
    public void Eliminar() {
        int respuesta = 0;
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloProvincia MCamion = new ModeloProvincia(listaprovincia.get(seleccionado).getCod_provincia(), "");

                if (MCamion.DeleteProvincia()== null) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    seleccionado = -1;
                    CargarDirecciones();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar al Camionero!",
                            "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
                    seleccionado = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
                seleccionado = 0;
            }
        }
    }

    public void LlenarTablaBusqueda() {
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaProvincias.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaprovincia = modeloProv.ListarProvincia(criterio);
        // Uso de una expresion landa

        if (!listaprovincia.isEmpty()) {
            listaprovincia.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getCod_provincia()), String.valueOf(cam.getNombre())};
                mTabla.addRow(filaNueva);
            });
        } else {
            vistaProvincias.getjLabelSinCoincidencias().setVisible(true);
        }
    }

    public void Insertar() {
        ModeloProvincia MCamionero = new ModeloProvincia();
        MCamionero = RecuperarDatos(MCamionero,false);

        if (MCamionero.CrearProvincia() == null) {
            JOptionPane.showMessageDialog(null,
                    "Provincia creada satisfactoriamente.");
            CargarDirecciones();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la Provincia!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear la Provincia", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Modificar() {
        ModeloProvincia MCamion = new ModeloProvincia();
        MCamion = RecuperarDatos(MCamion, true);
        MCamion.setCod_provincia(listaprovincia.get(seleccionado).getCod_provincia());

        if (MCamion.ActualizarProvincia()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero modificado satisfactoriamente.");
            CargarDirecciones();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camion!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ModeloProvincia RecuperarDatos(ModeloProvincia MCami,boolean isUpdate) {
//        MCami.setNombre(vistaProvincias.getjFieldNombreRA().getText());
         mssDEError = "";
        if (isUpdate) {
            MCami.setCod_provincia(listaprovincia.get(seleccionado).getCod_provincia());
        } else {
            boolean ValiCRepetida = !MCami.ListarProvincia(vistaProvincias.getjFieldNombreRA().getText()).isEmpty();

            if (ValiCRepetida) {
                mssDEError += "\n - Este nombre  ya existe";
                return null;
            }
        }
        MCami.setNombre(vistaProvincias.getjFieldNombreRA().getText());
        return MCami;
    }

    public void MostrarDatos() {
        System.out.println("Lista: " + listaprovincia);
        vistaProvincias.getIdForATxt().setText(String.valueOf(listaprovincia.get(seleccionado).getCod_provincia()));
        vistaProvincias.getjFieldNombreRA().setText(listaprovincia.get(seleccionado).getNombre());

    }

    private void ObtenerIDTable(java.awt.event.MouseEvent evt) {
        seleccionado = vistaProvincias.getTablaDeRegistros().convertRowIndexToModel(vistaProvincias.getTablaDeRegistros().getSelectedRow());
        vistaProvincias.getTablaDeRegistros().removeAll();
        MostrarDatos();
    }

    public void LimpiarDatos() {
        vistaProvincias.getIdForATxt().setText("");
        vistaProvincias.getjFieldNombreRA().setText("");

    }
}

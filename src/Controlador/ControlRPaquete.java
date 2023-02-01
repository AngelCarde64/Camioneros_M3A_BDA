package Controlador;

import Modelo.Cliente;
import Modelo.ModeloCliente;
import Modelo.Dirrecciones;
import Modelo.ModeloDirrecciones;
import Modelo.ModeloPaquete;
import Modelo.Paquete;
import Vista.VistaRegistroPaquetes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRPaquete {

    private VistaRegistroPaquetes vRPaquetes;
    private ModeloPaquete modeloPaquete;
    private Validaciones vali = new Validaciones();
    private String id_paquete = "", criterio = "";
    private int seleccionado ;
    private List<Paquete> listaPaquetes;
    private List<Dirrecciones> listaDirecciones;
    private List<Cliente> listaClientes;

    public ControlRPaquete(VistaRegistroPaquetes vRPaquetes, ModeloPaquete modeloPaquete) {
        this.vRPaquetes = vRPaquetes;
        this.modeloPaquete = modeloPaquete;
    }

    public void iniciarControl() {
        // --> Desactivar elementos que van a estar ocultos al principio
        //Cargar datos en el combobox
        ModeloDirrecciones MDirreciones = new ModeloDirrecciones();
        listaDirecciones = MDirreciones.ListarDirrecciones("");
        vRPaquetes.getjCBoxIDDirecciones().removeAllItems();

        for (Dirrecciones listD : listaDirecciones) {
            vRPaquetes.getjCBoxIDDirecciones().addItem(String.valueOf(listD.getId()
                    + " - " + listD.getCalle_P() + " - " + listD.getCalle_S()));
        }
        
        //Cargar datos combobox
        ModeloCliente MCliente = new ModeloCliente();
        listaClientes = MCliente.ListarCliente("");
        vRPaquetes.getjCBoxIDDestinatario().removeAllItems();
        for (Cliente listC : listaClientes) {
            vRPaquetes.getjCBoxIDDestinatario().addItem(String.valueOf(listC.getId()
                    + " - " + listC.getNombre()));
        }
        
        
        vRPaquetes.getjLabelSinCoincidencias().setVisible(false);
        CargarPaquetes();
        
        
        
        vRPaquetes.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        
        vRPaquetes.getjFieldCodP().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vali.IngresarSoloNumeros(evt);
            }
        });
        vRPaquetes.getjFieldDescripcion().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vali.IngresarSoloLetras(evt);
            }
        });
        
        
        vRPaquetes.getjButtonInsertarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar();
            }
        });
        
        vRPaquetes.getjButtonModificarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        vRPaquetes.getjButtonEliminarA().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });
        
    }
    public void LlenarTablaBusqueda() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vRPaquetes.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaPaquetes = modeloPaquete.ListarPaquete(criterio);
        // Uso de una expresion landa

        if (!listaPaquetes.isEmpty()) {
            listaPaquetes.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getId()), cam.getCod_paquete(), String.valueOf(cam.getDireccion()),
                cam.getDescripcion(),String.valueOf(cam.getDestinatario())};
                mTabla.addRow(filaNueva);
            });
        } else {
            vRPaquetes.getjLabelSinCoincidencias().setVisible(true);
        }

    }
    
     public void CargarPaquetes() {
        // Para darle forma al modelo de la tabla

        DefaultTableModel pTabla = (DefaultTableModel) vRPaquetes.getTablaDeRegistros().getModel();
        pTabla.setNumRows(0);

        listaPaquetes = modeloPaquete.ListarPaquete("");

        // Uso de una expresion landa
//        listap.stream().forEach(cam -> {
//             String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
//                cam.getPoblacion(), cam.getTelefono(), String.valueOf(cam.getSueldo()),String.valueOf(cam.getId_Direccion()),cam.getCorreo()};
        listaPaquetes.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getCod_paquete(), String.valueOf(cam.getDireccion()),
                cam.getDescripcion(),String.valueOf(cam.getDestinatario())};

            pTabla.addRow(filaNueva);

        });

    }
    public void Insertar() {
        ModeloPaquete MPaquete = new ModeloPaquete();
        MPaquete = RecuperarDatos(MPaquete);

        if (MPaquete.CrearPaquete()== null) {
//            crearEmail();
//                    sendEmail();
            JOptionPane.showMessageDialog(null,
                    "Cliente creado satisfactoriamente.");

            CargarPaquetes();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Cliente!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void Modificar() {
        ModeloPaquete MPaquetes = new ModeloPaquete();
        MPaquetes = RecuperarDatos(MPaquetes);

        if (MPaquetes.ActualizarPaquete()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero modificado satisfactoriamente.");
            LimpiarDatos();
            CargarPaquetes();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                String cedula;
                cedula = vRPaquetes.getTablaDeRegistros().getValueAt(seleccionado, 0).toString();
                modeloPaquete.setId(Integer.parseInt(cedula));

                if (modeloPaquete.DeletePaquete()== null) {
                    JOptionPane.showMessageDialog(null, "La persona fue eliminada exitosamente");
                    MostrarDatos();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }
    }
    
    public ModeloPaquete RecuperarDatos(ModeloPaquete MCami) {
        String mssDEError = "";
        boolean ValiCRepetida = MCami.ListarPaquete(vRPaquetes.getjFieldCodP().getText()).isEmpty();

        if (ValiCRepetida) {
            MCami.setCod_paquete(vRPaquetes.getjFieldCodP().getText());
        } else {
            mssDEError += "\n - El codigo ingresado ya existe";
            return null;
        }
        
        MCami.setDireccion((listaDirecciones.get(vRPaquetes.getjCBoxIDDirecciones().getSelectedIndex()).getId()));

        if (!vRPaquetes.getjFieldDescripcion().getText().isEmpty()) {
            MCami.setDescripcion(vRPaquetes.getjFieldDescripcion().getText());
        } else {
            mssDEError += "\n - Ingrese un nombre.";
            return null;
        }
        MCami.setDestinatario((listaClientes.get(vRPaquetes.getjCBoxIDDestinatario().getSelectedIndex()).getId()));

        
        return MCami;
    }
    public void MostrarDatos() {
        vRPaquetes.getjLabelID().setText(String.valueOf(listaPaquetes.get(seleccionado).getId()));
        vRPaquetes.getjFieldCodP().setText(listaPaquetes.get(seleccionado).getCod_paquete());
        vRPaquetes.getjFieldDescripcion().setText(listaPaquetes.get(seleccionado).getDescripcion());
        vRPaquetes.getjCBoxIDDirecciones().setSelectedItem(listaPaquetes.get(seleccionado).getDireccion());
        vRPaquetes.getjCBoxIDDestinatario().setSelectedItem(listaPaquetes.get(seleccionado).getDestinatario());

    }
    
        public void LimpiarDatos() {
        vRPaquetes.getjFieldCodP().setText("");
        vRPaquetes.getjFieldDescripcion().setText("");
        vRPaquetes.getjCBoxIDDestinatario().setSelectedIndex(0);
        vRPaquetes.getjCBoxIDDirecciones().setSelectedIndex(0);
    }

    public void Buscar() {
        criterio = vRPaquetes.getjTextFieldBuscar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            vRPaquetes.getjLabelSinCoincidencias().setVisible(false);
            CargarPaquetes();
        }
    }

    private void ObtenerIDTable() {
        int fila = vRPaquetes.getTablaDeRegistros().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                String cedula;
                cedula = vRPaquetes.getTablaDeRegistros().getValueAt(fila, 0).toString();
                modeloPaquete.setId(Integer.parseInt(cedula));

                if (modeloPaquete.DeletePaquete()== null) {
                    JOptionPane.showMessageDialog(null, "La persona fue eliminada exitosamente");
                    MostrarDatos();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }

    }


}

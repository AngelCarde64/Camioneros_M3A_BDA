package Controlador;

import Modelo.ModeloCliente;
import Modelo.Cliente;
import Modelo.Dirrecciones;
import Modelo.Provincia;
import Modelo.ModeloProvincia;
import Modelo.ModeloPaquete;
import Modelo.Paquete;
import Vista.VistaRegistroPaquetes;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRPaquete {

    private VistaRegistroPaquetes vRPaquetes;
    private ModeloPaquete modeloPaquete;
    private Validaciones vali = new Validaciones();
    private String mssDEError = "", criterio = "";
    private int seleccionado=-1 ;
    private List<Paquete> listaPaquetes;
    private List<Provincia> listaDirecciones;
    private List<Cliente> listaClientes;

    public ControlRPaquete(VistaRegistroPaquetes vRPaquetes, ModeloPaquete modeloPaquete) {
        this.vRPaquetes = vRPaquetes;
        this.modeloPaquete = modeloPaquete;
    }

    public void iniciarControl() {
        CargarPaquetes();
        // --> Desactivar elementos que van a estar ocultos al principio
        //Cargar datos en el combobox
        ModeloProvincia MDirreciones = new ModeloProvincia();
        listaDirecciones = MDirreciones.ListarProvincia("");
        vRPaquetes.getjCBoxIDDirecciones().removeAllItems();
            
        for (Provincia listD : listaDirecciones) {
            vRPaquetes.getjCBoxIDDirecciones().addItem(String.valueOf(listD.getCod_provincia()+"-"+listD.getNombre()));
        }
        
        //Cargar datos combobox
        ModeloCliente MCliente = new ModeloCliente();
        listaClientes = MCliente.ListarCliente("");
        vRPaquetes.getjCBoxIDDestinatario().removeAllItems();
        for (Cliente listC : listaClientes) {
            vRPaquetes.getjCBoxIDDestinatario().addItem(String.valueOf(listC.getId()+"-"+listC.getDni()
                    + " - " + listC.getNombre()));
        }
 
        
        vRPaquetes.getjFieldCodP().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vali.IngresarSoloNumeros(evt);
            }
        });
        
        
        // --> Add listeners MOUSE LISTENER
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
        vRPaquetes.getTablaDeRegistros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObtenerIDTable();
            }
        });
        vRPaquetes.getjTextFieldBuscar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vRPaquetes.getjTextFieldBuscar().getText().contains("Buscar")) {
                    vRPaquetes.getjTextFieldBuscar().setText("");
                    vRPaquetes.getjTextFieldBuscar().setForeground(Color.black);
                }
            }
        });
        // --> Key Listener
        vRPaquetes.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    Buscar();
                }
            }
        });
         vRPaquetes.getjLabelSinCoincidencias().setVisible(false);
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
        MPaquete = RecuperarDatos(MPaquete,false);

        if (!mssDEError.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error al crear al paquete!\n"
                    + "Por favor corriga estos errores:" + mssDEError,
                    "Error al crear al paquete", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (MPaquete.CrearPaquete()== null) {
            JOptionPane.showMessageDialog(null,
                    "Paquete creado satisfactoriamente.");

             CargarPaquetes();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al turno paquete!\n"
                    + "¡¡Error al intentar crear al paquete!!",
                    "Error al crear al paquete", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void Modificar() {
        ModeloPaquete MPaquetes = new ModeloPaquete();
        MPaquetes = RecuperarDatos(MPaquetes,true);
        MPaquetes.setId(listaPaquetes.get(seleccionado).getId());
            
        if (MPaquetes.ActualizarPaquete()== null) {
            JOptionPane.showMessageDialog(null,
                    "Camionero modificado satisfactoriamente.");
            CargarPaquetes();
            LimpiarDatos();
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Camionero!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Camionero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar() {
       if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al paquete!\n"
                    + "Por favor Selecciona un paquete",
                    "Error al eliminar al paquete", JOptionPane.ERROR_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                String cedula;
                cedula = vRPaquetes.getTablaDeRegistros().getValueAt(seleccionado, 0).toString();
                modeloPaquete.setId(Integer.parseInt(cedula));

                if (modeloPaquete.DeletePaquete()== null) {
                    JOptionPane.showMessageDialog(null, "La persona fue eliminada exitosamente");
                    CargarPaquetes();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }
    }
    
    public ModeloPaquete RecuperarDatos(ModeloPaquete MCami,boolean isUpdate) {
        String mssDEError = "";
        if (isUpdate) {
            MCami.setId(listaPaquetes.get(seleccionado).getId());
        } 
        else{
        boolean ValiCRepetida = !MCami.ListarPaquete(vRPaquetes.getjFieldCodP().getText()).isEmpty();

        if (ValiCRepetida) {
           
       
            mssDEError += "\n - El codigo ingresado ya existe";
            return null;
        }
        }
         MCami.setCod_paquete(vRPaquetes.getjFieldCodP().getText());
       
        if (!vRPaquetes.getjFieldDescripcion().getText().isEmpty()) {
            MCami.setDescripcion(vRPaquetes.getjFieldDescripcion().getText());
        } else {
            mssDEError += "\n - Ingrese un nombre.";
            return null;
        }
        MCami.setDestinatario((listaClientes.get(vRPaquetes.getjCBoxIDDestinatario().getSelectedIndex()).getId()));
         MCami.setDireccion((listaDirecciones.get(vRPaquetes.getjCBoxIDDirecciones().getSelectedIndex()).getCod_provincia()));

        
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
        vRPaquetes.getjFieldCodP().setText(null);
        vRPaquetes.getjFieldDescripcion().setText(null);
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
         seleccionado = vRPaquetes.getTablaDeRegistros().convertRowIndexToModel(vRPaquetes.getTablaDeRegistros().getSelectedRow());
        vRPaquetes.getTablaDeRegistros().removeAll();
        MostrarDatos();

    }


}

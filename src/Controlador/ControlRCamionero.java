package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Importacion para email
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
public class ControlRCamionero {

    private VistaRCamionero vistaCam;
    private ModeloCamionero modeloCamionero;

    private Validaciones validaciones = new Validaciones();
    private String criterio = "";
    private int id_Camionero;
    // --> Sera usado para mostrar en uin combo box todas los ID de dirreciones disponibles
    //--> Atributos para email
    private static String emailFrom = "adrysdiaz1991@gmail.com";
    private static String passwordFrom = "jsplaeoxoykcrgym";
    private String emailTo;
    private String subject;
    private String content;

    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    private List<Dirrecciones> listaDirecciones;
    private List<Camionero> listaCamioneros;

    public ControlRCamionero(VistaRCamionero vistaCam, ModeloCamionero modeloCamionero) {
        this.vistaCam = vistaCam;
        this.modeloCamionero = modeloCamionero;
    }

    public void iniciarControl() {
        CargarCamioneros();
        // --> Obtener ID de Direcciones
        ModeloDirrecciones MDirreciones = new ModeloDirrecciones();
        listaDirecciones = MDirreciones.ListarDirrecciones("");
        vistaCam.getjCBoxIDDirecciones().removeAllItems();

        for (Dirrecciones listD : listaDirecciones) {
            vistaCam.getjCBoxIDDirecciones().addItem(String.valueOf(listD.getId()
                    + " - " + listD.getCalle_P() + " - " + listD.getCalle_S()));
        }

        // --> Add listeners MOUSE LISTENER
        
        
        
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
        vistaCam.getjTextFieldBuscar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vistaCam.getjTextFieldBuscar().getText().contains("Buscar")) {
                    vistaCam.getjTextFieldBuscar().setText("");
                    vistaCam.getjTextFieldBuscar().setForeground(Color.black);
                }
            }
        });

        
        
        // --> Key Listener
        
        
        vistaCam.getjTextFieldBuscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    Buscar();
                }
            }
        });

        vistaCam.getjFieldDNI().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });

        vistaCam.getjFieldtelefono().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
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

        listaCamioneros = modeloCamionero.ListarCamioneros(criterio);
        // Uso de una expresion landa
<<<<<<< HEAD
        listap.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getPoblacion(), cam.getTelefono(), String.valueOf(cam.getSueldo()),String.valueOf(cam.getId_Direccion()),cam.getCorreo()};
            mTabla.addRow(filaNueva);
        });
=======
        if (!listaCamioneros.isEmpty()) {
            listaCamioneros.stream().forEach(cam -> {
                String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                    cam.getTelefono(), cam.getPoblacion(), String.valueOf(cam.getSueldo()), String.valueOf(cam.getId_Direccion())};
                mTabla.addRow(filaNueva);
            });
        } else {
            vistaCam.getjLabelSinCoincidencias().setVisible(true);
        }
>>>>>>> 19986e3e5f62ff177a1b72eb5c384f3d832c0017
    }

    public void CargarCamioneros() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        listaCamioneros = modeloCamionero.ListarCamioneros("");
        // Uso de una expresion landa
<<<<<<< HEAD
        listap.stream().forEach(cam -> {
             String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getPoblacion(), cam.getTelefono(), String.valueOf(cam.getSueldo()),String.valueOf(cam.getId_Direccion()),cam.getCorreo()};
=======
        listaCamioneros.stream().forEach(cam -> {
            String[] filaNueva = {String.valueOf(cam.getId()), cam.getDni(), cam.getNombre(),
                cam.getTelefono(), cam.getPoblacion(), String.valueOf(cam.getSueldo()), String.valueOf(cam.getId_Direccion())};
>>>>>>> 19986e3e5f62ff177a1b72eb5c384f3d832c0017
            mTabla.addRow(filaNueva);
        });
    }

    public void Insertar() {
        ModeloCamionero MCamionero = new ModeloCamionero();
        MCamionero = RecuperarDatos(MCamionero);

        if (MCamionero.CrearCamionero() == null) {
            crearEmail();
                    sendEmail();
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
                ModeloCamionero MCamionero = new ModeloCamionero(id_Camionero, "", "", "", "", 0, 0, "");

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
<<<<<<< HEAD
        MCami.setSueldo((Double.parseDouble(vistaCam.getjFieldsueldo().getText().toString())));
//        MCami.setId_Direccion(vistaCam.getjCBoxIDDirecciones().getSelectedIndex());
        MCami.setId_Direccion(2);
        MCami.setCorreo(vistaCam.getJfieldcorreo().getText().trim());
=======
        MCami.setSueldo(Double.parseDouble(vistaCam.getjFieldsueldo().getText()));
        System.out.println(Double.parseDouble(vistaCam.getjFieldsueldo().getText()));
        MCami.setId_Direccion((listaDirecciones.get(vistaCam.getjCBoxIDDirecciones().getSelectedIndex()).getId()));
>>>>>>> 19986e3e5f62ff177a1b72eb5c384f3d832c0017
        return MCami;
    }

    public void MostrarDatos() {
        vistaCam.getjLabelID().setText(String.valueOf(listaCamioneros.get(id_Camionero).getId()));
        vistaCam.getjFieldDNI().setText(listaCamioneros.get(id_Camionero).getDni());
        vistaCam.getjFieldNombre().setText(listaCamioneros.get(id_Camionero).getNombre());
        vistaCam.getjFieldtelefono().setText(listaCamioneros.get(id_Camionero).getTelefono());
        vistaCam.getjSpinnerPoblacion().setValue(Double.parseDouble(listaCamioneros.get(id_Camionero).getPoblacion()));
        vistaCam.getjCBoxIDDirecciones().setSelectedItem(listaCamioneros.get(id_Camionero).getId_Direccion());
        vistaCam.getjFieldsueldo().setText(String.valueOf(listaCamioneros.get(id_Camionero).getSueldo()));
    }

    public void LimpiarDatos() {
        vistaCam.getjFieldDNI().setText("");
        vistaCam.getjFieldNombre().setText("");
        vistaCam.getjFieldtelefono().setText("");
        vistaCam.getjSpinnerPoblacion().setValue(0);
        vistaCam.getjFieldsueldo().setText("");
        vistaCam.getjCBoxIDDirecciones().setSelectedIndex(0);
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
        id_Camionero = vistaCam.getTablaDeRegistros().convertRowIndexToModel(vistaCam.getTablaDeRegistros().getSelectedRow());
        vistaCam.getTablaDeRegistros().removeAll();
        MostrarDatos();
    }
    private void crearEmail() {
        emailTo = vistaCam.getJfieldcorreo().getText().trim();
        mProperties = new Properties();
        subject = "Pagequeteria";
        content = "Felicidades usted esta contratado";
        
         // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
                     
            
        } catch (AddressException ex) {
            Logger.getLogger(ControlRCamionero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ControlRCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(ControlRCamionero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ControlRCamionero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package Controlador;

import Modelo.Camionero;
import Modelo.ModeloCamionero;
import Vista.VistaRegistroCamionero;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

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

    // --> Se llenaran todos los datos en la tabla
    public void LlenarTablaBusqueda() {

    }

    public void CargarCamioneros() {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vistaCam.getTablaDeRegistros().getModel();
        mTabla.setNumRows(0);

        List<Camionero> listap = modelo.listarPersonas("");
        Holder<Integer> i = new Holder<>(0);

        // Uso de una expresion landa
        listap.stream().forEach(pe -> {
            String[] filaNueva = {pe.getIdPersona(), pe.getNombre(), pe.getApellido(),
                pe.getFechanacimiento().toString(), pe.getTelefono(), pe.getSexo(), String.valueOf(pe.getSueldo()),
                String.valueOf(pe.getCupo())};
            mTabla.addRow(filaNueva);
//            //Llenar imagen
            Image foto = pe.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                render.setIcon(icono);
                vistaCam.getTblPersonas().setValueAt(new JLabel(icono), i.value, 8);
            } else {
                vistaCam.getTblPersonas().setValueAt(null, i.value, 8);
            }

            i.value++;
        });
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

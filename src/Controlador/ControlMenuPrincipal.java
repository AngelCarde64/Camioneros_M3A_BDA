package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class ControlMenuPrincipal {

    // --> Para almacenar que color tendran los botones del menu cuando son seleccionados
    private Color[] coloresbtnMenu = {
        // --> Cuando ha sido presionado.
        new Color(204, 184, 148),
        // --> Cuando no ha sido seleccionado.
        new Color(245, 222, 179)
    };

    private VistaMenuPrincipal vistaMP;

    public ControlMenuPrincipal(VistaMenuPrincipal vista) {
        this.vistaMP = vista;
        vistaMP.setVisible(true);
        vistaMP.setLocationRelativeTo(null);
    }

    public void IniciarControl() {
        this.vistaMP.setLocationRelativeTo(null);
        vistaMP.getjPanelIncio().setVisible(true);

        evtMouseBtn(vistaMP.getjPanelCamioneros(), "CAMIONEROS");
        evtMouseBtn(vistaMP.getjPanelPaquetes(), "PAQUETES");
        evtMouseBtn(vistaMP.getjPanelCamiones(), "CAMIONES");
        evtMouseBtn(vistaMP.getjPanelTurnosConducc(), "TURNOS DE CONDUCCIÓN");
//        vistaMP.getjPanelCamioneros().addActionListener(l -> buscar());
    }

    private void evtMouseBtn(JPanel panel, String name) {
        panel.addMouseListener(new java.awt.event.MouseAdapter() {

            // --> Ejecutar todo el codigo cuando el usuario de click en unos de los botones del menu.
            @Override
            public void mousePressed(MouseEvent e) {
                setLabelBackround(vistaMP.getjPanelCamioneros());

                switch (name) {
                    case "CAMIONEROS":
                        vistaMP.getjPanelCamioneros().setBackground(coloresbtnMenu[0]);

                        VistaRCamionero VRCamionero = new VistaRCamionero();
                        ModeloCamionero modeloCamionero = new ModeloCamionero();

                        ControlRCamionero CRCamionero = new ControlRCamionero(VRCamionero, modeloCamionero);
                        CRCamionero.iniciarControl();

                        SetNewPanelContent(VRCamionero);
                        break;
                    case "PAQUETES":
                        vistaMP.getjPanelPaquetes().setBackground(coloresbtnMenu[0]);
                        break;
                    case "CAMIONES":
                        vistaMP.getjPanelCamiones().setBackground(coloresbtnMenu[0]);
                        break;
                    case "TURNOS DE CONDUCCIÓN":
                        vistaMP.getjPanelTurnosConducc().setBackground(coloresbtnMenu[0]);
                        break;
                }
            }

            // ---> El cursor del ratón se encuentra sobre el botón.
            @Override
            public void mouseEntered(MouseEvent e) {
                switch (name) {
                    case "CAMIONEROS":
                        vistaMP.getjPanelCamioneros().setBackground(coloresbtnMenu[0]);
                        break;
                    case "PAQUETES":
                        vistaMP.getjPanelPaquetes().setBackground(coloresbtnMenu[0]);
                        break;
                    case "CAMIONES":
                        vistaMP.getjPanelCamiones().setBackground(coloresbtnMenu[0]);
                        break;
                    case "TURNOS DE CONDUCCIÓN":
                        vistaMP.getjPanelTurnosConducc().setBackground(coloresbtnMenu[0]);
                        break;
                }
            }

            // ---> El cursor del ratón se encuentra fuera del área activa del botón.
            @Override
            public void mouseExited(MouseEvent e) {
                switch (name) {
                    case "CAMIONEROS":
                        vistaMP.getjPanelCamioneros().setBackground(coloresbtnMenu[1]);
                        break;
                    case "PAQUETES":
                        vistaMP.getjPanelPaquetes().setBackground(coloresbtnMenu[1]);
                        break;
                    case "CAMIONES":
                        vistaMP.getjPanelCamiones().setBackground(coloresbtnMenu[1]);
                        break;
                    case "TURNOS DE CONDUCCIÓN":
                        vistaMP.getjPanelTurnosConducc().setBackground(coloresbtnMenu[1]);
                        break;
                }
            }
        });
    }

    private void SetNewPanelContent(JPanel newPanel) {
        // --> Necesario para que se adapte al ancho de toda la pantalla.
        vistaMP.getjPanelContent().setLayout(new GridBagLayout());
        vistaMP.getjPanelContent().removeAll();
        GridBagConstraints gbc = new GridBagConstraints();
        // --> Para colocar debajo o alado de un elemento que ya esta en interfaz
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        vistaMP.getjPanelContent().add(newPanel, gbc);

        // --> Necesarios para evitar errores y que se muestre todo de manera correcta
        vistaMP.revalidate();
        vistaMP.getjPanelContent().repaint();
        // --> el método pack() busca el tamaño adecuado para la ventana, 
        // -> considerando el tamaño y posición de los componentes contenidos en ella, 
        // -> y modifica el tamaño de la ventana para adaptarse a ellos.
        vistaMP.pack();
    }

    /**
     * ----> Para restaurar los botones seleccionados a su color original o
     * predeterminado.
     */
    private void setLabelBackround(JPanel panel) {
        vistaMP.getjPanelIncio().setVisible(false);
        vistaMP.getjPanelCamioneros().setBackground(coloresbtnMenu[1]);
        vistaMP.getjPanelCamiones().setBackground(coloresbtnMenu[1]);
        vistaMP.getjPanelPaquetes().setBackground(coloresbtnMenu[1]);
        vistaMP.getjPanelTurnosConducc().setBackground(coloresbtnMenu[1]);
    }
}

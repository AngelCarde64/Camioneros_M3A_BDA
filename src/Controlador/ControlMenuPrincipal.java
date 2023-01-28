package Controlador;

import Vista.VistaMenuPrincipal;

public class ControlMenuPrincipal {

    private VistaMenuPrincipal vista;

    public ControlMenuPrincipal(VistaMenuPrincipal interfaz) {
        this.vista = interfaz;
        interfaz.setVisible(true);
    }

    public void IniciarControlPrincipal() {
//        vista.get
    }

    public void Controlador() {
        vista.getPaneCamioners().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarbarra();
            }
        });
        vista.getjButtonIniciarSesion1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarINGRESO();
            }
        });;
    }

    public void mostrarbarra() {
        vista.paneIngCamres.setVisible(false);
        vista.jPanelCrud.setVisible(true);
        vista.jLabeltituloCamioneros.setText("MENU DE CAMIONERROS");
        vista.paneMostrar.setVisible(false);
        vista.pnbuscarCamionero.setVisible(false);
        vista.getPaneInicio().setVisible(true);
    }

    public void mostrarINGRESO() {
        vista.paneIngCamres.setVisible(true);
        vista.jPanelCrud.setVisible(true);
        vista.jLabeltituloCamioneros.setText("INGRESO DE CAMIONEROS");
        vista.paneMostrar.setVisible(false);
        vista.pnbuscarCamionero.setVisible(false);
        vista.getPaneInicio().setVisible(false);
    }
}

package Controlador;

import Vista.VistaMenuPrincipal;

public class ControlMenuPrincipal {

    private VistaMenuPrincipal interfaz;

    public ControlMenuPrincipal(VistaMenuPrincipal interfaz) {
        this.interfaz = interfaz;
        interfaz.setVisible(true);
    }

    public void Controlador() {
        interfaz.getPaneCamioners().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarbarra();
            }
        });
        interfaz.getjButtonIniciarSesion1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarINGRESO();
            }
        });;
    }

    public void mostrarbarra() {
        interfaz.paneIngCamres.setVisible(false);
        interfaz.paneChoicecamioneros.setVisible(true);
        interfaz.tituloCamioneros.setText("MENU DE CAMIONERROS");
        interfaz.paneMostrar.setVisible(false);
        interfaz.pnbuscarCamionero.setVisible(false);
        interfaz.getPaneInicio().setVisible(true);
    }

    public void mostrarINGRESO() {
        interfaz.paneIngCamres.setVisible(true);
        interfaz.paneChoicecamioneros.setVisible(true);
        interfaz.tituloCamioneros.setText("INGRESO DE CAMIONEROS");
        interfaz.paneMostrar.setVisible(false);
        interfaz.pnbuscarCamionero.setVisible(false);
        interfaz.getPaneInicio().setVisible(false);
    }
}

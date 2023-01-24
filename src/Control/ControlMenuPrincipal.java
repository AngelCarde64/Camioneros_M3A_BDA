package Control;

import Modelo.Camionero;
import Modelo.ModeloCamionero;
import Vista.Vista_Final;
import static javax.swing.GroupLayout.Alignment.CENTER;

public class ControlMenuPrincipal {
    private Camionero conductor;
    private Vista_Final interfaz;

    public ControlMenuPrincipal(Camionero conductor, Vista_Final interfaz) {
        this.conductor = conductor;
        this.interfaz = interfaz;
    }
    
    public void Controlador(){
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
    public void mostrarbarra(){
        interfaz.paneIngCamres.setVisible(false);
        interfaz.paneChoicecamioneros.setVisible(true);
        interfaz.tituloCamioneros.setText("MENU DE CAMIONERROS");
        interfaz.paneMostrar.setVisible(false);
        interfaz.pnbuscarCamionero.setVisible(false);
        interfaz.getPaneInicio().setVisible(true);
    }
    
    public void mostrarINGRESO(){
        interfaz.paneIngCamres.setVisible(true);
        interfaz.paneChoicecamioneros.setVisible(true);
        interfaz.tituloCamioneros.setText("INGRESO DE CAMIONEROS");
        interfaz.paneMostrar.setVisible(false);
        interfaz.pnbuscarCamionero.setVisible(false);
        interfaz.getPaneInicio().setVisible(false);
    }
}




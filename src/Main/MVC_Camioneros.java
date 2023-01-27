package Main;

import Control.ControlMenuPrincipal;
import Modelo.Camionero;
import Vista.*;

public class MVC_Camioneros {

    public static void main(String[] args) {
        Vista_Final vista = new Vista_Final();
        vista.setVisible(true);
        Camionero empleado = new Camionero();
        ControlMenuPrincipal acciones = new ControlMenuPrincipal(empleado,vista);
        acciones.Controlador();
    }
}

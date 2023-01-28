package Main;

import Controlador.*;
import Vista.*;

public class MVC_Camioneros {

    public static void main(String[] args) {
        VistaMenuPrincipal vista = new VistaMenuPrincipal();
        ControlMenuPrincipal acciones = new ControlMenuPrincipal(vista);
        acciones.Controlador();
    }
}

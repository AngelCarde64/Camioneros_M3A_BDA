package Main;

import Controlador.*;
import Vista.*;

public class MVC_Camioneros {

    public static void main(String[] args) {
        Vista_Final vista = new Vista_Final();
        ControlMenuPrincipal acciones = new ControlMenuPrincipal(vista);
        acciones.Controlador();
    }
}

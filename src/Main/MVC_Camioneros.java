package Main;

import Controlador.*;
import Vista.*;
import javax.mail.MessagingException;

public class MVC_Camioneros {

    public static void main(String[] args) throws MessagingException {
        VistaMenuPrincipal vista = new VistaMenuPrincipal();
        ControlMenuPrincipal controller = new ControlMenuPrincipal(vista);
        controller.IniciarControl();
//        Pruebas p= new Pruebas();
//        p.setVisible(true);
             
    }
}

package Main;

import Controlador.*;
import Modelo.ModeloCamionero;
import Vista.*;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MVC_Camioneros {

    public static void main(String[] args) throws MessagingException {
        VistaMenuPrincipal vista = new VistaMenuPrincipal();
        ControlMenuPrincipal controller = new ControlMenuPrincipal(vista);
        controller.IniciarControl();
//        Pruebas p= new Pruebas();
//        p.setVisible(true);
             
    }
}

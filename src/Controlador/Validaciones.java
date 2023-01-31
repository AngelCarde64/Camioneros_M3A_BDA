package Controlador;

// --> ¡¡ POR ACTUALIZAR !!
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Validaciones {

    // ---> Se lo usara para limitar a 10 los numeros que se pueden ingresar en un jTextField
    private int contador = 0;

    public int valiCedula(String cedula) {
        //si la cedula es una cadena numerica
        if (cedula.matches("[0-9]{10}")) {
            int numero = 0, suma = 0, resultado = 0;
            for (int i = 0; i < cedula.length(); i++) {
                numero = Integer.parseInt(String.valueOf(cedula.charAt(i)));
                if (i % 2 == 0) {
                    numero = numero * 2;

                    if (numero > 9) {
                        numero = numero - 9;
                    }
                }
                suma = suma + numero;
            }
            if (suma % 10 != 0) {
                resultado = 10 - (suma % 10);
                if (resultado == numero) {
                    //si la cedula es correcta
                    return 0;
                } else {
                    //si la cedula no es valida
                    return 1;
                }
            } else {
                return 0;
            }
            //la cedula contiene letras o no cumple con el formato
        } else {
            return 1;
        }
    }

    public boolean validarNombre(String nomAp) {
        return nomAp.matches("[a-zA-z]{3,15}");
    }

    public void IngresarSoloNumeros(java.awt.event.KeyEvent evt) {
        // --> Validacion extra por si el usuario borra de golpe todos los numeros y por si pega.
        JTextField txt = (JTextField) evt.getComponent();
        if (txt.getText().equals("")) {
            contador = 0;
        } else if (txt.getText().length() >= 10) {
            contador = 10;
        }

        char validarnum = evt.getKeyChar();
        if (validarnum >= '0' && validarnum <= '9') {
            if (contador < 10) {
                contador++;
            } else {
                evt.consume();
            }
            //--> Hacer un decremento al contador cuando borre numeros
        } else if (validarnum == KeyEvent.VK_BACK_SPACE || validarnum == KeyEvent.VK_DELETE) {
            if (contador > 0) {
                contador--;
            }
        } else {
            evt.consume();
        }
    }

    public void IngresarSoloLetras(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }

    public boolean valiString(String cadena) {
        return cadena.matches("[a-zA-z]{3,15}[\\s]{0,1}[a-zA-z]{0,15}");
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

}

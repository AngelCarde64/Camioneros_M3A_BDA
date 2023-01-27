package Modelo;

import Conexion.ConectPG;
import Vista.Vista_Final;
import java.awt.event.ActionListener;

public class ModeloCamionero extends Camionero {
    ConectPG conexion;
    private Camionero conductor;
    private Vista_Final interfaz;
    
    public ModeloCamionero() {
    }
    
}

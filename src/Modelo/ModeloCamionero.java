package Modelo;


public class ModeloCamionero extends Camionero {

    public ModeloCamionero() {
    }
    
    public ModeloCamionero(int id, String dni, String nombre, String telefono, String direccion, String id_Direccion, double sueldo, String poblacion) {
        super(id, dni, nombre, telefono, direccion, id_Direccion, sueldo, poblacion);
    }
}

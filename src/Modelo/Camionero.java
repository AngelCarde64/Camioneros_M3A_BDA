package Modelo;

public class Camionero {

    private int id;
    private String dni;
    private String nombre;
    private String telefono;
    private String poblacion;
    private int id_Direccion;
    private double sueldo;
    private String correo;

    public Camionero() {
    }

    public Camionero(int id, String dni, String nombre, String telefono, String poblacion, int id_Direccion, double sueldo, String correo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.id_Direccion = id_Direccion;
        this.sueldo = sueldo;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getId_Direccion() {
        return id_Direccion;
    }

    public void setId_Direccion(int id_Direccion) {
        this.id_Direccion = id_Direccion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

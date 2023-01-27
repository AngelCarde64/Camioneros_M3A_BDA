package Modelo;

public class Provincia {

    private String cod_paquete;
    private String nombre;

    public Provincia() {
    }

    public Provincia(String cod_paquete, String nombre) {
        this.cod_paquete = cod_paquete;
        this.nombre = nombre;
    }

    public String getCod_paquete() {
        return cod_paquete;
    }

    public void setCod_paquete(String cod_paquete) {
        this.cod_paquete = cod_paquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

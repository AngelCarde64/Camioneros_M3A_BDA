package Modelo;

public class Provincia {

    private int cod_provincia;
    private String nombre;

    public Provincia() {
    }

    public Provincia(int cod_paquete, String nombre) {
        this.cod_provincia = cod_paquete;
        this.nombre = nombre;
    }

    public int getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(int cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

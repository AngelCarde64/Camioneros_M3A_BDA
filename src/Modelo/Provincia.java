package Modelo;

public class Provincia {

    private String cod_provincia;
    private String nombre;

    public Provincia() {
    }

    public Provincia(String cod_paquete, String nombre) {
        this.cod_provincia = cod_paquete;
        this.nombre = nombre;
    }

    public String getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

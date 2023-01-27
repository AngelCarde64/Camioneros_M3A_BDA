package Modelo;

public class Paquete {

    private int id;
    private String cod_paquete;
    private String descripcion;
    private String destinatario;
    private String direccion;

    public Paquete() {
    }

    public Paquete(int id, String cod_paquete, String descripcion, String destinatario, String direccion) {
        this.id = id;
        this.cod_paquete = cod_paquete;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccion = direccion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_paquete() {
        return cod_paquete;
    }

    public void setCod_paquete(String cod_paquete) {
        this.cod_paquete = cod_paquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
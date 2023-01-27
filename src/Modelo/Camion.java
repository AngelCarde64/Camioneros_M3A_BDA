package Modelo;

public class Camion {

    private int id;
    private String nro_Placa;
    private String modelo;
    private String tipo;
    private String potencia;

    public Camion() {
    }

    public Camion(int id, String nro_Placa, String modelo, String tipo, String potencia) {
        this.id = id;
        this.nro_Placa = nro_Placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNro_Placa() {
        return nro_Placa;
    }

    public void setNro_Placa(String matricula) {
        this.nro_Placa = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}

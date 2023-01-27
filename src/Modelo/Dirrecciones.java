package Modelo;

public class Dirrecciones {

    private int id;
    private String calle_P;
    private String calle_S;

    public Dirrecciones() {
    }

    public Dirrecciones(int id, String calle_P, String calle_S) {
        this.id = id;
        this.calle_P = calle_P;
        this.calle_S = calle_S;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle_P() {
        return calle_P;
    }

    public void setCalle_P(String calle_P) {
        this.calle_P = calle_P;
    }

    public String getCalle_S() {
        return calle_S;
    }

    public void setCalle_S(String calle_S) {
        this.calle_S = calle_S;
    }
}

package Modelo;

public class TurnoDeConduccion {

    private String id;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFin;
    private int cami_id;
    private int cam_id;

    public TurnoDeConduccion() {
    }

    public TurnoDeConduccion(String id, java.sql.Date fechaInicio, java.sql.Date fechaFin, int tur_cami_id, int tur_cam_id) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cami_id = tur_cami_id;
        this.cam_id = tur_cam_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public java.sql.Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public java.sql.Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCami_id() {
        return cami_id;
    }

    public void setCami_id(int cami_id) {
        this.cami_id = cami_id;
    }

    public int getCam_id() {
        return cam_id;
    }

    public void setCam_id(int cam_id) {
        this.cam_id = cam_id;
    }
}

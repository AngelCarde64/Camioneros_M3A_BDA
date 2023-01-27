package Modelo;

import java.util.Date;

public class TurnoDeConduccion {

    private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private int cami_id;
    private int cam_id;

    public TurnoDeConduccion() {
    }

    public TurnoDeConduccion(String id, Date fechaInicio, Date fechaFin, int tur_cami_id, int tur_cam_id) {
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
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

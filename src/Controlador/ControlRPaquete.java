package Controlador;

import Modelo.ModeloPaquete;
import Vista.VistaRegistroPaquetes;

public class ControlRPaquete {

    private VistaRegistroPaquetes vRPaquetes;
    private ModeloPaquete modeloPaquete;

    private Validaciones vali = new Validaciones();
    private String id_paquete = "", criterio = "";

    public ControlRPaquete(VistaRegistroPaquetes vRPaquetes, ModeloPaquete modeloPaquete) {
        this.vRPaquetes = vRPaquetes;
        this.modeloPaquete = modeloPaquete;
    }

    public void iniciarControl() {
        // --> Desactivar elementos que van a estar ocultos al principio
        vRPaquetes.getjLabelSinCoincidencias().setVisible(false);
    }

}

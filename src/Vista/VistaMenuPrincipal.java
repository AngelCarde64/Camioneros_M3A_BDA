package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaMenuPrincipal extends javax.swing.JFrame {

    public VistaMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        jPanelMenuLateral = new javax.swing.JPanel();
        Barra_img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelCamioneros = new javax.swing.JPanel();
        jLabelIconC = new javax.swing.JLabel();
        jLabelCamioneros = new javax.swing.JLabel();
        jPanelPaquetes = new javax.swing.JPanel();
        jLabelIconP = new javax.swing.JLabel();
        jLabelPaquetes = new javax.swing.JLabel();
        jPanelCamiones = new javax.swing.JPanel();
        jLabelIconCa = new javax.swing.JLabel();
        jLabelCamiones = new javax.swing.JLabel();
        jPanelTurnosConducc = new javax.swing.JPanel();
        jLabelIconTC = new javax.swing.JLabel();
        jLabel1TConduccion = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jPanelIncio = new javax.swing.JPanel();
        jLabelBienvenido2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenuLateral.setBackground(new java.awt.Color(210, 105, 30));

        Barra_img.setForeground(new java.awt.Color(255, 255, 255));
        Barra_img.setText("_______________________________");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Camion.png"))); // NOI18N

        jPanelCamioneros.setBackground(new java.awt.Color(245, 222, 179));
        jPanelCamioneros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIconC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N

        jLabelCamioneros.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCamioneros.setText("CAMIONEROS");

        javax.swing.GroupLayout jPanelCamionerosLayout = new javax.swing.GroupLayout(jPanelCamioneros);
        jPanelCamioneros.setLayout(jPanelCamionerosLayout);
        jPanelCamionerosLayout.setHorizontalGroup(
            jPanelCamionerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamionerosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelIconC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCamionerosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelCamioneros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCamionerosLayout.setVerticalGroup(
            jPanelCamionerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamionerosLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabelIconC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCamionerosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCamioneros))
        );

        jPanelPaquetes.setBackground(new java.awt.Color(245, 222, 179));
        jPanelPaquetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIconP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paquete.png"))); // NOI18N

        jLabelPaquetes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPaquetes.setText("PAQUETES");

        javax.swing.GroupLayout jPanelPaquetesLayout = new javax.swing.GroupLayout(jPanelPaquetes);
        jPanelPaquetes.setLayout(jPanelPaquetesLayout);
        jPanelPaquetesLayout.setHorizontalGroup(
            jPanelPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaquetesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelIconP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPaquetesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPaquetesLayout.setVerticalGroup(
            jPanelPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaquetesLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabelIconP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPaquetesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelPaquetes))
        );

        jPanelCamiones.setBackground(new java.awt.Color(245, 222, 179));
        jPanelCamiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIconCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion.png"))); // NOI18N

        jLabelCamiones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCamiones.setText("CAMIONES");

        javax.swing.GroupLayout jPanelCamionesLayout = new javax.swing.GroupLayout(jPanelCamiones);
        jPanelCamiones.setLayout(jPanelCamionesLayout);
        jPanelCamionesLayout.setHorizontalGroup(
            jPanelCamionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelIconCa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCamionesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelCamiones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCamionesLayout.setVerticalGroup(
            jPanelCamionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamionesLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabelIconCa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCamionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCamiones))
        );

        jPanelTurnosConducc.setBackground(new java.awt.Color(245, 222, 179));
        jPanelTurnosConducc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIconTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TURNO.png"))); // NOI18N

        jLabel1TConduccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1TConduccion.setText("TURNOS DE CONDUCCIÓN");

        javax.swing.GroupLayout jPanelTurnosConduccLayout = new javax.swing.GroupLayout(jPanelTurnosConducc);
        jPanelTurnosConducc.setLayout(jPanelTurnosConduccLayout);
        jPanelTurnosConduccLayout.setHorizontalGroup(
            jPanelTurnosConduccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnosConduccLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelIconTC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTurnosConduccLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1TConduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTurnosConduccLayout.setVerticalGroup(
            jPanelTurnosConduccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnosConduccLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabelIconTC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTurnosConduccLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1TConduccion))
        );

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCamioneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCamiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTurnosConducc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Barra_img, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(Barra_img)
                .addGap(14, 14, 14)
                .addComponent(jPanelCamioneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanelPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanelCamiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanelTurnosConducc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));

        jPanelIncio.setBackground(new java.awt.Color(204, 204, 204));

        jLabelBienvenido2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabelBienvenido2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBienvenido2.setText("BIENVENIDO A TU SISTEMA DE ENVIO DE PAQUETERÍA PREFERIDO");

        javax.swing.GroupLayout jPanelIncioLayout = new javax.swing.GroupLayout(jPanelIncio);
        jPanelIncio.setLayout(jPanelIncioLayout);
        jPanelIncioLayout.setHorizontalGroup(
            jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelIncioLayout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabelBienvenido2)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );
        jPanelIncioLayout.setVerticalGroup(
            jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelIncioLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabelBienvenido2)
                    .addContainerGap(658, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1169, 1169, 1169))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getjPanelCamioneros() {
        return jPanelCamioneros;
    }

    public void setjPanelCamioneros(JPanel jPanelCamioneros) {
        this.jPanelCamioneros = jPanelCamioneros;
    }

    public JPanel getjPanelCamiones() {
        return jPanelCamiones;
    }

    public void setjPanelCamiones(JPanel jPanelCamiones) {
        this.jPanelCamiones = jPanelCamiones;
    }

    public JPanel getjPanelPaquetes() {
        return jPanelPaquetes;
    }

    public void setjPanelPaquetes(JPanel jPanelPaquetes) {
        this.jPanelPaquetes = jPanelPaquetes;
    }

    public JPanel getjPanelTurnosConducc() {
        return jPanelTurnosConducc;
    }

    public void setjPanelTurnosConducc(JPanel jPanelTurnosConducc) {
        this.jPanelTurnosConducc = jPanelTurnosConducc;
    }
    
    public JPanel getjPanelIncio() {
        return jPanelIncio;
    }

    public void setjPanelIncio(JPanel jPanelIncio) {
        this.jPanelIncio = jPanelIncio;
    }

    public JPanel getjPanelContent() {
        return jPanelContent;
    }

    public void setjPanelContent(JPanel jPanelContent) {
        this.jPanelContent = jPanelContent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barra_img;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel jLabel1TConduccion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenido2;
    private javax.swing.JLabel jLabelCamioneros;
    private javax.swing.JLabel jLabelCamiones;
    private javax.swing.JLabel jLabelIconC;
    private javax.swing.JLabel jLabelIconCa;
    private javax.swing.JLabel jLabelIconP;
    private javax.swing.JLabel jLabelIconTC;
    private javax.swing.JLabel jLabelPaquetes;
    private javax.swing.JPanel jPanelCamioneros;
    private javax.swing.JPanel jPanelCamiones;
    public javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelIncio;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelPaquetes;
    private javax.swing.JPanel jPanelTurnosConducc;
    // End of variables declaration//GEN-END:variables
}

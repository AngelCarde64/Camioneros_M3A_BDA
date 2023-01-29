/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
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
        jPanelTop = new javax.swing.JPanel();
        jLabeltituloCamioneros = new javax.swing.JLabel();
        jPanelIncio = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenuLateral.setBackground(new java.awt.Color(210, 105, 30));

        Barra_img.setForeground(new java.awt.Color(255, 255, 255));
        Barra_img.setText("_______________________________");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Camion.png"))); // NOI18N

        jPanelCamioneros.setBackground(new java.awt.Color(245, 222, 179));
        jPanelCamioneros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCamioneros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        jPanelCamioneros.add(jLabelIconC, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabelCamioneros.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCamioneros.setText("CAMIONEROS");
        jPanelCamioneros.add(jLabelCamioneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 20));

        jPanelPaquetes.setBackground(new java.awt.Color(245, 222, 179));
        jPanelPaquetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPaquetes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paquete.png"))); // NOI18N
        jPanelPaquetes.add(jLabelIconP, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabelPaquetes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPaquetes.setText("PAQUETES");
        jPanelPaquetes.add(jLabelPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jPanelCamiones.setBackground(new java.awt.Color(245, 222, 179));
        jPanelCamiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCamiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion.png"))); // NOI18N
        jPanelCamiones.add(jLabelIconCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabelCamiones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCamiones.setText("CAMIONES");
        jPanelCamiones.add(jLabelCamiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jPanelTurnosConducc.setBackground(new java.awt.Color(245, 222, 179));
        jPanelTurnosConducc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelTurnosConducc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TURNO.png"))); // NOI18N
        jPanelTurnosConducc.add(jLabelIconTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabel1TConduccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1TConduccion.setText("TURNOS DE CONDUCCIÓN");
        jPanelTurnosConducc.add(jLabel1TConduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, 20));

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCamioneros, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCamiones, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelTurnosConducc, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Barra_img, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTop.setBackground(new java.awt.Color(248, 171, 75));

        jLabeltituloCamioneros.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltituloCamioneros.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabeltituloCamioneros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltituloCamioneros.setText("INGRESO DE CAMIONEROS");
        jLabeltituloCamioneros.setFocusable(false);
        jLabeltituloCamioneros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1169, Short.MAX_VALUE)
            .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabeltituloCamioneros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabeltituloCamioneros, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        jPanelIncio.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBienvenido.setText("BIENVENIDO A TU SISTEMA DE ENVIO DE PAQUETERÍA PREFERIDO");

        javax.swing.GroupLayout jPanelIncioLayout = new javax.swing.GroupLayout(jPanelIncio);
        jPanelIncio.setLayout(jPanelIncioLayout);
        jPanelIncioLayout.setHorizontalGroup(
            jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncioLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabelBienvenido))
        );
        jPanelIncioLayout.setVerticalGroup(
            jPanelIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelBienvenido)
                .addContainerGap(546, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelIncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(631, 631, 631))
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContentLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jPanelIncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public JLabel getjLabeltituloCamioneros() {
        return jLabeltituloCamioneros;
    }

    public void setjLabeltituloCamioneros(JLabel jLabeltituloCamioneros) {
        this.jLabeltituloCamioneros = jLabeltituloCamioneros;
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
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelCamioneros;
    private javax.swing.JLabel jLabelCamiones;
    private javax.swing.JLabel jLabelIconC;
    private javax.swing.JLabel jLabelIconCa;
    private javax.swing.JLabel jLabelIconP;
    private javax.swing.JLabel jLabelIconTC;
    private javax.swing.JLabel jLabelPaquetes;
    private javax.swing.JLabel jLabeltituloCamioneros;
    private javax.swing.JPanel jPanelCamioneros;
    private javax.swing.JPanel jPanelCamiones;
    public javax.swing.JPanel jPanelContent;
    public javax.swing.JPanel jPanelIncio;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelPaquetes;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPanel jPanelTurnosConducc;
    // End of variables declaration//GEN-END:variables
}

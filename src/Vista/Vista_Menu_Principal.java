/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author User
 */
public class Vista_Menu_Principal extends javax.swing.JFrame {

    public Vista_Menu_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paneCamioners = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panePaquetes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PaneCamiones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PaneTurnosConducc = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        paneIngCamres = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        brnongresarCAMIONEROS = new javax.swing.JButton();
        btnbucarCAMIONEROS = new javax.swing.JButton();
        btnmostrarCAMIONEROS = new javax.swing.JButton();
        btneliminarCAMIONERO = new javax.swing.JButton();
        btnmodificarCAMIONERO = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 105, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneCamioners.setBackground(new java.awt.Color(245, 222, 179));
        paneCamioners.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/empleado.png"))); // NOI18N
        paneCamioners.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("CAMIONEROS");
        paneCamioners.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 20));

        jPanel1.add(paneCamioners, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_______________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/LOGOR (2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 160));

        panePaquetes.setBackground(new java.awt.Color(245, 222, 179));
        panePaquetes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/paquete.png"))); // NOI18N
        panePaquetes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("PAQUETES");
        panePaquetes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jPanel1.add(panePaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, -1));

        PaneCamiones.setBackground(new java.awt.Color(245, 222, 179));
        PaneCamiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/camion.png"))); // NOI18N
        PaneCamiones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setText("CAMIONES");
        PaneCamiones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jPanel1.add(PaneCamiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, -1));

        PaneTurnosConducc.setBackground(new java.awt.Color(245, 222, 179));
        PaneTurnosConducc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/TURNO.png"))); // NOI18N
        PaneTurnosConducc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, 50, 60));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("TURNOS DE CONDUCCIÓN");
        PaneTurnosConducc.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, 20));

        jPanel1.add(PaneTurnosConducc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 620));

        paneIngCamres.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setText("                                                                                                 INGRESO DE CAMIONEROS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1150, 35));

        jPanel3.setBackground(new java.awt.Color(139, 69, 19));

        brnongresarCAMIONEROS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        brnongresarCAMIONEROS.setText("INGRESAR");
        brnongresarCAMIONEROS.setBorderPainted(false);
        brnongresarCAMIONEROS.setFocusPainted(false);

        btnbucarCAMIONEROS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnbucarCAMIONEROS.setText("BUSCAR");
        btnbucarCAMIONEROS.setBorderPainted(false);

        btnmostrarCAMIONEROS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnmostrarCAMIONEROS.setText("MOSTRAR");
        btnmostrarCAMIONEROS.setBorderPainted(false);

        btneliminarCAMIONERO.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btneliminarCAMIONERO.setText("ELIMINAR");
        btneliminarCAMIONERO.setBorderPainted(false);

        btnmodificarCAMIONERO.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnmodificarCAMIONERO.setText("MODIFICAR");
        btnmodificarCAMIONERO.setBorderPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(brnongresarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnmostrarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnbucarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnmodificarCAMIONERO)
                .addGap(87, 87, 87)
                .addComponent(btneliminarCAMIONERO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnongresarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbucarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrarCAMIONEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminarCAMIONERO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificarCAMIONERO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 1150, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 160, 50));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("TELÉFONO:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 80, 50));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 160, 50));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("POBLACIÓN:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 90, 50));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("NOMBRE:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 80, 50));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 160, 50));

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 160, 50));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel15.setText("DNI:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 70, 50));

        javax.swing.GroupLayout paneIngCamresLayout = new javax.swing.GroupLayout(paneIngCamres);
        paneIngCamres.setLayout(paneIngCamresLayout);
        paneIngCamresLayout.setHorizontalGroup(
            paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1420, Short.MAX_VALUE)
            .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneIngCamresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1410, Short.MAX_VALUE)))
        );
        paneIngCamresLayout.setVerticalGroup(
            paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(paneIngCamres, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1420, 620));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PaneCamiones;
    public javax.swing.JPanel PaneTurnosConducc;
    public javax.swing.JButton brnongresarCAMIONEROS;
    public javax.swing.JButton btnbucarCAMIONEROS;
    public javax.swing.JButton btneliminarCAMIONERO;
    public javax.swing.JButton btnmodificarCAMIONERO;
    public javax.swing.JButton btnmostrarCAMIONEROS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JPanel paneCamioners;
    public javax.swing.JPanel paneIngCamres;
    public javax.swing.JPanel panePaquetes;
    // End of variables declaration//GEN-END:variables
}

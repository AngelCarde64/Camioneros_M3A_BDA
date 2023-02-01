/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class VistaRegistroProvincia extends javax.swing.JPanel {

    /**
     * Creates new form VistaRegistroProvincia
     */
    public VistaRegistroProvincia() {
        initComponents();
    }

    public JPanel getCambiarDatosPanel() {
        return CambiarDatosPanel;
    }

    public void setCambiarDatosPanel(JPanel CambiarDatosPanel) {
        this.CambiarDatosPanel = CambiarDatosPanel;
    }

    public JPanel getContentRAparte1() {
        return ContentRAparte1;
    }

    public void setContentRAparte1(JPanel ContentRAparte1) {
        this.ContentRAparte1 = ContentRAparte1;
    }

    public JButton getjButtonEliminarA() {
        return jButtonEliminarA;
    }

    public void setjButtonEliminarA(JButton jButtonEliminarA) {
        this.jButtonEliminarA = jButtonEliminarA;
    }

    public JButton getjButtonInsertarA() {
        return jButtonInsertarA;
    }

    public void setjButtonInsertarA(JButton jButtonInsertarA) {
        this.jButtonInsertarA = jButtonInsertarA;
    }

    public JButton getjButtonModificarA() {
        return jButtonModificarA;
    }

    public void setjButtonModificarA(JButton jButtonModificarA) {
        this.jButtonModificarA = jButtonModificarA;
    }

    public JButton getjButtonMostrar() {
        return jButtonMostrar;
    }

    public void setjButtonMostrar(JButton jButtonMostrar) {
        this.jButtonMostrar = jButtonMostrar;
    }

    public JTextField getjFieldNombreRA() {
        return jFieldNombreRA;
    }

    public void setjFieldNombreRA(JTextField jFieldNombreRA) {
        this.jFieldNombreRA = jFieldNombreRA;
    }

    public JLabel getjLabelSinCoincidencias() {
        return jLabelSinCoincidencias;
    }

    public void setjLabelSinCoincidencias(JLabel jLabelSinCoincidencias) {
        this.jLabelSinCoincidencias = jLabelSinCoincidencias;
    }

    public JTable getTablaDeRegistros() {
        return TablaDeRegistros;
    }

    public void setTablaDeRegistros(JTable TablaDeRegistros) {
        this.TablaDeRegistros = TablaDeRegistros;
    }

    public JTextField getJtextFieldBuscarPaquete() {
        return JtextFieldBuscarPaquete;
    }

    public void setJtextFieldBuscarPaquete(JTextField JtextFieldBuscarPaquete) {
        this.JtextFieldBuscarPaquete = JtextFieldBuscarPaquete;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContentRegistro = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        jLabelSinCoincidencias = new javax.swing.JLabel();
        jLabelIconTipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDeRegistros = new javax.swing.JTable();
        jButtonMostrar = new javax.swing.JButton();
        JtextFieldBuscarPaquete = new javax.swing.JTextField();
        ContentButtonsIME = new javax.swing.JPanel();
        jButtonInsertarA = new javax.swing.JButton();
        jButtonModificarA = new javax.swing.JButton();
        jButtonEliminarA = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        CambiarDatosPanel = new javax.swing.JPanel();
        Datostxt = new javax.swing.JLabel();
        MensajeingresoTxt = new javax.swing.JLabel();
        idForATxt = new javax.swing.JLabel();
        IDtxt = new javax.swing.JLabel();
        jScrollPCDAnimal = new javax.swing.JScrollPane();
        CambiarDatosAnimales = new javax.swing.JPanel();
        ContentRAparte1 = new javax.swing.JPanel();
        Nombretxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jFieldNombreRA = new javax.swing.JTextField();

        jPanelTop1.setBackground(new java.awt.Color(248, 171, 75));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVINCIAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelTop1Layout = new javax.swing.GroupLayout(jPanelTop1);
        jPanelTop1.setLayout(jPanelTop1Layout);
        jPanelTop1Layout.setHorizontalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTop1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanelTop1Layout.setVerticalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        ContentRegistro.setBackground(new java.awt.Color(236, 236, 236));

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSinCoincidencias.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSinCoincidencias.setText("No hay coincidencias");

        TablaDeRegistros.setBackground(new java.awt.Color(133, 171, 208));
        TablaDeRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        TablaDeRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_PROVINCIA", "NOMBRE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeRegistros.setRowHeight(30);
        jScrollPane2.setViewportView(TablaDeRegistros);

        jButtonMostrar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonMostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrar.setText("Buscar");
        jButtonMostrar.setBorder(null);

        JtextFieldBuscarPaquete.setForeground(new java.awt.Color(102, 102, 102));
        JtextFieldBuscarPaquete.setText("BUSCAR UNA PROVINCIA");

        ContentButtonsIME.setOpaque(false);

        jButtonInsertarA.setBackground(new java.awt.Color(137, 107, 197));
        jButtonInsertarA.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonInsertarA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsertarA.setText("Insertar");
        jButtonInsertarA.setBorder(null);

        jButtonModificarA.setBackground(new java.awt.Color(137, 107, 197));
        jButtonModificarA.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA.setText("Modificar");
        jButtonModificarA.setBorder(null);

        jButtonEliminarA.setBackground(new java.awt.Color(137, 107, 197));
        jButtonEliminarA.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonEliminarA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarA.setText("Eliminar");
        jButtonEliminarA.setBorder(null);

        javax.swing.GroupLayout ContentButtonsIMELayout = new javax.swing.GroupLayout(ContentButtonsIME);
        ContentButtonsIME.setLayout(ContentButtonsIMELayout);
        ContentButtonsIMELayout.setHorizontalGroup(
            ContentButtonsIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentButtonsIMELayout.createSequentialGroup()
                .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContentButtonsIMELayout.setVerticalGroup(
            ContentButtonsIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonActualizar.setBackground(new java.awt.Color(137, 107, 197));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setBorder(null);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabelIconTipo))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JtextFieldBuscarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ContentButtonsIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelIconTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtextFieldBuscarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(ContentButtonsIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        CambiarDatosPanel.setBackground(new java.awt.Color(255, 255, 255));

        Datostxt.setBackground(new java.awt.Color(0, 102, 255));
        Datostxt.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        Datostxt.setForeground(new java.awt.Color(102, 102, 102));
        Datostxt.setText("Datos");

        MensajeingresoTxt.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        MensajeingresoTxt.setForeground(new java.awt.Color(102, 102, 102));
        MensajeingresoTxt.setText("<html>A continuación puede ver y editar la información.<html>");
        MensajeingresoTxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MensajeingresoTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        idForATxt.setBackground(new java.awt.Color(153, 153, 153));
        idForATxt.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        idForATxt.setForeground(new java.awt.Color(102, 102, 102));
        idForATxt.setText("[Id]");

        IDtxt.setBackground(new java.awt.Color(0, 102, 255));
        IDtxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IDtxt.setForeground(new java.awt.Color(102, 102, 102));
        IDtxt.setText("ID:");

        javax.swing.GroupLayout CambiarDatosPanelLayout = new javax.swing.GroupLayout(CambiarDatosPanel);
        CambiarDatosPanel.setLayout(CambiarDatosPanelLayout);
        CambiarDatosPanelLayout.setHorizontalGroup(
            CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Datostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(MensajeingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(idForATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CambiarDatosPanelLayout.setVerticalGroup(
            CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Datostxt)
                .addGap(4, 4, 4)
                .addComponent(MensajeingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDtxt)
                    .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(idForATxt))))
        );

        jScrollPCDAnimal.setBackground(new java.awt.Color(255, 255, 255));

        CambiarDatosAnimales.setBackground(new java.awt.Color(255, 255, 255));

        ContentRAparte1.setOpaque(false);

        Nombretxt.setBackground(new java.awt.Color(0, 102, 255));
        Nombretxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombretxt.setForeground(new java.awt.Color(102, 102, 102));
        Nombretxt.setText("Nombre:");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jFieldNombreRA.setForeground(new java.awt.Color(102, 102, 102));
        jFieldNombreRA.setBorder(null);

        javax.swing.GroupLayout ContentRAparte1Layout = new javax.swing.GroupLayout(ContentRAparte1);
        ContentRAparte1.setLayout(ContentRAparte1Layout);
        ContentRAparte1Layout.setHorizontalGroup(
            ContentRAparte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRAparte1Layout.createSequentialGroup()
                .addGroup(ContentRAparte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFieldNombreRA, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ContentRAparte1Layout.setVerticalGroup(
            ContentRAparte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRAparte1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Nombretxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFieldNombreRA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );

        javax.swing.GroupLayout CambiarDatosAnimalesLayout = new javax.swing.GroupLayout(CambiarDatosAnimales);
        CambiarDatosAnimales.setLayout(CambiarDatosAnimalesLayout);
        CambiarDatosAnimalesLayout.setHorizontalGroup(
            CambiarDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarDatosAnimalesLayout.createSequentialGroup()
                .addComponent(ContentRAparte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        CambiarDatosAnimalesLayout.setVerticalGroup(
            CambiarDatosAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarDatosAnimalesLayout.createSequentialGroup()
                .addComponent(ContentRAparte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );

        jScrollPCDAnimal.setViewportView(CambiarDatosAnimales);

        javax.swing.GroupLayout ContentRegistroLayout = new javax.swing.GroupLayout(ContentRegistro);
        ContentRegistro.setLayout(ContentRegistroLayout);
        ContentRegistroLayout.setHorizontalGroup(
            ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPCDAnimal)
                    .addGroup(ContentRegistroLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        ContentRegistroLayout.setVerticalGroup(
            ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentRegistroLayout.createSequentialGroup()
                        .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(464, 464, 464))
                    .addGroup(ContentRegistroLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPCDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTop1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(ContentRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 590, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarDatosAnimales;
    private javax.swing.JPanel CambiarDatosPanel;
    private javax.swing.JPanel ContentButtonsIME;
    private javax.swing.JPanel ContentRAparte1;
    private javax.swing.JPanel ContentRegistro;
    private javax.swing.JLabel Datostxt;
    private javax.swing.JLabel IDtxt;
    private javax.swing.JTextField JtextFieldBuscarPaquete;
    private javax.swing.JLabel MensajeingresoTxt;
    private javax.swing.JLabel Nombretxt;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JLabel idForATxt;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminarA;
    private javax.swing.JButton jButtonInsertarA;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JTextField jFieldNombreRA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIconTipo;
    private javax.swing.JLabel jLabelSinCoincidencias;
    private javax.swing.JPanel jPanelTop1;
    private javax.swing.JScrollPane jScrollPCDAnimal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VistaRCamionero extends javax.swing.JPanel {

    public VistaRCamionero() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop1 = new javax.swing.JPanel();
        jLabeltituloCamioneros1 = new javax.swing.JLabel();
        ContentRegistro = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonInsertarA = new javax.swing.JButton();
        jButtonModificarA = new javax.swing.JButton();
        jButtonEliminarA = new javax.swing.JButton();
        jLabelSinCoincidencias = new javax.swing.JLabel();
        jScrollPaneCam = new javax.swing.JScrollPane();
        TablaDeRegistros = new javax.swing.JTable();
        CambiarDatosPanel = new javax.swing.JPanel();
        Datostxt = new javax.swing.JLabel();
        MensajeingresoTxt = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jScrollCami = new javax.swing.JScrollPane();
        JPanelDatosCamionero = new javax.swing.JPanel();
        IDtxt = new javax.swing.JLabel();
        jFieldDNI = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Nombretxt = new javax.swing.JLabel();
        jFieldNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        telefonoTxt = new javax.swing.JLabel();
        jFieldtelefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        telefonoTxt1 = new javax.swing.JLabel();
        jCBoxIDDirecciones = new javax.swing.JComboBox<>();
        SueldoTxt = new javax.swing.JLabel();
        jFieldsueldo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSpinnerPoblacion = new javax.swing.JSpinner();
        PorcionTXT = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelTop1.setBackground(new java.awt.Color(248, 171, 75));

        jLabeltituloCamioneros1.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltituloCamioneros1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabeltituloCamioneros1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltituloCamioneros1.setText("INGRESO DE CAMIONEROS");
        jLabeltituloCamioneros1.setFocusable(false);
        jLabeltituloCamioneros1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelTop1Layout = new javax.swing.GroupLayout(jPanelTop1);
        jPanelTop1.setLayout(jPanelTop1Layout);
        jPanelTop1Layout.setHorizontalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabeltituloCamioneros1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE))
        );
        jPanelTop1Layout.setVerticalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTop1Layout.createSequentialGroup()
                    .addComponent(jLabeltituloCamioneros1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanelTop1, java.awt.BorderLayout.PAGE_START);

        ContentRegistro.setBackground(new java.awt.Color(236, 236, 236));

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));

        jButtonBuscar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);

        jTextFieldBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBuscar.setText("Buscar en Animales");

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

        jLabelSinCoincidencias.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSinCoincidencias.setText("No hay coincidencias");

        TablaDeRegistros.setBackground(new java.awt.Color(133, 171, 208));
        TablaDeRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        TablaDeRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Genero", "Especie", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeRegistros.setRowHeight(30);
        jScrollPaneCam.setViewportView(TablaDeRegistros);

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCam)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPaneCam, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        CambiarDatosPanel.setBackground(new java.awt.Color(255, 255, 255));
        CambiarDatosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Datostxt.setBackground(new java.awt.Color(0, 102, 255));
        Datostxt.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        Datostxt.setForeground(new java.awt.Color(102, 102, 102));
        Datostxt.setText("Datos");
        CambiarDatosPanel.add(Datostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        MensajeingresoTxt.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        MensajeingresoTxt.setForeground(new java.awt.Color(102, 102, 102));
        MensajeingresoTxt.setText("<html>A continuación puede ver y editar la información.<html>");
        MensajeingresoTxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MensajeingresoTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CambiarDatosPanel.add(MensajeingresoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, 250, 44));

        IDTxt.setBackground(new java.awt.Color(0, 102, 255));
        IDTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(102, 102, 102));
        IDTxt.setText("ID:");
        CambiarDatosPanel.add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 57, -1));

        jLabelID.setBackground(new java.awt.Color(153, 153, 153));
        jLabelID.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(102, 102, 102));
        jLabelID.setText("[Id]");
        CambiarDatosPanel.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 91, 69, -1));

        jScrollCami.setBackground(new java.awt.Color(255, 255, 255));

        JPanelDatosCamionero.setBackground(new java.awt.Color(255, 255, 255));

        IDtxt.setBackground(new java.awt.Color(0, 102, 255));
        IDtxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IDtxt.setForeground(new java.awt.Color(102, 102, 102));
        IDtxt.setText("DNI:");

        jFieldDNI.setForeground(new java.awt.Color(102, 102, 102));
        jFieldDNI.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Nombretxt.setBackground(new java.awt.Color(0, 102, 255));
        Nombretxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombretxt.setForeground(new java.awt.Color(102, 102, 102));
        Nombretxt.setText("Nombre:");

        jFieldNombre.setForeground(new java.awt.Color(102, 102, 102));
        jFieldNombre.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        telefonoTxt.setBackground(new java.awt.Color(0, 102, 255));
        telefonoTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(102, 102, 102));
        telefonoTxt.setText("Telefono:");

        jFieldtelefono.setForeground(new java.awt.Color(102, 102, 102));
        jFieldtelefono.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        telefonoTxt1.setBackground(new java.awt.Color(0, 102, 255));
        telefonoTxt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefonoTxt1.setForeground(new java.awt.Color(102, 102, 102));
        telefonoTxt1.setText("ID Direccion");

        jCBoxIDDirecciones.setBorder(null);

        SueldoTxt.setBackground(new java.awt.Color(0, 102, 255));
        SueldoTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SueldoTxt.setForeground(new java.awt.Color(102, 102, 102));
        SueldoTxt.setText("Sueldo");

        jFieldsueldo.setForeground(new java.awt.Color(102, 102, 102));
        jFieldsueldo.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSpinnerPoblacion.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerPoblacion.setBorder(null);

        PorcionTXT.setBackground(new java.awt.Color(0, 102, 255));
        PorcionTXT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PorcionTXT.setForeground(new java.awt.Color(102, 102, 102));
        PorcionTXT.setText("Población:");

        javax.swing.GroupLayout JPanelDatosCamioneroLayout = new javax.swing.GroupLayout(JPanelDatosCamionero);
        JPanelDatosCamionero.setLayout(JPanelDatosCamioneroLayout);
        JPanelDatosCamioneroLayout.setHorizontalGroup(
            JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(PorcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSpinnerPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBoxIDDirecciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jFieldtelefono)
                    .addComponent(jFieldNombre)
                    .addComponent(jSeparator2)
                    .addComponent(jFieldsueldo)
                    .addComponent(jSeparator4)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addComponent(jFieldDNI))))
                .addGap(21, 21, 21))
        );
        JPanelDatosCamioneroLayout.setVerticalGroup(
            JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(IDtxt))
                    .addComponent(jFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombretxt)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoTxt)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telefonoTxt1)
                .addGap(9, 9, 9)
                .addComponent(jCBoxIDDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SueldoTxt))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PorcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinnerPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollCami.setViewportView(JPanelDatosCamionero);

        javax.swing.GroupLayout ContentRegistroLayout = new javax.swing.GroupLayout(ContentRegistro);
        ContentRegistro.setLayout(ContentRegistroLayout);
        ContentRegistroLayout.setHorizontalGroup(
            ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollCami)
                    .addGroup(ContentRegistroLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addGap(8, 8, 8))))
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
                    .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentRegistroLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollCami, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))))
        );

        add(ContentRegistro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
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

    public JComboBox<String> getjCBoxIDDirecciones() {
        return jCBoxIDDirecciones;
    }

    public void setjCBoxIDDirecciones(JComboBox<String> jCBoxIDDirecciones) {
        this.jCBoxIDDirecciones = jCBoxIDDirecciones;
    }

    public JTextField getjFieldDNI() {
        return jFieldDNI;
    }

    public void setjFieldDNI(JTextField jFieldDNI) {
        this.jFieldDNI = jFieldDNI;
    }

    public JTextField getjFieldNombre() {
        return jFieldNombre;
    }

    public void setjFieldNombre(JTextField jFieldNombre) {
        this.jFieldNombre = jFieldNombre;
    }

    public JTextField getjFieldsueldo() {
        return jFieldsueldo;
    }

    public void setjFieldsueldo(JTextField jFieldsueldo) {
        this.jFieldsueldo = jFieldsueldo;
    }

    public JTextField getjFieldtelefono() {
        return jFieldtelefono;
    }

    public void setjFieldtelefono(JTextField jFieldtelefono) {
        this.jFieldtelefono = jFieldtelefono;
    }

    public JTextField getjTextFieldBuscar() {
        return jTextFieldBuscar;
    }

    public void setjTextFieldBuscar(JTextField jTextFieldBuscar) {
        this.jTextFieldBuscar = jTextFieldBuscar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarDatosPanel;
    private javax.swing.JPanel ContentRegistro;
    private javax.swing.JLabel Datostxt;
    private javax.swing.JLabel IDTxt;
    private javax.swing.JLabel IDtxt;
    private javax.swing.JPanel JPanelDatosCamionero;
    private javax.swing.JLabel MensajeingresoTxt;
    private javax.swing.JLabel Nombretxt;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JLabel PorcionTXT;
    private javax.swing.JLabel SueldoTxt;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarA;
    private javax.swing.JButton jButtonInsertarA;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JComboBox<String> jCBoxIDDirecciones;
    private javax.swing.JTextField jFieldDNI;
    private javax.swing.JTextField jFieldNombre;
    private javax.swing.JTextField jFieldsueldo;
    private javax.swing.JTextField jFieldtelefono;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelSinCoincidencias;
    public javax.swing.JLabel jLabeltituloCamioneros;
    private javax.swing.JLabel jLabeltituloCamioneros1;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPanel jPanelTop1;
    private javax.swing.JScrollPane jScrollCami;
    private javax.swing.JScrollPane jScrollPaneCam;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinnerPoblacion;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JLabel telefonoTxt;
    private javax.swing.JLabel telefonoTxt1;
    // End of variables declaration//GEN-END:variables
}

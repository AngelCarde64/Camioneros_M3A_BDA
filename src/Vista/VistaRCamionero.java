package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaRCamionero extends javax.swing.JPanel {

    public VistaRCamionero() {
        initComponents();
    }

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
        jButtonActualizar = new javax.swing.JButton();
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
        SueldoTxt1 = new javax.swing.JLabel();
        SueldoTxt2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jfieldcorreo = new javax.swing.JTextField();

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
            .addGap(0, 1271, Short.MAX_VALUE)
            .addGroup(jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabeltituloCamioneros1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE))
        );
        jPanelTop1Layout.setVerticalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTop1Layout.createSequentialGroup()
                    .addComponent(jLabeltituloCamioneros1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ContentRegistro.setBackground(new java.awt.Color(236, 236, 236));

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));

        jButtonBuscar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);

        jTextFieldBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBuscar.setText("  Buscar camioneros ...");
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(164, 164, 164))); // NOI18N

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Nombre", "Poblacion", "Teléfono", "Salario", "ID Dirreción", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeRegistros.setRowHeight(30);
        jScrollPaneCam.setViewportView(TablaDeRegistros);

        jButtonActualizar.setBackground(new java.awt.Color(137, 107, 197));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setBorder(null);

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscar)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCam))
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
                        .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPaneCam, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
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

        IDTxt.setBackground(new java.awt.Color(0, 102, 255));
        IDTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(102, 102, 102));
        IDTxt.setText("ID:");

        jLabelID.setBackground(new java.awt.Color(153, 153, 153));
        jLabelID.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(102, 102, 102));
        jLabelID.setText("[Id]");

        javax.swing.GroupLayout CambiarDatosPanelLayout = new javax.swing.GroupLayout(CambiarDatosPanel);
        CambiarDatosPanel.setLayout(CambiarDatosPanelLayout);
        CambiarDatosPanelLayout.setHorizontalGroup(
            CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                .addGroup(CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Datostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(MensajeingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(CambiarDatosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
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
                    .addComponent(IDTxt)
                    .addGroup(CambiarDatosPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelID)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollCami.setBackground(new java.awt.Color(255, 255, 255));
        jScrollCami.setBorder(null);

        JPanelDatosCamionero.setBackground(new java.awt.Color(255, 255, 255));
        JPanelDatosCamionero.setPreferredSize(new java.awt.Dimension(340, 500));

        IDtxt.setBackground(new java.awt.Color(0, 102, 255));
        IDtxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IDtxt.setForeground(new java.awt.Color(102, 102, 102));
        IDtxt.setText("DNI:");

        jFieldDNI.setForeground(new java.awt.Color(102, 102, 102));
        jFieldDNI.setBorder(null);
        jFieldDNI.setMinimumSize(new java.awt.Dimension(30, 16));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
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

        jFieldsueldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jFieldsueldo.setForeground(new java.awt.Color(255, 198, 51));
        jFieldsueldo.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSpinnerPoblacion.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerPoblacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PorcionTXT.setBackground(new java.awt.Color(0, 102, 255));
        PorcionTXT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PorcionTXT.setForeground(new java.awt.Color(102, 102, 102));
        PorcionTXT.setText("Población:");

        SueldoTxt1.setBackground(new java.awt.Color(0, 102, 255));
        SueldoTxt1.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        SueldoTxt1.setForeground(new java.awt.Color(102, 102, 102));
        SueldoTxt1.setText("$");

        SueldoTxt2.setBackground(new java.awt.Color(0, 102, 255));
        SueldoTxt2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SueldoTxt2.setForeground(new java.awt.Color(102, 102, 102));
        SueldoTxt2.setText("Correo:");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jfieldcorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jfieldcorreo.setBorder(null);

        javax.swing.GroupLayout JPanelDatosCamioneroLayout = new javax.swing.GroupLayout(JPanelDatosCamionero);
        JPanelDatosCamionero.setLayout(JPanelDatosCamioneroLayout);
        JPanelDatosCamioneroLayout.setHorizontalGroup(
            JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(telefonoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jCBoxIDDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(SueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(SueldoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFieldsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(SueldoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(PorcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jSpinnerPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
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
                .addComponent(SueldoTxt)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(SueldoTxt1))
                    .addComponent(jFieldsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(SueldoTxt2)
                .addGap(9, 9, 9)
                .addComponent(jfieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
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
                .addContainerGap()
                .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollCami, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ContentRegistroLayout.setVerticalGroup(
            ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollCami, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
            .addGroup(ContentRegistroLayout.createSequentialGroup()
                .addComponent(CambiarDatosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonActualizar() {
        return jButtonActualizar;
    }

    public void setjButtonActualizar(JButton jButtonActualizar) {
        this.jButtonActualizar = jButtonActualizar;
    }

    public JLabel getjLabelID() {
        return jLabelID;
    }

    public void setjLabelID(JLabel jLabelID) {
        this.jLabelID = jLabelID;
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

    public JSpinner getjSpinnerPoblacion() {
        return jSpinnerPoblacion;
    }

    public void setjSpinnerPoblacion(JSpinner jSpinnerPoblacion) {
        this.jSpinnerPoblacion = jSpinnerPoblacion;
    }

    public JTextField getJfieldcorreo() {
        return jfieldcorreo;
    }

    public void setJfieldcorreo(JTextField jfieldcorreo) {
        this.jfieldcorreo = jfieldcorreo;
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
    private javax.swing.JLabel SueldoTxt1;
    private javax.swing.JLabel SueldoTxt2;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JButton jButtonActualizar;
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
    public javax.swing.JLabel jLabeltituloCamioneros1;
    private javax.swing.JPanel jPanelTop1;
    private javax.swing.JScrollPane jScrollCami;
    private javax.swing.JScrollPane jScrollPaneCam;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinnerPoblacion;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jfieldcorreo;
    private javax.swing.JLabel telefonoTxt;
    private javax.swing.JLabel telefonoTxt1;
    // End of variables declaration//GEN-END:variables
}

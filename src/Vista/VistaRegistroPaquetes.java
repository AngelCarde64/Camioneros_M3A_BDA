package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaRegistroPaquetes extends javax.swing.JPanel {

    public VistaRegistroPaquetes() {
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
        jButtonActualizar = new javax.swing.JButton();
        CambiarDatosPanel = new javax.swing.JPanel();
        Datostxt = new javax.swing.JLabel();
        MensajeingresoTxt = new javax.swing.JLabel();
        IDTxt = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jScrollCami = new javax.swing.JScrollPane();
        JPanelDatosCamionero = new javax.swing.JPanel();
        IDtxt = new javax.swing.JLabel();
        jFieldCodP = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Nombretxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        telefonoTxt = new javax.swing.JLabel();
        jFieldDescripcion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jCBoxIDDirecciones = new javax.swing.JComboBox<>();
        SueldoTxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jCBoxIDDestinatario = new javax.swing.JComboBox<>();

        jPanelTop1.setBackground(new java.awt.Color(248, 171, 75));

        jLabeltituloCamioneros1.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltituloCamioneros1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabeltituloCamioneros1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltituloCamioneros1.setText("INGRESO DE PAQUETERIA");
        jLabeltituloCamioneros1.setFocusable(false);
        jLabeltituloCamioneros1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelTop1Layout = new javax.swing.GroupLayout(jPanelTop1);
        jPanelTop1.setLayout(jPanelTop1Layout);
        jPanelTop1Layout.setHorizontalGroup(
            jPanelTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        jTextFieldBuscar.setText("  Buscar paqueterias ...");
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
                "ID", "CODIGO P.", "Direccion", "Descripcion", "Destinatario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeRegistros.setRowHeight(30);
        TablaDeRegistros.getTableHeader().setReorderingAllowed(false);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldBuscar))
                .addGap(0, 0, 0)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addComponent(jScrollPaneCam, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneCam, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CambiarDatosPanel.setBackground(new java.awt.Color(255, 255, 255));

        Datostxt.setBackground(new java.awt.Color(0, 102, 255));
        Datostxt.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        Datostxt.setForeground(new java.awt.Color(102, 102, 102));
        Datostxt.setText("Datos");

        MensajeingresoTxt.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        MensajeingresoTxt.setForeground(new java.awt.Color(102, 102, 102));
        MensajeingresoTxt.setText("<html>A continuaci??n puede ver y editar la informaci??n.<html>");
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
        IDtxt.setText("Cod Paquete:");

        jFieldCodP.setForeground(new java.awt.Color(102, 102, 102));
        jFieldCodP.setBorder(null);
        jFieldCodP.setMinimumSize(new java.awt.Dimension(30, 16));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Nombretxt.setBackground(new java.awt.Color(0, 102, 255));
        Nombretxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombretxt.setForeground(new java.awt.Color(102, 102, 102));
        Nombretxt.setText("Id Direccion:");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        telefonoTxt.setBackground(new java.awt.Color(0, 102, 255));
        telefonoTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(102, 102, 102));
        telefonoTxt.setText("Descripcion:");

        jFieldDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        jFieldDescripcion.setBorder(null);
        jFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldDescripcionActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jCBoxIDDirecciones.setBorder(null);

        SueldoTxt.setBackground(new java.awt.Color(0, 102, 255));
        SueldoTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SueldoTxt.setForeground(new java.awt.Color(102, 102, 102));
        SueldoTxt.setText("Destinatario:");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jCBoxIDDestinatario.setBorder(null);

        javax.swing.GroupLayout JPanelDatosCamioneroLayout = new javax.swing.GroupLayout(JPanelDatosCamionero);
        JPanelDatosCamionero.setLayout(JPanelDatosCamioneroLayout);
        JPanelDatosCamioneroLayout.setHorizontalGroup(
            JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5))
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jFieldDescripcion)
                            .addComponent(jSeparator2)
                            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                                .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                                .addComponent(Nombretxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBoxIDDirecciones, 0, 183, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(jFieldCodP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDtxt)
                            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                                .addComponent(SueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBoxIDDestinatario, 0, 182, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4)
                .addContainerGap())
        );
        JPanelDatosCamioneroLayout.setVerticalGroup(
            JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDtxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFieldCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(Nombretxt)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(jCBoxIDDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoTxt)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelDatosCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamioneroLayout.createSequentialGroup()
                        .addComponent(SueldoTxt)
                        .addGap(48, 48, 48)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBoxIDDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273))
        );

        jScrollCami.setViewportView(JPanelDatosCamionero);

        javax.swing.GroupLayout ContentRegistroLayout = new javax.swing.GroupLayout(ContentRegistro);
        ContentRegistro.setLayout(ContentRegistroLayout);
        ContentRegistroLayout.setHorizontalGroup(
            ContentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRegistroLayout.createSequentialGroup()
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
                .addComponent(jScrollCami))
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
            .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldDescripcionActionPerformed

    public JButton getjButtonActualizar() {
        return jButtonActualizar;
    }

    public void setjButtonActualizar(JButton jButtonActualizar) {
        this.jButtonActualizar = jButtonActualizar;
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

    public JTextField getjFieldCodP() {
        return jFieldCodP;
    }

    public void setjFieldCodP(JTextField jFieldCodP) {
        this.jFieldCodP = jFieldCodP;
    }

    public JComboBox<String> getjCBoxIDDirecciones1() {
        return jCBoxIDDestinatario;
    }



    public JTextField getjFieldtelefono() {
        return jFieldDescripcion;
    }

    public void setjFieldtelefono(JTextField jFieldtelefono) {
        this.jFieldDescripcion = jFieldtelefono;
    }

    public JTextField getjTextFieldBuscar() {
        return jTextFieldBuscar;
    }

    public void setjTextFieldBuscar(JTextField jTextFieldBuscar) {
        this.jTextFieldBuscar = jTextFieldBuscar;
    }

   

    public JComboBox<String> getjCBoxIDDestinatario() {
        return jCBoxIDDestinatario;
    }

    public void setjCBoxIDDestinatario(JComboBox<String> jCBoxIDDestinatario) {
        this.jCBoxIDDestinatario = jCBoxIDDestinatario;
    }

    public JTextField getjFieldDescripcion() {
        return jFieldDescripcion;
    }

    public void setjFieldDescripcion(JTextField jFieldDescripcion) {
        this.jFieldDescripcion = jFieldDescripcion;
    }

    public JLabel getjLabelID() {
        return jLabelID;
    }

    public void setjLabelID(JLabel jLabelID) {
        this.jLabelID = jLabelID;
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
    private javax.swing.JLabel SueldoTxt;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarA;
    private javax.swing.JButton jButtonInsertarA;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JComboBox<String> jCBoxIDDestinatario;
    private javax.swing.JComboBox<String> jCBoxIDDirecciones;
    private javax.swing.JTextField jFieldCodP;
    private javax.swing.JTextField jFieldDescripcion;
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
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JLabel telefonoTxt;
    // End of variables declaration//GEN-END:variables
}

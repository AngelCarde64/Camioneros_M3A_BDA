package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaRCamion extends javax.swing.JPanel {

    public VistaRCamion() {
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
        JPanelDatosCamion = new javax.swing.JPanel();
        NroPlacaTXT = new javax.swing.JLabel();
        jFieldnro_Placa = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        modelotxt = new javax.swing.JLabel();
        jFieldModelo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tipoTxt = new javax.swing.JLabel();
        jFieldTipo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        potenciaTxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jFieldpotencia = new javax.swing.JTextField();

        jPanelTop1.setBackground(new java.awt.Color(248, 171, 75));

        jLabeltituloCamioneros1.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltituloCamioneros1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabeltituloCamioneros1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltituloCamioneros1.setText("INGRESO DE CAMION");
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
        jTextFieldBuscar.setText("  Buscar camioneros ...");
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(164, 164, 164))); // NOI18N

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
                "ID", "Nro. Placa", "Tipo", "Potencia", "Modelo"
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
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
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

        JPanelDatosCamion.setBackground(new java.awt.Color(255, 255, 255));
        JPanelDatosCamion.setPreferredSize(new java.awt.Dimension(340, 500));

        NroPlacaTXT.setBackground(new java.awt.Color(0, 102, 255));
        NroPlacaTXT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NroPlacaTXT.setForeground(new java.awt.Color(102, 102, 102));
        NroPlacaTXT.setText("Nro. Placa:");

        jFieldnro_Placa.setForeground(new java.awt.Color(102, 102, 102));
        jFieldnro_Placa.setBorder(null);
        jFieldnro_Placa.setMinimumSize(new java.awt.Dimension(30, 16));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        modelotxt.setBackground(new java.awt.Color(0, 102, 255));
        modelotxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modelotxt.setForeground(new java.awt.Color(102, 102, 102));
        modelotxt.setText("Modelo:");

        jFieldModelo.setForeground(new java.awt.Color(102, 102, 102));
        jFieldModelo.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        tipoTxt.setBackground(new java.awt.Color(0, 102, 255));
        tipoTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tipoTxt.setForeground(new java.awt.Color(102, 102, 102));
        tipoTxt.setText("Tipo:");

        jFieldTipo.setForeground(new java.awt.Color(102, 102, 102));
        jFieldTipo.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        potenciaTxt.setBackground(new java.awt.Color(0, 102, 255));
        potenciaTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        potenciaTxt.setForeground(new java.awt.Color(102, 102, 102));
        potenciaTxt.setText("Potencia");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jFieldpotencia.setForeground(new java.awt.Color(102, 102, 102));
        jFieldpotencia.setBorder(null);

        javax.swing.GroupLayout JPanelDatosCamionLayout = new javax.swing.GroupLayout(JPanelDatosCamion);
        JPanelDatosCamion.setLayout(JPanelDatosCamionLayout);
        JPanelDatosCamionLayout.setHorizontalGroup(
            JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDatosCamionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                        .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDatosCamionLayout.createSequentialGroup()
                                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(potenciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 169, Short.MAX_VALUE))
                            .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                                .addComponent(NroPlacaTXT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFieldnro_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator5))))
                        .addGap(41, 41, 41))
                    .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                        .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFieldModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFieldTipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFieldpotencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPanelDatosCamionLayout.setVerticalGroup(
            JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(NroPlacaTXT))
                    .addComponent(jFieldnro_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modelotxt)
                    .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelDatosCamionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoTxt)
                    .addGroup(JPanelDatosCamionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(potenciaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFieldpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollCami.setViewportView(JPanelDatosCamion);

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

    public JTextField getjFieldpotencia() {
        return jFieldpotencia;
    }

    public void setjFieldpotencia(JTextField jFieldpotencia) {
        this.jFieldpotencia = jFieldpotencia;
    }

    public JTextField getjTextFieldBuscar() {
        return jTextFieldBuscar;
    }

    public void setjTextFieldBuscar(JTextField jTextFieldBuscar) {
        this.jTextFieldBuscar = jTextFieldBuscar;
    }

    public JTextField getjFieldModelo() {
        return jFieldModelo;
    }

    public void setjFieldModelo(JTextField jFieldModelo) {
        this.jFieldModelo = jFieldModelo;
    }

    public JTextField getjFieldTipo() {
        return jFieldTipo;
    }

    public void setjFieldTipo(JTextField jFieldTipo) {
        this.jFieldTipo = jFieldTipo;
    }

    public JTextField getjFieldnro_Placa() {
        return jFieldnro_Placa;
    }

    public void setjFieldnro_Placa(JTextField jFieldnro_Placa) {
        this.jFieldnro_Placa = jFieldnro_Placa;
    }

    public JLabel getjLabelSinCoincidencias() {
        return jLabelSinCoincidencias;
    }

    public void setjLabelSinCoincidencias(JLabel jLabelSinCoincidencias) {
        this.jLabelSinCoincidencias = jLabelSinCoincidencias;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarDatosPanel;
    private javax.swing.JPanel ContentRegistro;
    private javax.swing.JLabel Datostxt;
    private javax.swing.JLabel IDTxt;
    private javax.swing.JPanel JPanelDatosCamion;
    private javax.swing.JLabel MensajeingresoTxt;
    private javax.swing.JLabel NroPlacaTXT;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarA;
    private javax.swing.JButton jButtonInsertarA;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JTextField jFieldModelo;
    private javax.swing.JTextField jFieldTipo;
    private javax.swing.JTextField jFieldnro_Placa;
    private javax.swing.JTextField jFieldpotencia;
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
    private javax.swing.JLabel modelotxt;
    private javax.swing.JLabel potenciaTxt;
    private javax.swing.JLabel tipoTxt;
    // End of variables declaration//GEN-END:variables
}

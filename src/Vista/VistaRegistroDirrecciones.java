package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaRegistroDirrecciones extends javax.swing.JFrame {

    public VistaRegistroDirrecciones() {
        initComponents();
    }

    public JButton getjButtonIngresar() {
        return jButtonIngresar;
    }

    public void setjButtonIngresar(JButton jButtonIngresar) {
        this.jButtonIngresar = jButtonIngresar;
    }

    public JButton getjButtonInsertarA() {
        return jButtonInsertarA;
    }

    public void setjButtonInsertarA(JButton jButtonInsertarA) {
        this.jButtonInsertarA = jButtonInsertarA;
    }

    public JButton getjButtonModificar() {
        return jButtonModificar;
    }

    public void setjButtonModificar(JButton jButtonModificar) {
        this.jButtonModificar = jButtonModificar;
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

    public JButton getjButtonMostrar1() {
        return jButtonMostrar1;
    }

    public void setjButtonMostrar1(JButton jButtonMostrar1) {
        this.jButtonMostrar1 = jButtonMostrar1;
    }

    public JButton getjButtonEliminarA() {
        return jButtonEliminarA;
    }

    public void setjButtonEliminarA(JButton jButtonEliminarA) {
        this.jButtonEliminarA = jButtonEliminarA;
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

    public JLabel getjLabelSinCoincidencias() {
        return jLabelSinCoincidencias;
    }

    public void setjLabelSinCoincidencias(JLabel jLabelSinCoincidencias) {
        this.jLabelSinCoincidencias = jLabelSinCoincidencias;
    }

    public JTextField getjFieldNombreRA1() {
        return jFieldNombreRA1;
    }

    public void setjFieldNombreRA1(JTextField jFieldNombreRA) {
        this.jFieldNombreRA1 = jFieldNombreRA;
    }

    public JTextField getjFieldCalleS() {
        return jFieldEspecie;
    }

    public void setjFieldCalleS(JTextField jFieldCalleS) {
        this.jFieldEspecie = jFieldCalleS;
    }
    
    
    //                                                                          jFieldCalleS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneIngCamres = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jPanelCRUD = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        ContentRegistro = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        jLabelSinCoincidencias = new javax.swing.JLabel();
        jLabelIconTipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDeRegistros = new javax.swing.JTable();
        jButtonMostrar1 = new javax.swing.JButton();
        JtextFieldBuscarPaquete = new javax.swing.JTextField();
        ContentButtonsIME = new javax.swing.JPanel();
        jButtonInsertarA = new javax.swing.JButton();
        jButtonModificarA = new javax.swing.JButton();
        jButtonEliminarA = new javax.swing.JButton();
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
        alertNombretxt = new javax.swing.JLabel();
        Especietxt = new javax.swing.JLabel();
        jFieldEspecie = new javax.swing.JTextField();
        alertEspecietxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jFieldNombreRA1 = new javax.swing.JTextField();

        paneIngCamres.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("TELÉFONO:");

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("NOMBRE:");

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(165, 42, 42));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(165, 42, 42));
        jLabel15.setText("DNI:");

        jTextField5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel16.setText("POBLACIÓN:");

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton2.setText("SELECCIONE LA DIRECCIÓN:");

        jButtonMostrar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonMostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrar.setText("INGRESAR");
        jButtonMostrar.setBorder(null);

        javax.swing.GroupLayout paneIngCamresLayout = new javax.swing.GroupLayout(paneIngCamres);
        paneIngCamres.setLayout(paneIngCamresLayout);
        paneIngCamresLayout.setHorizontalGroup(
            paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneIngCamresLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneIngCamresLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneIngCamresLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneIngCamresLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneIngCamresLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneIngCamresLayout.createSequentialGroup()
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        paneIngCamresLayout.setVerticalGroup(
            paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneIngCamresLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneIngCamresLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(paneIngCamresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneIngCamresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        jPanelCRUD.setBackground(new java.awt.Color(169, 103, 56));

        jButtonIngresar.setBackground(new java.awt.Color(192, 173, 116));
        jButtonIngresar.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setActionCommand("");
        jButtonIngresar.setBorder(null);
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setFocusPainted(false);

        jButtonBuscar.setBackground(new java.awt.Color(221, 162, 112));
        jButtonBuscar.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setFocusPainted(false);

        jButtonModificar.setBackground(new java.awt.Color(195, 148, 98));
        jButtonModificar.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setActionCommand("");
        jButtonModificar.setBorder(null);
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setFocusPainted(false);

        jButtonEliminar.setBackground(new java.awt.Color(203, 136, 100));
        jButtonEliminar.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setActionCommand("");
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setFocusPainted(false);

        javax.swing.GroupLayout jPanelCRUDLayout = new javax.swing.GroupLayout(jPanelCRUD);
        jPanelCRUD.setLayout(jPanelCRUDLayout);
        jPanelCRUDLayout.setHorizontalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanelCRUDLayout.setVerticalGroup(
            jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCRUDLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContentRegistro.setBackground(new java.awt.Color(236, 236, 236));

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSinCoincidencias.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSinCoincidencias.setText("No hay coincidencias");

        TablaDeRegistros.setBackground(new java.awt.Color(133, 171, 208));
        TablaDeRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        TablaDeRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CALLE PRINCIPAL", "CALLE SECUNDARIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeRegistros.setRowHeight(30);
        jScrollPane2.setViewportView(TablaDeRegistros);

        jButtonMostrar1.setBackground(new java.awt.Color(102, 153, 255));
        jButtonMostrar1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonMostrar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrar1.setText("Buscar");
        jButtonMostrar1.setBorder(null);

        JtextFieldBuscarPaquete.setForeground(new java.awt.Color(102, 102, 102));
        JtextFieldBuscarPaquete.setText("BUSCAR UNA DIRECCION");

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
                        .addComponent(jButtonMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ContentButtonsIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jButtonMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(ContentButtonsIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        Nombretxt.setText("Calle Principal:");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        alertNombretxt.setBackground(new java.awt.Color(255, 255, 255));
        alertNombretxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        alertNombretxt.setForeground(new java.awt.Color(255, 51, 51));
        alertNombretxt.setText("Ingrese nueva calle principal");

        Especietxt.setBackground(new java.awt.Color(0, 102, 255));
        Especietxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Especietxt.setForeground(new java.awt.Color(102, 102, 102));
        Especietxt.setText("Calle Secundaria:");

        jFieldEspecie.setForeground(new java.awt.Color(102, 102, 102));
        jFieldEspecie.setBorder(null);

        alertEspecietxt.setBackground(new java.awt.Color(255, 255, 255));
        alertEspecietxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        alertEspecietxt.setForeground(new java.awt.Color(255, 51, 51));
        alertEspecietxt.setText("Ingrese nueva calle secundaria");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jFieldNombreRA1.setForeground(new java.awt.Color(102, 102, 102));
        jFieldNombreRA1.setBorder(null);

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
                        .addGap(10, 10, 10)
                        .addComponent(Especietxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alertEspecietxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFieldEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alertNombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentRAparte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFieldNombreRA1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jFieldNombreRA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertNombretxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Especietxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFieldEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(alertEspecietxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(ContentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarDatosAnimales;
    private javax.swing.JPanel CambiarDatosPanel;
    private javax.swing.JPanel ContentButtonsIME;
    private javax.swing.JPanel ContentRAparte1;
    private javax.swing.JPanel ContentRegistro;
    private javax.swing.JLabel Datostxt;
    private javax.swing.JLabel Especietxt;
    private javax.swing.JLabel IDtxt;
    private javax.swing.JTextField JtextFieldBuscarPaquete;
    private javax.swing.JLabel MensajeingresoTxt;
    private javax.swing.JLabel Nombretxt;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JTable TablaDeRegistros;
    private javax.swing.JLabel alertEspecietxt;
    private javax.swing.JLabel alertNombretxt;
    private javax.swing.JLabel idForATxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminarA;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonInsertarA;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonMostrar1;
    private javax.swing.JTextField jFieldEspecie;
    private javax.swing.JTextField jFieldNombreRA1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabelIconTipo;
    private javax.swing.JLabel jLabelSinCoincidencias;
    private javax.swing.JPanel jPanelCRUD;
    private javax.swing.JScrollPane jScrollPCDAnimal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JPanel paneIngCamres;
    // End of variables declaration//GEN-END:variables
}

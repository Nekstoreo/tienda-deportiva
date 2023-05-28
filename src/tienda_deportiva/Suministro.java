package tienda_deportiva;

import javax.swing.JOptionPane;
import javax.swing.table.*;
import tienda_deportiva.Compras;

public class Suministro extends javax.swing.JFrame {

    public static Object[] v_datos = new Object[4];
    public static String Datos[] = new String[4];
    public static DefaultTableModel modelo_suministro; //me define la taba

    public Suministro() {
        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
        this.setResizable(false); // no agrandar pagina
        
      

       modelo_suministro = (DefaultTableModel) Tabla_Suministro.getModel(); //se castea
       
       Tabla_Suministro.setModel(modelo_suministro);
  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        talla_termo = new javax.swing.JComboBox<>();
        precio_termo = new javax.swing.JTextField();
        comprar_termo = new javax.swing.JButton();
        ref_balonmicro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        precio_balonmicro = new javax.swing.JTextField();
        talla_balonbasket = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comprar_balonbasket = new javax.swing.JButton();
        termotxt = new javax.swing.JLabel();
        comprar_balonmicro = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        talla_balonmicro = new javax.swing.JComboBox<>();
        balonamericanotxt = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        precio_balonamericano = new javax.swing.JTextField();
        balonmicrotxt = new javax.swing.JLabel();
        talla_balonamericano = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        comprar_balonamericano = new javax.swing.JButton();
        agregar_carrito = new javax.swing.JButton();
        balonbasquettxt = new javax.swing.JLabel();
        precio_guantesgym = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        eliminar_fila = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        talla_guantesgym = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        precio_balonbasket = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ref_guantesgym = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ref_balonamericano = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Suministro = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        ref_termo = new javax.swing.JTextField();
        comprar_guantesgym = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ref_balonbasket = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        guantesgymtxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Anterior_pag = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("                                      Suministros");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 0), new java.awt.Color(102, 0, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 18, 630, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_tienda.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 18, 80, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        talla_termo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A" }));
        talla_termo.setToolTipText("TALLA");
        talla_termo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_termoActionPerformed(evt);
            }
        });
        jPanel2.add(talla_termo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 50, 20));

        precio_termo.setText("38000");
        precio_termo.setEnabled(false);
        precio_termo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_termoActionPerformed(evt);
            }
        });
        jPanel2.add(precio_termo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 50, -1));

        comprar_termo.setText("Comprar");
        comprar_termo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_termoActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_termo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 80, 20));

        ref_balonmicro.setText("352");
        ref_balonmicro.setEnabled(false);
        ref_balonmicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_balonmicroActionPerformed(evt);
            }
        });
        jPanel2.add(ref_balonmicro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 50, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 20));

        precio_balonmicro.setText("120000");
        precio_balonmicro.setEnabled(false);
        precio_balonmicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_balonmicroActionPerformed(evt);
            }
        });
        jPanel2.add(precio_balonmicro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 50, -1));

        talla_balonbasket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10" }));
        talla_balonbasket.setToolTipText("TALLA");
        jPanel2.add(talla_balonbasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TALLA:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 60, 20));

        comprar_balonbasket.setText("Comprar");
        comprar_balonbasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_balonbasketActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_balonbasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        termotxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        termotxt.setText("Termo");
        jPanel2.add(termotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 70, 40));

        comprar_balonmicro.setText("Comprar");
        comprar_balonmicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_balonmicroActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_balonmicro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TALLA:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 60, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 20));

        talla_balonmicro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10" }));
        talla_balonmicro.setToolTipText("TALLA");
        jPanel2.add(talla_balonmicro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, 20));

        balonamericanotxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        balonamericanotxt.setText("Balon americano");
        jPanel2.add(balonamericanotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 120, 140, 40));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PRECIO:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 20));

        precio_balonamericano.setText("150000");
        precio_balonamericano.setEnabled(false);
        precio_balonamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_balonamericanoActionPerformed(evt);
            }
        });
        jPanel2.add(precio_balonamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 60, -1));

        balonmicrotxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        balonmicrotxt.setText("  Balon micro");
        jPanel2.add(balonmicrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 40));

        talla_balonamericano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10" }));
        talla_balonamericano.setToolTipText("TALLA");
        jPanel2.add(talla_balonamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TALLA:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 60, 20));

        comprar_balonamericano.setText("Comprar");
        comprar_balonamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_balonamericanoActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_balonamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 20));

        agregar_carrito.setText("agregar carrito");
        agregar_carrito.setActionCommand("");
        agregar_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_carritoActionPerformed(evt);
            }
        });
        jPanel2.add(agregar_carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 140, 30));

        balonbasquettxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        balonbasquettxt.setText("Balon basket");
        jPanel2.add(balonbasquettxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 40));

        precio_guantesgym.setText("75000");
        precio_guantesgym.setEnabled(false);
        precio_guantesgym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_guantesgymActionPerformed(evt);
            }
        });
        jPanel2.add(precio_guantesgym, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 50, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("REF:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("REF:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, 20));

        eliminar_fila.setText("eliminar fila");
        eliminar_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_filaActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar_fila, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 140, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("REF:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PRECIO:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 20));

        talla_guantesgym.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_guantesgym.setToolTipText("TALLA");
        talla_guantesgym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_guantesgymActionPerformed(evt);
            }
        });
        jPanel2.add(talla_guantesgym, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 50, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REF:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 20));

        precio_balonbasket.setText("80000");
        precio_balonbasket.setEnabled(false);
        jPanel2.add(precio_balonbasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("REF:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        ref_guantesgym.setText("577");
        ref_guantesgym.setEnabled(false);
        jPanel2.add(ref_guantesgym, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 50, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TALLA:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 60, 20));

        ref_balonamericano.setText("566");
        ref_balonamericano.setEnabled(false);
        ref_balonamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_balonamericanoActionPerformed(evt);
            }
        });
        jPanel2.add(ref_balonamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 60, 20));

        Tabla_Suministro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Referencia", "Precio", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Short.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Suministro.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tabla_Suministro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Tabla_Suministro);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 750, 110));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 20));

        ref_termo.setText("544");
        ref_termo.setEnabled(false);
        ref_termo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_termoActionPerformed(evt);
            }
        });
        jPanel2.add(ref_termo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 50, 20));

        comprar_guantesgym.setText("Comprar");
        comprar_guantesgym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_guantesgymActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_guantesgym, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        ref_balonbasket.setText("333");
        ref_balonbasket.setEnabled(false);
        ref_balonbasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_balonbasketActionPerformed(evt);
            }
        });
        jPanel2.add(ref_balonbasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basquet.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/micro.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 120, 100));

        guantesgymtxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        guantesgymtxt.setText("Guantes gym");
        jPanel2.add(guantesgymtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 120, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/americano.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 14, 90, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/termo.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 100));

        Anterior_pag.setText("pagina anterior");
        Anterior_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior_pagActionPerformed(evt);
            }
        });
        jPanel2.add(Anterior_pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proteina.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_ten_blur.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        jTextField16.setText("SH243");
        jTextField16.setEnabled(false);
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 750, 490));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_backg.jpg"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1020, 520));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Anterior_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior_pagActionPerformed

        try {

            this.setVisible(false);//me cierra la aterior donde estaba parado
            

        } catch (Exception error) {
            System.out.println("\n se presento un error en boton regresar \n" + error);
        }
    }//GEN-LAST:event_Anterior_pagActionPerformed

    private void precio_termoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_termoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_termoActionPerformed

    private void precio_balonmicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_balonmicroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_balonmicroActionPerformed

    private void precio_balonamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_balonamericanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_balonamericanoActionPerformed

    private void precio_guantesgymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_guantesgymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_guantesgymActionPerformed

    private void talla_termoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_termoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_termoActionPerformed

    private void talla_guantesgymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_guantesgymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_guantesgymActionPerformed

    private void comprar_balonbasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_balonbasketActionPerformed

        try {

            if (!balonbasquettxt.getText().isEmpty() && !ref_balonbasket.getText().isEmpty() && !precio_balonbasket.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = balonbasquettxt.getText();

                v_datos[1] = Short.parseShort(ref_balonbasket.getText());
                v_datos[2] = Float.parseFloat(precio_balonbasket.getText());
                v_datos[3] = talla_balonbasket.getSelectedItem();

                modelo_suministro.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }


    }//GEN-LAST:event_comprar_balonbasketActionPerformed

    private void ref_balonbasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_balonbasketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_balonbasketActionPerformed

    private void ref_termoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_termoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_termoActionPerformed

    private void eliminar_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_filaActionPerformed
        // TODO add your handling code here:
        try {

            int verificar, fila_sel = -1;

            fila_sel = Tabla_Suministro.getSelectedRow();//a la fila elecccionada digame cual fila esta ahi

            if (fila_sel == -1) {
                JOptionPane.showMessageDialog(null, "\n debe seleccionae fila para eliminar \n"); //no ha seleccionado nada
            } else {
                verificar = JOptionPane.showConfirmDialog(null, "\n esta seguro de remover la fila seleccionada? \n");
                if (verificar == JOptionPane.YES_OPTION) {
                    modelo_suministro.removeRow(fila_sel); //remuva la seleccionada
                }
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "\n se presento un error eliminando el registro de la tabla \n" + error);
        }


    }//GEN-LAST:event_eliminar_filaActionPerformed

    private void agregar_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_carritoActionPerformed
        // TODO add your handling code here:

        try {
            for (int i = 0; i < Tabla_Suministro.getRowCount(); i++) {

                Datos[0] = Tabla_Suministro.getValueAt(i, 0).toString();
                Datos[1] = Tabla_Suministro.getValueAt(i, 1).toString();
                Datos[2] = Tabla_Suministro.getValueAt(i, 2).toString();
                Datos[3] = Tabla_Suministro.getValueAt(i, 3).toString();

                Compras.modelo_compras.addRow(Datos);
            }

            limpiar_tabla();//limpiar campos
            
            this.setVisible(false);
          

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_agregar_carritoActionPerformed

    public void limpiar_tabla() {
        //al pasar todos los datos limpiamos la primera tabla

        modelo_suministro = new DefaultTableModel();
        Tabla_Suministro.setModel(modelo_suministro);

    }

    private void comprar_balonmicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_balonmicroActionPerformed
        // TODO add your handling code here:

        try {

            if (!balonmicrotxt.getText().isEmpty() && !ref_balonmicro.getText().isEmpty() && !precio_balonmicro.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = balonmicrotxt.getText();
                v_datos[1] = Short.parseShort(ref_balonmicro.getText());
                v_datos[2] = Float.parseFloat(precio_balonmicro.getText());
                v_datos[3] = talla_balonmicro.getSelectedItem();

                modelo_suministro.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_balonmicroActionPerformed

    private void comprar_balonamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_balonamericanoActionPerformed
        // TODO add your handling code here:
        try {

            if (!balonamericanotxt.getText().isEmpty() && !ref_balonamericano.getText().isEmpty() && !precio_balonamericano.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = balonamericanotxt.getText();
                v_datos[1] = Short.parseShort(ref_balonamericano.getText());
                v_datos[2] = Float.parseFloat(precio_balonamericano.getText());
                v_datos[3] = talla_balonamericano.getSelectedItem();

                modelo_suministro.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }

    }//GEN-LAST:event_comprar_balonamericanoActionPerformed

    private void comprar_guantesgymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_guantesgymActionPerformed
        // TODO add your handling code here:

        try {

            if (!guantesgymtxt.getText().isEmpty() && !ref_guantesgym.getText().isEmpty() && !precio_guantesgym.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = guantesgymtxt.getText();
                v_datos[1] = Short.parseShort(ref_guantesgym.getText());
                v_datos[2] = Float.parseFloat(precio_guantesgym.getText());
                v_datos[3] = talla_guantesgym.getSelectedItem();

                modelo_suministro.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_guantesgymActionPerformed

    private void comprar_termoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_termoActionPerformed
        // TODO add your handling code here:

        try {

            if (!termotxt.getText().isEmpty() && !ref_termo.getText().isEmpty() && !precio_termo.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = termotxt.getText();

                v_datos[1] = Short.parseShort(ref_termo.getText());
                v_datos[2] = Float.parseFloat(precio_termo.getText());
                v_datos[3] = talla_termo.getSelectedItem();

                modelo_suministro.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_termoActionPerformed

    private void ref_balonmicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_balonmicroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_balonmicroActionPerformed

    private void ref_balonamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_balonamericanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_balonamericanoActionPerformed

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
            java.util.logging.Logger.getLogger(Suministro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suministro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suministro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suministro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suministro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior_pag;
    private javax.swing.JTable Tabla_Suministro;
    private javax.swing.JButton agregar_carrito;
    private javax.swing.JLabel balonamericanotxt;
    private javax.swing.JLabel balonbasquettxt;
    private javax.swing.JLabel balonmicrotxt;
    private javax.swing.JButton comprar_balonamericano;
    private javax.swing.JButton comprar_balonbasket;
    private javax.swing.JButton comprar_balonmicro;
    private javax.swing.JButton comprar_guantesgym;
    private javax.swing.JButton comprar_termo;
    private javax.swing.JButton eliminar_fila;
    private javax.swing.JLabel guantesgymtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField precio_balonamericano;
    private javax.swing.JTextField precio_balonbasket;
    private javax.swing.JTextField precio_balonmicro;
    private javax.swing.JTextField precio_guantesgym;
    private javax.swing.JTextField precio_termo;
    private javax.swing.JTextField ref_balonamericano;
    private javax.swing.JTextField ref_balonbasket;
    private javax.swing.JTextField ref_balonmicro;
    private javax.swing.JTextField ref_guantesgym;
    private javax.swing.JTextField ref_termo;
    private javax.swing.JComboBox<String> talla_balonamericano;
    private javax.swing.JComboBox<String> talla_balonbasket;
    private javax.swing.JComboBox<String> talla_balonmicro;
    private javax.swing.JComboBox<String> talla_guantesgym;
    private javax.swing.JComboBox<String> talla_termo;
    private javax.swing.JLabel termotxt;
    // End of variables declaration//GEN-END:variables
}

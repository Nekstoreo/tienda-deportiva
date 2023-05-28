package tienda_deportiva;

import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Ropa extends javax.swing.JFrame {

    public static Object[] v_datos = new Object[4];
    public static String Datos[] = new String[4];
    public static DefaultTableModel modelo_ropa; //me define la taba

    public Ropa() {
        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
        this.setResizable(false); // no agrandar pagina
        
       

       modelo_ropa = (DefaultTableModel)Tabla_Ropa.getModel(); //se castea
       
       Tabla_Ropa.setModel(modelo_ropa);    

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        talla_bikers = new javax.swing.JComboBox<>();
        precio_bikers = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ref_camisasport = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        precio_camisasport = new javax.swing.JTextField();
        talla_short = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comprar_short = new javax.swing.JButton();
        bike = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        talla_camisasport = new javax.swing.JComboBox<>();
        camisaR = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        precio_camisarelax = new javax.swing.JTextField();
        camisaS = new javax.swing.JLabel();
        talla_camisarelax = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        agregar_carrito = new javax.swing.JButton();
        shor = new javax.swing.JLabel();
        precio_conjuntodeportivo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        eliminar_fila = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        talla_conjuntodeportivo = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        precio_short = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ref_conjuntordeportivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ref_camisarelax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ropa = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        ref_bikers = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ref_short = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        camisaD = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Anterior_pag = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("                                              ROPA");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 0), new java.awt.Color(102, 0, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 18, 630, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_tienda.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 18, 80, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        talla_bikers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_bikers.setToolTipText("TALLA");
        talla_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_bikersActionPerformed(evt);
            }
        });
        jPanel2.add(talla_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 50, 20));

        precio_bikers.setText("25000");
        precio_bikers.setEnabled(false);
        precio_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_bikersActionPerformed(evt);
            }
        });
        jPanel2.add(precio_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 50, -1));

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 80, 20));

        ref_camisasport.setText("566");
        ref_camisasport.setEnabled(false);
        jPanel2.add(ref_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, 20));

        precio_camisasport.setText("55000");
        precio_camisasport.setEnabled(false);
        precio_camisasport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_camisasportActionPerformed(evt);
            }
        });
        jPanel2.add(precio_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 50, -1));

        talla_short.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_short.setToolTipText("TALLA");
        jPanel2.add(talla_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TALLA:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 60, 20));

        comprar_short.setText("Comprar");
        comprar_short.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_shortActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        bike.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        bike.setForeground(new java.awt.Color(255, 255, 255));
        bike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bike.setText("bikers");
        jPanel2.add(bike, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 90, 30));

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TALLA:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 60, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 20));

        talla_camisasport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_camisasport.setToolTipText("TALLA");
        jPanel2.add(talla_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 50, 20));

        camisaR.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        camisaR.setForeground(new java.awt.Color(255, 255, 255));
        camisaR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaR.setText("Camisa Relax");
        jPanel2.add(camisaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 120, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PRECIO:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 20));

        precio_camisarelax.setText("48000");
        precio_camisarelax.setEnabled(false);
        precio_camisarelax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_camisarelaxActionPerformed(evt);
            }
        });
        jPanel2.add(precio_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 60, -1));

        camisaS.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        camisaS.setForeground(new java.awt.Color(255, 255, 255));
        camisaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaS.setText("Camisa Sport");
        jPanel2.add(camisaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, 30));

        talla_camisarelax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_camisarelax.setToolTipText("TALLA");
        jPanel2.add(talla_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 60, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TALLA:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 60, 20));

        jButton4.setText("Comprar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 80, 20));

        agregar_carrito.setText("agregar carrito");
        agregar_carrito.setActionCommand("");
        agregar_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_carritoActionPerformed(evt);
            }
        });
        jPanel2.add(agregar_carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 140, 30));

        shor.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        shor.setForeground(new java.awt.Color(255, 255, 255));
        shor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shor.setText("Short Dama");
        jPanel2.add(shor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        precio_conjuntodeportivo.setText("60000");
        precio_conjuntodeportivo.setEnabled(false);
        precio_conjuntodeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_conjuntodeportivoActionPerformed(evt);
            }
        });
        jPanel2.add(precio_conjuntodeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 50, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("REF:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("REF:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, 20));

        eliminar_fila.setText("eliminar fila");
        eliminar_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_filaActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar_fila, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 140, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("REF:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PRECIO:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 20));

        talla_conjuntodeportivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_conjuntodeportivo.setToolTipText("TALLA");
        talla_conjuntodeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_conjuntodeportivoActionPerformed(evt);
            }
        });
        jPanel2.add(talla_conjuntodeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 50, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REF:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 20));

        precio_short.setText("35000");
        precio_short.setEnabled(false);
        jPanel2.add(precio_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("REF:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        ref_conjuntordeportivo.setText("876");
        ref_conjuntordeportivo.setEnabled(false);
        jPanel2.add(ref_conjuntordeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 50, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TALLA:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, 20));

        ref_camisarelax.setText("211");
        ref_camisarelax.setEnabled(false);
        jPanel2.add(ref_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 60, 20));

        Tabla_Ropa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Referencia", "Precio", "Talla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Ropa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tabla_Ropa.setAutoscrolls(false);
        Tabla_Ropa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Tabla_Ropa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 840, 110));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 20));

        ref_bikers.setText("632");
        ref_bikers.setEnabled(false);
        ref_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_bikersActionPerformed(evt);
            }
        });
        jPanel2.add(ref_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 50, 20));

        jButton5.setText("Comprar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        ref_short.setText("243");
        ref_short.setEnabled(false);
        ref_short.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_shortActionPerformed(evt);
            }
        });
        jPanel2.add(ref_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ropita.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisa2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, 120));

        camisaD.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        camisaD.setForeground(new java.awt.Color(255, 255, 255));
        camisaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaD.setText("Conjunto Deportivo");
        jPanel2.add(camisaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 120, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisa.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leggi.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 120, 120));

        Anterior_pag.setText("pagina anterior");
        Anterior_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior_pagActionPerformed(evt);
            }
        });
        jPanel2.add(Anterior_pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conjunto.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 120, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 950, 490));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_backg.jpg"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 520));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_bikersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_bikersActionPerformed

    private void precio_camisasportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_camisasportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_camisasportActionPerformed

    private void precio_camisarelaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_camisarelaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_camisarelaxActionPerformed

    private void precio_conjuntodeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_conjuntodeportivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_conjuntodeportivoActionPerformed

    private void talla_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_bikersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_bikersActionPerformed

    private void talla_conjuntodeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_conjuntodeportivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_conjuntodeportivoActionPerformed

    private void comprar_shortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_shortActionPerformed

        try {

            if (!shor.getText().isEmpty() && !ref_short.getText().isEmpty() && !precio_short.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = shor.getText();

                v_datos[1] = Short.parseShort(ref_short.getText());
                v_datos[2] = Float.parseFloat(precio_short.getText());
                v_datos[3] = talla_short.getSelectedItem();

                modelo_ropa.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }


    }//GEN-LAST:event_comprar_shortActionPerformed

    private void ref_shortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_shortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_shortActionPerformed

    private void ref_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_bikersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_bikersActionPerformed

    private void eliminar_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_filaActionPerformed
        // TODO add your handling code here:
        try {

            int verificar, fila_sel = -1;

            fila_sel = Tabla_Ropa.getSelectedRow();//a la fila elecccionada digame cual fila esta ahi

            if (fila_sel == -1) {
                JOptionPane.showMessageDialog(null, "\n debe seleccionae fila para eliminar \n"); //no ha seleccionado nada
            } else {
                verificar = JOptionPane.showConfirmDialog(null, "\n esta seguro de remover la fila seleccionada? \n");
                if (verificar == JOptionPane.YES_OPTION) {
                    modelo_ropa.removeRow(fila_sel); //remuva la seleccionada
                }
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "\n se presento un error eliminando el registro de la tabla \n" + error);
        }


    }//GEN-LAST:event_eliminar_filaActionPerformed

    private void agregar_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_carritoActionPerformed
        // TODO add your handling code here:
       
        try {
            for (int i = 0; i < Tabla_Ropa.getRowCount(); i++) {

                Datos[0] = Tabla_Ropa.getValueAt(i, 0).toString();
                Datos[1] = Tabla_Ropa.getValueAt(i, 1).toString();
                Datos[2] = Tabla_Ropa.getValueAt(i, 2).toString();
                Datos[3] = Tabla_Ropa.getValueAt(i, 3).toString();

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

        modelo_ropa = new DefaultTableModel();
        Tabla_Ropa.setModel(modelo_ropa);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {

            if (!camisaS.getText().isEmpty() && !ref_camisasport.getText().isEmpty() && !precio_camisasport.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = camisaS.getText();
                v_datos[1] = Short.parseShort(ref_camisasport.getText());
                v_datos[2] = Float.parseFloat(precio_camisasport.getText());
                v_datos[3] = talla_camisasport.getSelectedItem();

                modelo_ropa.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {

            if (!camisaR.getText().isEmpty() && !ref_camisarelax.getText().isEmpty() && !precio_camisarelax.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = camisaR.getText();
                v_datos[1] = Short.parseShort(ref_camisarelax.getText());
                v_datos[2] = Float.parseFloat(precio_camisarelax.getText());
                v_datos[3] = talla_camisarelax.getSelectedItem();

                modelo_ropa.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        try {

            if (!camisaD.getText().isEmpty() && !ref_conjuntordeportivo.getText().isEmpty() && !precio_conjuntodeportivo.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = camisaD.getText();
                v_datos[1] = Short.parseShort(ref_conjuntordeportivo.getText());
                v_datos[2] = Float.parseFloat(precio_conjuntodeportivo.getText());
                v_datos[3] = talla_conjuntodeportivo.getSelectedItem();

                modelo_ropa.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {

            if (!bike.getText().isEmpty() && !ref_bikers.getText().isEmpty() && !precio_bikers.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = bike.getText();
                v_datos[1] = Short.parseShort(ref_bikers.getText());
                v_datos[2] = Float.parseFloat(precio_bikers.getText());
                v_datos[3] = talla_bikers.getSelectedItem();

                modelo_ropa.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Anterior_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior_pagActionPerformed

        try {

            this.setVisible(false);//me cierra la aterior donde estaba parado
          

        } catch (Exception error) {
            System.out.println("\n se presento un error en boton regresar \n" + error);
        }
    }//GEN-LAST:event_Anterior_pagActionPerformed

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
            java.util.logging.Logger.getLogger(Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ropa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior_pag;
    private javax.swing.JTable Tabla_Ropa;
    private javax.swing.JButton agregar_carrito;
    private javax.swing.JLabel bike;
    private javax.swing.JLabel camisaD;
    private javax.swing.JLabel camisaR;
    private javax.swing.JLabel camisaS;
    private javax.swing.JButton comprar_short;
    private javax.swing.JButton eliminar_fila;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio_bikers;
    private javax.swing.JTextField precio_camisarelax;
    private javax.swing.JTextField precio_camisasport;
    private javax.swing.JTextField precio_conjuntodeportivo;
    private javax.swing.JTextField precio_short;
    private javax.swing.JTextField ref_bikers;
    private javax.swing.JTextField ref_camisarelax;
    private javax.swing.JTextField ref_camisasport;
    private javax.swing.JTextField ref_conjuntordeportivo;
    private javax.swing.JTextField ref_short;
    private javax.swing.JLabel shor;
    private javax.swing.JComboBox<String> talla_bikers;
    private javax.swing.JComboBox<String> talla_camisarelax;
    private javax.swing.JComboBox<String> talla_camisasport;
    private javax.swing.JComboBox<String> talla_conjuntodeportivo;
    private javax.swing.JComboBox<String> talla_short;
    // End of variables declaration//GEN-END:variables
}

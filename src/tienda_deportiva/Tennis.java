package tienda_deportiva;

import javax.swing.JOptionPane;
import javax.swing.table.*;
import tienda_deportiva.Compras;

public class Tennis extends javax.swing.JFrame {

    public static Object[] v_datos = new Object[4];
    public static String Datos[] = new String[4];
    public static DefaultTableModel modelo_tennis; //me define la taba

    public Tennis() {
        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
        this.setResizable(false); // no agrandar pagina
       
        
        
       modelo_tennis = (DefaultTableModel) Tabla_Tennis.getModel(); //se castea
         
       Tabla_Tennis.setModel(modelo_tennis);
        
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        talla_sintetica = new javax.swing.JComboBox<>();
        precio_sintetica = new javax.swing.JTextField();
        comprar_sintetica = new javax.swing.JButton();
        ref_atletismo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        precio_atletismo = new javax.swing.JTextField();
        talla_guayos = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comprar_guayos = new javax.swing.JButton();
        sinteticatxt = new javax.swing.JLabel();
        comprar_atletismo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        talla_atletismo = new javax.swing.JComboBox<>();
        caminata = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        precio_caminata = new javax.swing.JTextField();
        atletismotxt = new javax.swing.JLabel();
        talla_caminata = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        comprar_caminata = new javax.swing.JButton();
        agregar_carrito = new javax.swing.JButton();
        guayostxt = new javax.swing.JLabel();
        precio_futbolsala = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        eliminar_fila = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        talla_futbolsala = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        precio_guayos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ref_futbolsala = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ref_caminata = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Tennis = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        ref_sintetica = new javax.swing.JTextField();
        comprar_futbolsala = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ref_guayos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        futbolsalatxt = new javax.swing.JLabel();
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
        jLabel1.setText("                                              TENNIS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 0), new java.awt.Color(102, 0, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 18, 630, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_tienda.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 18, 80, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        talla_sintetica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "39", "40", "41", "42" }));
        talla_sintetica.setToolTipText("TALLA");
        talla_sintetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_sinteticaActionPerformed(evt);
            }
        });
        jPanel2.add(talla_sintetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 50, 20));

        precio_sintetica.setText("185000");
        precio_sintetica.setEnabled(false);
        precio_sintetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_sinteticaActionPerformed(evt);
            }
        });
        jPanel2.add(precio_sintetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 50, -1));

        comprar_sintetica.setText("Comprar");
        comprar_sintetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_sinteticaActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_sintetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 80, 20));

        ref_atletismo.setText("744");
        ref_atletismo.setEnabled(false);
        jPanel2.add(ref_atletismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 60, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 20));

        precio_atletismo.setText("230000");
        precio_atletismo.setEnabled(false);
        precio_atletismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_atletismoActionPerformed(evt);
            }
        });
        jPanel2.add(precio_atletismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 60, -1));

        talla_guayos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "39", "40", "41", "42" }));
        talla_guayos.setToolTipText("TALLA");
        jPanel2.add(talla_guayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TALLA:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 60, 20));

        comprar_guayos.setText("Comprar");
        comprar_guayos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_guayosActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_guayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        sinteticatxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        sinteticatxt.setForeground(new java.awt.Color(0, 0, 0));
        sinteticatxt.setText("sintetica");
        jPanel2.add(sinteticatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 80, 30));

        comprar_atletismo.setText("Comprar");
        comprar_atletismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_atletismoActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_atletismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TALLA:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 60, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 20));

        talla_atletismo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "39", "40", "41", "42" }));
        talla_atletismo.setToolTipText("TALLA");
        jPanel2.add(talla_atletismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 60, 20));

        caminata.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        caminata.setForeground(new java.awt.Color(0, 0, 0));
        caminata.setText("caminata");
        jPanel2.add(caminata, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PRECIO:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 20));

        precio_caminata.setText("310000");
        precio_caminata.setEnabled(false);
        precio_caminata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_caminataActionPerformed(evt);
            }
        });
        jPanel2.add(precio_caminata, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 60, -1));

        atletismotxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        atletismotxt.setForeground(new java.awt.Color(0, 0, 0));
        atletismotxt.setText("   atletrismo");
        jPanel2.add(atletismotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 30));

        talla_caminata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "39", "40", "41", "42" }));
        talla_caminata.setToolTipText("TALLA");
        jPanel2.add(talla_caminata, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TALLA:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 60, 20));

        comprar_caminata.setText("Comprar");
        comprar_caminata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_caminataActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_caminata, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 20));

        agregar_carrito.setText("agregar carrito");
        agregar_carrito.setActionCommand("");
        agregar_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_carritoActionPerformed(evt);
            }
        });
        jPanel2.add(agregar_carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 140, 30));

        guayostxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        guayostxt.setForeground(new java.awt.Color(0, 0, 0));
        guayostxt.setText("guayos");
        jPanel2.add(guayostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 30));

        precio_futbolsala.setText("280000");
        precio_futbolsala.setEnabled(false);
        precio_futbolsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_futbolsalaActionPerformed(evt);
            }
        });
        jPanel2.add(precio_futbolsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 60, -1));

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

        talla_futbolsala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "39", "40", "41", "42" }));
        talla_futbolsala.setToolTipText("TALLA");
        talla_futbolsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_futbolsalaActionPerformed(evt);
            }
        });
        jPanel2.add(talla_futbolsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 60, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REF:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 20));

        precio_guayos.setText("120000");
        precio_guayos.setEnabled(false);
        jPanel2.add(precio_guayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 60, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("REF:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        ref_futbolsala.setText("833");
        ref_futbolsala.setEnabled(false);
        jPanel2.add(ref_futbolsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 60, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TALLA:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 60, 20));

        ref_caminata.setText("854");
        ref_caminata.setEnabled(false);
        jPanel2.add(ref_caminata, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 60, 20));

        Tabla_Tennis.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Tennis.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tabla_Tennis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Tabla_Tennis);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 750, 110));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 20));

        ref_sintetica.setText("018");
        ref_sintetica.setEnabled(false);
        ref_sintetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_sinteticaActionPerformed(evt);
            }
        });
        jPanel2.add(ref_sintetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 50, 20));

        comprar_futbolsala.setText("Comprar");
        comprar_futbolsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar_futbolsalaActionPerformed(evt);
            }
        });
        jPanel2.add(comprar_futbolsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        ref_guayos.setText("123");
        ref_guayos.setEnabled(false);
        ref_guayos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_guayosActionPerformed(evt);
            }
        });
        jPanel2.add(ref_guayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 60, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atleti.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nike.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 110));

        futbolsalatxt.setFont(new java.awt.Font("Forte", 2, 18)); // NOI18N
        futbolsalatxt.setForeground(new java.awt.Color(0, 0, 0));
        futbolsalatxt.setText("  futbol sala");
        jPanel2.add(futbolsalatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 120, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nikeee.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 140, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guayos.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 130, 110));

        Anterior_pag.setText("pagina anterior");
        Anterior_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior_pagActionPerformed(evt);
            }
        });
        jPanel2.add(Anterior_pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teniguayo.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 110));

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
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 850, 520));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio_sinteticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_sinteticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_sinteticaActionPerformed

    private void precio_atletismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_atletismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_atletismoActionPerformed

    private void precio_caminataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_caminataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_caminataActionPerformed

    private void precio_futbolsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_futbolsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_futbolsalaActionPerformed

    private void talla_sinteticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_sinteticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_sinteticaActionPerformed

    private void talla_futbolsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_futbolsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_futbolsalaActionPerformed

    private void comprar_guayosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_guayosActionPerformed

        try {

            if (!guayostxt.getText().isEmpty() && !ref_guayos.getText().isEmpty() && !precio_guayos.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = guayostxt.getText();

                v_datos[1] = Short.parseShort(ref_guayos.getText());
                v_datos[2] = Float.parseFloat(precio_guayos.getText());
                v_datos[3] = talla_guayos.getSelectedItem();

                modelo_tennis.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }


    }//GEN-LAST:event_comprar_guayosActionPerformed

    private void ref_guayosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_guayosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_guayosActionPerformed

    private void ref_sinteticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_sinteticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_sinteticaActionPerformed

    private void eliminar_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_filaActionPerformed
        // TODO add your handling code here:
        try {

            int verificar, fila_sel = -1;

            fila_sel = Tabla_Tennis.getSelectedRow();//a la fila elecccionada digame cual fila esta ahi

            if (fila_sel == -1) {
                JOptionPane.showMessageDialog(null, "\n debe seleccionae fila para eliminar \n"); //no ha seleccionado nada
            } else {
                verificar = JOptionPane.showConfirmDialog(null, "\n esta seguro de remover la fila seleccionada? \n");
                if (verificar == JOptionPane.YES_OPTION) {
                    modelo_tennis.removeRow(fila_sel); //remuva la seleccionada
                }
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "\n se presento un error eliminando el registro de la tabla \n" + error);
        }


    }//GEN-LAST:event_eliminar_filaActionPerformed

    private void agregar_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_carritoActionPerformed
        // TODO add your handling code here:

        try {
            for (int i = 0; i < Tabla_Tennis.getRowCount(); i++) {

                Datos[0] = Tabla_Tennis.getValueAt(i, 0).toString();
                Datos[1] = Tabla_Tennis.getValueAt(i, 1).toString();
                Datos[2] = Tabla_Tennis.getValueAt(i, 2).toString();
                Datos[3] = Tabla_Tennis.getValueAt(i, 3).toString();

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

        modelo_tennis = new DefaultTableModel();
        Tabla_Tennis.setModel(modelo_tennis);

    }

    private void comprar_atletismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_atletismoActionPerformed
        // TODO add your handling code here:

        try {

            if (!atletismotxt.getText().isEmpty() && !ref_atletismo.getText().isEmpty() && !precio_atletismo.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = atletismotxt.getText();
                v_datos[1] = Short.parseShort(ref_atletismo.getText());
                v_datos[2] = Float.parseFloat(precio_atletismo.getText());
                v_datos[3] = talla_atletismo.getSelectedItem();

                modelo_tennis.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_atletismoActionPerformed

    private void comprar_caminataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_caminataActionPerformed
        // TODO add your handling code here:
        try {

            if (!caminata.getText().isEmpty() && !ref_caminata.getText().isEmpty() && !precio_caminata.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = caminata.getText();
                v_datos[1] = Short.parseShort(ref_caminata.getText());
                v_datos[2] = Float.parseFloat(precio_caminata.getText());
                v_datos[3] = talla_caminata.getSelectedItem();

                modelo_tennis.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }

    }//GEN-LAST:event_comprar_caminataActionPerformed

    private void comprar_futbolsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_futbolsalaActionPerformed
        // TODO add your handling code here:

        try {

            if (!futbolsalatxt.getText().isEmpty() && !ref_futbolsala.getText().isEmpty() && !precio_futbolsala.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = futbolsalatxt.getText();
                v_datos[1] = Short.parseShort(ref_futbolsala.getText());
                v_datos[2] = Float.parseFloat(precio_futbolsala.getText());
                v_datos[3] = talla_futbolsala.getSelectedItem();

                modelo_tennis.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_futbolsalaActionPerformed

    private void comprar_sinteticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar_sinteticaActionPerformed
        // TODO add your handling code here:

        try {

            if (!sinteticatxt.getText().isEmpty() && !ref_sintetica.getText().isEmpty() && !precio_sintetica.getText().isEmpty()) { //si el campos estan vacios

                v_datos[0] = sinteticatxt.getText();
                v_datos[1] = Short.parseShort(ref_sintetica.getText());
                v_datos[2] = Float.parseFloat(precio_sintetica.getText());
                v_datos[3] = talla_sintetica.getSelectedItem();

                modelo_tennis.addRow(v_datos); //me deja agregarle un vector 

            } else {
                JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");

            }

        } catch (Exception error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_comprar_sinteticaActionPerformed

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
            java.util.logging.Logger.getLogger(Tennis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tennis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tennis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tennis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tennis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior_pag;
    private javax.swing.JTable Tabla_Tennis;
    private javax.swing.JButton agregar_carrito;
    private javax.swing.JLabel atletismotxt;
    private javax.swing.JLabel caminata;
    private javax.swing.JButton comprar_atletismo;
    private javax.swing.JButton comprar_caminata;
    private javax.swing.JButton comprar_futbolsala;
    private javax.swing.JButton comprar_guayos;
    private javax.swing.JButton comprar_sintetica;
    private javax.swing.JButton eliminar_fila;
    private javax.swing.JLabel futbolsalatxt;
    private javax.swing.JLabel guayostxt;
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
    private javax.swing.JTextField precio_atletismo;
    private javax.swing.JTextField precio_caminata;
    private javax.swing.JTextField precio_futbolsala;
    private javax.swing.JTextField precio_guayos;
    private javax.swing.JTextField precio_sintetica;
    private javax.swing.JTextField ref_atletismo;
    private javax.swing.JTextField ref_caminata;
    private javax.swing.JTextField ref_futbolsala;
    private javax.swing.JTextField ref_guayos;
    private javax.swing.JTextField ref_sintetica;
    private javax.swing.JLabel sinteticatxt;
    private javax.swing.JComboBox<String> talla_atletismo;
    private javax.swing.JComboBox<String> talla_caminata;
    private javax.swing.JComboBox<String> talla_futbolsala;
    private javax.swing.JComboBox<String> talla_guayos;
    private javax.swing.JComboBox<String> talla_sintetica;
    // End of variables declaration//GEN-END:variables
}

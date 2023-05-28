package tienda_deportiva;

import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compras extends javax.swing.JFrame {

    private static DefaultTableModel modelo_compras;//me define la taba
    private static final String[] Filas = new String[4];
    private static boolean login;

    public Compras() {
        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
        this.setResizable(false); // no agrandar pagina 

        modelo_compras = (DefaultTableModel) Tabla_Compras.getModel(); //se castea       
        Tabla_Compras.setModel(modelo_compras);

    }

    /*
    * Metodos Usados en esta clase
     */
    public void limpiar_tabla() {
        modelo_compras = new DefaultTableModel();
        Tabla_Compras.setModel(modelo_compras);
    }

    private float calcularTotalfactura() {
        float sumar = 0;
        for (int i = 0; i < Tabla_Compras.getRowCount(); i++) {
            String datoSuma = Tabla_Compras.getValueAt(i, 2).toString();
            sumar += Float.parseFloat(datoSuma);
        }
        return sumar;
    }

    private float calcularDescuento(float total) {
        if (ClienteRegistrado.getSelectedItem().equals("NO")) {
            return 0;
        } else {
            return (float) (total * 0.05);
        }
    }

    private float calcularTotal() {
        float sumar = 0;
        for (int i = 0; i < Tabla_Compras.getRowCount(); i++) {
            String datoSuma = Tabla_Compras.getValueAt(i, 2).toString();
            sumar += Float.parseFloat(datoSuma);
        }
        return sumar;
    }

    private float calcularIVA(float total) {
        return (float) (total * 0.19);
    }
    
    /*
    * Metodos Usados en esta clase
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodopago = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        efectivo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ClienteRegistrado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        comprador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        psswd = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        generar_factura = new javax.swing.JButton();
        tarjeta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        comprador1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ClienteRegistrado1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        psswd1 = new javax.swing.JPasswordField();
        generar_factura1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        efectivo1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Ncuotas = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        generar_factura2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        comprador3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Compras = new javax.swing.JTable();
        seguir_comprando = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        metodopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta_Debito", "Tarjeta_Credito", "Credito_Almacen" }));
        metodopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodopagoActionPerformed(evt);
            }
        });

        jLabel4.setText("METODOS DE PAGO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));

        efectivo.setBackground(new java.awt.Color(255, 255, 255));
        efectivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre del Comprador");
        efectivo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 28));

        ClienteRegistrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ClienteRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteRegistradoActionPerformed(evt);
            }
        });
        efectivo.add(ClienteRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 80, -1));

        jLabel7.setText("Ciente Registrado:");
        efectivo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1234.png"))); // NOI18N
        efectivo.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 380, 120));

        comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compradorActionPerformed(evt);
            }
        });
        efectivo.add(comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, -1));

        jLabel8.setText("Usuario");
        efectivo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 30));

        jLabel9.setText("Contraseña");
        efectivo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 30));
        efectivo.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 230, -1));
        efectivo.add(psswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 230, -1));
        efectivo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 36, 25, -1));

        generar_factura.setText("Generar Factura");
        generar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_facturaActionPerformed(evt);
            }
        });
        efectivo.add(generar_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 140, 40));

        jTabbedPane1.addTab("Efectivo", efectivo);

        tarjeta.setBackground(new java.awt.Color(255, 255, 255));
        tarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Nombre del Comprador");
        tarjeta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 28));

        comprador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprador1ActionPerformed(evt);
            }
        });
        tarjeta.add(comprador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 250, -1));

        jLabel12.setText("CLIENTE REGISTRADO:");
        tarjeta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 20));

        ClienteRegistrado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ClienteRegistrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteRegistrado1ActionPerformed(evt);
            }
        });
        tarjeta.add(ClienteRegistrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, -1));

        jLabel13.setText("Usuario");
        tarjeta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 20));

        jLabel14.setText("Contraseña");
        tarjeta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 20));
        tarjeta.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, -1));
        tarjeta.add(psswd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 250, -1));

        generar_factura1.setText("Generar Factura");
        generar_factura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_factura1ActionPerformed(evt);
            }
        });
        tarjeta.add(generar_factura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 140, 40));

        jLabel5.setText("Numero de la tarjeta");
        tarjeta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 20));

        jLabel15.setText("Fecha de Expiracion");
        tarjeta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 20));

        jLabel16.setText("Codigo de Seguridad");
        tarjeta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        tarjeta.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 240, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        tarjeta.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        tarjeta.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 80, -1));
        tarjeta.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 80, -1));

        jLabel17.setText("MM");
        tarjeta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 20));

        jLabel18.setText("AA");
        tarjeta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 50, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visa.png"))); // NOI18N
        tarjeta.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 70));

        jTabbedPane1.addTab("Debito/Credito", tarjeta);

        efectivo1.setBackground(new java.awt.Color(255, 255, 255));
        efectivo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Nombre del Comprador");
        efectivo1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 28));

        Ncuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "6", "12" }));
        Ncuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NcuotasActionPerformed(evt);
            }
        });
        efectivo1.add(Ncuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1234.png"))); // NOI18N
        efectivo1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 380, 120));

        jLabel21.setText("Numero de Cedula:");
        efectivo1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 20));

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        efectivo1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 230, -1));
        efectivo1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 36, 25, -1));

        generar_factura2.setText("Generar Factura");
        generar_factura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_factura2ActionPerformed(evt);
            }
        });
        efectivo1.add(generar_factura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 140, 40));

        jLabel22.setText("Numero Cuotas:");
        efectivo1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, 20));

        comprador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprador3ActionPerformed(evt);
            }
        });
        efectivo1.add(comprador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 230, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(efectivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(efectivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("CreditoAlmacen", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 450, 470));

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tabla_Compras.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Tabla_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "producto", "referencia", "precio", "talla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Compras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tabla_Compras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla_Compras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(Tabla_Compras);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 500, 400));

        seguir_comprando.setText("Seguir Comprando");
        seguir_comprando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguir_comprandoActionPerformed(evt);
            }
        });
        jPanel1.add(seguir_comprando, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 130, 40));

        eliminar.setText("eliminar fila");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, 40));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Carrito");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 160, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 2, 24)); // NOI18N
        jLabel2.setText("Carrito");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_backg.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:

        try {

            int verificar, eliminar = -1;

            eliminar = Tabla_Compras.getSelectedRow();//a la fila selecccionada digame cual fila esta ahi

            if (eliminar == -1) {
                JOptionPane.showMessageDialog(null, "\n debe seleccionae fila para eliminar \n"); //no ha seleccionado nada
            } else {
                verificar = JOptionPane.showConfirmDialog(null, "\n esta seguro de remover la fila seleccionada? \n");
                if (verificar == JOptionPane.YES_OPTION) {
                    modelo_compras.removeRow(eliminar); //remuva la seleccionada
                }
            }

        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(null, "\n se presento un error eliminando el registro de la tabla \n" + error);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void seguir_comprandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguir_comprandoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_seguir_comprandoActionPerformed

    private void ClienteRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteRegistradoActionPerformed
    }//GEN-LAST:event_ClienteRegistradoActionPerformed

    private void compradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compradorActionPerformed
    }//GEN-LAST:event_compradorActionPerformed

    private void metodopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodopagoActionPerformed
    }//GEN-LAST:event_metodopagoActionPerformed

    private void generar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_facturaActionPerformed
        String compradorNombre = comprador.getText();
        if (compradorNombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos. Si no está registrado, por favor llene los campos vacíos.");
            return;
        }

        Factura tabla = new Factura();
        tabla.setVisible(true);
        this.setVisible(false);

        Factura.Nombre.setText(compradorNombre);
        Factura.InfoCliente.setText((String) ClienteRegistrado.getSelectedItem());
        Factura.modopago.setText("Efectivo");
        Factura.numerocuotas.setText("NO APLICA");
        Factura.valorcuota.setText("NO APLICA");

        float sumar = calcularTotalfactura();
        float descuento = calcularDescuento(sumar);
        float iva = 0; // Calcula el IVA según sea necesario
        float totalPagar = sumar - descuento + iva;

        Factura.Total.setText(String.valueOf(sumar));
        Factura.descuento.setText(String.valueOf(descuento));
        Factura.Total_Pagar.setText(String.valueOf(totalPagar));

    }//GEN-LAST:event_generar_facturaActionPerformed

    private void comprador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprador1ActionPerformed

    private void ClienteRegistrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteRegistrado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteRegistrado1ActionPerformed

    private void generar_factura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_factura1ActionPerformed
        Factura tabla = new Factura();
        String datosuma = "";
        float sumar = 0;
        float descuento = 0;
        float sumastotales = 0;
        float iva = 0;

        try {

            if (!comprador1.getText().isEmpty())//si el campos estan vacios y lo niego
            {
                Factura.Nombre.setText(comprador1.getText());
                Factura.InfoCliente.setText((String) ClienteRegistrado.getSelectedItem());
                Factura.modopago.setText("Tarjeta");
                Factura.numerocuotas.setText("NO APLICA");
                Factura.valorcuota.setText("NO APLICA");

                for (int i = 0; i < Tabla_Compras.getRowCount(); i++) {

                    Filas[0] = Tabla_Compras.getValueAt(i, 0).toString();
                    Filas[1] = Tabla_Compras.getValueAt(i, 1).toString();
                    Filas[2] = Tabla_Compras.getValueAt(i, 2).toString();
                    Filas[3] = Tabla_Compras.getValueAt(i, 3).toString();
                    Factura.modelo_Factura.addRow(Filas);
                }

                for (int i = 0; i < Tabla_Compras.getRowCount(); i++) {
                    datosuma = Tabla_Compras.getValueAt(i, 2).toString();
                    sumar += Float.parseFloat(datosuma);
                }

                Factura.Total.setText(String.valueOf(sumar));

                if (sumar >= 0) {
                    iva = (float) (sumar * 0.19);
                    Factura.Iva.setText(String.valueOf(iva));

                } else {
                    JOptionPane.showMessageDialog(null, "\n error calculando iva \n");
                }

                if (ClienteRegistrado1.getSelectedItem() == "NO") {

                    float sumando = 0;

                    //no tiene descuento
                    sumando = iva + sumar;
                    Factura.Total_Pagar.setText(String.valueOf(sumando));

                } else {
                    try {
                        //Lee los archivos de la base de datos de usuarios            
                        FileReader file_user = new FileReader("D:\\WorkSpace\\P_Final\\src\\base_datos\\user.txt");
                        BufferedReader dat_user = new BufferedReader(file_user);

                        String linea = "";
                        String usuario = user1.getText();
                        String contra = psswd1.getText();
                        linea = dat_user.readLine();

                        if (usuario.isEmpty() || contra.isEmpty()) {  //Comprobamos que los campos no esten vacios
                            JOptionPane.showMessageDialog(null, "Alguno de los campos esta vacio");
                        } else {
                            while (linea != null && login == false) {
                                String usuario_db = "";
                                String contra_db = "";
                                String[] parts = new String[1];
                                parts = linea.split(";");
                                usuario_db = parts[0];
                                contra_db = parts[1];
                                if ((contra.equals(contra_db) && usuario.equals(usuario_db)) == true) {
                                    login = true;
                                }
                                linea = dat_user.readLine();

                            }
                            if (login == true) {
                                JOptionPane.showMessageDialog(null, "Inicio sesion correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario no existe o Contraseña Incorrecta");
                            }

                        }
                        dat_user.close();
                    } catch (IOException error) {

                        System.out.println("\nSe presento un error iniciando sesion \n" + error);

                    }
                    descuento = (float) (sumar * 0.03);
                }

                //descuento 5% por ser cliente
                Factura.descuento.setText(String.valueOf(descuento));
                sumastotales = iva + (sumar - descuento);
                Factura.Total_Pagar.setText(String.valueOf(sumastotales)); //puedo hacer esto en lo otro

                tabla.setVisible(true);
                this.setVisible(false);
                limpiar_tabla();//limpiar campos

            } else {
                JOptionPane.showMessageDialog(null, "Campos vacios");
            }

        } catch (HeadlessException | NumberFormatException error) {
            System.out.println("\n se presento un error \n" + error);
        }
    }//GEN-LAST:event_generar_factura1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void NcuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NcuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NcuotasActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void generar_factura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_factura2ActionPerformed
        String compradorCedula = cedula.getText();
        if (comprador3.getText().isEmpty() || compradorCedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos");
            return;
        }

        Factura tabla = new Factura();
        tabla.setVisible(true);
        this.setVisible(false);

        Factura.Nombre.setText(compradorCedula);
        Factura.descuento.setText("NO APLICA");
        Factura.InfoCliente.setText((String) ClienteRegistrado.getSelectedItem());
        Factura.modopago.setText("Credito_Almacen");
        Factura.numerocuotas.setText((String) Ncuotas.getSelectedItem());

        for (int i = 0; i < Tabla_Compras.getRowCount(); i++) {
            String[] filas = new String[4];
            for (int j = 0; j < 4; j++) {
                filas[j] = Tabla_Compras.getValueAt(i, j).toString();
            }
            Factura.modelo_Factura.addRow(filas);
        }

        float sumar = calcularTotal();
        float iva = calcularIVA(sumar);

        Factura.Total.setText(String.valueOf(sumar));
        Factura.Iva.setText(String.valueOf(iva));

        float totalPagar = sumar + iva;
        Factura.Total_Pagar.setText(String.valueOf(totalPagar));

        int numCuotas = Integer.parseInt((String) Ncuotas.getSelectedItem());
        float credito = totalPagar / numCuotas;
        float cuota = (float) (credito + (credito * 0.12));
        Factura.valorcuota.setText(String.valueOf(cuota));

        limpiar_tabla();
    }//GEN-LAST:event_generar_factura2ActionPerformed


    private void comprador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprador3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Compras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ClienteRegistrado;
    public static javax.swing.JComboBox<String> ClienteRegistrado1;
    public static javax.swing.JComboBox<String> Ncuotas;
    private javax.swing.JTable Tabla_Compras;
    public static javax.swing.JTextField cedula;
    public static javax.swing.JTextField comprador;
    public static javax.swing.JTextField comprador1;
    public static javax.swing.JTextField comprador3;
    private javax.swing.JPanel efectivo;
    private javax.swing.JPanel efectivo1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton generar_factura;
    private javax.swing.JButton generar_factura1;
    private javax.swing.JButton generar_factura2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JComboBox<String> metodopago;
    private javax.swing.JPasswordField psswd;
    private javax.swing.JPasswordField psswd1;
    private javax.swing.JButton seguir_comprando;
    private javax.swing.JPanel tarjeta;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}

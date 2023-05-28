package tienda_deportiva;

import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Ropa extends javax.swing.JFrame {

    private static final Object[] v_datos = new Object[4];
    private static final String Datos[] = new String[4];
    private static DefaultTableModel modelo_ropa;

    public Ropa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setExtendedState(NORMAL);
        modelo_ropa = (DefaultTableModel) Tabla_Ropa.getModel();
        Tabla_Ropa.setModel(modelo_ropa);
    }
    
    
    
    /*
    * Metodos Usados en esta clase
     */
    private void agregarItemALaTabla(String tipo, String prenda, short ref, float precio, String talla) {

        // Comprobar si todos los campos están vacíos
        if (prenda.isEmpty() || ref < 0 || precio < 0 || talla.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");
            return;
        }

        // Agrega los datos al modelo de tabla
        modelo_ropa.addRow(new Object[]{tipo, prenda, ref, precio, talla});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ropa = new javax.swing.JTable();
        Anterior_pag = new javax.swing.JButton();
        agregar_carrito = new javax.swing.JButton();
        eliminar_fila = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pShort = new javax.swing.JPanel();
        fotoShortDama = new javax.swing.JLabel();
        shor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precio_short = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ref_short = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        talla_short = new javax.swing.JComboBox<>();
        comShort = new javax.swing.JButton();
        pCamisaS = new javax.swing.JPanel();
        camisaS = new javax.swing.JLabel();
        fotoCamiseta = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        precio_camisasport = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ref_camisasport = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        talla_camisasport = new javax.swing.JComboBox<>();
        comCamisaS = new javax.swing.JButton();
        pConjuntoD = new javax.swing.JPanel();
        camisaD = new javax.swing.JLabel();
        fotoConjDep = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        precio_conjuntodeportivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        talla_conjuntodeportivo = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        ref_conjuntordeportivo = new javax.swing.JTextField();
        comConjuntoD = new javax.swing.JButton();
        pBikers = new javax.swing.JPanel();
        bike = new javax.swing.JLabel();
        fotoBikers = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        precio_bikers = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ref_bikers = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        talla_bikers = new javax.swing.JComboBox<>();
        comBiker = new javax.swing.JButton();
        pCamisaR = new javax.swing.JPanel();
        camisaR = new javax.swing.JLabel();
        fotoCamisaRlx = new javax.swing.JLabel();
        talla_camisarelax = new javax.swing.JComboBox<>();
        precio_camisarelax = new javax.swing.JTextField();
        ref_camisarelax = new javax.swing.JTextField();
        comCamisaR = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_backg.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 38, 38));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(1017, 584));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("                                              ROPA");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 0), new java.awt.Color(102, 0, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 630, 41));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 90));

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));
        jPanel3.setMaximumSize(new java.awt.Dimension(890, 290));
        jPanel3.setMinimumSize(new java.awt.Dimension(890, 290));
        jPanel3.setPreferredSize(new java.awt.Dimension(890, 290));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 910, 110));

        Anterior_pag.setText("Volver");
        Anterior_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior_pagActionPerformed(evt);
            }
        });
        jPanel3.add(Anterior_pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 260, 30));

        agregar_carrito.setText("Agregar al carrito");
        agregar_carrito.setActionCommand("");
        agregar_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_carritoActionPerformed(evt);
            }
        });
        jPanel3.add(agregar_carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 290, 30));

        eliminar_fila.setText("Eliminar Producto");
        eliminar_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_filaActionPerformed(evt);
            }
        });
        jPanel3.add(eliminar_fila, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 300, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1000, 180));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(890, 290));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pShort.setBackground(new java.awt.Color(38, 38, 38));
        pShort.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoShortDama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ropita.png"))); // NOI18N
        pShort.add(fotoShortDama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 120));

        shor.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        shor.setForeground(new java.awt.Color(255, 255, 255));
        shor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shor.setText("Short Dama");
        pShort.add(shor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO:");
        pShort.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        precio_short.setEditable(false);
        precio_short.setText("35000");
        precio_short.setEnabled(false);
        pShort.add(precio_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 30));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("REF:");
        pShort.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        ref_short.setEditable(false);
        ref_short.setText("243");
        ref_short.setEnabled(false);
        ref_short.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_shortActionPerformed(evt);
            }
        });
        pShort.add(ref_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA:");
        pShort.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        talla_short.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_short.setToolTipText("TALLA");
        pShort.add(talla_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 20));

        comShort.setText("Comprar");
        comShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comShortActionPerformed(evt);
            }
        });
        pShort.add(comShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        jPanel2.add(pShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 300));

        pCamisaS.setBackground(new java.awt.Color(38, 38, 38));
        pCamisaS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camisaS.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        camisaS.setForeground(new java.awt.Color(255, 255, 255));
        camisaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaS.setText("Camisa Sport");
        pCamisaS.add(camisaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        fotoCamiseta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisa2.png"))); // NOI18N
        pCamisaS.add(fotoCamiseta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO:");
        pCamisaS.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        precio_camisasport.setText("55000");
        precio_camisasport.setEnabled(false);
        precio_camisasport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_camisasportActionPerformed(evt);
            }
        });
        pCamisaS.add(precio_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 60, 30));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REF:");
        pCamisaS.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 20));

        ref_camisasport.setText("566");
        ref_camisasport.setEnabled(false);
        pCamisaS.add(ref_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TALLA:");
        pCamisaS.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        talla_camisasport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_camisasport.setToolTipText("TALLA");
        pCamisaS.add(talla_camisasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 20));

        comCamisaS.setText("Comprar");
        comCamisaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCamisaSActionPerformed(evt);
            }
        });
        pCamisaS.add(comCamisaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        jPanel2.add(pCamisaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 160, 300));

        pConjuntoD.setBackground(new java.awt.Color(38, 38, 38));
        pConjuntoD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camisaD.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        camisaD.setForeground(new java.awt.Color(255, 255, 255));
        camisaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaD.setText("Conjunto Deportivo");
        pConjuntoD.add(camisaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        fotoConjDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conjunto.png"))); // NOI18N
        pConjuntoD.add(fotoConjDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PRECIO:");
        pConjuntoD.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        precio_conjuntodeportivo.setText("60000");
        precio_conjuntodeportivo.setEnabled(false);
        precio_conjuntodeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_conjuntodeportivoActionPerformed(evt);
            }
        });
        pConjuntoD.add(precio_conjuntodeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 30));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TALLA:");
        pConjuntoD.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 20));

        talla_conjuntodeportivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_conjuntodeportivo.setToolTipText("TALLA");
        talla_conjuntodeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_conjuntodeportivoActionPerformed(evt);
            }
        });
        pConjuntoD.add(talla_conjuntodeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 60, 20));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("REF:");
        pConjuntoD.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        ref_conjuntordeportivo.setText("876");
        ref_conjuntordeportivo.setEnabled(false);
        pConjuntoD.add(ref_conjuntordeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 60, 30));

        comConjuntoD.setText("Comprar");
        comConjuntoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comConjuntoDActionPerformed(evt);
            }
        });
        pConjuntoD.add(comConjuntoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        jPanel2.add(pConjuntoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 160, 300));

        pBikers.setBackground(new java.awt.Color(38, 38, 38));
        pBikers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bike.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        bike.setForeground(new java.awt.Color(255, 255, 255));
        bike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bike.setText("bikers");
        pBikers.add(bike, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        fotoBikers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leggi.png"))); // NOI18N
        pBikers.add(fotoBikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO:");
        pBikers.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        precio_bikers.setText("25000");
        precio_bikers.setEnabled(false);
        precio_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_bikersActionPerformed(evt);
            }
        });
        pBikers.add(precio_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 30));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("REF:");
        pBikers.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 20));

        ref_bikers.setText("632");
        ref_bikers.setEnabled(false);
        ref_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_bikersActionPerformed(evt);
            }
        });
        pBikers.add(ref_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TALLA:");
        pBikers.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        talla_bikers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_bikers.setToolTipText("TALLA");
        talla_bikers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talla_bikersActionPerformed(evt);
            }
        });
        pBikers.add(talla_bikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 20));

        comBiker.setText("Comprar");
        comBiker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBikerActionPerformed(evt);
            }
        });
        pBikers.add(comBiker, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        jPanel2.add(pBikers, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 170, 300));

        pCamisaR.setBackground(new java.awt.Color(38, 38, 38));
        pCamisaR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camisaR.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        camisaR.setForeground(new java.awt.Color(255, 255, 255));
        camisaR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camisaR.setText("Camisa Relax");
        pCamisaR.add(camisaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        fotoCamisaRlx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisa.png"))); // NOI18N
        pCamisaR.add(fotoCamisaRlx, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        talla_camisarelax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        talla_camisarelax.setToolTipText("TALLA");
        pCamisaR.add(talla_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 20));

        precio_camisarelax.setText("48000");
        precio_camisarelax.setEnabled(false);
        precio_camisarelax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_camisarelaxActionPerformed(evt);
            }
        });
        pCamisaR.add(precio_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 30));

        ref_camisarelax.setText("211");
        ref_camisarelax.setEnabled(false);
        pCamisaR.add(ref_camisarelax, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, 30));

        comCamisaR.setText("Comprar");
        comCamisaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCamisaRActionPerformed(evt);
            }
        });
        pCamisaR.add(comCamisaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PRECIO:");
        pCamisaR.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TALLA:");
        pCamisaR.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("REF:");
        pCamisaR.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jPanel2.add(pCamisaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 160, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_bikersActionPerformed
    }//GEN-LAST:event_precio_bikersActionPerformed

    private void precio_camisasportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_camisasportActionPerformed
    }//GEN-LAST:event_precio_camisasportActionPerformed

    private void precio_camisarelaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_camisarelaxActionPerformed
    }//GEN-LAST:event_precio_camisarelaxActionPerformed

    private void precio_conjuntodeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_conjuntodeportivoActionPerformed
    }//GEN-LAST:event_precio_conjuntodeportivoActionPerformed

    private void talla_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_bikersActionPerformed
    }//GEN-LAST:event_talla_bikersActionPerformed

    private void talla_conjuntodeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talla_conjuntodeportivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talla_conjuntodeportivoActionPerformed

    private void comShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comShortActionPerformed

        // Check if all fields are not empty
        if (shor.getText().isEmpty() || ref_short.getText().isEmpty() || precio_short.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "\n por favor revice los datos \n");
            return;
        }

        // Get the data from the fields
        String shortName = shor.getText();
        short referenceId = Short.parseShort(ref_short.getText());
        float price = Float.parseFloat(precio_short.getText());
        String size = talla_short.getSelectedItem().toString();

        // Add the data to the model
        modelo_ropa.addRow(new Object[]{shortName, referenceId, price, size});
    }//GEN-LAST:event_comShortActionPerformed

    private void ref_shortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_shortActionPerformed
    }//GEN-LAST:event_ref_shortActionPerformed

    private void ref_bikersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_bikersActionPerformed
    }//GEN-LAST:event_ref_bikersActionPerformed

    private void eliminar_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_filaActionPerformed
        // Check if a row is selected
        int row = Tabla_Ropa.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "\n Debe seleccionae fila para eliminar \n");
            return;
        }

        // Confirm with the user if they want to delete the row
        int confirm = JOptionPane.showConfirmDialog(null, "\n Esta seguro de remover la fila seleccionada? \n");
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Remove the row from the model
        modelo_ropa.removeRow(row);
    }//GEN-LAST:event_eliminar_filaActionPerformed

    private void agregar_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_carritoActionPerformed

        Object[][] data = new Object[Tabla_Ropa.getRowCount()][Tabla_Ropa.getColumnCount()];
        for (int i = 0; i < Tabla_Ropa.getRowCount(); i++) {
            for (int j = 0; j < Tabla_Ropa.getColumnCount(); j++) {
                data[i][j] = Tabla_Ropa.getValueAt(i, j);
            }
        }
        for (Object[] row : data) {
            Compras.modelo_compras.addRow(row);
        }

        limpiar_tabla();
        this.setVisible(false);
    }//GEN-LAST:event_agregar_carritoActionPerformed

    public void limpiar_tabla() {
        modelo_ropa = new DefaultTableModel();
        Tabla_Ropa.setModel(modelo_ropa);
    }

    private void comCamisaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCamisaSActionPerformed
        agregarItemALaTabla("Camisa Sport", camisaS.getText(), Short.parseShort(ref_camisasport.getText()), Float.parseFloat(precio_camisasport.getText()), talla_camisasport.getSelectedItem().toString());
    }//GEN-LAST:event_comCamisaSActionPerformed

    private void comCamisaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCamisaRActionPerformed
        agregarItemALaTabla("Camisa Relax", camisaR.getText(), Short.parseShort(ref_camisarelax.getText()), Float.parseFloat(precio_camisarelax.getText()), talla_camisarelax.getSelectedItem().toString());
    }//GEN-LAST:event_comCamisaRActionPerformed

    private void comConjuntoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comConjuntoDActionPerformed
        agregarItemALaTabla("Conjunto Deportivo", camisaD.getText(), Short.parseShort(ref_conjuntordeportivo.getText()), Float.parseFloat(precio_conjuntodeportivo.getText()), talla_conjuntodeportivo.getSelectedItem().toString());
    }//GEN-LAST:event_comConjuntoDActionPerformed

    private void comBikerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBikerActionPerformed
        agregarItemALaTabla("Biker", bike.getText(), Short.parseShort(ref_bikers.getText()), Float.parseFloat(precio_bikers.getText()), talla_bikers.getSelectedItem().toString());
    }//GEN-LAST:event_comBikerActionPerformed

    private void Anterior_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior_pagActionPerformed
        this.setVisible(false);
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
    private javax.swing.JButton comBiker;
    private javax.swing.JButton comCamisaR;
    private javax.swing.JButton comCamisaS;
    private javax.swing.JButton comConjuntoD;
    private javax.swing.JButton comShort;
    private javax.swing.JButton eliminar_fila;
    private javax.swing.JLabel fotoBikers;
    private javax.swing.JLabel fotoCamisaRlx;
    private javax.swing.JLabel fotoCamiseta;
    private javax.swing.JLabel fotoConjDep;
    private javax.swing.JLabel fotoShortDama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBikers;
    private javax.swing.JPanel pCamisaR;
    private javax.swing.JPanel pCamisaS;
    private javax.swing.JPanel pConjuntoD;
    private javax.swing.JPanel pShort;
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

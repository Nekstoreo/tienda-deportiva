package tienda_deportiva;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;

import org.jfree.data.general.DefaultPieDataset;

public class Ventas extends javax.swing.JFrame {

    public Ventas() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargar();
    }

    private void cargar() {
        String[] columnNames = {"Fecha", "Comprador", "Cliente", "Metodo de pago", "Nro Cuotas", "Valor cuota", "Pago total"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        try (BufferedReader dat = new BufferedReader(new FileReader("src/base_datos/registro_ventas.txt"))) {
            String linea = "";
            while ((linea = dat.readLine()) != null) {
                if (!linea.isBlank()) {
                    String[] registro = linea.split(";");
                    model.addRow(registro);
                }
            }
        } catch (IOException error) {
            System.out.println("\nSe presento un error\n" + error);
        }
        Tabla.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        registro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        grafica = new javax.swing.JPanel();
        generar = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estadistica de Ventas");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(102, 255, 255)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 380, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_head (2).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1020, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/main/main_bg_wide_foot.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1030, 70));

        registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null}
                },
                new String[]{
                    "Fecha", "Comprador", "Cliente", "Metodo de pago", "Nro Cuotas", "Valor Cuota", "Pago total"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        registro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 330));

        jTabbedPane1.addTab("Registro de Ventas", registro);

        grafica.setLayout(new java.awt.BorderLayout());

        generar.setText("Click para generar grafica");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        grafica.add(generar, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Estadisticas", grafica);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 960, 410));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas_backg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 570));

        pack();
    }// </editor-fold>

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            BufferedReader dat_r = new BufferedReader(new FileReader("src/base_datos/registro_ventas.txt"));
            int[] metodosPago = getMetodosPago(dat_r);

            DefaultPieDataset datos = new DefaultPieDataset();
            datos.setValue("Efectivo", metodosPago[0]);
            datos.setValue("Tarjeta", metodosPago[1]);
            datos.setValue("Credito Almacen", metodosPago[2]);
            JFreeChart grafica = ChartFactory.createPieChart(
                    "Metodos de pagos mas usados en la tienda",
                    datos,
                    true,
                    true,
                    false);
            ChartPanel panel = new ChartPanel(grafica);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(900, 380));
            this.grafica.add(panel, BorderLayout.NORTH);
            this.generar.setVisible(false);
            pack();
            repaint();
            for (int pagos : metodosPago){
                System.out.println(pagos);
            }

        } catch (IOException error) {
            System.out.println("\nSe presento un error\n" + error);
        }
    }

    private int[] getMetodosPago(BufferedReader dat_r) throws IOException {
        String linea;
        int efectivo = 0, tarjeta = 0, credito = 0;

        while ((linea = dat_r.readLine()) != null) {
            if (linea.contains("Efectivo")) {
                efectivo++;
            } else if (linea.contains("Tarjeta")) {
                tarjeta++;
            } else if (linea.contains("Credito_Almacen")) {
                credito++;
            }
        }
        return new int[]{efectivo, tarjeta, credito};
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Ventas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel bg;
    private javax.swing.JButton generar;
    private javax.swing.JPanel grafica;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel registro;
    // End of variables declaration//GEN-END:variables
}

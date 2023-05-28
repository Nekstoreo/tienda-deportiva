/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda_deportiva;

import javax.swing.JOptionPane;

/**
 *
 * @author nekstoreo
 */
public class Tienda_Deportiva {

/**
     *
     * Tema 4 Almacén deportivo      *
     * Se requiere diseñar una solución para manejar las ventas de un almacén
     * deportivo. Toda la mercancía tiene un código interno. La mercancía que se
     * tiene es: ropa, tenis, suministros. La tienda tiene sistemas de venta de
     * contado (pago inmediato en efectivo, o con tarjetas débito o crédito) y a
     * crédito (directo por el almacén). Adicionalmente tiene un canal de ventas
     * en internet.      *
     * Las ventas a crédito directamente por el almacén tienen un recargo de 12%
     * y se pueden diferir a 3,6,12 meses.      *
     * Se dice que un cliente es aquel que tiene una cuenta en el almacén y
     * ellos tienen un descuento del 5% en efectivo y 3% en otro medio de pago
     * si pagan de contado.      
     * Se debe ayudar al almacén a manejar la facturación por cualquier canal y
     * a manejar los créditos que tienen los clientes del almacén, conocer a
     * cuántas cuotas se hizo el crédito, cuántas cuotas tiene pagadas, cuántas
     * debe, el valor de las cuotas, si está atrasado o no. El almacén cobra IVA
     * del 19% para todos sus productos.      *
     * Usando la librería JFreechart, se debe tener una gráfica tipo pie (torta)
     * que muestre en porcentaje, de la cantidad de ventas hechas a crédito, con
     * tarjeta y de contado.
     */
    
    
    public static void main(String[] args) {

        try {
            
            Pagina_Principal proyecto_almacen = new Pagina_Principal();
            proyecto_almacen.setVisible(true);

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en el main \n" + error);
        }

    }
    
}

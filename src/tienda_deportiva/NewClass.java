package tienda_deportiva;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewClass {

    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
            try (BufferedReader dat_r = new BufferedReader(
                    new FileReader("src/base_datos/registro_ventas.txt"))) {
                String linea = "";

                short efectivo = 0, tarjeta = 0, credito = 0;

                linea = dat_r.readLine();
                while (linea != null) {
                    if (linea.contains("Efectivo")) {
                        efectivo++;
                    } else if (linea.contains("Tarjeta")) {
                        tarjeta++;
                    } else if (linea.contains("Credito_Almacen")) {
                        credito++;
                    }
                    linea = dat_r.readLine();
                }
                System.out.println(efectivo);
            }

        }
 
}


package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoArchivo {
    public static void crearArchivo(String nombreArchivo){
    File archivo = new File(nombreArchivo);//recibe la ruta del archivo
        try {
            //se utiliza para escribir si existe o crear un archivo si no existe
            PrintWriter salida = new PrintWriter(archivo);
            //cierra el flujo
            salida.close();
            System.out.println("se creo el archivo");
        } catch (FileNotFoundException ex) {
            //muestra la ruta de ejecucion hasta el error del codigo
            ex.printStackTrace(System.out);
        }
    
            
    
    }
}

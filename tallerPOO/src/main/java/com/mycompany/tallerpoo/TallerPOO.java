/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import static com.mycompany.tallerpoo.ManejoArchivos.*;
import static com.mycompany.tallerpoo.Triage.*;
public class TallerPOO {

    public static void main(String[] args) {
        //System.out.println("Hello ksdaodkao!");
        crearArchivo("folder\\Triage.txt");//crea un archivo en el proyecto de net
        //crearArchivo("C:\\JavaArchivos\\hola.txt");//crea un archivo tipo txt en el disco c
        
      escribirArchivo("folder\\Triage.txt", "andara?");
        //escribirArchivo("archivo\\Hola.txt", "Felicidades, anda");asi se le puede subir archivos
        
        //leerArchivo("archivo\\Hola.txt"); //bueno y asi lees todo el contenido de tu archivo- metodo(nombreDeCarpeta, nombredearchivo)
        
        
        
    }
}

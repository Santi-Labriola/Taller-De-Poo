package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import static com.mycompany.tallerpoo.ManejoArchivos.*;

import java.time.*;
import java.util.ArrayList;
import InterfazUsuario.BuscarEstFecha;


public class TallerPOO {

    public static void main(String[] args) {
        //System.out.println("Hello ksdaodkao!");
        //crearArchivo("folder\\Triage.txt");//crea un archivo en el proyecto de net
        //crearArchivo("C:\\JavaArchivos\\hola.txt");//crea un archivo tipo txt en el disco c
        
        //escribirArchivo("folder\\Triage.txt", "andara?");
        //escribirArchivo("archivo\\Hola.txt", "Felicidades, anda");asi se le puede subir archivos
        
        //leerArchivo("archivo\\Hola.txt"); //bueno y asi lees todo el contenido de tu archivo- metodo(nombreDeCarpeta, nombredearchivo)
        
        
        Paciente paci=new Paciente("Lucas Nuñez",LocalDate.of(2022,1,1),"Alegria 123",44092390,4438354,3454343,"Soltero","lucasmagiconunez@gmail.com","Papa de lucas");
        ArrayList lista=ResultadoEstudios.obtenerResultadoEstudios(LocalDate.of(2023,5,10));

        System.out.println(lista);
        BuscarEstFecha abc=new BuscarEstFecha();
        abc.setVisible(true);
        abc.setLocationRelativeTo(null);
    }
}

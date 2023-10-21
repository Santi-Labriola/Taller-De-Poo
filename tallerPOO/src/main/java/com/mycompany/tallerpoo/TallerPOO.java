package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import static com.mycompany.tallerpoo.ManejoArchivos.*;

import java.time.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class TallerPOO {

    public static void main(String[] args) throws IOException {        
       
        //Paciente paci=new Paciente("Lucas Nuñez",LocalDate.of(2022,1,1),"Alegria 123",44092390,4438354,3454343,"Soltero","lucasmagiconunez@gmail.com","Papa de lucas");
        
        
        LocalDate fecha1 = LocalDate.of(2023, 1, 1);
        LocalDate fecha2 = LocalDate.of(2023, 12, 31);
        Triage hola= new Triage();
        ArrayList<Integer> resultado = hola.cantTriagePorFecha(fecha1,fecha2);
        for (int i = 0; i < resultado.size(); i++) {
                System.out.println("Recuento de categoría " + i + ": " + resultado.get(i));
            }
        
        
        
        String barra= File.separator;
        String archivo ="Archivos/Triage.txt";   
        
        ListaTriage prueba = new ListaTriage();
        
        
        
        
        
        prueba.leer(archivo);
        System.out.println(prueba);
        
        ListaPacientes listapaci=new ListaPacientes();
        ListaResEstudios listaresu=new ListaResEstudios();
        ListaAdmisiones listaAdmisiones=new ListaAdmisiones();
        ListaMedicos listamedi=new ListaMedicos();
        ListaEspecialidades listaespe= new ListaEspecialidades();
        ListaMedEsp listamedesp=new ListaMedEsp();
        
        listapaci.leer("Archivos/Pacientes.txt");
        listaresu.leer("Archivos/ResEstudios.txt",listapaci);
        listaAdmisiones.leer("Archivos/Admisiones.txt",listapaci);
        listamedi.leer("Archivos/Medicos.txt");
        listaespe.leer("Archivos/Especialidades.txt",listamedi,listamedesp);
        
        System.out.println(listapaci);
        System.out.println(listamedi);
        
        
        
//        ArrayList lista=ResultadoEstudios.obtenerResultadoEstudios(LocalDate.of(2023,5,10));
//        
//        System.out.println(lista);
//        BuscarEstFecha abc=new BuscarEstFecha();
//        abc.setVisible(true);
//        abc.setLocationRelativeTo(null);
    }
}

package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import static com.mycompany.tallerpoo.ManejoArchivos.*;
//import static com.mycompany.tallerpoo.Triage.cantTriagePorFecha;

import java.time.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class TallerPOO {

    public static void main(String[] args) throws IOException {        
       
        //Paciente paci=new Paciente("Lucas Nuñez",LocalDate.of(2022,1,1),"Alegria 123",44092390,4438354,3454343,"Soltero","lucasmagiconunez@gmail.com","Papa de lucas");
        
        String barra= File.separator;
        String archivo ="Archivos/Triage.txt";   
        
        LocalDate fecha1 = LocalDate.of(2021, 07, 15);
        LocalDate fecha2 = LocalDate.of(2023, 10, 10);
        Triage hola= new Triage();
        ArrayList<Integer> resultado = hola.cantTriagePorFecha(archivo,fecha1,fecha2);
        
            String colour="";    
        for (int i = 0; i < resultado.size(); i++) {
                if (i==0){colour="Rojo";}if (i==1){colour="Naranja";}
                if (i==2){colour="Amarillo";}if (i==3){colour="Verde";}
                if (i==4){colour="Azul";}
                System.out.println
        ("Recuento de categoría " + colour + ": " + resultado.get(i));
            }
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

package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import InterfazUsuario.*;
import static com.mycompany.tallerpoo.ManejoArchivos.*;
import static com.mycompany.tallerpoo.RegistroMedico.calcularMasConsPorFecha;
//import static com.mycompany.tallerpoo.Triage.cantTriagePorFecha;

import java.time.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class TallerPOO {

    public static void main(String[] args) throws IOException {        
       
        //Paciente paci=new Paciente("Lucas Nuñez",LocalDate.of(2022,1,1),"Alegria 123",44092390,4438354,3454343,"Soltero","lucasmagiconunez@gmail.com","Papa de lucas");
        LocalDate fecha1 = LocalDate.of(2021, 7, 15);
        LocalDate fecha2 = LocalDate.of(2023, 10, 24);
       
        String barra= File.separator;
        
        
       /*
        String archivo ="Archivos/Triage.txt";   
        
        
        Triage hola= new Triage();
        Triage opa= new Triage();
 //     ArrayList<Integer> resultado = hola.cantTriagePorFecha(fecha1,fecha2);
        ArrayList<String> res=opa.obtenerTriageCambiadosPorFecha(fecha1,fecha2);
        String colour="";    
        for (int i = 0; i < res.size(); i++) {
                if (i==0){colour="Rojo";}if (i==1){colour="Naranja";}
                if (i==2){colour="Amarillo";}if (i==3){colour="Verde";}
                if (i==4){colour="Azul";}
                System.out.println
        ("Recuento de categoría " + colour + ": " + res.get(i));
            }
        for( int i=0; i<res.size() ;i++){
            System.out.println( res.get(i));}
        
        
       
        ListaTriage prueba = new ListaTriage();
        prueba.leer(archivo);
        System.out.println(prueba);
        */
        ListaPVarias listavarias=new ListaPVarias();
        listavarias.leer("Archivos"+barra+"PacientesVariasConsultas");
        String dniMedico="31382929";
        int numPacientes= RegistroMedico.calcularNumPacDeMedPorFecha(fecha1, fecha2, dniMedico);
        System.out.println("Número de pacientes atendidos por el médico en el rango de fechas: " + numPacientes);
        /*    ArrayList<String> personasConMasConsultas = calcularMasConsPorFecha(fecha1, fecha2);
            for (String dni : personasConMasConsultas) {
                 System.out.println("DNI: " + dni);
                                        }*/
        
            
        ListaPacientes listapaci=new ListaPacientes();
        ListaResEstudios listaresu=new ListaResEstudios();
        ListaAdmisiones listaAdmisiones=new ListaAdmisiones();
        ListaMedicos listamedi=new ListaMedicos();
        ListaEspecialidades listaespe= new ListaEspecialidades();
        ListaMedEsp listamedesp=new ListaMedEsp();
        ListaPacientes listaPaciSinTriage=new ListaPacientes();
        ListaPacientes listaPaciTriageados=new ListaPacientes();
        
        
        listapaci.leer("Archivos/Pacientes.txt");
        listaresu.leer("Archivos/ResEstudios.txt",listapaci);
        listaAdmisiones.leer("Archivos/Admisiones.txt",listapaci);
        listamedi.leer("Archivos/Medicos.txt");
        listaespe.leer("Archivos/Especialidades.txt",listamedi,listamedesp);
        listaPaciSinTriage.leer("Archivos/EnEsperaAlTriage.txt");
        listaPaciTriageados.leer("Archivos/EnEsperaPorAtender.txt");
            
        
        DatosTaller.setPacientes(listapaci);
        DatosTaller.setMedicos(listamedi);
        DatosTaller.setResultados(listaresu);
        DatosTaller.setAdmisiones(listaAdmisiones);
        DatosTaller.setEspecialidades(listaespe);
        
        DatosTaller.setPacientesSinTriage(listaPaciSinTriage);
        DatosTaller.setPacientesTriageados(listaPaciTriageados);
        
        
/*
//        MenuGestorCentro abc=new MenuGestorCentro();
//        abc.setVisible(true);
//        abc.setLocationRelativeTo(null);
//        
//        ArrayList lista=ResultadoEstudios.obtenerResultadoEstudios(LocalDate.of(2023,5,10));
        
//        System.out.println(lista);

        BuscarEstFecha buscar=new BuscarEstFecha();
        buscar.setVisible(true);
        buscar.setLocationRelativeTo(null);
    }
     

*/
    }
}   
package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
import InterfazUsuario.*;
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
        
        LocalDate fecha1 = LocalDate.of(2022, 7, 15);
        LocalDate fecha2 = LocalDate.of(2023, 9, 10);
        Triage hola= new Triage();
        Triage opa= new Triage();
        //ArrayList<Integer> resultado = hola.cantTriagePorFecha(fecha1,fecha2);
        ArrayList<String> res=opa.obtenerTriageCambiadosPorFecha(fecha1,fecha2);
        String colour="";    
        /*for (int i = 0; i < resultado.size(); i++) {
                if (i==0){colour="Rojo";}if (i==1){colour="Naranja";}
                if (i==2){colour="Amarillo";}if (i==3){colour="Verde";}
                if (i==4){colour="Azul";}
                System.out.println
        ("Recuento de categoría " + colour + ": " + resultado.get(i));
            }*/
       /* for( int i=0; i<res.size() ;i++){
            System.out.println( res.get(i));}
        */
       
        /*ListaTriage prueba = new ListaTriage();
        prueba.leer(archivo);
        System.out.println(prueba);*/

        ListaPVarias listavarias=new ListaPVarias();
        
        ListaPacientes listapaci=new ListaPacientes();
        ListaResEstudios listaresu=new ListaResEstudios();
        ListaAdmisiones listaAdmisiones=new ListaAdmisiones();
        ListaMedicos listamedi=new ListaMedicos();
        ListaEspecialidades listaespe= new ListaEspecialidades();
        ListaMedEsp listamedesp=new ListaMedEsp();
        ListaPacientes listaPaciSinTriage=new ListaPacientes();
        //ListaPacientes listaPaciTriageados=new ListaPacientes();
        
        
        listapaci.leer("Archivos/Pacientes.txt");
        listaresu.leer("Archivos/ResEstudios.txt",listapaci);
        listaAdmisiones.leer("Archivos/Admisiones.txt",listapaci);
        listamedi.leer("Archivos/Medicos.txt");
        listaespe.leer("Archivos/Especialidades.txt",listamedi,listamedesp);
        
        listaPaciSinTriage.leer("Archivos/");
        //listaPaciTriageados.leer("");
        
        
        DatosTaller.setPacientes(listapaci);
        DatosTaller.setMedicos(listamedi);
        DatosTaller.setResultados(listaresu);
        DatosTaller.setAdmisiones(listaAdmisiones);
        DatosTaller.setEspecialidades(listaespe);
        
        DatosTaller.setPacientesSinTriage(listaPaciSinTriage);
        
        System.out.println(DatosTaller.getPacientes());
        

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
}

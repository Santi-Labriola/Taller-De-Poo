
package com.mycompany.taller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaAdmisiones {
    
    protected ArrayList <AdmisionDeEmergencia> admisiones;

    public ListaAdmisiones(ArrayList<AdmisionDeEmergencia> admisiones) {
        this.admisiones = admisiones;
    }

    public ListaAdmisiones() {
        this.admisiones=new ArrayList <AdmisionDeEmergencia>();
    }

    public ArrayList<AdmisionDeEmergencia> getAdmisiones() {
        return admisiones;
    }

    public void setAdmisiones(ArrayList<AdmisionDeEmergencia> admisiones) {
        this.admisiones = admisiones;
    }
    
    public void agregar(AdmisionDeEmergencia adm){
        admisiones.add(adm);
    }
    
    public void eliminar(AdmisionDeEmergencia adm){
        admisiones.remove(adm);
    }
    
    public void leer(String archivo){
        leerInterno(archivo,null);
    }
    
    public void leer(String archivo, ListaPacientes listapaci){
        leerInterno(archivo,listapaci);
    }
        
    private void leerInterno(String archivo, ListaPacientes listapaci){
        
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivo));
            String linea = reader.readLine();
            
            while (linea!=null){
                String[] split=linea.split(",");//splitea la linea
                String[] splitFecha=split[1].split("/");//splitea la fecha 
                String[] splitHora=split[2].split(":");//splitea la hora
                
                AdmisionDeEmergencia adm=new AdmisionDeEmergencia();
                
                //se inicializar la fecha y hora
                LocalDate fecha= LocalDate.of(Integer.parseInt(splitFecha[2]),
                                                Integer.parseInt(splitFecha[1]),
                                                Integer.parseInt(splitFecha[0]));
                
                LocalTime hora= LocalTime.of(Integer.parseInt(splitHora[0]),
                                                Integer.parseInt(splitHora[1]),
                                                Integer.parseInt(splitHora[2]));
                
                adm.setFecha(fecha);
                adm.setHora(hora);
                adm.setMotivoDeConsulta(split[3]);
               
                /*si se paso la lista de pacientes por parametro, se busca por dni al paciente
                y hace un setPaciente.
                */
                if (listapaci!=null){            
                    Paciente paci=listapaci.getPorDni(Integer.parseInt(split[0]));
                    adm.setPaciente(paci);
                    
                    //si el paciente existe, se añade esta admision a la lista del paciente.
                    if (paci!=null){
                            paci.agregarAdmision(adm);
                    }
                }
                this.agregar(adm);
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

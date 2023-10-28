
package com.mycompany.taller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class ListaPacientes {
    public ArrayList <Paciente> pacientes;
    
    public ListaPacientes() {
        this.pacientes = new ArrayList<Paciente>();
    }
    
    public ListaPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void agregar(Paciente paci){
        pacientes.add(paci);
    }
    
    public void eliminar(Paciente paci){
        pacientes.remove(paci);
    }
    
    public Paciente getPorDni(int dni){
        for (Paciente paci : this.pacientes){
           if (paci.getDocumento()==dni){
                return paci;
            }        
        }
        return null;
    }
    
    public ArrayList<Paciente> leer(String archivo){
        
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivo));
            String linea = reader.readLine();
            
            while (linea!=null){
                String[] split=linea.split(",");//splitea la linea
                String[] splitFecha=split[3].split("/");//splitea la fecha 
                
                Paciente paci=new Paciente();
                
                LocalDate fechanac= LocalDate.of(Integer.parseInt(splitFecha[0]),
                                                Integer.parseInt(splitFecha[1]),
                                                Integer.parseInt(splitFecha[2]));
                
                paci.setDocumento(Integer.parseInt(split[0]));
                paci.setNombre(split[1]);
                paci.setApellido(split[2]);
                paci.setFechaNacimiento(fechanac);
                paci.setDomicilio(split[4]);
                paci.setTelefoFijo(Integer.parseInt(split[5]));
                paci.setTelefonoCelular(Integer.parseInt(split[6]));
                paci.setEstadoCivil(split[7]);
                paci.setCorreoElectronico(split[8]);
                paci.setPersonaDeContacto(split[9]);
                
                this.agregar(paci);
                
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(pacientes.size());
     return pacientes;
             
     }

    @Override
    public String toString() {
        return "ListaPacientes{" + "pacientes=" + pacientes + '}';
    }
}

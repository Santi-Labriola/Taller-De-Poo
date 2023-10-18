
package com.mycompany.tallerpoo;
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
    ArrayList <Paciente> pacientes;
    
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
    
    public void leer(String archivo){
        
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivo));
            String linea = reader.readLine();
            
            while (linea!=null){
                String[] split=linea.split(",");//splitea la linea
                String[] splitFecha=split[2].split("/");//splitea la fecha 
                
                Paciente paci=new Paciente();
                
                LocalDate fechanac= LocalDate.of(Integer.parseInt(splitFecha[2]),
                                                Integer.parseInt(splitFecha[1]),
                                                Integer.parseInt(splitFecha[0]));
                
                paci.setDocumento(Integer.parseInt(split[0]));
                paci.setNombre(split[1]);
                paci.setFechaNacimiento(fechanac);
                paci.setDomicilio(split[3]);
                paci.setTelefoFijo(Integer.parseInt(split[4]));
                paci.setTelefonoCelular(Integer.parseInt(split[5]));
                paci.setEstadoCivil(split[6]);
                paci.setCorreoElectronico(split[7]);
                paci.setPersonaContacto(split[8]);
                
                pacientes.add(paci);
                
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "ListaPacientes{" + "pacientes=" + pacientes + '}';
    }
}

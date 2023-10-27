
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ListaEnfermeros {
    private ArrayList<Enfermero> enfermeros;

    public ListaEnfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public ListaEnfermeros() {
        this.enfermeros=new ArrayList<Enfermero>();
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }
    
    public void agregar(Enfermero enfermero){
        this.enfermeros.add(enfermero);
    }
    
    public void agregarArchivo(String archivoNombre, Enfermero enfermero){
        PrintWriter salida= null;
        try {
            File archivo= new File(archivoNombre);
            salida = new PrintWriter(new FileWriter(archivo, true ));            
                       
            salida.println(enfermero.getDocumento()+","+enfermero.getNombre()+","+enfermero.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+","
                    +enfermero.getDomicilio()+","+enfermero.getTelefoFijo()+","+enfermero.getTelefonoCelular()+","
                    +enfermero.getEstadoCivil()+","+enfermero.getCorreoElectronico());
            
        } catch (IOException ex) {
            
        } finally {
            salida.close();
        } 
    }
    
    public ArrayList<Enfermero> leer(String archivoNombre){
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivoNombre));
            String linea = reader.readLine();
            
            while (linea!=null && !linea.isBlank()){
                String[] split=linea.split(",");//splitea la linea
                String[] splitFecha=split[2].split("/");//splitea la fecha 
                
                Enfermero enfermero=new Enfermero();
                
                LocalDate fechanac= LocalDate.of(Integer.parseInt(splitFecha[2]),
                                                Integer.parseInt(splitFecha[1]),
                                                Integer.parseInt(splitFecha[0]));
                
                enfermero.setDocumento(Integer.parseInt(split[0]));
                enfermero.setNombre(split[1]);
                enfermero.setFechaNacimiento(fechanac);
                enfermero.setDomicilio(split[3]);
                enfermero.setTelefoFijo(Integer.parseInt(split[4]));
                enfermero.setTelefonoCelular(Integer.parseInt(split[5]));
                enfermero.setEstadoCivil(split[6]);
                enfermero.setCorreoElectronico(split[7]);

                
                this.agregar(enfermero);
                
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return enfermeros;
    }
}

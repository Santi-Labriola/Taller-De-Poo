/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class ListaTriage {
    ArrayList<Triage> triages;


    public ListaTriage(ArrayList<Triage> triages) {
        this.triages = triages;
    }

    public ListaTriage() {
        this.triages= new ArrayList<Triage>();        
    }
    
    public void agregar (Triage tri) {
        triages.add(tri);
    }
    
    public boolean eliminar (Triage tri) {
        if (triages.contains(tri)) {
            triages.remove(tri);
            return true;
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Triage tri; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                tri = new Triage(); 
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                tri.setFecha( LocalDate.parse(campos[0], formatter));        
                tri.setColorSugerido(campos[1]);
                tri.setConsciencia(Integer.parseInt(campos[2]));
                tri.setDifilcutadRespiracion(Integer.parseInt(campos[3]));
                tri.setDolorAbdominal(Integer.parseInt(campos[4]));
                tri.setEdad(Integer.parseInt(campos[5]));
                tri.setEstadoMental(Integer.parseInt(campos[6]));
                tri.setFiebre(Integer.parseInt(campos[7]));
                tri.setHora(campos[8]);
                tri.setLesionesGraves(Integer.parseInt(campos[9]));
                tri.setLesionesLeves(Integer.parseInt(campos[10]));
                tri.setPulso(Integer.parseInt(campos[11]));
                tri.setRespiracion(Integer.parseInt(campos[12]));
                tri.setSangrado(Integer.parseInt(campos[13]));
                tri.setSignosShock(Integer.parseInt(campos[14]));
                tri.setVomitos(Integer.parseInt(campos[15]));
                tri.setColorFinal(campos[16]);
                tri.setMotivoCambio(campos[17]);
                
                
                
                
                
                
                this.agregar(tri);                
                linea = br.readLine();
            }            
        } catch (Exception e) {
         
        } finally {
            if (null!=br) {
                br.close();
            }
        }
        System.out.println("cant" + this.triages.size());
        for (Triage tria: triages) {
            System.out.println(tria.toString());
        }
    }
    
    
    
}

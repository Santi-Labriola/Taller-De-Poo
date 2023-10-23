/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class ListaPVarias {
    ArrayList<String> varias;

    public ListaPVarias() {
    this.varias =null;   
    }
       
    public ListaPVarias(ArrayList<String> lista) {
        this.varias = varias;
    }
    
    public void agregar (String algo) {
        varias.add(algo);
    }
    
    public boolean eliminar (String algo) {
        if (varias.contains(algo)) {
            varias.remove(algo);
            return true;
        }                
     return false;
    }
    
    public void leer (String archivo) throws IOException {
        
        String algo; 
      
        try {         
            BufferedReader br= new BufferedReader (new FileReader(archivo));
            String linea = br.readLine();
            while (null!=linea) {
                String [] campos = linea.split(",");
                if(  campos.length<=11){
                algo=campos[0]+campos[1]+campos[11];
                
                this.agregar(algo);
                
                }else {
                System.err.println("Línea incorrecta: " + linea);
                }
                linea = br.readLine();
                }
                
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                ex.printStackTrace();
                }
                System.out.println(varias.size());
                }

    @Override
    public String toString() {
        return "ListaPVarias{" + "varias=" + varias + '}';
    }
    
}
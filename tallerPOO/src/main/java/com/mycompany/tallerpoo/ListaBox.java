
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaBox {
   private ArrayList<Box> boxes; 

    public ListaBox(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    public ListaBox() {
        this.boxes=new ArrayList<Box>();
    }
   
    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(ArrayList<Box> boxes) {
        boxes = boxes;
    }
    
    public void agregarBox(Box box){
        boxes.add(box);
    }
    
    public Box getPorNumero(int numero){
        for(Box box : this.boxes){
            if(box.getNumero()==numero){
                return box;
            }
        }
        return null;
    }
    
    public void eliminarBox(Box box){
        boxes.remove(box);
    }
    
    public void leer(String archivo){
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivo));
            String linea = reader.readLine();
            
            while (linea!=null && !linea.isBlank()){
                String[] split=linea.split(",");//splitea la linea
                
                Box box=new Box();
                
                box.setNumero(Integer.parseInt(split[0]));
                
                if(split[1]=="0"){
                    box.setOcupado(false);
                }else{
                    box.setOcupado(true);
                }

                this.agregarBox(box);
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

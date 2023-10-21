/*
 *pr
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
//
public class Triage {
    private LocalDate Fecha;
    private String hora;
    private int respiracion;
    private int pulso;
    private int estadoMental;
    private int consciencia;
    private int difilcutadRespiracion;
    private int lesionesGraves;
    private int edad;
    private int fiebre;
    private int vomitos;
    private int dolorAbdominal;
    private int signosShock;
    private int lesionesLeves;
    private int sangrado;
    private String colorSugerido;
    private String motivoCambio;
    private String colorFinal;

    public Triage (LocalDate Fecha, String colorSugerido) {
        this.Fecha = Fecha;
        this.colorSugerido = colorSugerido;
    }
    
    

    public Triage() {
        
        this.Fecha = LocalDate.of(1, 1, 1);;
        this.hora = "";
        this.respiracion = 0;
        this.pulso = 0;
        this.estadoMental = 0;
        this.consciencia = 0;
        this.difilcutadRespiracion = 0;
        this.lesionesGraves = 0;
        this.edad = 0;
        this.fiebre = 0;
        this.vomitos = 0;
        this.dolorAbdominal = 0;
        this.signosShock = 0;
        this.lesionesLeves = 0;
        this.sangrado = 0;
        this.colorSugerido = "";
        this.motivoCambio = "";
        this.colorFinal = "";
    }
    
    

    public Triage(LocalDate Fecha, String hora, int respiracion, int pulso, int estadoMental, int conciencia, int difilcutadRespiracion, int lesionesGraves, int edad, int fiebre, int vomitos, int dolorAbdominal, int signosShock, int lesionesLeves, int sangrado, String colorSugerido, String motivoCambio, String colorFinal) {
        this.Fecha = Fecha;
        this.hora = hora;
        this.respiracion = respiracion;
        this.pulso = pulso;
        this.estadoMental = estadoMental;
        this.consciencia = consciencia;
        this.difilcutadRespiracion = difilcutadRespiracion;
        this.lesionesGraves = lesionesGraves;
        this.edad = edad;
        this.fiebre = fiebre;
        this.vomitos = vomitos;
        this.dolorAbdominal = dolorAbdominal;
        this.signosShock = signosShock;
        this.lesionesLeves = lesionesLeves;
        this.sangrado = sangrado;
        this.colorSugerido = colorSugerido;
        this.motivoCambio = motivoCambio;
        this.colorFinal = colorFinal;
    }
    
    

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(int respiracion) {
        if (respiracion>=0 && respiracion<=2){
        this.respiracion = respiracion;}
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        if (pulso>=0 && pulso<=1){
            this.pulso = pulso;
        }
    }

    public int getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(int estadoMental) {
        if (estadoMental>=0 && estadoMental<=2){
            this.estadoMental = estadoMental;
        }
    }

    public int getConsciencia() {
        return consciencia;
    }

    public void setConsciencia(int consciencia) {
        if (consciencia>=0 && consciencia<=3){
            this.consciencia = consciencia;
        }
    }

    public int getDifilcutadRespiracion() {
        return difilcutadRespiracion;
    }

    public void setDifilcutadRespiracion(int difilcutadRespiracion) {
        if(difilcutadRespiracion>=0 && difilcutadRespiracion<=1){
            this.difilcutadRespiracion = difilcutadRespiracion;
        }
    }

    public int getLesionesGraves() {
        return lesionesGraves;
    }

    public void setLesionesGraves(int lesionesGraves) {
       if(lesionesGraves>=0 && lesionesGraves<=2){ 
           this.lesionesGraves = lesionesGraves;
       }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>= 0 && edad<=1){
            this.edad = edad;
        }
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        if(fiebre>=0 && fiebre<=2){
            this.fiebre = fiebre;
        }
    }

    public int getVomitos() {
        return vomitos;
    }

    public void setVomitos(int vomitos) {
        if(vomitos>=0 && vomitos<=2 ){
            this.vomitos = vomitos;
        }
    }

    public int getDolorAbdominal() {
        return dolorAbdominal;
    }
///////////////////////////////////////////////////////////////////////
    public void setDolorAbdominal(int dolorAbdominal) {
        if(dolorAbdominal>=0 && dolorAbdominal<=2 ){
            this.dolorAbdominal = dolorAbdominal;}
    }

    public int getSignosShock() {
        return signosShock;
    }

    public void setSignosShock(int signosShock) {
        if(signosShock>=0 && signosShock<=3){
            this.signosShock = signosShock;
        }
    }

    public int getLesionesLeves() {
        return lesionesLeves;
    }

    public void setLesionesLeves(int lesionesLeves) {
        if (lesionesLeves>=0 && lesionesLeves<=1){
            this.lesionesLeves = lesionesLeves;
        }
    }

    public int getSangrado() {
        return sangrado;
    }

    public void setSangrado(int sangrado) {
        if(sangrado>=0 && sangrado <=2){
            this.sangrado = sangrado;
        }
    }

    public String getColorSugerido() {
        return colorSugerido;
    }

    public void setColorSugerido(String colorSugerido) {
        this.colorSugerido = colorSugerido;
    }

    public String getMotivoCambio() {
        return motivoCambio;
    }

    public void setMotivoCambio(String motivoCambio) {
        this.motivoCambio = motivoCambio;
    }

    public String getColorFinal() {
        return colorFinal;
    }

    public void setColorFinal(String colorFinal) {
        this.colorFinal = colorFinal;
    }
    
  
    public  String  obtenerColorSugerido  (int respiracion, int pulso 
        ,int estadoMental,int conciencia, int dificultadRespiracion,
        int lesionesGraves, int edad, int fiebre, int vomito, 
        int dolorAbdominal, int signosShock, int lesionesLeves,int sangrado){
    
    int suma = respiracion + pulso + estadoMental + conciencia + 
        dificultadRespiracion + lesionesGraves + edad + fiebre + vomito + 
            dolorAbdominal + signosShock + lesionesLeves + sangrado;
    String color;
    
    
    if (suma >= 15) {
        return "Rojo (Requiere atención médica inmediata)";
    } else if (suma >= 10 && suma <= 14) {
        return "Naranja (Requiere atención médica urgente)";
    } else if (suma>= 5 && suma <= 9) {
        return "Amarillo (Requiere atención médica en un plazo más largo)";
    } else if (suma >= 0 && suma <= 4) {
        return "Verde (Condiciones no urgentes)";
    } else {
        return "Azul (Condiciones que pueden ser tratadas en un entorno no hospitalario)";
    }

    }
    
   
      
     public  ArrayList<Integer> cantTriagePorFecha( LocalDate fecha1, LocalDate fecha2) throws FileNotFoundException, IOException {        
        
         ArrayList lista=new ArrayList();
                         
        int rojo = 0;
        int naranja = 0;
        int amarillo = 0;
        int verde = 0;
        int azul = 0;
               
        try {
            BufferedReader br= new BufferedReader (new FileReader("Archivos/Triage.txt"));
            String linea = br.readLine();
            
            while (linea != null) {
                                
                String [] array = linea.split(",");
          // Validar que haya al menos dos campos en la línea antes de procesarla
            if (array.length >= 2) {
                String[] splitFecha = array[0].split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(splitFecha[0]), Integer.parseInt(splitFecha[1]), Integer.parseInt(splitFecha[2]));
            
                if (date.isAfter(fecha1) && date.isBefore(fecha2)) {
                    if (array[1].equals("Rojo")) {
                        rojo++;
                    } else if (array[1].equals("Naranja")) {
                        naranja++;
                    } else if (array[1].equals("Amarillo")) {
                        amarillo++;
                    } else if (array[1].equals("Verde")) {
                        verde++;
                    } else if (array[1].equals("Azul ")) {
                        azul++;
                    }
                }
                linea = br.readLine();
            }
            }
            lista.add(rojo);
            lista.add(naranja);
            lista.add(amarillo);
            lista.add(verde);
            lista.add(azul);

            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return lista;
    }   
    

  

    /*
    public String toString() {
        return "Triage{" + "Fecha=" + Fecha + ", hora=" + hora + ", respiracion=" + respiracion + ", pulso=" + pulso + ", estadoMental=" + estadoMental + ", consciencia=" + consciencia + ", difilcutadRespiracion=" + difilcutadRespiracion + ", lesionesGraves=" + lesionesGraves + ", edad=" + edad + ", fiebre=" + fiebre + ", vomitos=" + vomitos + ", dolorAbdominal=" + dolorAbdominal + ", signosShock=" + signosShock + ", lesionesLeves=" + lesionesLeves + ", sangrado=" + sangrado + ", colorSugerido=" + colorSugerido + ", motivoCambio=" + motivoCambio + ", colorFinal=" + colorFinal + '}';
    } */
     public String toString() {
        return "Triage{" + "Fecha=" + Fecha + ", colorSugerido=" + colorSugerido + '}';
    } 
}
    


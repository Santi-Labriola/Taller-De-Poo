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
    
   
        
    public static ArrayList cantTriagePorFecha(LocalDate fecha1, LocalDate fecha2) {           
        
        ArrayList lista=new ArrayList();
     try {
        BufferedReader entrada = new BufferedReader(new FileReader("src/main/java/Archivos/Triage\\Triage.txt"));
        String linea = entrada.readLine();
        int rojo=0;
        int naranja =0;
        int amarillo =0;
        int verde =0;
        int azul=0;
        String[] array = new String[1];
        String[] fec= new String [2];
        int [] colo= new int [4];        
        LocalDate date;
        while (linea != null) {
            array = linea.split(",");
            fec=array[0].split("-");
            date=LocalDate.of(Integer.parseInt(fec[2]),
               Integer.parseInt(fec[1]),Integer.parseInt(fec[0]));
            
            
            if (date.isAfter(fecha1) && date.isBefore(fecha2)){
                if(array[1].equals("Rojo"))
                    rojo+=rojo;
                    colo[0]=rojo;
                } else if (array[1].equals("Naranja")){
                    naranja+=naranja;
                    colo[1]=naranja ;} 
                    else if(array[1].equals("Amarillo")){
                    amarillo+=amarillo;
                    colo[2]=amarillo;} 
                    else if(array[1].equals("Verde")){
                    verde+=verde;
                    colo[3]=verde;} else if(array[1].equals("Azul")){
                    azul+=azul;
                    colo[4]=azul;}
            linea = entrada.readLine();
        }
        lista.add(colo[0]);
        lista.add(colo[1]);
        lista.add(colo[2]);
        lista.add(colo[3]);
        lista.add(colo[4]);
        entrada.close();
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    return lista;
}
    
    
    
    
}
/*
    FALTA: - Triage realizado en un rango de fechas, indicándose la cantidad de cada color
bandera inicio= fecha1
bandera limite = fecha2
leo el archivo y si la fecha que aparece en el es >= fecha1 y <= fecha2, leo el color del triage
hago contador del color que este en esa fecha, van a ser 5 contadores diferentes

+cantTriagePorFecha(fecha1: String, fecha2: String): List String 
-Entran 2 fechas, 
-se busca en el archivo .txt esas fechas, se verifican si estan
- se busca en el txt el color del triage, y se acumula

    +triageCambiadosPorFecha(fecha1: String, fecha2: String): Int
    HAY QUE VER BASE DE DATOS
    
    */

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
    private int conciencia;
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

    public Triage(LocalDate Fecha, String hora, int respiracion, int pulso, int estadoMental, int conciencia, int difilcutadRespiracion, int lesionesGraves, int edad, int fiebre, int vomitos, int dolorAbdominal, int signosShock, int lesionesLeves, int sangrado, String colorSugerido, String motivoCambio, String colorFinal) {
        this.Fecha = Fecha;
        this.hora = hora;
        this.respiracion = respiracion;
        this.pulso = pulso;
        this.estadoMental = estadoMental;
        this.conciencia = conciencia;
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
        this.respiracion = respiracion;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public int getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(int estadoMental) {
        this.estadoMental = estadoMental;
    }

    public int getConciencia() {
        return conciencia;
    }

    public void setConciencia(int conciencia) {
        this.conciencia = conciencia;
    }

    public int getDifilcutadRespiracion() {
        return difilcutadRespiracion;
    }

    public void setDifilcutadRespiracion(int difilcutadRespiracion) {
        this.difilcutadRespiracion = difilcutadRespiracion;
    }

    public int getLesionesGraves() {
        return lesionesGraves;
    }

    public void setLesionesGraves(int lesionesGraves) {
        this.lesionesGraves = lesionesGraves;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        this.fiebre = fiebre;
    }

    public int getVomitos() {
        return vomitos;
    }

    public void setVomitos(int vomitos) {
        this.vomitos = vomitos;
    }

    public int getDolorAbdominal() {
        return dolorAbdominal;
    }

    public void setDolorAbdominal(int dolorAbdominal) {
        this.dolorAbdominal = dolorAbdominal;
    }

    public int getSignosShock() {
        return signosShock;
    }

    public void setSignosShock(int signosShock) {
        this.signosShock = signosShock;
    }

    public int getLesionesLeves() {
        return lesionesLeves;
    }

    public void setLesionesLeves(int lesionesLeves) {
        this.lesionesLeves = lesionesLeves;
    }

    public int getSangrado() {
        return sangrado;
    }

    public void setSangrado(int sangrado) {
        this.sangrado = sangrado;
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
    
    switch(suma) {
    case -1: // Dependiendo del protocolo específico de la institución
        color = "Azul";
        break;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
        color = "Verde";
        break;
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
        color = "Amarillo";
        break;
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
        color = "Naranja";
        break;
    default:
        if (suma >= 15 && suma <= 24) {
            color = "Rojo";
        } else {
            color = "Valor no válido";
        }
        break;
}

return color;
    }
    
   
        
     public static ArrayList<String[]> countColors(String nombreArchivo, LocalDate fecha1, LocalDate fecha2) {
    File archivo = new File(nombreArchivo);
    ArrayList<String[]> list = new ArrayList<String[]>();
     try {
        BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        String lectura = entrada.readLine();

        while (lectura != null) {
            String[] array = lectura.split(",");
            list.add(array);
            lectura = entrada.readLine();
        }

        entrada.close();
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    return list;
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

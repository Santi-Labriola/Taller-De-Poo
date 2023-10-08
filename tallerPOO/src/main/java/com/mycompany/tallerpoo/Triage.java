/*
 *pr
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

/**
 *
 * @author Matias
 */
//
public class Triage {
    private String Fecha;
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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
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
    
    switch(suma){
        case -1://-1 Dependerá del protocolo específico de la institución 
            color="Azul";
        case 0,1,2,3,4:
            color="Verde";
        case 5,6,7,8,9:
            color="Amarillo";
        case 10,11,12,13,14:
            color="Naranja";
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
    /*
    FALTA: 
    +cantTriagePorFecha(fecha1: String, fecha2: String): List String 
    +triageCambiadosPorFecha(fecha1: String, fecha2: String): Int
    HAY QUE VER BASE DE DATOS
    
    */
}

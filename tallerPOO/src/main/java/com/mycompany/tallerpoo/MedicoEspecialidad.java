/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.time.LocalDate;

/**
 *
 * @author Santi
 */
public class MedicoEspecialidad {
    
    private LocalDate fecha;
    private String Universidad; 
    //public Medico medico;
    //public Especialidad especialidad;    

    public MedicoEspecialidad(LocalDate fecha, String Universidad) {
        this.fecha = fecha;
        this.Universidad = Universidad;
    }
    
    public MedicoEspecialidad(){
        this.fecha = LocalDate.of(1, 1, 1);
        this.Universidad = "";
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    @Override
    public String toString() {
        return "MedicoEspecialidad{" + "fecha=" + fecha + ", Universidad=" + Universidad + '}';
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

/**
 *
 * @author Santi
 */
public class Especialidad {
    
    private String titulo;
    private String especialidad;

    public Especialidad(String titulo, String especialidad) {
        this.titulo = titulo;
        this.especialidad = especialidad;
    }
    
    public Especialidad() {
        this.titulo = "";
        this.especialidad = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "titulo=" + titulo + ", especialidad=" + especialidad + '}';
    }
    
}
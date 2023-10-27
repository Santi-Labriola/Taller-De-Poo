package com.mycompany.tallerpoo;

import java.util.ArrayList;

/**
 *
 * @author Santi
 */
public class Especialidad {
    
    private String titulo;
    private String especialidad;
    private ArrayList<Medico> medicos;

    public Especialidad(String titulo, String especialidad) {
        this.titulo = titulo;
        this.especialidad = especialidad;
        this.medicos=new ArrayList<Medico>();
    }
    
    public Especialidad() {
        this.titulo = "";
        this.especialidad = "";
        this.medicos=new ArrayList<Medico>();
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

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }
    
    public void agregarMedico(Medico medico){
        this.medicos.add(medico);
    }

    @Override
    public String toString() {
        return "Especialidad{" + "titulo=" + titulo + ", especialidad=" + especialidad + '}';
    }
    
}
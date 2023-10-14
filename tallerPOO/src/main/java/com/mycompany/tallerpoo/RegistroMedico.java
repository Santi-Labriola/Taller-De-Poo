/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Santi
 */

public class RegistroMedico {
    
    private LocalDate fecha;
    private LocalTime hora; 
    private String lugarAtendido;
    private String diagnostico;
    private String diagnosticoClinico;
    
    //public ArrayList<RegistroMedico> registroMedico;
    //public AdmisionDeEmergencia admisionDeEmergencia;
    //public ArrayList<Medico> medico;
    //public Paciente paciente;

    public RegistroMedico(LocalDate fecha, LocalTime hora, String lugarAtendido, String diagnostico, String diagnosticoClinico) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugarAtendido = lugarAtendido;
        this.diagnostico = diagnostico;
        this.diagnosticoClinico = diagnosticoClinico;
    }
	
    public RegistroMedico() {
        this.fecha = LocalDate.of(1, 1, 1);
        this.hora = LocalTime.of(0, 0,0);
	this.lugarAtendido = "";
	this.diagnostico = "";
	this.diagnosticoClinico = "";
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnosticoClinico() {
        return diagnosticoClinico;
    }

    public void setDiagnosticoClinico(String diagnosticoClinico) {
        this.diagnosticoClinico = diagnosticoClinico;
    }

    /*
    public ResultadoEstudios obtenerResultadoEstudios(LocalDate fecha) {
        Aca se hace algun tipo de recorrido por el archivo que tiene los resultados de Estudios del paciente
        return (Retorna un resultado de Estudio que se hizo en esa fecha);
    }
    
    public int calcularNumPacDeMedPorFecha(Medico medico, LocalDate fecha1, LocalDate fecha2){
        
    }
    
    public int CalcularPacPorEdadesyFechas(int edad1, int edad2, LocalDate fecha1, LocalDate fecha2){
        
    }
    
    public list<String> calcularMasConsPorFecha(LocalDate fecha1, LocalDate fecha2){
    
    }
    
    public list<String> calcularMedMasPacPorFecha(LocalDate fecha1, LocalDate fecha2)
    
    */
    
    @Override
    public String toString() {
        return "RegistroMedico{" + "fecha=" + fecha + ", hora=" + hora + ", lugarAtendido=" + lugarAtendido + ", diagnostico=" + diagnostico + ", diagnosticoClinico=" + diagnosticoClinico + '}';
    }
    
}
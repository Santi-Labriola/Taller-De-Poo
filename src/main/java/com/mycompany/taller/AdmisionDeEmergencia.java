
package com.mycompany.taller;
import java.time.*;
import java.util.*;
/**
 *
 * @author Lucas
 */
public class AdmisionDeEmergencia {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoDeConsulta;
    private Paciente paciente;
    
    public AdmisionDeEmergencia(){
        this.fecha=LocalDate.of(1,1,1);
        this.hora=LocalTime.of(0, 0,0);
        this.motivoDeConsulta="";
    }

    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
    }
    
    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta,Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente=paciente;
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

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
//    public void registrarPaciente(Paciente paciente){//falta programar
//        
//    }
    
    public String calcularMasConsPorFecha(LocalDate fecha1,LocalTime fecha2){ //falta programar
        return "ver";
    }

    @Override
    public String toString() {
        return "AdmisionDeEmergencia{" + "fecha=" + fecha + ", hora=" + hora + ", motivoDeConsulta=" + motivoDeConsulta + ", paciente=" + '}';
    }
            
}

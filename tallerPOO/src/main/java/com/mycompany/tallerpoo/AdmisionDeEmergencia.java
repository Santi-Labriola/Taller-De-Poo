
package com.mycompany.tallerpoo;
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
    

    public AdmisionDeEmergencia(){
        this.fecha=LocalDate.of(0, 0, 0);
        this.hora=LocalTime.of(0, 0,0);
        this.motivoDeConsulta="";
    }

    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
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
    
    public void registrarPaciente(Paciente paciente){//falta programar
        
    }
    
    public String calcularMasConsPorFecha(LocalDate fecha1,LocalTime fecha2){ //falta programar
        return "ver";
    }
            
}

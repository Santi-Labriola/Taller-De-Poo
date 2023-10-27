
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
    private Paciente paciente;
    private Triage triage;
    private Box box;
    
    public AdmisionDeEmergencia(){
        this.fecha=LocalDate.of(1,1,1);
        this.hora=LocalTime.of(0, 0,0);
        this.motivoDeConsulta="";
        this.paciente=new Paciente();
        this.triage=null;
        this.box=new Box();
    }

    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente=new Paciente();
        this.triage=null;
    }
    
    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta,Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente=paciente;
        this.triage=null;
    }

    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta, Paciente paciente, Triage triage) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente = paciente;
        this.triage = triage;
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

    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    
    public String calcularMasConsPorFecha(LocalDate fecha1,LocalTime fecha2){ //falta programar
        return "ver";
    }
    
    @Override
    public String toString() {
        return "AdmisionDeEmergencia{" + "fecha=" + fecha + ", hora=" + hora + ", motivoDeConsulta=" + motivoDeConsulta + ", paciente=" + '}';
    }
            
}

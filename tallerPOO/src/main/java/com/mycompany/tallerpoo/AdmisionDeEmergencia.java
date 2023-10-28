
package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;
/**
 * Clase que representan las admisiones de los pacientes.
 * @author Lucas
 * @see ListaAdmisiones
 */
public class AdmisionDeEmergencia {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoDeConsulta;
    private Paciente paciente;
    /**
     * Triage que es realizado luego de la admision. Se inicializa vacio hasta que
     * un medico/enfermero decida realizar el triage.
     * @see Triage
     */
    private Triage triage;
    /**
     * Box que es asignado una vez que un medico decida atender al paciente vinculado
     * a esta admision. Se inicializa vacio hasta que un medico decida realizar la atencion.
     */
    private Box box;
    
    /**
     * Cnstructor por defecto de la claseo
     */
    public AdmisionDeEmergencia(){
        this.fecha=LocalDate.of(1,1,1);
        this.hora=LocalTime.of(0, 0,0);
        this.motivoDeConsulta="";
        this.paciente=new Paciente();
        this.triage=null;
        this.box=new Box();
    }
    /**
     * Contructor parametrizado de la clase.
     * @param fecha
     * @param hora
     * @param motivoDeConsulta 
     */
    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente=new Paciente();
        this.triage=null;
        this.box=new Box();
    }
    
    /**
     * Contructor parametrizado de la clase, con el paciente incluido.
     * @param fecha
     * @param hora
     * @param motivoDeConsulta
     * @param paciente 
     */
    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta,Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente=paciente;
        this.triage=null;
        this.box=new Box();
    }
    /**
     * Contructor parametrizado de la clase, con el triage y el paciente incluidos.
     * @param fecha
     * @param hora
     * @param motivoDeConsulta
     * @param paciente
     * @param triage 
     */
    public AdmisionDeEmergencia(LocalDate fecha, LocalTime hora, String motivoDeConsulta, Paciente paciente, Triage triage) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoDeConsulta = motivoDeConsulta;
        this.paciente = paciente;
        this.triage = triage;
        this.box=new Box();
        
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
    
    @Override
    public String toString() {
        return "AdmisionDeEmergencia{" + "fecha=" + fecha + ", hora=" + hora + ", motivoDeConsulta=" + motivoDeConsulta + ", paciente=" + '}';
    }
            
}

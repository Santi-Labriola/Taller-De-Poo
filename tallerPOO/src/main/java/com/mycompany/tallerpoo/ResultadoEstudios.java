
package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;
import java.io.*;

/**
 * Clase en donde se almacenan los datos de los resultados de estudios.
 * @author Lucas
 */
public class ResultadoEstudios {
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoDeEstudio;
    private String informeDeEstudio;
    /**
     * Paciente al cual le pertenece el resultado de estudio.
     * @see #setPaciente(com.mycompany.tallerpoo.Paciente) 
     * @see #getPaciente() 
     *
     */
    private Paciente paciente;
    
    /**
     * Constructor por defecto de la clase
     */
    public ResultadoEstudios(){
        this.fecha=LocalDate.of(1, 1, 1);
        this.hora=LocalTime.of(0, 0,0);
        this.informeDeEstudio="";
        this.paciente=null;
    }
    /**
     * Constructor parametrizado de la clase.
     * @param fecha
     * @param hora
     * @param tipoDeEstudio
     * @param informeDeEstudio 
     */
    public ResultadoEstudios(LocalDate fecha, LocalTime hora, String tipoDeEstudio, String informeDeEstudio) {
 
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informeDeEstudio = informeDeEstudio;
        this.paciente=null;
    }
    
    /**
     * Constructor parametrizado de la clase, con el paciente incluido.
     * @param fecha
     * @param hora
     * @param tipoDeEstudio
     * @param informeDeEstudio
     * @param paciente 
     */
    public ResultadoEstudios(LocalDate fecha, LocalTime hora, String tipoDeEstudio, String informeDeEstudio, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informeDeEstudio = informeDeEstudio;
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
    
    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getInformeDeEstudio() {
        return informeDeEstudio;
    }

    public void setInformeDeEstudio(String informeDeEstudio) {
        this.informeDeEstudio = informeDeEstudio;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}

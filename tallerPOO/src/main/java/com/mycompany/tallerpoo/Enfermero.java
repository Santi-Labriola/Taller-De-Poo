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



public class Enfermero extends Persona {
    //public ArrayList<Triage> triage;  
    
    public Enfermero (String nombre, LocalDate fechaNacimiento, String domicilio, 
                  int documento, int telefoFijo, int telefonoCelular, 
                  String estadoCivil, String correoElectronico) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, 
            telefonoCelular, estadoCivil, correoElectronico);
                      
    }
    
    public Triage hacerTriage(LocalDate Fecha, LocalTime hora, int respiracion, int pulso, int estadoMental, int conciencia, int dificultadRespiracion, int lesionesGraves, int edad, int fiebre, int vomitos, int dolorAbdominal, int signosShock, int lesionesLeves, int sangrado, AdmisionDeEmergencia admision){
        Triage triage=new Triage();
        
        triage.setFecha(LocalDate.now());
        triage.setHora(LocalTime.now());
        triage.setRespiracion(respiracion);
        triage.setPulso(pulso);
        triage.setEstadoMental(estadoMental);
        triage.setConsciencia(conciencia);
        triage.setDificultadRespiracion(dificultadRespiracion);
        triage.setLesionesGraves(lesionesGraves);
        triage.setEdad(edad);
        triage.setFiebre(fiebre);
        triage.setVomitos(vomitos);
        triage.setDolorAbdominal(dolorAbdominal);
        triage.setSignosShock(signosShock);
        triage.setLesionesLeves(lesionesLeves);
        triage.setSangrado(sangrado);
        
        String color=triage.obtenerColorSugerido(respiracion, pulso, estadoMental, conciencia, dificultadRespiracion, lesionesGraves, edad, fiebre, vomitos, dolorAbdominal, signosShock, lesionesLeves, sangrado);
        
        triage.setColorSugerido(color);
        triage.setColorFinal(color);
        
        Paciente paci=admision.getPaciente();
        DatosTaller.eliminarPacienteAdmision(paci);
        DatosTaller.agregarPacienteTriage(paci);
        
        return triage;
    }
}
 


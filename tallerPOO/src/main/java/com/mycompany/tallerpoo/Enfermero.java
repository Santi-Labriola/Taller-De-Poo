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



public class Enfermero extends Persona {
    //public ArrayList<Triage> triage;  
    
    public Enfermero (String nombre, LocalDate fechaNacimiento, String domicilio, 
                  int documento, int telefoFijo, int telefonoCelular, 
                  String estadoCivil, String correoElectronico) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, 
            telefonoCelular, estadoCivil, correoElectronico);
                      
    }
    
    public void hacerAdmision(Paciente paciente){
        Medico.listaPacientes.add(paciente);
    }
}
 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;
import java.time.*;
/**
 *
 * @author Lucas
 */
public class Paciente extends Persona{ //extender de persona
    private String personaContacto;

    public Paciente(String nombre, LocalDate fechaNacimiento, String domicilio,
                    int documento, int telefoFijo, int telefonoCelular, 
                    String estadoCivil, String correoElectronico,
                    String personaContacto) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.personaContacto=personaContacto;
    }
    
    
    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }
    
    public int obtenerEdad(){
        
        int edad;
        LocalDate fechaActual= LocalDate.now(); //LocalDate.now() retorna la fecha local actual.
        LocalDate fechaNac=getFechaNacimiento();
        
        if (fechaActual.isAfter(fechaNac)){ //devuelve true si la fechaActual el mayor a la fechaNac.
            
            edad=fechaActual.getYear()-fechaNac.getYear(); //Se restan los años de cada fecha
            
            if (fechaActual.getMonthValue()<fechaNac.getMonthValue()){ //si el mes es menor, no cumplió años aun
                edad-=1;
            }
            else{
                if (fechaActual.getMonth()==fechaNac.getMonth()){
                    if (fechaActual.getDayOfMonth()<fechaNac.getDayOfMonth()){
                        edad-=1;
                    }
                }
            }
        }
        else{
            return -1; //retorna -1 si la fecha de nacimento es mayor a la fecha actual
        }
        return edad;
    }
}

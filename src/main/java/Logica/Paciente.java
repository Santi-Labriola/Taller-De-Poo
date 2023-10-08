/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.time.*;
/**
 *
 * @author Lucas
 */
public class Paciente { //extender de persona
    private String personaContacto;
    
    public Paciente(String personaContacto){
        
    }
    
    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }
    
    public int obtenerEdad(LocalDate fechaNacimiento,LocalDate fechaActual){
        int edad;
        if (fechaActual.isAfter(fechaNacimiento)){ //devuelve 1 si la fechaActual el mayor a la fechaNac.
            edad=fechaActual.getYear()-fechaNacimiento.getYear();
            if (fechaActual.getMonthValue()<fechaNacimiento.getMonthValue()){
                edad-=1;
            }
            else{
                if (fechaActual.getMonth()==fechaNacimiento.getMonth()){
                    if (fechaActual.getDayOfMonth()<fechaNacimiento.getDayOfMonth()){
                        edad-=1;
                    }
                }
            }
        }
        else{
            return -1;
        }
        return edad;
    }
}

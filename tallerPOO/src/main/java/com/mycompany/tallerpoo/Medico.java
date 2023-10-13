

package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;

/**
 *
 * @author Lucas
 */
public class Medico extends Persona{
    private int matricula;
    public static ArrayList<Paciente> listaPacientes=new ArrayList<>(); //lista que almacenara pacientes no atendidos.
    
    public Medico(String nombre, LocalDate fechaNacimiento, String domicilio, 
                  int documento, int telefoFijo, int telefonoCelular, 
                  String estadoCivil, String correoElectronico, int matricula) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.matricula=matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //Atender paciente quita de la lista de pacientes para atender, asi los otros
    //medicos ya no pueden verlo
    public void atenderPaciente(Paciente paciente){
        Medico.listaPacientes.remove(paciente); 
    }
    
    //hacer admision de pacientes que llegan al hospital, se los almacena en una
    //lista la cual contiene todos los pacientes en espera.
    //los medico pueden ver esta lista y atender (eliminar de lista) a pacientes.
    public void hacerAdmision(Paciente paciente){
        Medico.listaPacientes.add(paciente);
    }
}

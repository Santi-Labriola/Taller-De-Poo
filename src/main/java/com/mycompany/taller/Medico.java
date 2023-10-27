

package com.mycompany.taller;
import java.time.*;
import java.util.*;

/**
 *
 * @author Lucas
 */
public class Medico extends FuncionarioGeneral{
    private int matricula;
    private ArrayList<Especialidad> especialidad;
  
    public Medico(String nombre, LocalDate fechaNacimiento, String domicilio, 
                  int documento, int telefoFijo, int telefonoCelular, 
                  String estadoCivil, String correoElectronico, int matricula, String sector ,String rol, String personaDeContacto, String contrasenia) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico,sector ,rol,personaDeContacto,contrasenia);
        this.matricula=matricula;
        this.especialidad=new ArrayList<Especialidad>();
    }

    public Medico() {
        this.especialidad=new ArrayList<Especialidad>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void agregarEspecialidad(Especialidad espe){
        this.especialidad.add(espe);
    }
    
    //Atender paciente quita de la lista de pacientes para atender (ya triageados), asi los otros
    //medicos ya no pueden verlo
    public void atenderPaciente(Paciente paciente){
        DatosTaller.eliminarPacienteTriage(paciente); 
    }
    
    
    
    
    //hacer admision de pacientes que llegan al hospital, se los almacena en una
    //lista la cual contiene todos los pacientes en espera.
    //los medico pueden ver esta lista y atender (eliminar de lista) a pacientes.
    
    //ESTO NO VA EN MEDICO
//    public void hacerAdmision(Paciente paci){
//        
//        
//        
//        DatosTaller.agregarPacienteAdmision(paci);
//    }
    
    
    
    
    
    
    /**
     * Se crea un triage y se calcula el color del mismo en base a los datos que se pasen por parametro.
     * @param respiracion
     * @param pulso
     * @param estadoMental
     * @param conciencia
     * @param dificultadRespiracion
     * @param lesionesGraves
     * @param edad
     * @param fiebre
     * @param vomitos
     * @param dolorAbdominal
     * @param signosShock
     * @param lesionesLeves
     * @param sangrado
     * @param admision
     * @return triage con los datos pasados por parametro
     */
    public Triage hacerTriage(int respiracion, int pulso, int estadoMental, int conciencia, int dificultadRespiracion, int lesionesGraves, int edad, int fiebre, int vomitos, int dolorAbdominal, int signosShock, int lesionesLeves, int sangrado, AdmisionDeEmergencia admision){
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
    /**
     * Modifica el color de un triage.
     * @param triage triage a modificar
     * @param color color a seleccionar, debe ser uno de los siguientes: Rojo, Naranja, Amarillo, Verde, Azul
     * @param motivo motivo por el cual se realizo el cambio.
     */
    public void modificarTriage(Triage triage, String color, String motivo){
        triage.setColorFinal(color);
        triage.setMotivoCambio(motivo);
    }
    
    @Override
    public String toString() {
        return "Medico{" + "matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }
    
    
}

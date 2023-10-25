

package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;

/**
 *
 * @author Lucas
 */
public class Medico extends Persona{
    private int matricula;
    private ArrayList<Especialidad> especialidad;
  
    public Medico(String nombre, LocalDate fechaNacimiento, String domicilio, 
                  int documento, int telefoFijo, int telefonoCelular, 
                  String estadoCivil, String correoElectronico, int matricula) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
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
 
    
    /**
     * Se crea un triage y se calcula el color del mismo en base a los datos que
     * se pasen por parametro. Tambien añade al paciente a la lista de pacientes
     * triageados sin atender.
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
     * @return Objeto tipo Triage con los datos pasados por parametro, y con el color ya calculado.
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
        triage.setAdmision(admision);
        
        String color=triage.obtenerColorSugerido(respiracion, pulso, estadoMental, conciencia, dificultadRespiracion, lesionesGraves, edad, fiebre, vomitos, dolorAbdominal, signosShock, lesionesLeves, sangrado);
        
        triage.setColorSugerido(color);
        triage.setColorFinal(color);
        
        admision.setTriage(triage);
        
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
    
    /**
     * Intenta asignar un box a una admision. Este metodo deberia ser llamado al
     * atender a un paciente para asignarle un box.
     * @param admi admision a la que se le desea asignar un box.
     * @param box box que desea asignarse.
     * @return devuelve true si pudo asignarse correctamente, devuelve false si el
     * box está ocupado.
     */
    public boolean asignarBox(AdmisionDeEmergencia admi, Box box){
        if (box.isOcupado()){
            return false;
        }
        admi.setBox(box);
        box.setOcupado(true);
        
        return true;
    }
    
    /**
     * Intenta asignar un box a una admision. Este metodo deberia ser llamado al
     * atender a un paciente para asignarle un box.
     * @param admi admision a la que se le desea asignar un box.
     * @param numero numero de box que desea asignarse.
     * @return devuelve true si pudo asignarse correctamente, devuelve false si el
     * box está ocupado o si no existe.
     */
    public boolean asignarBox(AdmisionDeEmergencia admi, int numero){
        
        Box box=DatosTaller.getBoxes().getPorNumero(numero);
        
        if (box==null || box.isOcupado()){
            return false;
        }
        admi.setBox(box);
        box.setOcupado(true);
        
        return true;
    }
}


package com.mycompany.tallerpoo;
import java.time.*;
import java.util.ArrayList;

/**
 * Esta clase representa un objeto de tipo paciente, y es donde se almacena
 * toda la informacion con respecto a el.
 * @author Usuario
 */
public class Paciente extends Persona{ //extender de persona
    private String personaContacto;
    private ArrayList<ResultadoEstudios> estudios;
    private ArrayList<AdmisionDeEmergencia> admisiones;
    
    public Paciente(){
        super();
        this.personaContacto="";
        this.estudios=new ArrayList<ResultadoEstudios>();
        this.admisiones=new ArrayList<AdmisionDeEmergencia>();
    }
    
    public Paciente(String nombre, LocalDate fechaNacimiento, String domicilio,
                    int documento, int telefoFijo, int telefonoCelular, 
                    String estadoCivil, String correoElectronico,
                    String personaContacto) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.personaContacto=personaContacto;
        this.estudios=new ArrayList<ResultadoEstudios>();
        this.admisiones=new ArrayList<AdmisionDeEmergencia>();
        
    }
    
    public Paciente(String nombre, LocalDate fechaNacimiento, String domicilio,
                    int documento, int telefoFijo, int telefonoCelular, 
                    String estadoCivil, String correoElectronico,
                    String personaContacto, ArrayList<ResultadoEstudios> estudios,
                    ArrayList<AdmisionDeEmergencia> admisiones) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.personaContacto=personaContacto;
        this.estudios=estudios;
        this.admisiones=admisiones;
    }
    
    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }
    
    public ArrayList<ResultadoEstudios> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<ResultadoEstudios> estudios) {
        this.estudios = estudios;
    }

    public ArrayList<AdmisionDeEmergencia> getAdmisiones() {
        return admisiones;
    }

    public void setAdmisiones(ArrayList<AdmisionDeEmergencia> admisiones) {
        this.admisiones = admisiones;
    }
    /**
     * Metodo que agrega un estudio a la lista de estudios del paciente
     * @param resu tipo {@code ResultadoEstudios}
     * @see #agregarAdmision(com.mycompany.tallerpoo.AdmisionDeEmergencia) 
     */
    public void agregarEstudio(ResultadoEstudios resu){
        this.estudios.add(resu);
    }
    
    /**
     * Metodo que agrega una admision a la lista de admisiones del paciente
     * @param adm tipo {@code AdmisionDeEmergencia}
     */
    public void agregarAdmision(AdmisionDeEmergencia adm){
        this.admisiones.add(adm);
    }
    
    /**
     * Metodo para calcular la edad del paciente en base a su fecha de nacimiento.
     * @return {@code int} -  edad del paciente
     */
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
            return -1; //retorna -1 si la fecha de nacimento es mayor a la fecha actual.
        }
        return edad;
    }
    
    @Override
    public String toString() {
        return "Paciente{" + "Nombre=" + this.getNombre() + ", Documento=" + this.getDocumento() + ", Resultados=" + this.estudios + ", Admisiones=" + this.admisiones +'}';
    }


}

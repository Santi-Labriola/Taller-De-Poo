
package com.mycompany.tallerpoo;
import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Paciente extends Persona{ //extender de persona
    private String personaContacto;
    private ArrayList<ResultadoEstudios> estudios;
    
    public Paciente(){
    }
    
    public Paciente(String nombre, LocalDate fechaNacimiento, String domicilio,
                    int documento, int telefoFijo, int telefonoCelular, 
                    String estadoCivil, String correoElectronico,
                    String personaContacto) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.personaContacto=personaContacto;
    }

    public Paciente(String nombre, LocalDate fechaNacimiento, String domicilio,
                    int documento, int telefoFijo, int telefonoCelular, 
                    String estadoCivil, String correoElectronico,
                    String personaContacto, ResultadoEstudios estudios) {
        
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.personaContacto=personaContacto;
        this.estudios.add(estudios);
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
        return "Paciente{" + "Nombre=" + this.getNombre() + ", Documento=" + this.getDocumento() + '}';
    }


}

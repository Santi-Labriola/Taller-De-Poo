

package com.mycompany.tallerpoo;
import java.time.*;

/**
 *
 * @author Lucas
 */
public class Medico extends Persona{
        private int matricula;

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
    
}

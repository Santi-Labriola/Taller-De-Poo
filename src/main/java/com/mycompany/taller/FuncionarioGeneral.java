
package com.mycompany.taller;

import java.time.LocalDate;

/**
 *
 * @author 54345
 */
public class FuncionarioGeneral extends Persona{

    public FuncionarioGeneral(){
        super();
    }
    
    public FuncionarioGeneral(String nombre, LocalDate fechaNacimiento, String domicilio,
                              int documento, int telefoFijo, int telefonoCelular,
                              String estadoCivil, String correoElectronico){
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
    }
    
    public void accederAlSistema(String contraseña/*, int dni*/){
        
    }
    
}


package com.mycompany.taller;

import java.time.LocalDate;

/**
 *
 * @author 54345
 */
public class FuncionarioGeneral extends Persona{
    private String rol;
    private String sector;
    private String contrasenia;
    public FuncionarioGeneral(){
        super();
    }
    
    public FuncionarioGeneral(String nombre, LocalDate fechaNacimiento, String domicilio,
                              int documento, int telefoFijo, int telefonoCelular,
                              String estadoCivil, String correoElectronico,
                              String rol, String sector, String contrasenia){
        super(nombre, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico);
        this.rol = rol;
        this.sector=contrasenia;
        this.contrasenia=contrasenia;
    
    }
    
    public void accederAlSistema(String contraseña/*, int dni*/){
        
    }
    
}

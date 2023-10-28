
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

    public FuncionarioGeneral() {
    }
    
    public FuncionarioGeneral(String nombre,String apellido, LocalDate fechaNacimiento, String domicilio,
                              int documento, int telefoFijo, int telefonoCelular,
                              String estadoCivil, String correoElectronico,
                              String rol, String sector, String contrasenia,String personaDeContacto){
        super(nombre,apellido, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico, personaDeContacto);
        this.rol = rol;
        this.sector=contrasenia;
        this.contrasenia=contrasenia;
    
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void accederAlSistema(String contraseña/*, int dni*/){
        
    }
    
}

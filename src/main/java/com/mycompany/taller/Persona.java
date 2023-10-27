
package com.mycompany.taller;
import java.time.*;

/**
 *
 * @author Matias
 */
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private int documento;
    private int telefoFijo;
    private int telefonoCelular;
    private String  estadoCivil;
    private String correoElectronico;
    private String personaDeContacto;

    public Persona() {
    }
    
    public Persona(String nombre,String apellido, LocalDate fechaNacimiento, String domicilio,
            int documento, int telefoFijo, int telefonoCelular,
            String estadoCivil, String correoElectronico,String personaDeContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefoFijo = telefoFijo;
        this.telefonoCelular = telefonoCelular;
        this.estadoCivil = estadoCivil;
        this.correoElectronico = correoElectronico;
        this.personaDeContacto=personaDeContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefoFijo() {
        return telefoFijo;
    }

    public void setTelefoFijo(int telefoFijo) {
        this.telefoFijo = telefoFijo;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPersonaDeContacto() {
        return personaDeContacto;
    }

    public void setPersonaDeContacto(String personaDeContacto) {
        this.personaDeContacto = personaDeContacto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", documento=" + documento + ", telefoFijo=" + telefoFijo + ", telefonoCelular=" + telefonoCelular + ", estadoCivil=" + estadoCivil + ", correoElectronico=" + correoElectronico + ", personaDeContacto=" + personaDeContacto + '}';
    }
    
    
   
    
    
}
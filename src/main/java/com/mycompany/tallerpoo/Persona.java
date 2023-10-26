
package com.mycompany.tallerpoo;
import java.time.*;

/**
 *
 * @author Matias
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String domicilio;
    private String documento;
    private String telefoFijo;
    private String telefonoCelular;
    private String  estadoCivil;
    private String correoElectronico;
    private String motivo;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, String fechaNacimiento, String domicilio, String documento, String telefoFijo, String telefonoCelular, String estadoCivil, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefoFijo = telefoFijo;
        this.telefonoCelular = telefonoCelular;
        this.estadoCivil = estadoCivil;
        this.correoElectronico = correoElectronico;
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
   

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefoFijo() {
        return telefoFijo;
    }

    public void setTelefoFijo(String telefoFijo) {
        this.telefoFijo = telefoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", documento=" + documento + ", telefoFijo=" + telefoFijo + ", telefonoCelular=" + telefonoCelular + ", estadoCivil=" + estadoCivil + ", correoElectronico=" + correoElectronico + ", motivo=" + motivo + '}';
    }
    

    
    
    
}
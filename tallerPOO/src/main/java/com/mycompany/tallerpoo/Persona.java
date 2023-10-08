/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;
import java.time.*;

/**
 *
 * @author Matias
 */
public abstract class Persona {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private int documento;
    private int telefoFijo;
    private int telefonoCelular;
    private String  estadoCivil;
    private String correoElectronico;

    public Persona(String nombre, LocalDate fechaNacimiento, String domicilio, int documento, int telefoFijo, int telefonoCelular, String estadoCivil, String correoElectronico) {
        this.nombre = nombre;
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
    
    
}
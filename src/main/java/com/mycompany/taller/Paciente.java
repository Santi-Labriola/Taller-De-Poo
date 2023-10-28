package com.mycompany.taller;

import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Paciente extends Persona { //extender de persona

    
    private String motivo;
    private ArrayList<ResultadoEstudios> estudios;
    private ArrayList<AdmisionDeEmergencia> admisiones;

    public Paciente() {
        this.estudios = new ArrayList<ResultadoEstudios>();
        this.admisiones = new ArrayList<AdmisionDeEmergencia>();
    }

    public Paciente(String nombre,String apellido,LocalDate fechaNacimiento, String domicilio,
            int documento, int telefoFijo, int telefonoCelular,
            String estadoCivil, String correoElectronico,
            String personaDeContacto, String motivo) {

        super(nombre,apellido, fechaNacimiento, domicilio, documento,telefoFijo, telefonoCelular, estadoCivil, correoElectronico,personaDeContacto);
        
        this.motivo = motivo;
    }

   

    public Paciente(String nombre,String apellido, LocalDate fechaNacimiento, String domicilio,
            int documento, int telefoFijo, int telefonoCelular,
            String estadoCivil, String correoElectronico, String motivo,
            String personaDeContacto, ResultadoEstudios estudio, AdmisionDeEmergencia admision) {

        super(nombre,apellido, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico,personaDeContacto);
        this.motivo = motivo;
        this.estudios.add(estudio);
        this.admisiones.add(admision);
    }

    public Paciente(String nombre,String apellido, LocalDate fechaNacimiento, String domicilio,
            int documento, int telefoFijo, int telefonoCelular,
            String estadoCivil, String correoElectronico, String motivo,
            String personaDeContacto, ArrayList<ResultadoEstudios> estudios,
            ArrayList<AdmisionDeEmergencia> admisiones) {

        super(nombre,apellido, fechaNacimiento, domicilio, documento, telefoFijo, telefonoCelular, estadoCivil, correoElectronico,personaDeContacto);
        this.motivo = motivo;
        this.estudios = estudios;
        this.admisiones = admisiones;
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
    
     public String getMotivo() {
        return motivo;
    }
     
     

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void agregarEstudio(ResultadoEstudios resu) {
        this.estudios.add(resu);
    }

    public void agregarAdmision(AdmisionDeEmergencia adm) {
        this.admisiones.add(adm);
    }

    public int obtenerEdad() {

        int edad;
        LocalDate fechaActual = LocalDate.now(); //LocalDate.now() retorna la fecha local actual.
        LocalDate fechaNac = getFechaNacimiento();

        if (fechaActual.isAfter(fechaNac)) { //devuelve true si la fechaActual el mayor a la fechaNac.

            edad = fechaActual.getYear() - fechaNac.getYear(); //Se restan los años de cada fecha

            if (fechaActual.getMonthValue() < fechaNac.getMonthValue()) { //si el mes es menor, no cumplió años aun
                edad -= 1;
            } else {
                if (fechaActual.getMonth() == fechaNac.getMonth()) {
                    if (fechaActual.getDayOfMonth() < fechaNac.getDayOfMonth()) {
                        edad -= 1;
                    }
                }
            }
        } else {
            return -1; //retorna -1 si la fecha de nacimento es mayor a la fecha actual.
        }
        return edad;
    }

    @Override
    public String toString() {
        return "Paciente{" + "Nombre=" + this.getNombre() + ", Documento=" + this.getDocumento() + ", Resultados=" + this.estudios + ", Admisiones=" + this.admisiones + '}';
    }

}

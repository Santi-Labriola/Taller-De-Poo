
package com.mycompany.tallerpoo;
import java.time.*;
        
/**
 *
 * @author Lucas
 */
public class AsignacionBox {
    private LocalDate fecha;
    private LocalTime hora;
    private Box box;
    private AdmisionDeEmergencia admision;

    public AsignacionBox(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.box=new Box();
        this.admision=new AdmisionDeEmergencia();
    }

    public AsignacionBox(LocalDate fecha, LocalTime hora, Box box, AdmisionDeEmergencia admision) {
        this.fecha = fecha;
        this.hora = hora;
        this.box = box;
        this.admision = admision;
    }

        
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public AdmisionDeEmergencia getAdmision() {
        return admision;
    }

    public void setAdmision(AdmisionDeEmergencia admision) {
        this.admision = admision;
    }
    
    
}

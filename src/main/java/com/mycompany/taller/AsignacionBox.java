
package com.mycompany.taller;
import java.time.*;
        
/**
 *
 * @author Lucas
 */
public class AsignacionBox {
    private LocalDate fecha;
    private LocalTime hora;

    public AsignacionBox(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
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
    
}


package com.mycompany.tallerpoo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaAsignacionBox {
    ArrayList<AsignacionBox> asignaciones;

    public ListaAsignacionBox() {
        this.asignaciones=new ArrayList<AsignacionBox>();
    }

    public ListaAsignacionBox(ArrayList<AsignacionBox> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public ArrayList<AsignacionBox> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<AsignacionBox> asignaciones) {
        this.asignaciones = asignaciones;
    }
    
    public void agregar(AsignacionBox asig){
        asignaciones.add(asig);
    }
    
}

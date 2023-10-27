
package com.mycompany.tallerpoo;

import java.util.ArrayList;

/**
 * Esta clase es una colección que almacena instancias de la clase AsignacionBox.
 * Nos permite agregar asignaciones de box a la lista y proporciona métodos para acceder y gestionar
 * estas asignaciones.
 * @author Usuario
 */

public class ListaAsignacionBox {
    /**
     * Esta clase es una colección que guarda instancias de la clase AsignacionBox.
     * Permite agregar asignaciones de box a la lista y proporciona métodos para acceder y gestionar
     * estas asignaciones.
     */    
    private ArrayList<AsignacionBox> asignaciones;

    /**
     * Constructor de la clase que crea una lista vacía de asignaciones de box.
     */
    
    public ListaAsignacionBox() {
        this.asignaciones=new ArrayList<AsignacionBox>();
    }

    
    /**
     * Constructor de la clase ListaAsignacionBox que permite inicializar la lista con una lista
     * existente de asignaciones de box.
     *
     * @param asignaciones La lista de asignaciones de box para inicializar.
     */
    
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

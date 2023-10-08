
package Logica;


/**
 *
 * @author Lucas
 */
public class Box {
    private int numero;
    private boolean ocupado;

    public Box(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}

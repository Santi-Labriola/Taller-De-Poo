
package PantallaMain;
import Interfaz.PantallaLogin;
import static persistencia.ManejoArchivo.*;
public class Main {
    
    public static void main(String [] args){
    PantallaLogin login = new PantallaLogin();
    crearArchivo("archivos\\Paciente.txt");
    login.setVisible(true);
    login.setLocationRelativeTo(null);
    
    }
}

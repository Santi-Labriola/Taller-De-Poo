
package Main;
import Interfaz.PantallaLogin;

public class Login {
   public static void main(String []args){
   PantallaLogin login = new PantallaLogin();
   
     login.setVisible(true); //hace que la pantalla sea visible
     login.setLocationRelativeTo(null);//pone a la pantalla en medio
     
   } 
}

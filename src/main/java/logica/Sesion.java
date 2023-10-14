
package logica;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Sesion {
    
      String barra = File.separator;
    // Ruta relativa a la carpeta "TallerPoovvvv/Registro" dentro del proyecto
    String Ubicacion = System.getProperty("user.dir") + barra + "BaseDatos"+barra;
      private Component rootPane;
     public void sesion(String usuario, String contrasenia){
         System.out.println("entro");
        //obtengo el nombre del usuario dentro del archivo
        File direccion = new File(Ubicacion + usuario+ ".txt" );
        if(usuario.equals("") || contrasenia.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Complete los campos");
            System.out.print("paso condicion1");
        }else{
            if(direccion.exists()){
                try{
                    FileInputStream aValidar = new FileInputStream(direccion);
                    Properties validar = new Properties();
                    validar.load(aValidar);
                    String contraseniA = validar.getProperty("Contraseña");
                    if(contraseniA.equals(contrasenia)){
                   dispose(); 
                        System.out.println("llamo");
                   ControlLogin control = new ControlLogin();
                   control.rol(usuario);
                    }else{
                       
                    JOptionPane.showMessageDialog(rootPane,"Usuario y/o contraseña incorrecto");
                    }
                }catch(Exception e){
                }
            }else{
               
                JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrecto");
                
            }
                
        }
    
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

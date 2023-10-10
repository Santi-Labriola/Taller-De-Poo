
package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lucas
 */
public class ResultadoEstudios {
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoDeEstudio;
    private String informeDeEstudio;
    
    public ResultadoEstudios(){
        this.fecha=LocalDate.of(1, 1, 1);
        this.hora=LocalTime.of(0, 0,0);
        this.informeDeEstudio="";
    }

    public ResultadoEstudios(LocalDate fecha, LocalTime hora, String tipoDeEstudio, String informeDeEstudio) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informeDeEstudio = informeDeEstudio;
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

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getInformeDeEstudio() {
        return informeDeEstudio;
    }

    public void setInformeDeEstudio(String informeDeEstudio) {
        this.informeDeEstudio = informeDeEstudio;
    }
    
    //public Lista <------- FALTA programar obtenerResultadosDeEstudio(devuelve una lista de los resultados entre dos fechas
    //no lo empezamos porque falta saber como manejar base de datos/archivos
    
    public ArrayList obtenerResultadoEstudios(LocalDate fecha){
        //File archivo=new File("data/ResEstudios.txt");

        ArrayList lista=new ArrayList();
        try {
            BufferedReader reader= new BufferedReader (new FileReader("data/ResEstudios.txt"));
            String linea = reader.readLine();
            String [] split=new String[7];
            String [] stringA;
            LocalDate fecha2;
            while (linea!=null){
                split=linea.split(",");
                stringA=split[3].split("/");
                fecha2=LocalDate.of(Integer.parseInt(stringA[2]),Integer.parseInt(stringA[1]),Integer.parseInt(stringA[0]));
                if (fecha2==fecha){
                    lista.add(Arrays.asList(split));
                }
                linea = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return lista;
        
    }
}


/*try {
            PrintWriter writter= new PrintWriter(new FileWriter(archivo,true));
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/

//para escribir 
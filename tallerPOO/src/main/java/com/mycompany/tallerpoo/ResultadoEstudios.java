
package com.mycompany.tallerpoo;
import java.time.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Lucas
 */
public class ResultadoEstudios {
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoDeEstudio;
    private String informeDeEstudio;
    private Paciente paciente;
    
    public ResultadoEstudios(){
        this.fecha=LocalDate.of(1, 1, 1);
        this.hora=LocalTime.of(0, 0,0);
        this.informeDeEstudio="";
        this.paciente=null;
    }

    public ResultadoEstudios(LocalDate fecha, LocalTime hora, String tipoDeEstudio, String informeDeEstudio) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informeDeEstudio = informeDeEstudio;
        this.paciente=null;
    }
    
    public ResultadoEstudios(LocalDate fecha, LocalTime hora, String tipoDeEstudio, String informeDeEstudio, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informeDeEstudio = informeDeEstudio;
        this.paciente=paciente;
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
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public static ArrayList obtenerResultadoEstudios(LocalDate fecha){
        //File archivo=new File("data/ResEstudios.txt");

        ArrayList lista=new ArrayList();
        try {
            BufferedReader reader= new BufferedReader (new FileReader("src/main/java/Archivos/ResEstudios.txt"));
            
            String linea = reader.readLine();
            String [] split=new String[7];
            String [] stringA;
            LocalDate fecha2;
            
            while (linea!=null){
                split=linea.split(",");
                
                stringA=split[2].split("/");
                fecha2=LocalDate.of(Integer.parseInt(stringA[2]),Integer.parseInt(stringA[1]),Integer.parseInt(stringA[0]));
                
                
                if (fecha.equals(fecha2)){
                    BufferedReader reader2= new BufferedReader (new FileReader("src/main/java/Archivos/Pacientes/"+split[1]+".txt"));
                    linea=reader2.readLine();
                    String[] splitUsr= linea.split(",");
                    stringA=splitUsr[1].split("/");
                    
                    fecha2=LocalDate.of(Integer.parseInt(stringA[2]),Integer.parseInt(stringA[1]),Integer.parseInt(stringA[0]));
                            
                    Paciente pac= new Paciente(splitUsr[0],fecha2,splitUsr[2],
                                       Integer.parseInt(split[1]),Integer.parseInt(splitUsr[3]),
                                  Integer.parseInt(splitUsr[4]),splitUsr[5],splitUsr[6],splitUsr[7]);
                    
                    stringA= split[3].split(":");
                    LocalTime hora=LocalTime.of(Integer.parseInt(stringA[2]),Integer.parseInt(stringA[1]),Integer.parseInt(stringA[0]));
                    
                    ResultadoEstudios resu= new ResultadoEstudios(fecha,hora,split[4],split[5],pac);
                   
                    lista.add(resu);
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
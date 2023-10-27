
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class ListaResEstudios {
    protected ArrayList <ResultadoEstudios> resultados;

    public ListaResEstudios(ArrayList<ResultadoEstudios> resultados) {
        this.resultados = resultados;
    }

    public ListaResEstudios() {
        this.resultados=new ArrayList <ResultadoEstudios>();
    }

    public ArrayList<ResultadoEstudios> getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList<ResultadoEstudios> resultados) {
        this.resultados = resultados;
    }
    
    public void agregar(ResultadoEstudios resu){
        resultados.add(resu);
    }
    
    public void eliminar(ResultadoEstudios resu){
        resultados.remove(resu);
    }
    
    public void agregarAlArchivo(String archivoNombre, ResultadoEstudios res){
        PrintWriter salida= null;
        try {
            File archivo= new File(archivoNombre);
            salida = new PrintWriter(new FileWriter(archivo, true ));
            
            salida.println(res.getPaciente().getDocumento()+","+res.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                           +","+res.getHora()+","+res.getTipoDeEstudio()+","+res.getInformeDeEstudio());
            
        } catch (IOException ex) {

        } finally {
            salida.close();
        } 
    }
    public ArrayList getListaPorFecha(LocalDate fecha){
        ArrayList<ResultadoEstudios> resultados=new ArrayList();
        for (ResultadoEstudios resu : this.resultados){
            if (resu.getFecha().isEqual(fecha)){
                resultados.add(resu);
            }
        }
        return resultados;
    }
        
    public void leer(String archivo){
        
        ListaPacientes listapaci=DatosTaller.getPacientes();
        try {
            BufferedReader reader= new BufferedReader (new FileReader(archivo));
            String linea = reader.readLine();
            
            while (linea!=null && !linea.isBlank()){
                String[] split=linea.split(",");//splitea la linea
                String[] splitFecha=split[1].split("/");//splitea la fecha 
                String[] splitHora=split[2].split(":");//splitea la hora
                
                ResultadoEstudios resu=new ResultadoEstudios();
                
                //se inicializar la fecha y hora
                LocalDate fecha= LocalDate.of(Integer.parseInt(splitFecha[2]),
                                                Integer.parseInt(splitFecha[1]),
                                                Integer.parseInt(splitFecha[0]));
                
                LocalTime hora= LocalTime.of(Integer.parseInt(splitHora[0]),
                                                Integer.parseInt(splitHora[1]),
                                                Integer.parseInt(splitHora[2]));
                
                resu.setFecha(fecha);
                resu.setHora(hora);
                
                resu.setTipoDeEstudio(split[3]);
                resu.setInformeDeEstudio(split[4]);
               
                /*si se paso la lista de pacientes por parametro, se busca por dni al paciente
                y hace un setPaciente.
                */
                if (listapaci!=null){            
                    Paciente paci=listapaci.getPorDni(Integer.parseInt(split[0]));
                    resu.setPaciente(paci);
                    
                    //si el paciente existe, se añade este resultado de estudio a la lista del paciente.
                    if (paci!=null){
                        paci.agregarEstudio(resu);
                    }
                }
                this.agregar(resu);
                linea = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
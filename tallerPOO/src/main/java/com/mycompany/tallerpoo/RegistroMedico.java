/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Matias
 */

public class RegistroMedico {
    
    private LocalDate fecha;
    private LocalTime hora; 
    private String lugarAtendido;
    private String diagnostico;
    private String diagnosticoClinico;
    public ArrayList<RegistroMedico> registroMedico;
    public AdmisionDeEmergencia admisionDeEmergencia;
    public ArrayList<Medico> medico;
    public Paciente paciente;

    public RegistroMedico(LocalDate fecha, LocalTime hora, String lugarAtendido, String diagnostico, String diagnosticoClinico) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugarAtendido = lugarAtendido;
        this.diagnostico = diagnostico;
        this.diagnosticoClinico = diagnosticoClinico;
    }
	
    public RegistroMedico() {
        this.fecha = LocalDate.of(1, 1, 1);
        this.hora = LocalTime.of(0, 0,0);
	this.lugarAtendido = "";
	this.diagnostico = "";
	this.diagnosticoClinico = "";
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

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnosticoClinico() {
        return diagnosticoClinico;
    }

    public void setDiagnosticoClinico(String diagnosticoClinico) {
        this.diagnosticoClinico = diagnosticoClinico;
    }

    
    //calcula  los pacientes que mas consultaron en un rango de fechas
    public static ArrayList<String> calcularMasConsPorFecha(LocalDate fecha1, LocalDate fecha2) {
    String barra = File.separator;
    ArrayList<String> personasConMasConsultas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Archivos" + barra + "PacientesVariasConsultas"))) {
        String linea = br.readLine();
        ArrayList<String> dnis = new ArrayList<>();
        ArrayList<LocalDate> fechas = new ArrayList<>();

        while (linea != null) {
            String[] array = linea.split(",");
            if(array.length>=10){
            
            String[] splitFecha = array[9].split("/");
            LocalDate fechaConsulta = LocalDate.of(Integer.parseInt(splitFecha[2]), Integer.parseInt(splitFecha[1]), Integer.parseInt(splitFecha[0]));
            
            dnis.add(array[0]);
            fechas.add(fechaConsulta);
            }
            linea = br.readLine();
        }

        // Crear un HashMap para realizar un seguimiento de las consultas por persona
        HashMap<String, Integer> consultasPorPersona = new HashMap<>();

        // Iterar sobre los DNIs y fechas
        for (int i = 0; i < dnis.size(); i++) {
            String dni = dnis.get(i);
            LocalDate fechaConsulta = fechas.get(i);
            
            // Verificar si la fecha de consulta está dentro del rango
            if (fechaConsulta.isAfter(fecha1) && fechaConsulta.isBefore(fecha2)) {
                consultasPorPersona.put(dni, consultasPorPersona.getOrDefault(dni, 0) + 1);
            }
        }

        int maxConsultas = 0;

        // Encontrar el número máximo de consultas en el rango
        for (String dni : consultasPorPersona.keySet()) {
            int consultas = consultasPorPersona.get(dni);
            if (consultas > maxConsultas) {
                maxConsultas = consultas;
                personasConMasConsultas.clear();
                personasConMasConsultas.add(dni);
            } else if (consultas == maxConsultas) {
                personasConMasConsultas.add(dni);
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    return personasConMasConsultas;
    }
        

    //calcula el numero pacientes de que un medico ,ingresado por dni, atendio
    public static int calcularNumPacDeMedPorFecha(LocalDate fecha1, LocalDate fecha2, String dniMedico) {
        String barra = File.separator;
        ArrayList<String> paciAtenMedi = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos" + barra + "PacientesVariasConsultas"))) {
            String linea = br.readLine();

            while (linea != null) {
                String[] array = linea.split(",");
                if (array.length >= 11) { // Asegúrate de que haya suficientes campos en la línea
                    String dniPaciente = array[0];
                    String fechaAtencionStr = array[9];
                    String medicoAsignado = array[10];

                    String[] splitFecha = fechaAtencionStr.split("/");
                    LocalDate fechaAtencion = LocalDate.of(
                            Integer.parseInt(splitFecha[2]),
                            Integer.parseInt(splitFecha[1]),
                            Integer.parseInt(splitFecha[0])
                    );

                    if (medicoAsignado.equals(dniMedico) && fechaAtencion.isAfter(fecha1) && fechaAtencion.isBefore(fecha2)) {
                        paciAtenMedi.add(dniPaciente);
                    }
                    
                }
                linea = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return paciAtenMedi.size();
    }

    //////// medico que tuvo mas pacientes por fecha
    public static String calcularMedMasPacPorFecha(LocalDate fecha1, LocalDate fecha2, String dniMedico) {
        String barra = File.separator;
        ArrayList<String> citas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos" + barra + "PacientesVariasConsultas"))) {
            String linea = br.readLine();

            while (linea != null) {
                String[] array = linea.split(",");
                if (array.length >= 11) {
                    String dniPaciente = array[0];
                    String fechaAtencionStr = array[9];
                    String medicoAsignado = array[10];

                    String[] splitFecha = fechaAtencionStr.split("/");
                    LocalDate fechaAtencion = LocalDate.of(
                            Integer.parseInt(splitFecha[2]),
                            Integer.parseInt(splitFecha[1]),
                            Integer.parseInt(splitFecha[0])
                    );

                    if (fechaAtencion.isAfter(fecha1) && fechaAtencion.isBefore(fecha2) && medicoAsignado.equals(dniMedico)) {
                        citas.add(dniPaciente);
                    }
                }
                linea = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Calcular al médico que atendió a la mayoría de pacientes
        Map<String, Integer> contadorMedicos = new HashMap<>();
        for (String dniPaciente : citas) {
            contadorMedicos.put(dniPaciente, contadorMedicos.getOrDefault(dniPaciente, 0) + 1);
        }

        int maxPacientesAtendidos = 0;
        String medicoConMasPacientes = null;

        for (Map.Entry<String, Integer> entry : contadorMedicos.entrySet()) {
            if (entry.getValue() > maxPacientesAtendidos) {
                maxPacientesAtendidos = entry.getValue();
                medicoConMasPacientes = entry.getKey();
            }
        }

        return medicoConMasPacientes;
    }








   /* public int CalcularPacPorEdadesyFechas(int edad1, int edad2, LocalDate fecha1, LocalDate fecha2){
        
    }
    
    
    public list<String> calcularMedMasPacPorFecha(LocalDate fecha1, LocalDate fecha2)
    
   */
    
    @Override
    public String toString() {
        return "RegistroMedico{" + "fecha=" + fecha + ", hora=" + hora + ", lugarAtendido=" + lugarAtendido + ", diagnostico=" + diagnostico + ", diagnosticoClinico=" + diagnosticoClinico + '}';
    }
    
}

package com.mycompany.tallerpoo;

/**
 *
 * @author Usuario
 */
public abstract class DatosTaller {
    private static ListaPacientes pacientes=new ListaPacientes();
    private static ListaMedicos medicos=new ListaMedicos();
    private static ListaResEstudios resultados=new ListaResEstudios();
    private static ListaAdmisiones admisiones=new ListaAdmisiones();
    private static ListaEspecialidades especialidades=new ListaEspecialidades();
    private static ListaBox boxes=new ListaBox();
    private static ListaPacientes pacientesSinTriage=new ListaPacientes();
    private static ListaPacientes pacientesTriageados=new ListaPacientes();
    private static ListaAsignacionBox asignaciones=new ListaAsignacionBox();
    private static ListaEnfermeros enfermeros=new ListaEnfermeros();
    private static ListaTriage triages=new ListaTriage();

    public static ListaTriage getTriages() {
        return triages;
    }

    public static void setTriages(ListaTriage triages) {
        DatosTaller.triages = triages;
    }

    public static ListaPacientes getPacientes() {
        return pacientes;
    }

    
    
    public static void setPacientes(ListaPacientes pacientes) {
        DatosTaller.pacientes = pacientes;
    }

    public static ListaMedicos getMedicos() {
        return medicos;
    }

    public static void setMedicos(ListaMedicos medicos) {
        DatosTaller.medicos = medicos;
    }

    public static ListaResEstudios getResultados() {
        return resultados;
    }

    public static void setResultados(ListaResEstudios resultados) {
        DatosTaller.resultados = resultados;
    }

    public static ListaAdmisiones getAdmisiones() {
        return admisiones;
    }

    public static void setAdmisiones(ListaAdmisiones admisiones) {
        DatosTaller.admisiones = admisiones;
    }

    public static ListaEspecialidades getEspecialidades() {
        return especialidades;
    }

    public static void setEspecialidades(ListaEspecialidades especialidades) {
        DatosTaller.especialidades = especialidades;
    }

    public static ListaBox getBoxes() {
        return boxes;
    }

    public static void setBoxes(ListaBox boxes) {
        DatosTaller.boxes = boxes;
    }
    
    public static ListaPacientes getPacientesSinTriage() {
        return pacientesSinTriage;
    }

    public static void setPacientesSinTriage(ListaPacientes pacientesSinTriage) {
        DatosTaller.pacientesSinTriage = pacientesSinTriage;
    }

    public static ListaPacientes getPacientesTriageados() {
        return pacientesTriageados;
    }

    public static void setPacientesTriageados(ListaPacientes pacientesTriageados) {
        DatosTaller.pacientesTriageados = pacientesTriageados;
    }

    public static ListaAsignacionBox getAsignaciones() {
        return asignaciones;
    }

    public static ListaEnfermeros getEnfermeros() {
        return enfermeros;
    }

    public static void setEnfermeros(ListaEnfermeros enfermeros) {
        DatosTaller.enfermeros = enfermeros;
    }
    
    public static void setAsignaciones(ListaAsignacionBox asignaciones) {
        DatosTaller.asignaciones = asignaciones;
    }
       
    public static void agregarPaciente(Paciente paci){
        pacientes.agregar(paci);
    }
    
    public static void agregarPacienteAdmision(Paciente paci){
        pacientesSinTriage.agregar(paci);
    }
    
    public static void eliminarPacienteAdmision(Paciente paci){
        pacientesSinTriage.eliminar(paci);
    }
    
    
    public static void agregarPacienteTriage(Paciente paci){
        pacientesTriageados.agregar(paci);
    }
    
    public static void eliminarPacienteTriage(Paciente paci){
        pacientesTriageados.eliminar(paci);
    }

}

package logica;

import Interfaz.Triage;

public class ColorTriage {

    int res;
    int pulso;
    int dolorPe;
    int lesionGrav;
    int edadd;
    int fiebree;
    int shockk;
    int lesionesLev;
    int estadoMen;
    int concienciaa;
    int vomitoss;
    int resultado;
    String triage;

    public void color(String[] obtener) {
        if (obtener[0] == "Normal") {
            res = 0;
        } else {
            if (obtener[0] == "Moderada") {
                res = 1;
            } else {
                res = 2;
            }
        }
        if (obtener[1] == "Normal") {
            pulso = 0;
        } else {
            pulso = 1;
        }
        if (obtener[2] == "No presente") {
            estadoMen = 0;
        } else {
            if (obtener[2] == "Noderado") {
                estadoMen = 1;
            } else {
                estadoMen = 2;
            }
        }
        if (obtener[3] == "No presente") {
            dolorPe = 0;
        } else {
            dolorPe = 1;
        }
        if (obtener[4] == "No presente") {
            lesionGrav = 0;
        } else {
            lesionGrav = 2;
        }
        if (obtener[5] == "Adulto") {
            edadd = 0;
        } else {
            edadd = 1;
        }
        if (obtener[6].equals("Sin fiebre")) {
            fiebree = 0;
        } else {
            if (obtener[6] == "Moderada") {
                fiebree = 1;
            } else {
                fiebree = 2;
            }
        }
        if (obtener[7] == "No presentes") {
            shockk = 0;
        } else {
            shockk = 3;
        }
        if (obtener[8] == "No presentes") {
            lesionesLev = 0;
        } else {
            lesionesLev = 1;
        }
        if (obtener[9] == "Normal") {
            estadoMen = 0;
        } else {
            if (obtener[9] == "Leve") {
                estadoMen = 1;
            } else {
                estadoMen = 2;
            }
        }
        if (obtener[10] == "Conciente y alerta") {
            concienciaa = 0;
        } else {
            concienciaa = 3;
        }
        if (obtener[11] == "Sin vomitos") {
            vomitoss = 0;
        } else {
            if (obtener[11] == "Moderado") {
                vomitoss = 1;
            } else {
                vomitoss = 2;
            }
        }
        resultado = res + pulso + dolorPe + lesionGrav + lesionGrav + edadd
         + fiebree + shockk + lesionesLev + estadoMen + concienciaa + vomitoss
         + resultado;
        System.out.println(resultado);
        if(resultado>=15){
        //triage ="ROJO";
        Triage retorno = new Triage();
        retorno.mostrar("ROJO");
        }
        if(resultado>=10 && resultado<=14){
        //triage="NARANJA";
        Triage retorno = new Triage();
        retorno.mostrar("NARANAJA");
        }
        if(resultado>=5&&resultado<=9){
        //triage="AMARILLO";
        Triage retorno = new Triage();
        retorno.mostrar("AMARILLO");
        }
        if(resultado>0 && resultado<=4){
        //triage="AZUL";
        Triage retorno = new Triage();
        retorno.mostrar("AZUL");
        }
        if(resultado==0){
        //triage="VERDE";
         Triage retorno = new Triage();
        retorno.mostrar("VERDE");
        }
        }
        }
        
        /*Triage retorno = new Triage();
        retorno.mostrar(triage);
        System.out.println("si");*/
    


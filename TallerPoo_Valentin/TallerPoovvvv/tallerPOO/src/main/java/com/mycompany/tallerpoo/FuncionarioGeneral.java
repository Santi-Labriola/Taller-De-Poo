/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpoo;

/**
 *
 * @author 54345
 */
public class FuncionarioGeneral {
    
    private String contraseña;

    public FuncionarioGeneral(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public FuncionarioGeneral(){
        contraseña = "";
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void accederAlSistema(String contraseña/*, int dni*/){
        
    }
    
}

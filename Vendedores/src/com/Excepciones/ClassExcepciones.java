/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Excepciones;

/**
 *
 * @author USUARIOTC
 */
public class ClassExcepciones extends Exception{
    private String mensaje;
    public ClassExcepciones(String msg){
        this.mensaje=msg;
    }
    
}

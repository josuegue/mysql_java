/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Datos;

import com.Dominio.ClassVendedor;
import com.Excepciones.ClassEscriExcep;
import com.Excepciones.ClassExcepciones;
import com.Excepciones.ClassLectExcep;
import java.util.List;

/**
 *
 * @author USUARIOTC
 */
public interface InterfaceDatosVendedor {
    boolean existe(String nombreArchivo) throws ClassExcepciones;
    public List <ClassVendedor>  listar(String nombre_Archivo) throws ClassLectExcep;
    void escribir (ClassVendedor vendedor, String nombre_Archivo, boolean anexar) throws ClassEscriExcep;
    public void buscar(String nombre_Archivo, String buscar) throws ClassLectExcep;
    public void crear(String nombre_Archivo) throws ClassEscriExcep;
    public void borrar(String nombre_Archivo) throws ClassExcepciones;
}

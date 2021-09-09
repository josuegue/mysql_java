/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Negocio;

import com.Datos.ClassDatosVendedor;
import com.Datos.InterfaceDatosVendedor;
import com.Dominio.ClassVendedor;
import com.Excepciones.ClassExcepciones;
import com.Excepciones.ClassLectExcep;
import java.util.List;


/**
 *
 * @author USUARIOTC
 */
public class ClassRegistroVendedor implements InterfaceRegistroVendedor{
    private final InterfaceDatosVendedor acceso_Datos;
    public ClassRegistroVendedor(){
        this.acceso_Datos= new ClassDatosVendedor();
    }
    
    @Override
    public void agregar_Vendedor(String nombreVendedor, double enero, double febrero, double marzo, String nombreArchivo) {
        ClassVendedor vendedor = new ClassVendedor(nombreVendedor,enero,febrero,marzo);
        boolean anexar = false;
        try {
            anexar=acceso_Datos.existe(nombreArchivo);
            acceso_Datos.escribir(vendedor, nombreArchivo, anexar);
            
        } catch (ClassExcepciones ex) {
            System.out.println("Error al accesar datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listar_Vendedor(String nombreArchivo) {
        String [] datos;
        try {
            List<ClassVendedor> vendedor = acceso_Datos.listar(nombreArchivo);
            for (ClassVendedor vnd: vendedor){
                System.out.println(vnd.getNombre());
            }
        } catch (ClassLectExcep ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscar_Vendedor(String nombreArchivo, String buscar) {
        try {
            acceso_Datos.buscar(nombreArchivo, buscar);
        } catch (ClassLectExcep ex) {
            System.out.println("Error al buscar al vendedor: ");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void iniciar_Archivo(String nombreArchivo) {
        try {
            if(acceso_Datos.existe(nombreArchivo)){
                acceso_Datos.borrar(nombreArchivo);
                acceso_Datos.crear(nombreArchivo);
            } 
            else{
                acceso_Datos.crear(nombreArchivo);
            }
        } catch (ClassExcepciones ex) {
            System.out.println("Error de acceso: ");
            ex.printStackTrace(System.out);
        }
    }


    
}

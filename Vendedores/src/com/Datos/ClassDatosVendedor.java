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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.LinearGradient;

/**
 *
 * @author USUARIOTC
 */
public class ClassDatosVendedor implements InterfaceDatosVendedor{
    private final static DecimalFormat df =new DecimalFormat("###.##");

    @Override
    public boolean existe(String nombreArchivo) throws ClassExcepciones {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<ClassVendedor> listar(String nombre_Archivo) throws ClassLectExcep {
        List <ClassVendedor> vendedores = new ArrayList();
     
        try {
            BufferedReader entrada =null;
            File archivo = new File(nombre_Archivo);
            entrada=new BufferedReader(new FileReader(archivo));
            
            String linea = null;
            linea=entrada.readLine();
            while(linea!=null){
                ClassVendedor vendedor = new ClassVendedor(linea);
                //Constructor, si  sale mal pues modificarlo
                vendedores.add(vendedor);
                linea=entrada.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch( IOException ex){
            ex.printStackTrace(System.out);
        }
        return vendedores;
    }

    @Override
    public void escribir(ClassVendedor vendedor, String nombre_Archivo, boolean anexar) throws ClassEscriExcep {
        PrintWriter salida= null;
        try {
            File archivo = new File(nombre_Archivo);
            salida=new PrintWriter(new FileWriter(archivo, anexar));
            //Aqui se puede concatenar todo el string de los datos
            salida.println(vendedor.toNombre()+";"+df.format(vendedor.toEnero())+";"+df.format(vendedor.toFebrero())+";"+df.format(vendedor.toMarzo())+";"+df.format(vendedor.toPromedio())+";"+df.format(vendedor.toGranTotal()));
            salida.close();
            System.out.println("Se ha realizado un registro");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            salida.close();
        }
    }

    @Override
    public void buscar(String nombre_Archivo, String buscar) throws ClassLectExcep {
        BufferedReader entrada= null;
        String resultado=null;
        
        try {
            
            File archivo = new File(nombre_Archivo);
            entrada= new BufferedReader (new FileReader(archivo));
            String linea = entrada.readLine();
            int i=0;
            String [] datos=null;
            while(linea!=null){
                datos=linea.split(";");
                if (datos[0].equalsIgnoreCase(buscar)){
                    System.out.println("Nombre encontrado: "+ datos[0]+" en el No. de lista - "+i);
                    break;
                }
                linea=entrada.readLine();
                
                
                i++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void crear(String nombre_Archivo) throws ClassEscriExcep {
       PrintWriter salida=null;
        try {
            File archivo = new File(nombre_Archivo);
            salida= new PrintWriter(archivo);
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            salida.close();
        }
    }

    @Override
    public void borrar(String nombre_Archivo) throws ClassExcepciones {
        File archivo = new File(nombre_Archivo);
        archivo.delete();
        System.out.println("Se ha eliminado el archivo");
    }
    
}

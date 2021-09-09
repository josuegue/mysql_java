/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dominio;

/**
 *
 * @author USUARIOTC
 */
public class ClassVendedor {
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double promedio;
    private double gran_Total;
    
    public ClassVendedor(String nombre){
        this.nombre=nombre;
    }
    public ClassVendedor(String number, double january, double february, double march){
        this.nombre=number;
        this.enero=january;
        this.febrero=february;
        this.marzo=march;
        this.promedio=(january+february+march)/3;
        this.gran_Total=january+february+march;
    }
    
    public String toNombre(){
        return getNombre();
    }
    
    public double toFebrero(){
        return getFebrero();
    }
    public double toEnero(){
        return getEnero();
    }
    public double toMarzo(){
        return getMarzo();
    }
    public double toPromedio(){
        return getPromedio();
    }
    public double toGranTotal(){
        return getGran_Total();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the gran_Total
     */
    public double getGran_Total() {
        return gran_Total;
    }

    /**
     * @param gran_Total the gran_Total to set
     */
    public void setGran_Total(double gran_Total) {
        this.gran_Total = gran_Total;
    }
    
}

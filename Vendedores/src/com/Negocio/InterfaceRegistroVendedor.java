/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Negocio;

/**
 *
 * @author USUARIOTC
 */
public interface InterfaceRegistroVendedor {
    public void agregar_Vendedor(String nombreVendedor, double enero, double febrero, double marzo, String nombreArchivo);
    public void listar_Vendedor(String nombreArchivo);
    public void buscar_Vendedor(String nombreArchivo, String buscar);
    public void iniciar_Archivo(String nombreArchivo);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;

import com.Datos.ClassDatosVendedor;
import com.Datos.InterfaceDatosVendedor;
import com.Negocio.ClassRegistroVendedor;
import com.Negocio.InterfaceRegistroVendedor;
import java.util.Scanner;

/**
 *
 * @author USUARIOTC
 */
public class Vendedores {
    private static final Scanner sn = new Scanner(System.in);
    private static final String nombre_Archivo="C:\\Users\\USUARIOTC\\Documents\\Ejercicios JavaP2\\Vendedores\\Archivostxt\\prueba.txt";
    private static final InterfaceRegistroVendedor datos_Vendedor= new ClassRegistroVendedor();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        probarelrecirrudo prueba = new probarelrecirrudo();
//        prueba.probar(nombre_Archivo, "eduardo");
//        
        
        
        menu();
    }
    private static void menu(){
        int op=0;
        do { 
            System.out.print("\n\nIngresa --- 0 --- para salir"
                    + "\n1. - Iniciar lista de vendedores"
                    + "\n2. - Agregar vendedor"
                    + "\n3. - Listar vendedores"
                    + "\n4. - Buscar vendedor"
                    + "\nIngresa tu opcion: ");
            op=sn.nextInt();
            sn.nextLine();
            
            switch(op){
                case 1:
                    //Se inicia el archivo
                    System.out.println("\n\n");
                    datos_Vendedor.iniciar_Archivo(nombre_Archivo);
                    break;
                case 2:
                    //Agregar vendedores
                    System.out.println("\n\n");
                    String nombre="";
                    double enero=0.0f;
                    double febrero=0.0f;
                    double marzo=0.0f;
                    System.out.print("Ingresa el nombre: ");
                    nombre=sn.nextLine();
                    System.out.print("Ingresa la cantidad de enero: ");
                    enero=sn.nextDouble();
                    System.out.print("Ingresa la cantidad de febrero: ");
                    febrero=sn.nextDouble();
                    System.out.print("Ingresa la cantidad de marzo: ");
                    marzo=sn.nextDouble();
                    sn.nextLine();
                    datos_Vendedor.agregar_Vendedor(nombre, enero, febrero, marzo, nombre_Archivo);
                    
                    break;
                case 3:
                    //Listar vendedores
                    System.out.println("\n\n");
                    System.out.println("------Lista de vendedores-----");
                    datos_Vendedor.listar_Vendedor(nombre_Archivo);
                    System.out.println("------Final-----");
                    break;
                case 4:
                    //Buscar vendedor por nombre
                    System.out.println("\n\n");
                    System.out.print("Ingresa el nombre del vendedor: ");
                    String buscar = sn.nextLine();
                    datos_Vendedor.buscar_Vendedor(nombre_Archivo, buscar);
                    break;
                case 0:
                    System.out.println("\n\n");
                    System.out.println("Gracias tu preferencia.");
                    break;
                default:
                    System.out.println("\n\n");
                    System.out.println("Error de opcion, vuelve a intentar");
            }
            
            
        } while (op!=0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author USUARIOTC
 */
public class probarelrecirrudo {
        public void probar(String nombre_Archivo, String buscar) {
        BufferedReader entrada= null;
        String resultado="vos no se encontro nada";
        
        try {
            
            File archivo = new File(nombre_Archivo);
            entrada= new BufferedReader (new FileReader(archivo));
            String linea = entrada.readLine();
            int i=0;
            String [] datos=null;
            while(linea!=null){
                datos=linea.split(";");
                if (datos[0].equalsIgnoreCase(buscar)){
                    System.out.println("Nonbre encontrado: "+ datos[0]+" en el No. de lista - "+i);
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
    
}

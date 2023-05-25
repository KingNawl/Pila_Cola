/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila_cola;

import java.util.ArrayList;
import pila_cola.clases.*;

/**
 *
 * @author alumno
 */


public class Pila_Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona>lista =new ArrayList<>();
        
        
        Persona p=new Persona();
        
        Cola c=new Cola();
        
         if(c.colaAñadir(lista, p)){
             System.out.println("El elemento se ha insertado");
         }else{
             System.out.println("El elemento no se ha insertado");
         }
        
    }
    
    
    
}

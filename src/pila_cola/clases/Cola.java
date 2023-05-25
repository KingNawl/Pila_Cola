/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila_cola.clases;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */

 //Simular con un arraylist una pila: coger, insertar, borrar 
    
    /*Cada vez que inserto la longitud se irá reduciendo
    
    
    Simular con un arraylist una cola

    */
public class Cola {
     private final int TOPE_COLA=10;

    public Cola() { //constructor vacío
    }

    
    
    public boolean colaAñadir(ArrayList<Persona> lista, Persona p){
         
         if(!colaLlena(lista)){
            lista.add(p);
             
            return true;
         }
         
         return false;
    }
    
    
    public boolean colaLlena(ArrayList<Persona> lista){
         
        return lista.size()>= TOPE_COLA; //cuando esto se cumpla estará llena
        
        /* otra forma de hacerlo:
        int contador;
        contador= c.size()-TOPE_COLA;
        
        if(contador>0){
            return false;
        }
        return true;
        
        */
     }
     
    public Persona sacarCola(ArrayList<Persona> lista){ // obtener dato del arraylist
         
         Persona p=null; //inicializar la variable Persona
         
         if(!lista.isEmpty()){ // si no está vacío
 //también se puede hacer lista.size()!= 0 && lista.size() < colaLlena()
             p=lista.get(0);
             lista.remove(0);
         }
         
         return p;
     }
}

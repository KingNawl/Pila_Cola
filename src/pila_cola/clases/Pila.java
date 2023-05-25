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
public class Pila {
    
    private final int TOPE_PILA=10;

    public Pila() {
    }

    
    
    public boolean pilaAñadir(ArrayList<Persona>lista, Persona p){
         
         if(!pilaLlena(lista)){
             lista.add(p);
             
             return true;
         }
         
         return false;
    }
     
    public boolean pilaLlena(ArrayList<Persona>lista){
         
         return lista.size()>=TOPE_PILA;
     }
     
    
    public Persona sacarPila(ArrayList<Persona>lista){
         Persona p=null;
         if (!lista.isEmpty()){ 
//también se puede hacer lista.size()!= 0 && lista.size() < pilaLlena()
         
             p=lista.get(lista.size()-1);//-1 porque siempre es uno más la long de la lista
             lista.remove(lista.size()-1);
         }
         
         return p;
     }
    
    
    
    public void sumarPila(ArrayList<Integer>lista1, ArrayList<Integer>lista2){
       ArrayList<Integer> lista3 = new ArrayList<>();
       ArrayList<Integer>listaaux=new ArrayList<>();
       int indice=0;
       int suma=0;
       
       
       while(indice<lista1.size() && indice<lista2.size()){
           suma=lista1.get(indice)+lista2.get(indice);
           listaaux.add(suma);
           indice++;
       }
      indice=0;
       while(indice<listaaux.size()){
           if (!listaaux.isEmpty()){ 
               lista3.add(listaaux.get(indice));
               listaaux
//             lista3.add(listaaux.get(listaaux.size()-1));//-1 porque siempre es uno más la long de la lista
//             listaaux.remove(listaaux.size()-1);
         }
           indice++;
       }
        
    }
     
}

/*
Open Webinars hay un ejemplo de list, map y set: 12_Colecciones
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila_cola.clases;

/**
 *
 * @author alumno
 */

/*
Propiedades básicas del objeto. 
Constructor: para crear el objeto o algo en particular necesito el constructor
Y necesito los metodos de getter y setter para obtener de los atributos.
Para acceder a esos métodos necesito el constructor para poder acceder.
*/

public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
    }

    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}

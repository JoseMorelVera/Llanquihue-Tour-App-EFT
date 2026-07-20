/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que representa los datos basicos de una personas
 * 
 * Clase padre
 */
public class Persona {
    private String nombre;
    private String rut;

    
    /**
     * Constructor de la clase Padre persona 
     * 
     * @param nombre indica el nombre de la persona 
     * @param rut indica el rut unico de la persona 
     */
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    /**
     * Muestra la informacion de la persona como clase padre 
     * @return 
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " Rut : " + rut;
    }
    
    public String mostrarResumen() {
        return "Nombre: " + nombre +
                " Rut : " + rut;      
    }    
}

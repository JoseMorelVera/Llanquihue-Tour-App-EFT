/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Clase hija de la clase persona 
 */
public class Guia extends Persona implements Registrable {
    
    private String actividad;

    /**
     *Constructor clase guia  
     *
     * @param nombre nombre del guia 
     * @param rut rut del guia 
     * @param servicio serivicio que ofrece el guia 
     */
    public Guia(String nombre, String rut, String servicio) {
        super(nombre, rut);
        this.actividad = servicio;
    }

    public String getServicio() {
        return actividad;
    }

    public void setServicio(String servicio) {
        this.actividad = servicio;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " Actividad : " + actividad;
    }
    
    @Override
    public String registrar() {
        return "Guia registrado con exito";
    }
    
    
    @Override 
    public String mostrarResumen() {
        return "Tipo: Guia\n" + toString() + "\n";     
    }    
}

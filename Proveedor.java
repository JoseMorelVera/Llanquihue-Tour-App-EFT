/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Clase hija de clase Persona
 */
public class Proveedor extends Persona implements Registrable {
    
    private String servicio; 

    /**
     * constructor clase Proveedor 
     * 
     * @param nombre nombre del proveedor 
     * @param rut rut del proveedor 
     * @param servicio servicio que ofrece el proveedor 
     */
    public Proveedor(String nombre, String rut, String servicio) {
        super(nombre, rut);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                " Servicio: " + servicio;
    }
    
    @Override
    public String registrar() {
        return "Cliente registrado con exito";
    }
    
    
    @Override 
    public String mostrarResumen() {
        return "Tipo: Proveedor\n" + toString() + "\n";
    }    
}

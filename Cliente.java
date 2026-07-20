/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Clase cliente que es clase hija de persona 
 */
public class Cliente extends Persona implements Registrable {
    
    private String direccion;

    /**
     * Constructor clase cliente
     * 
     * @param nombre nombre del cliente 
     * @param rut rut del cliente 
     * @param direccion dirreccion del cliente 
     */
    public Cliente(String nombre, String rut, String direccion) {
        super(nombre, rut);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " Direccion: " + direccion;
    }
    
    @Override
    public String registrar() {
        return "Cliente registrado con exito";
    }
    
    @Override 
    public String mostrarResumen() {
        return "Tipo: Cliente\n" + toString() + "\n";
    }    
}

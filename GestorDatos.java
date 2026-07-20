/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import model.Registrable;
import model.Cliente;
import model.Guia;
import model.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *Clase que implementa el arraylist para las listas dinamicas 
 * 
 * @author josem
 */
public class GestorDatos {
    
    private final List<Registrable> listaRegistrados = new ArrayList<>();
   
    /**
     * Agregar un objeto a la lista
     * 
     * @param elemento objeto a guardar en la lista 
     */
    public void agregar(Registrable elemento) {
        listaRegistrados.add(elemento);
    }
    
    /**
     * Muetra los elementos que estan guardados en la lista 
     * @return  
     */
    public String mostrarResumen() {
        if (listaRegistrados.isEmpty()) {
            return "No hay datos guardados.";
        }
        
        String resumen = "";
        
        for (Registrable elemento : listaRegistrados) {
            
            if (elemento instanceof Guia) {
                
                Guia guia = (Guia) elemento;
                
                resumen += guia.mostrarResumen() +
                        "\n";
                
            } else if (elemento instanceof Cliente) {
                
                Cliente cliente = (Cliente) elemento;
                
                resumen += cliente.mostrarResumen() +
                        "\n";
                
            } else if (elemento instanceof Proveedor) {
                
                Proveedor proveedor = (Proveedor) elemento;
                
                resumen += proveedor.mostrarResumen() +
                        "\n";
            }
                 
        }
        
        return resumen;
    }
    
    public String filtrarClientes() {
        if (listaRegistrados.isEmpty()) {
            return "No hay datos guardados.";
        }

        String resumenClientes = "";
        boolean encontroClientes = false;

   
        for (Registrable elemento : listaRegistrados) {

            if (elemento instanceof Cliente) {
                Cliente cliente = (Cliente) elemento;

                resumenClientes += cliente.mostrarResumen() + "\n";
                encontroClientes = true;
            }
        }

        if (!encontroClientes) {
            return "No hay Clientes registrados en el sistema.";
        }

        return resumenClientes;
    }
}

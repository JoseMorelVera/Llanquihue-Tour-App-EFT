/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IU;

import data.GestorDatos;
import java.util.Scanner;
import model.Cliente;
import model.Guia;
import model.Proveedor;
import util.RutInvalidoException;
import util.Validador;

/**
 *
 * @author josem
 */
public class LlanquihueTourAppFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        Scanner teclado = new Scanner(System.in);
        
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n========================================");
            System.out.println("      SISTEMA LLANQUIHUE TOUR - MENÚ    ");
            System.out.println("========================================");
            System.out.println("1. Registrar nuevo Cliente");
            System.out.println("2. Registrar nuevo Guia Turistico");
            System.out.println("3. Registrar nuevo Proveedor");
            System.out.println("4. Mostrar todos los registros");
            System.out.println("5. Filtrar y mostrar solo Clientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            
            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine(); 
            } else {
                System.out.println("[ERROR] Por favor, ingrese un numero valido.");
                teclado.nextLine();
                continue;
            }

            System.out.println("----------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println(">>> REGISTRO DE NUEVO CLIENTE <<<");
                    System.out.print("Ingrese Nombre: ");
                    String nomCliente = teclado.nextLine();
                    System.out.print("Ingrese RUT (con guion): ");
                    String rutCliente = teclado.nextLine();
                    System.out.print("Ingrese Dirección: ");
                    String dirCliente = teclado.nextLine();

                    Cliente nuevoCliente = new Cliente(nomCliente, rutCliente, dirCliente);
                    gestor.agregar(nuevoCliente);
                    System.out.println("\nCliente registrado correctamente en el sistema.");
                    break;

                case 2:
                    System.out.println(">>> REGISTRO DE NUEVO GUIA <<<");
                    System.out.print("Ingrese Nombre: ");
                    String nomGuia = teclado.nextLine();
                    System.out.print("Ingrese RUT (con guion): ");
                    String rutGuia = teclado.nextLine();
                    System.out.print("Ingrese Actividad: ");
                    String servGuia = teclado.nextLine();

                    Guia nuevoGuia = new Guia(nomGuia, rutGuia, servGuia);
                    gestor.agregar(nuevoGuia);
                    System.out.println("\nGuia registrado correctamente en el sistema.");
                    break;

                case 3:
                    System.out.println(">>> REGISTRO DE NUEVO PROVEEDOR <<<");
                    System.out.print("Ingrese Nombre/Razón Social: ");
                    String nomProv = teclado.nextLine();
                    System.out.print("Ingrese RUT (con guión): ");
                    String rutProv = teclado.nextLine();
                    System.out.print("Ingrese Tipo de Servicio: ");
                    String servProv = teclado.nextLine();

                    Proveedor nuevoProv = new Proveedor(nomProv, rutProv, servProv);
                    gestor.agregar(nuevoProv);
                    System.out.println("\nProveedor registrado correctamente.");
                    break;

                case 4:
                    System.out.println(">>> REPORTE GENERAL DE REGISTROS <<<");
                    System.out.print(gestor.mostrarResumen());
                    break;

                case 5:
                    System.out.println(">>> LISTADO EXCLUSIVO DE CLIENTES <<<");
                    System.out.print(gestor.filtrarClientes());
                    break;

                case 6:
                    System.out.println("Saliendo del sistema de Llanquihue Tour. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("[ERROR] Opción fuera de rango. Intente nuevamente.");
                    break;
            }
        }
        
        teclado.close();
    }
    
}

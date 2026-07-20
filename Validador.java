/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author josem
 */
public class Validador {
    
    public static void validar(String rut) throws RutInvalidoException {
        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El Rut no puede estar vacio");
        }
        
        String rutLimpio = rut.replace(".", "").replace(" ", "");
        
        if (!rutLimpio.contains("-")) {
            throw new RutInvalidoException("El Rut debe llevar guion");
        }
        
        if (rutLimpio.length() < 9 || rutLimpio.length() > 10) {
            throw new RutInvalidoException("El Rut debe tener entre 9 y 10 caracteres con guion");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author erick
 */
public class CategoryInUseException extends Exception {
    public CategoryInUseException(String message) {
        super("No se puede eliminar una categoria en uso");
    }
}

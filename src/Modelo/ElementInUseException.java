/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author erick
 */
public class ElementInUseException extends Exception {
    public ElementInUseException(String message) {
        super("No se puede eliminar un elemento en uso");
    }
}
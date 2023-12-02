/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Clientes;
import Modelo.Prestamo;
import java.util.HashSet;

/**
 *
 * @author uno
 */
public class GestorCliente {

    private HashSet<Clientes> hashsetClientes;

    public GestorCliente(HashSet<Clientes> cliente) {
        this.hashsetClientes = new HashSet<>();
    }

    public GestorCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HashSet<Clientes> getClientes() {
        return hashsetClientes;
    }

    public void agregarCliente(Clientes c) {
        hashsetClientes.add(c);
    }

    public void eliminarCliente(Clientes cliente, GestorPrestamo gestorPrestamo) {
        if (!clienteEnUso(cliente, gestorPrestamo)) {
            hashsetClientes.remove(cliente);
            System.out.println("Cliente eliminado correctamente");
        }else{
            System.out.println("Error: Cliente esta en uso prestamo");
        }
    }

    public Clientes buscarCliente(String cedula) {
        for (Clientes c : hashsetClientes) {
            if (c.getCedula() == cedula) {
                return c;
            }
        }
        return null;
    }

    public boolean clienteEnUso(Clientes cliente, GestorPrestamo gestorPrestamo) {
        for (Prestamo p : gestorPrestamo.getPrestamosList()) {
            if (p.getCliente().equals(cliente)) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Clientes;
import Modelo.Lista;
import Modelo.Prestamo;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author uno
 */
public class GestorCliente implements Lista<Clientes> {

    public HashSet<Clientes> getHashsetClientes() {
        return hashsetClientes;
    }

    public void setHashsetClientes(HashSet<Clientes> hashsetClientes) {
        this.hashsetClientes = hashsetClientes;
    }

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
            if (c.getCedula().equals(cedula.toString())) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.hashsetClientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GestorCliente other = (GestorCliente) obj;
        return Objects.equals(this.hashsetClientes, other.hashsetClientes);
    }

    @Override
    public boolean agregar(Clientes obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Clientes obj) {
    return this.agregar(obj);
    }

    @Override
    public boolean borrar(Clientes obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes[] toArray() {
        return this.hashsetClientes.toArray(new Clientes[0]);
    }
}

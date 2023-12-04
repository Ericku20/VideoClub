/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Clientes;
import Modelo.Lista;
import Modelo.Prestamo;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author uno y Sofia
 */
public class GestorCliente {

    private HashSet<Clientes> hashsetClientes;

    public GestorCliente() {
        this.hashsetClientes = new HashSet<>();
    }

    public HashSet<Clientes> getClientes() {
        return hashsetClientes;
    }

    public void agregarCliente(Clientes c) {
        hashsetClientes.add(c);
    }

    public void eliminarCliente(String cedula) {
        Iterator<Clientes> iterator = hashsetClientes.iterator();

        while (iterator.hasNext()) {
            Clientes cliente = iterator.next();
            if (cliente.getCedula().equals(cedula)) {
                iterator.remove(); // Removes the current element from the set
                //Optionally, you can break the loop if you want to remove only the first occurrence
                break;
            }
        }
    }

    public Object[][] buscarCliente(String cedula) {
        int size = hashsetClientes.size();
        Object[][] data = new Object[size][];
        int index = 0;

        for (Clientes cliente : hashsetClientes) {
            if (cliente.getCedula().equals(cedula)) {
                Object[] clientArray = cliente.mostrarEnTabla();
                data[index++] = clientArray;
            }

        }

        return data;
    }

    public boolean clienteEnUso(Clientes cliente, GestorPrestamo gestorPrestamo) {
        for (Prestamo p : gestorPrestamo.getPrestamosList()) {
            if (p.getCliente().equals(cliente)) {
                return true;
            }
        }
        return false;
    }

    public Object[][] mostrarClientesEnPantalla() {
        int size = hashsetClientes.size();
        Object[][] data = new Object[size][];
        int index = 0;

        for (Clientes cliente : hashsetClientes) {
            Object[] clientArray = cliente.mostrarEnTabla();
            data[index++] = clientArray;
        }

        return data;
    }

}

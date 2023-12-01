/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Clientes;
import java.util.HashSet;

/**
 *
 * @author uno
 */
public class GestorCliente {

    private HashSet<Clientes> cliente;

    public GestorCliente(HashSet<Clientes> cliente) {
        this.cliente = new HashSet<>();
    }

    public HashSet<Clientes> getClientes() {
        return cliente;
    }

    public void agregarCliente(Clientes c) {
        cliente.add(c);
    }

    public void eliminarCliente(Clientes c, GestorPrestamo prestamo) {
        
    }
    
    public Clientes buscarCliente(int cedula){
         for (Clientes c : cliente) {
            if (c.getCedula()== cedula) {
                return c;
            }
        }
        return null;
    } 

//    private boolean clienteEnUso(Clientes c, GestorPrestamo prestamo) {
//        for (Prestamo prestamo : gestorPrestamo.getPrestamos()) {
//            if (prestamo.getCliente().equals(cliente)) {
//                return true;
//            }
//        }
//        return false;
//    }
}

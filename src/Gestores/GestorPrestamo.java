/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Clientes;
import Modelo.Peliculas;
import Modelo.Prestamo;
import java.util.ArrayList;

/**
 *
 * @author uno
 */
public class GestorPrestamo {
    private ArrayList<Prestamo> prestamosList;
    Prestamo prestamo;
    

    public GestorPrestamo() {
        this.prestamosList = new ArrayList<>();
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public ArrayList<Prestamo> getPrestamosList() {
        return prestamosList;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamosList.add(prestamo);
    }

    public Prestamo obtenerProximoPrestamo() {
        if (!prestamosList.isEmpty()) {
            return prestamosList.remove(0);
        }
        return null;
    }
    
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamosList.remove(prestamo);
    }

    public void modificarPrestamo(Prestamo prestamo, boolean nuevoEstado, String nuevaFecha,
            Clientes nuevoCliente, Peliculas nuevaPelicula) {
        if (prestamosList.contains(prestamo)) {
            prestamo.setEstado(nuevoEstado);
            prestamo.setFecha(nuevaFecha);
            prestamo.setCliente(nuevoCliente);
            prestamo.setPelicula(nuevaPelicula);
        } else {
            System.out.println("Error: El préstamo no existe en la lista.");
        }
    }
}

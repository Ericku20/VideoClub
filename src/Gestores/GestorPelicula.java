/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Modelo.Categoria;
import Modelo.Clientes;
import Modelo.Peliculas;
import Modelo.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author uno
 */
public class GestorPelicula {

    private HashMap<Integer, Categoria> categoriasMap;
    private HashMap<Integer, Peliculas> peliculasMap;
    private HashMap<String, Clientes> clientesMap;
    private ArrayList<Prestamo> prestamosList;
    Categoria categoria;
    Peliculas pelicula;

    public GestorPelicula(HashMap<Integer, Categoria> categoriasMap, HashMap<Integer, Peliculas> peliculasMap, HashMap<String, Clientes> clientesMap, ArrayList<Prestamo> prestamosList) {
        this.categoriasMap = categoriasMap;
        this.peliculasMap = peliculasMap;
        this.clientesMap = clientesMap;
        this.prestamosList = prestamosList;
    }

    public HashMap<Integer, Categoria> getCategoriasMap() {
        return categoriasMap;
    }

    public HashMap<Integer, Peliculas> getPeliculasMap() {
        return peliculasMap;
    }

    public ArrayList<Prestamo> getPrestamosList() {
        return prestamosList;
    }

    public HashMap<String, Clientes> getClientesMap() {
        return clientesMap;
    }

    public void setPeliculasMap(HashMap<Integer, Peliculas> peliculasMap) {
        this.peliculasMap = peliculasMap;
    }

    public void setClientesMap(HashMap<String, Clientes> clientesMap) {
        this.clientesMap = clientesMap;
    }

    public void setPrestamosList(ArrayList<Prestamo> prestamosList) {
        this.prestamosList = prestamosList;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void agregarCategoria(int codigo, String nombre) {
        Categoria nuevaCategoria = new Categoria(codigo, nombre);
        categoriasMap.put(codigo, nuevaCategoria);
    }

    public Categoria obtenerCategoria(int codigo) {
        return categoriasMap.get(codigo);
    }

    public void actualizarCategoria(int codigo, String nuevoNombre) {
        Categoria categoria = categoriasMap.get(codigo);
        if (categoria != null) {
            categoria.setNombre(nuevoNombre);
        }
    }

    public void eliminarCategoria(int codigo) {
        categoriasMap.remove(codigo);
    }

    public void agregarPelicula(int codigo, String nombre, int categoriaId) {
        Categoria categoria = categoriasMap.get(categoriaId);
        if (categoria != null) {
            Peliculas nuevaPelicula = new Peliculas(codigo, nombre, categoria);
            peliculasMap.put(codigo, nuevaPelicula);
        }
    }

    public Peliculas obtenerPelicula(int codigo) {
        return peliculasMap.get(codigo);
    }

    public void eliminarPelicula(int codigo) {
        peliculasMap.remove(codigo);
    }
    // no se si falta algo
}

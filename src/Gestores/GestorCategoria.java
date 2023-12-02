/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

/**
 *
 * @author erick
 */
import Modelo.Categoria;
import Modelo.CategoryInUseException;
import Modelo.DuplicateDataException;

import java.util.HashMap;
import java.util.Map;

public class GestorCategoria {

    private Map<Integer, Categoria> categorias;

    public GestorCategoria() {
        this.categorias = new HashMap<>();
    }

    public void agregarCategoria(Categoria categoria) throws DuplicateDataException {
        int codigo = categoria.getCodigo();

        if (categorias.containsKey(codigo)) {
            throw new DuplicateDataException("¡Error! La categoría con código " + codigo + " ya existe.");
        }

        categorias.put(codigo, categoria);
    }

    public Categoria obtenerCategoria(int codigo) {
        return categorias.get(codigo);
    }

    public void actualizarCategoria(int codigo, Categoria categoria) throws DuplicateDataException {
        if (!categorias.containsKey(codigo)) {
            throw new DuplicateDataException("¡Error! La categoría con código " + codigo + " no existe.");
        }

        categorias.put(codigo, categoria);
    }

    // Método para eliminar una categoría por su código
    public void eliminarCategoria(int codigo) throws CategoryInUseException {

        if (isCategoriaEnUso(codigo)) {
            throw new CategoryInUseException("¡Error! La categoría con código " + codigo + " está en uso y no puede ser eliminada.");
        }

        categorias.remove(codigo);
    }

    private boolean isCategoriaEnUso(int codigo) {
        return false;
    }
}

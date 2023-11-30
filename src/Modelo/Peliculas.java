package Modelo;

/**
 *
 * @author Sofia_2
 */
public class Peliculas {

    private int codigo;
    private String nombre;
    private Categoria categoria;

    public Peliculas(int codigo, String nombre, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " Nombre: " + nombre + " Categoria: " + categoria;
    }

}

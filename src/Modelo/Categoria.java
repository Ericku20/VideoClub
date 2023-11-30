package Modelo;

/**
 *
 * @author Sofia_2
 */
public class Categoria {
    
    private int codigo;
    private String nombre;

    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " Nombre: " + nombre;
    }
    
    
    
}

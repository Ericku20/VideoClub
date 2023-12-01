package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Sofia_2
 */
public class Prestamo {

    private int numero;
    private boolean estado;
    private String fecha;
    private Clientes cliente;
    private Peliculas pelicula;
    private ArrayList<Peliculas> peliculasRentadas;

    public Prestamo(int numero, boolean estado, String fecha, Clientes cliente, Peliculas pelicula) {
        this.numero = numero;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.peliculasRentadas = new ArrayList();
    }

    public int getNumero() {
        return numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + " Estado: " + estado + " Fecha: " + fecha + " Cliente: " + cliente + " Pelicula: " + pelicula;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author uno
 */
public interface Lista<Type> {

    public boolean agregar(Type obj);

    public boolean modificar(Type obj);

    public boolean borrar(Type obj);

    public Type buscar(Object id);

    public Type[] toArray();
}

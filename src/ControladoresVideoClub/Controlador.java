/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoresVideoClub;

import Modelo.Clientes;

/**
 *
 * @author uno
 */
public interface Controlador<Type> {
  public void agregar(Type obj);
  public void modificar(Type obj);
  public void borrar(Type obj);
  public void buscar(Object cedula);
  public void readAll();
  
  public Clientes[] toArray();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoresVideoClub;

import Gestores.GestorCliente;
import Modelo.Clientes;
import Vista.Vista;

/**
 *
 * @author uno
 */
public class ControladorClientes implements Controlador<Clientes>  {
    private GestorCliente gestorcli;
    private Vista vista;

    public GestorCliente getGestorcli() {
        return gestorcli;
    }

    public void setGestorcli(GestorCliente gestorcli) {
        this.gestorcli = gestorcli;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public ControladorClientes(Vista vista) {
        this.vista = vista;
    }

    public ControladorClientes(GestorCliente gestorcli, Vista vista) {
        this.gestorcli = gestorcli;
        this.vista = vista;
    }
    
    
    @Override
    public void agregar(Clientes obj) {
 
    }

    @Override
    public void modificar(Clientes obj) {
          if (obj.isComplete()){
            this.gestorcli.modificar(obj);
            this.readAll();
        }else{
            this.vista.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void borrar(Clientes obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscar(Object cedula) {
   Clientes clientes=this.gestorcli.buscarCliente((String) cedula);
        if (clientes!=null){
            this.vista.display(clientes);
        }else{
            this.vista.displayErrorMessage("El cliente buscado no se encuentra registrado");
        }
    }

    @Override
    public void readAll() {
       /*  this.gestorcli = new GestorCliente();
           Clientes[] clientes=this.gestorcli.toArray();
        if (clientes.length>0){
            this.vista.displayAll(clientes);
        }
     */
         Clientes[] clientes = this.gestorcli.toArray();

    if (clientes.length > 0) {
        this.vista.displayAll(clientes);
    }
    }

    @Override
    public Clientes[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

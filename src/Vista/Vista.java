/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import GUI.FrmClientes;
import GUI.FrmPrestamos;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author uno
 */
public interface Vista <Type>{
     public static void maximize(JFrame frm) {
        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
     

    public void clear();
    public void display(Type regs);
    public void displayAll(Type[] regs);
    public void displayMessaje(String msj);
    public boolean displayConfirmMessaje(String msj);
    public void displayErrorMessaje(String msj);
    public void displayErrorMessage(String el_cliente_no_se_encuentra_registrado);
     
}


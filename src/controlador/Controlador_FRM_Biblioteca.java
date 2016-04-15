/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.MetodosUsuario;
import vista.FRM_Biblioteca;

/**
 *
 * @author AA_17
 */
public class Controlador_FRM_Biblioteca implements ActionListener
{
    MetodosUsuario metodosUsuario;
    FRM_Biblioteca frm_Biblioteca;
    
    public Controlador_FRM_Biblioteca(FRM_Biblioteca frm_Biblioteca)
    {
       metodosUsuario = new MetodosUsuario();
       this.frm_Biblioteca = frm_Biblioteca;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            //frm_Biblioteca.mostrarCodigo(metodosUsuario.devolverCodigo());
            buscar();
        }
        
        if(e.getActionCommand().equals("Agregar"))
        {
            metodosUsuario.AgregarUsuario(frm_Biblioteca.devolverInformacion());
            frm_Biblioteca.mostrarMensaje("El Usuario ha sido agregado con exito");
            frm_Biblioteca.resetearGUI();
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
           metodosUsuario.modificar(frm_Biblioteca.devolverInformacion());
           frm_Biblioteca.mostrarMensaje("El Usuario ha sido agregado con exito");
           frm_Biblioteca.resetearGUI();
        }
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodosUsuario.eliminar(frm_Biblioteca.devolverInformacion());
            frm_Biblioteca.mostrarMensaje("El Usuario ha sido agregado con exito");
            frm_Biblioteca.resetearGUI();
        }
    }
    
    public void buscar()
    {
        
        if(metodosUsuario.consultarUsuario(frm_Biblioteca.devolverNumeroDePrestamo()))
            {
                frm_Biblioteca.mostrarInformacion(metodosUsuario.getArregloInformacion());
                frm_Biblioteca.habilitarEdicion();
            }
            else
            {
                int opcion=frm_Biblioteca.mostrarMensajeOpcion("Esta cedula no existe, desea agregar el estudiante?");
              if(opcion==0)  
              {
                  frm_Biblioteca.habilitarAgregar();
              }
              else
              {
                  frm_Biblioteca.resetearGUI();
              }
                
            }
    }
    
}

 
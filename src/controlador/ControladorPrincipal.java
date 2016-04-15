/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_Biblioteca;

/**
 *
 * @author AA_17
 */
public class ControladorPrincipal implements ActionListener
{
    FRM_Biblioteca frm_Biblioteca;
    
    public ControladorPrincipal()
    {
        frm_Biblioteca = new FRM_Biblioteca();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        
        if(e.getActionCommand().equals("Biblioteca"))
        {
            frm_Biblioteca.setVisible(true);
        }
    }
    
}

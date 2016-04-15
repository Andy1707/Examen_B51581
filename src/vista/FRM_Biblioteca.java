/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.Controlador_FRM_Biblioteca;
import javax.swing.JOptionPane;


/**
 *
 * @author AA_17
 */
public class FRM_Biblioteca extends javax.swing.JFrame {

    Controlador_FRM_Biblioteca controlador;
    
    /**
     * Creates new form FRM_Biblioteca
     */
    public FRM_Biblioteca() 
    {
        initComponents();
        controlador = new Controlador_FRM_Biblioteca(this);
        this.panel_Botones1.agregarEvento(controlador); 
        this.panel_Informacion1.agregarEvento(controlador);
        
    }

    public String[] devolverInformacion()
    {
        return this.panel_Informacion1.devolverInformacion();
    }
    
    public String devolverNumeroDePrestamo()
    {
        return this.panel_Informacion1.devolverNumeroDePrestamo();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.panel_Informacion1.mostrarInformacion(arreglo);
    }
    
    public void habilitarAgregar()
    {
        this.panel_Botones1.habilitarAgregar();
        this.panel_Informacion1.habilitarAgregar();
    }
    
    public void habilitarEdicion()
    {
        this.panel_Botones1.habilitarEdicion();
        this.panel_Informacion1.habilitarEdicion();
    }
    
    public void resetearGUI()
    {
        this.panel_Botones1.deshabilitarBotones();
        this.panel_Informacion1.deshabilitarCampos();
    }
    
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public int mostrarMensajeOpcion(String mensaje)
    {
        return JOptionPane.showConfirmDialog(this, mensaje);
    }
    
    public void mostrarCodigo(String numeroDePrestamo)
    {
        this.panel_Informacion1.mostrarCodigo(numeroDePrestamo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Botones1 = new vista.Panel_Botones();
        panel_Informacion1 = new vista.Panel_Informacion();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.Panel_Botones panel_Botones1;
    private vista.Panel_Informacion panel_Informacion1;
    // End of variables declaration//GEN-END:variables
}

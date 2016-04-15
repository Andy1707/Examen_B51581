/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Biblioteca;

/**
 *
 * @author AA_17
 */
public class Panel_Botones extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Botones
     */
    public Panel_Botones() 
    {
        initComponents();
        
    }
    
    public void agregarEvento(Controlador_FRM_Biblioteca controlador)
    {
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Buscar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
    }
    
    public void habilitarAgregar()
    {
        this.btn_Agregar.setEnabled(true);
    }
    
    public void habilitarEdicion()
    {
        this.btn_Agregar.setEnabled(false);
        this.btn_Buscar.setEnabled(false);
        this.btn_Modificar.setEnabled(true);
        this.btn_Eliminar.setEnabled(true);
        
    }
    
    public void deshabilitarBotones()
    {
        this.btn_Agregar.setEnabled(false);
        this.btn_Buscar.setEnabled(true);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Buscar.setText("Buscar");

        btn_Agregar.setText("Agregar");
        btn_Agregar.setEnabled(false);

        btn_Modificar.setText("Modificar");
        btn_Modificar.setEnabled(false);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Buscar)
                .addGap(38, 38, 38)
                .addComponent(btn_Agregar)
                .addGap(41, 41, 41)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_Eliminar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}

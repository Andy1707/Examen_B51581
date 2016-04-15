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
public class Panel_Informacion extends javax.swing.JPanel {

    
    /**
     * Creates new form Panel_Informacion
     */
    public Panel_Informacion() 
    {
        initComponents();
        deshabilitarCampos();
    }
    
    public void agregarEvento(Controlador_FRM_Biblioteca controlador)
    {
        this.jt_NumeroPrestamo.addActionListener(controlador);
    }
    
    public String[] devolverInformacion()
    {
        String informacion[] = new String[3];
        informacion[0]= this.jt_NombreUsuario.getText();
        informacion[1]= this.jt_CedulaUsuario.getText();
        informacion[2]= this.jt_IsbnLibro.getText();
        return informacion;
    }
    
    public String devolverNumeroDePrestamo()
    {
        return this.jt_NumeroPrestamo.getText();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_NombreUsuario.setText(arreglo[0]);
        this.jt_CedulaUsuario.setText(arreglo[1]);
        this.jt_IsbnLibro.setText(arreglo[2]);
    }
    
    

    public void habilitarAgregar()
    {
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_IsbnLibro.setEnabled(true);
    }
    
    public void habilitarEdicion()
    {
        this.jt_NumeroPrestamo.setEnabled(false);
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_IsbnLibro.setEnabled(true);
    }
    
    public void mostrarCodigo(String numeroDePrestamo)
    {
        this.jt_NumeroPrestamo.setText(numeroDePrestamo);
    }
    
    public void deshabilitarCampos()
    {
        this.jt_NumeroPrestamo.setEnabled(true);
        //this.jt_NumeroPrestamo.setText("");
        this.jt_NombreUsuario.setEnabled(false);
        this.jt_NombreUsuario.setText("");
        this.jt_CedulaUsuario.setEnabled(false);
        this.jt_CedulaUsuario.setText("");
        this.jt_IsbnLibro.setEnabled(false);
        this.jt_IsbnLibro.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroPrestamo = new javax.swing.JLabel();
        jl_NombreUsuario = new javax.swing.JLabel();
        jl_CedulaUsuario = new javax.swing.JLabel();
        jt_NumeroPrestamo = new javax.swing.JTextField();
        jt_NombreUsuario = new javax.swing.JTextField();
        jt_CedulaUsuario = new javax.swing.JTextField();
        jl_IsbnLibro = new javax.swing.JLabel();
        jt_IsbnLibro = new javax.swing.JTextField();

        jl_NumeroPrestamo.setText("Numero de Prestamo");

        jl_NombreUsuario.setText("Nombre del Usuario");

        jl_CedulaUsuario.setText("Cedula del Usuario");

        jl_IsbnLibro.setText("ISBN del Libro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NumeroPrestamo)
                        .addGap(28, 28, 28)
                        .addComponent(jt_NumeroPrestamo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_NombreUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_CedulaUsuario)
                            .addComponent(jl_IsbnLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_CedulaUsuario)
                            .addComponent(jt_IsbnLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroPrestamo)
                    .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreUsuario)
                    .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CedulaUsuario)
                    .addComponent(jt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IsbnLibro)
                    .addComponent(jt_IsbnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaUsuario;
    private javax.swing.JLabel jl_IsbnLibro;
    private javax.swing.JLabel jl_NombreUsuario;
    private javax.swing.JLabel jl_NumeroPrestamo;
    private javax.swing.JTextField jt_CedulaUsuario;
    private javax.swing.JTextField jt_IsbnLibro;
    private javax.swing.JTextField jt_NombreUsuario;
    private javax.swing.JTextField jt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}

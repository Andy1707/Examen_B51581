/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author AA_17
 */
public class Usuario 
{
    private String numeroPrestamo,nombreUsuario, cedulaUsuario, isbnLibro;

    public Usuario(String numeroPrestamo, String nombreUsuario, String cedulaUsuario, String isbnLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.isbnLibro = isbnLibro;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    
    
    public String getInformacion()
    {
        return "Nombre del Usuario:"+nombreUsuario+"\n Cedula del Usuario:"+cedulaUsuario+"\nISBN del Libro:"+isbnLibro;
    }
    
}

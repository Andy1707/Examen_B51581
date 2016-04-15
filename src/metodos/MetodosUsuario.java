/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;

/**
 *
 * @author AA_17
 */
public class MetodosUsuario 
{
    private ArrayList<Usuario> arrayUsuario;
    String arregloInformacion[] = new String[3];
    
    public void MetodosUsuario()
    {
        arrayUsuario = new ArrayList<Usuario>();
    }
    
    public void AgregarUsuario(String arreglo[])
    {
       Usuario temporal = new Usuario(arreglo[0],arreglo[1],arreglo[2],arreglo[3]);
       arrayUsuario.add(temporal);
    }
    
    public void mostrarInformacion()
    {
        for(int i=0;i<arrayUsuario.size();i++)
        {
            System.out.println(arrayUsuario.get(i).getInformacion());
        
        }
    
    }
    
   public boolean consultarUsuario(String NumeroPrestamo)
    {
        boolean existe=false;
        
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(NumeroPrestamo))
            {
                arregloInformacion[0]=arrayUsuario.get(i).getNombreUsuario();
                arregloInformacion[1]=arrayUsuario.get(i).getCedulaUsuario();
                arregloInformacion[2]=arrayUsuario.get(i).getIsbnLibro();
                existe=true;
            }
        
        }
        return existe;
    
    }
    
    public void modificar(String arreglo[])
    {
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayUsuario.get(i).setNombreUsuario(arreglo[1]);
                arrayUsuario.get(i).setCedulaUsuario(arreglo[2]);
                arrayUsuario.get(i).setIsbnLibro(arreglo[3]);
                
            }
        }
    }
    
    public void eliminar(String arreglo[])
    {
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayUsuario.remove(i);
            }
        }
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacion;
    }    
    
    public String devolverCodigo()
    {
        String codigo= "000";
        if(arrayUsuario.size()==0)
        {
            codigo+=1;
        }
        
        else
        {
            int numero=Integer.parseInt(arrayUsuario.get(arrayUsuario.size()-1).getNumeroPrestamo());
            numero++;
            codigo+=""+numero;
        }
        
        codigo=codigo.substring(codigo.length()-4, codigo.length());
        return codigo;
      
    }
    
}

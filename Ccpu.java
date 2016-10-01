/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.s.programada;
import java.util.Scanner;
/**
 *
 * @author leoj_
 */
public class Ccpu 
{
    Ccontrolador contro =new Ccontrolador();
    int estado=1, n=0, m;
    String nombre, acum[];
    public void periferico()
    {
        Scanner leer= new Scanner(System.in);
        nombre=leer.nextLine();
    }
    
    public void control()
    {
        contro.señalesControl();
    }
    
    public void lectura()
    {
                estado=contro.estado();
        System.out.println("Estado del controlador: ");
        if(estado==1)
        System.out.println("Preparado");  
        else
        System.out.println("No Preparado");
        
        escritura();
    }
    
    public void escritura()
    {
        if(estado!=0)
        {
        contro.cambioestado(0);
        programa();
        }
        n=n+nombre.length();
        String[] RegDato= new String[n];
        RegDato[m]=""+nombre.charAt(m);
        acum=RegDato;
        if(m<nombre.length())
        {
            control();
        }
        else
        {
            contro.cambioestado(1);
            control();
        }
    }
    public void programa()
    {
        System.out.println("Escribe tu nombre:");
        periferico();
    }
    
}

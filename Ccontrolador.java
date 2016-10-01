/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.s.programada;

/**
 *
 * @author leoj_
 */
public class Ccontrolador
{
    int estado=1; //1=Preparado  0=NoPreparado
    Ccpu CPU =new Ccpu();
    public int estado()
    {
        return estado;
    }
    
    public void señalesControl()
    {
        datos();
    }
    
    public void datos()
    {
        CPU.lectura();
    }
    
    public void cambioestado(int n)
    {
        estado=n;
    }
}

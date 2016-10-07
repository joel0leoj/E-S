/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
import java.util.Random;
/**
 *
 * @author andy
 */
public class Ccontrolador {
    
    	//RANDOM DATOS BOOLEANOS 
	Random randomno = new Random();
    
	   
	boolean estado=randomno.nextBoolean();
	 boolean control=randomno.nextBoolean();
	      
	  
	public Ccontrolador (boolean estado, boolean contro) {
        this.estado = estado;        
        this.contro = contro;          
    }
	
		public void Comunicacion()//metodo para revisar estado controlador
		{
			if(estado==true)
			{
				   System.out.println("Se ha establecido la conexion! ");
			}
			else
			{	   
				System.out.println("No se pudo establecer comunicacion, intente de nuevo");
			}	
            
		}

		public void Datos()//metodo para hacer lectura/modificar
		{
			
		}
		
		public void Transferencia()//lectura/estructura del dispositivo
		
		{
			
		}
		
		public void EstadoFinal()//revisión final del dispositivo
		{
			
		}
    
}

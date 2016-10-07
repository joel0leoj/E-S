/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author andy
 */
public class Ccontrolador {
    
    
	public boolean estado;
    public boolean contro;
	
	public Ccontrolador (boolean estado, boolean contro) {
        this.estado = estado;        
        this.contro = contro;          
    }
	
		public void Comunicacion()//metodo para revisar estado controlador
		{
			estado = true;
            System.out.println("Se ha establecido la conexion! ");
            
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

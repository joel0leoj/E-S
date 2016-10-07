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
import java.util.Scanner;

public class Ccpu extends Ccontrolador{
    
    
int ord1;
    
public Ccpu (boolean estado, boolean control) {
    super(estado, control);
    this.estado = estado;
    this.control = control;
   
                 
    }

    
    public void VerificarE()//veriicar estado dispositivo
		{
			if(estado==true)
			{
				System.out.println("El disposito se ha reconocido correctamente");
				
			}
			else
			{
				System.out.println("No se reconoció el dispositivo, verifiquelo");
			}
		}
	    
		public void Ordenar()//opciones de orden en forma de menu
		{
            System.out.println("Ejecutar orden: \n1.Estado. \n2.Transferencia");
            ord1=entrada1.nextInt();
            
        switch (ord1)        
        {
			case 1:
                Comunicacion();
				break;
			case 2:
				Transferencia();
				break;
            default:
                break;
        }
			System.out.println("Esperando comunicacion con el controlador...\n\n");
		}
		public void Revisar()
		{
            
			
		}
        
        public boolean GetImprimir()
		{
			
            return control;
			
		}
        
}

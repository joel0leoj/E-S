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
    
    Scanner entrada1 = new Scanner(System.in);
        int a;
    
public Ccpu (boolean estado, boolean contro) {
    super(estado, contro);
    this.estado = estado;
    this.contro = contro;
                 
    }

    
    public void VerificarE()//veriicar estado dispositivo
		{
			if(estado==true)
			{
				System.out.println("El disposito se ha reconocido correctamente");
				
			}
			else
			{
				Sytem.out.printl("No se reconoció el dispositivo, verifiquelo");
			}
			
			
		}
	    
		public void Ordenar()//opciones de orden en forma de menu
		{
            System.out.println("Ejecutar orden: \n1.Estado. \n2.Transferencia");
            a=entrada1.nextInt();
            
            switch (a)        
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
			
            return contro;
			
		}
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andy
 */
public class Ccontrolador {
    Scanner entrada1 = new Scanner(System.in);    //Datos para Scanner
	Random randomno = new Random();               //RANDOM DATOS BOOLEANOS 
    
    int opc = (int)(randomno.nextDouble() * 2 + 1);; //variable para establecer rango del random
    int ord2;                                    //variable para menu de transferencia
	boolean estado;                             //permite reconocer el dispositivo
	boolean control;                            //permite tener control en ciertas acciones al comprobar el estado
	
	public Ccontrolador (boolean estado, boolean control) { //Constructor
        this.estado = estado;        
        this.control = control;
        
    }
	
		public void Comunicacion()//metodo para revisar estado controlador
		{
			if(opc==2)
			{
				   System.out.println("Estado -> Se ha establecido la conexion! ");
                   control=true;
			}
			else
			{	   
				System.out.println("Estado -> No se pudo establecer comunicacion, intente de nuevo");
			}	
		}

		public void Transferencia()//metodo para hacer lectura/escritura del dispositivo
		{
            if(control==true)
			{
				   System.out.println("Transferencia -> La CPU tiene acceso a la informacion asociada al dispositivo.\n");
                   System.out.println("Que opcion se desea ejecutar? \n1.- Lectura. \n2.- Escritura.\n");
                   
                   ord2=entrada1.nextInt();
            
                switch (ord2)   //Menu para lectura/escritura     
                {
                    case 1:
                        System.out.println("Leyendo Datos de dispositivo y adaptando al CPU:\n");

                           for(int i=2; i>=0;i--)
                           {
                               System.out.println("Checando - - - en proceso... ");

                           }
                           System.out.println("Operacion con exito !");
                    break;

                    case 2:
                        System.out.println("CPU modificando datos al dispositivo:\n");

                           for(int i=2; i>=0;i--)
                           {
                               System.out.println("Checando - - - en proceso... ");

                           }
                           System.out.println("Transferencia realizada !");
                    break;

                    default:
                    break;
                }
                   
                   
			}
            else //En caso de que el dispositivo aun no se reconozca en el proceso
			{	   
				System.out.println("Transferencia -> Aun no se puede establecer comunicacion entre el CPU y el dispositivo.");
			}	
			
		}
		
		public void Datos()//
		{
			
		}
		
		public void EstadoFinal()//revisión final del dispositivo
		{
			
		}
    
}

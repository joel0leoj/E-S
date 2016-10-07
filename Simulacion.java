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
import org.omg.Messaging.SyncScopeHelper;
import java.util.Scanner;

public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Scanner entrada1 = new Scanner(System.in);
	    	 int a;
			 //a=entrada1.nextInt();  //no compila si agregamos esto por ahora
    
    
	Ccpu cpu = new Ccpu(false,false);
    cpu.Ordenar();

	          
	
		
        
    }
}
    


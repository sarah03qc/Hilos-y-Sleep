package sec;

/* 
Este programa es una ejemplificacion basica del uso de hilos y el metodo
sleep() en Java.
El objetivo del programa es utilizar hilos para que un contador n se vaya
desplegando de manera pausada, en este caso, cada 1000 milisegundos que 
son 1 segundo. La idea es que sea basico para que se pueda observar como 
trabajan los hilos.
*/

// importando lo necesario
import java.lang.Thread; 
 
// creamos clase HiloContador 
public class HiloContador extends Thread {
	
	public HiloContador() {}
	
	public void run()  {
		try {  
			// se hace esto para tener cuidado con una excepcion
			for (int n = 0; n < 11; n++)  {
				// el hilo principal duerme por 1000 segundos en este caso, que son 1 segundo
				// cada vez que el ciclo for se ejecuta
			    Thread.sleep(1000);  // este es el metodo sleep
			    // desplegamos el valor del contador n  
			    System.out.println(n + " seg");  
			}  
        }  
        catch (Exception expn)  {
        	// para "atrapar" la excepcion
        	System.out.println(expn);  
        }  
   }  
}
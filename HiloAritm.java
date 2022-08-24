package sec;

/* 
Este programa es una ejemplificacion basica del uso de hilos y el metodo
sleep() en Java.
El objetivo del programa es utilizar hilos para que existan pausas en el despliegue
de distintas operaciones aritmeticas, y mostrar el uso de hilos y sleep() fuera de un
ciclo. 
*/

// importando lo necesario
import java.lang.Thread;  
 
// creamos clase HiloAritm 
public class HiloAritm extends Thread {

	int operando1 = 6;
	int operando2 = 2;
	int resta = 0;
	int multi = 0;
	int suma = 0;
	int divi = 0;
	
	public void run()  {
		try {  
			// se hace esto para tener cuidado con una excepcion
			suma = operando1 + operando2;
			// desplegamos el resultado de la suma
	        System.out.println("Suma es: " + suma);  
	        
			// el hilo principal duerme por 1000 segundos en este caso, que son 1 segundo	
			Thread.sleep(2000);  // lo usamos de nuevo para que pause antes de dar la resta
			resta = operando1 - operando2;
			// desplegamos el resultado de la resta 
	        System.out.println("Resta es: " + resta);  
	        
	        Thread.sleep(2000);  // lo usamos de nuevo para que pause antes de dar la multip
			multi = operando1 * operando2;
			// desplegamos el resultado de la multiplicacion 
	        System.out.println("Multiplicacion es: " + multi);  
	        
	        Thread.sleep(2000);  // lo usamos de nuevo para que pause antes de dar la division
			divi = operando1 / operando2;
			// desplegamos el resultado de la division 
	        System.out.println("Division es: " + divi);    
        }  
        catch (Exception expn)  {
        	// para "atrapar" la excepcion
        	System.out.println(expn);  
        }  
   }  
} 


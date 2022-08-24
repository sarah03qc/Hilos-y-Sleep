package contador;

public class Contador extends Thread{
	
	
	public Contador() {}

	
	public void run(){
        int i = 0;
		while(i <= 100){
            try {
            	System.out.println(i);
				sleep(1000);
				i++;
		    }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
        }
		System.out.println("AQUI TERMINA EL CONTADOR");
    
    }

}

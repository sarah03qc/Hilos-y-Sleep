package contador;


public class Abecedario extends Thread{
	
	char Lista[] = {'A','B','C','D','E','F','G','H','I','J','K',
			'L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public void run(){
		int i=0;
		while(i < Lista.length){
            try {
            	System.out.println(Lista[i]);
				sleep(1000);
				i++;
		    }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
        }
		System.out.println("AQUI TERMINA EL ABECEDARIO");
    
    }

}

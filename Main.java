package contador;

public class Main {
	static Contador contador = new Contador();
	static Abecedario abecedario = new Abecedario();



	public static int multiplicador(int valor) {
		int resultado = 0;
		if (valor < 10) {
			resultado = valor * 10;
		}
		else {
			resultado = valor * 5;
		}
		return resultado;
	}
	
	public static void main(String[] args) {

		System.out.println("AQUI EMPIEZA AMBOS CONTADORES");
		abecedario.start();
		contador.start();
		
		
		/*
		System.out.println("Hola Mundo!");
		int num = 5;
		String numero = "Cinco";
		
		System.out.println("****************");
		System.out.println(num +" = "+ numero);
		System.out.println("****************");
		System.out.println(multiplicador(num));
		*/
	}
}

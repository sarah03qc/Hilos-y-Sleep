package sec;

public class Main {
	static HiloContador conta = new HiloContador();
	static HiloAritm operac = new HiloAritm();
	static HiloContador conta2 = new HiloContador();
	
	public static void main(String[] args) {
		System.out.println("INICIO");
		conta.start();
		operac.start();
		//conta2.start();
		}
}
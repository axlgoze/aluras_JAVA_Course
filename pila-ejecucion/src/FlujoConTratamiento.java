
public class FlujoConTratamiento {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin de main");
	}
		
	private static void metodo1() {
		System.out.println("Inicio de metodo1");
		metodo2();
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio de metodo2");
		//System.out.println("Fin de metodo2");
		
		throw new ArithmeticException("Surgio un error");
		

		
		
	}	
}

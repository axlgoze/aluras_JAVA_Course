
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin de main");
	}
		
	private static void metodo1() {
		System.out.println("Inicio de metodo1");
		try {
			metodo2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2() throws MiException {
		System.out.println("Inicio de metodo2");
		
		throw new MiException("My Exception has been thrown");
		//System.out.println("Fin de metodo2");
	}	
}

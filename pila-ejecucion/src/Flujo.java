
public class Flujo {
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
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				if(i == 3) {
					int num=0;
					int resultado= i/num;
					System.out.println(resultado);
				}
				String test = null;
				System.out.println(test.toString());
			} catch(ArithmeticException | NullPointerException exception){
				System.out.println("Atrapo Exception");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
		}
		System.out.println("Fin de metodo2");
	}	
}

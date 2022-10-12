
public class TestReferencia {
	
	public static void main(String[] args) {
		// General item can be adapted to the most specific item
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Brayan");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
	}	
	
}

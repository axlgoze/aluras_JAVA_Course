
public class TestGerente {
	public static void main(String[] args) {
		//Funcionario gerente = new Funcionario();
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setClave("Alura");
		
		System.out.println(gerente.login("Alura"));
		
		System.out.println(gerente.getBonificacion());
	}
}

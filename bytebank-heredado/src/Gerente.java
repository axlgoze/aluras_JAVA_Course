// extends from
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String valor){
		this.clave = clave;
	}
	
	public boolean login(String clave){
		return clave == "Alura";
	}

	public double getBonificacion() {
		return super.getSalario() + this.getSalario() * 0.05;
	}
}

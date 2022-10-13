// extends from
public class Gerente extends Funcionario implements Autenticable{

	public double getBonificacion() {
	    System.out.println("Ejecutando desde Gerente");
		//return super.getSalario() + this.getSalario() * 0.05;
	    return 2000;
	}

    @Override
    public void setClave(String valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean login(String clave) {
        // TODO Auto-generated method stub
        return false;
    }
}

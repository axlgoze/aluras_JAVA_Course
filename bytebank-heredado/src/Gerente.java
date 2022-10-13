// extends from
public class Gerente extends Funcionario implements Autenticable{
    
    AutenticacionUtil util;
    
    public Gerente() {
        util = new AutenticacionUtil();
    }
    
	public double getBonificacion() {
	    System.out.println("Ejecutando desde Gerente");
		//return super.getSalario() + this.getSalario() * 0.05;
	    return 2000;
	}

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
        
    }

    @Override
    public boolean login(String clave) {
        return this.util.iniciarSesion(clave);
    }
}

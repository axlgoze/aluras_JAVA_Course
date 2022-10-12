
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario axel = new Contador();
		Gerente jimena = new Gerente();
		Contador alexis = new Contador();
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		axel.setSalario(2000);
		jimena.setSalario(10000);
		alexis.setSalario(5000);
		
		controlBonificacion.registrarSalario(axel);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
		
		
	}
}


public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
		
		System.out.println("nuevas pruebas");
		
		CuentaCorriente cc2 = new CuentaCorriente(111, 111);
		CuentaAhorros ca2 = new CuentaAhorros(222,222);
		
		cc2.depositar(1000);
		ca2.depositar(1000);
		
		cc2.transferir(200, ca2);
		ca2.transferir(100, cc2);
		
		System.out.println("cc2: "+cc2.getSaldo());
		System.out.println("ca2: "+ca2.getSaldo());
		
		
		
	}
}

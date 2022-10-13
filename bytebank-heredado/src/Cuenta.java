
public abstract class Cuenta implements Tributacion{
	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente titular = new Cliente(); //this way objects are initialized with null
	
	
	//class variable not for instance
	private static int total = 0;
	
	
	//constructor personalized
	public Cuenta(int agencia, int numero) {
		if(this.agencia<0 && numero<0) {
			System.out.println("No se permiten valores negativos");
			this.agencia=1;
			this.numero=1;
		}else {
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Estoy creando una cuenta");
		}
		total++;
		System.out.println("Se van creando : "+total+" cuentas.");
	}
	
	public abstract void depositar(double saldo);
	
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	
	public boolean transferir( double valor, Cuenta cuenta) {
		if(this.saldo >= valor ) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}else {
			return false;			
		}
	}
	
	//get method
	public double getSaldo(){
		//this object
		return this.saldo;
	}
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}
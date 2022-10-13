
public class CuentaAhorros extends Cuenta {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
		
	}

    @Override
    public double getValorImpuesto() {
        // TODO Auto-generated method stub
        return 0;
    }
	
}

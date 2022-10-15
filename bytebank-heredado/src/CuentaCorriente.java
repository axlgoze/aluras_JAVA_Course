
public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) {
		double valorARetirar = valor + 0.2;
		super.retirar(valorARetirar);
	}

	@Override
	public void depositar(double saldo) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public double getValorImpuesto() {
        // TODO Auto-generated method stub
        return super.saldo *0.01;
    }
}


public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        
        cuenta.depositar(210);
        cuenta.retirar(210);
        cuenta.retirar(10);
        
        
        
    }
}

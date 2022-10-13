
public class SistemaInterno {
    
    private String clave = "Alura";
    
    public boolean autentica(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.login(clave);
        if(puedeIniciarSesion) {
            System.out.println("Login Exitoso");
            return true;
        }else {
            System.out.println("Error al iniciar sesión");
            return false;
        }
    }
}

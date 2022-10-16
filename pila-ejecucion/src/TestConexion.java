
public class TestConexion {
	public static void main(String[] args) {
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch(IllegalStateException e){
			System.out.println("...Recibiendo Exception");
			e.printStackTrace();			
		} finally {
			if(con != null) {
				System.out.println("...Ejecutando Finally");				
				con.cerrar();
			}
		}
	}
}

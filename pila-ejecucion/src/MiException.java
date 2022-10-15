
public class MiException extends RuntimeException{
	
	public MiException() {
		//invoking father's constructor
		super();
	}
	
	public MiException(String message) {
		super(message);
	}

}

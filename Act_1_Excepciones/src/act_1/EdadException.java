package act_1;

public class EdadException extends Exception{
	private static final long serialVersionUID = 1L;
	private int edad;
	
	public EdadException(int edad) {
		this.edad = edad;
	}
	
	
}

package act_1;

public class NombreLongitudException extends Exception{
	private static final long serialVersionUID = 1L;
	private int numero;
	
	public NombreLongitudException(int numero) {
		super();
		this.numero = numero;
	}
	
	
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
public class CuentaBancaria {

	
	private String IBAN;
	private String titular;
	private Double saldo;
	private int numMaxMovimientos = 100;
	
	private Movimiento[] coleccion;
	
	private int numActualesMovimientos = 0;
	
	
	
	
	
	public CuentaBancaria(String IBAN, String titular, Double saldo) {
		
	this.IBAN = IBAN;
	this.titular = titular;
	this.saldo = saldo;
	this.coleccion = new Movimiento[this.numMaxMovimientos];
	this.numMaxMovimientos = 100; 
	
	}
	

	
	public CuentaBancaria(String IBAN, String titular) {
	
	this.IBAN = IBAN;	
	this.titular = titular;
	this.saldo = 0.00;
	this.numActualesMovimientos = 0;
	
	}
	
	public CuentaBancaria() {
		this.numMaxMovimientos = 100; 
		this.saldo = 0.00;
		this.numActualesMovimientos = 0;
		this.coleccion = new Movimiento[this.numMaxMovimientos];
	}
	



	public void MostrarInfoCuentaBancaria() {
		String s = "\nIBAN " + this.IBAN + ", Titular "+ this.titular + ", Saldo " + this.saldo; 
		System.out.println(s);
		
		if(this.numActualesMovimientos > 0) {
			System.out.println("Los movimientos son: ");
			
			for (int i = 0; i < numActualesMovimientos; i++) {
				System.out.println("\n"+ (i + 1) + (". ") + this.coleccion[i].mostrarInfoMovimientos() +"\n");
				
			}
		}
	
	}
	
	public void MostrarNombreCuenta() {
		String d = "\nNombre de cuenta"+ this.titular;
		System.out.println(d);
	}
	
	public void addMovimiento(int ID, String fecha, Tipo tipo, Double cantidad) {
		if(numActualesMovimientos < numMaxMovimientos) {
			
			Movimiento nuevoMovimiento = new Movimiento(ID, fecha, tipo, cantidad);
			
			coleccion[numActualesMovimientos] = nuevoMovimiento;
			numActualesMovimientos++;
			
		}
	
	}
	
	public void mostrarMovimiento() {
		for(int i = 0; i < numActualesMovimientos; i++) {
			System.out.println(coleccion[i].mostrarInfoMovimientos());
			
		}
		
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
		
	}
	

	
}

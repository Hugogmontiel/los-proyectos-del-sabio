package DawBank;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CuentaBancaria {

	
	private String IBAN;
	private Cliente cliente;
	private Double saldo;
	
	private ArrayList<Movimiento> coleccion= new ArrayList<Movimiento>();
	
	private int numActualesMovimientos = 0;
	
	
	
	
	
	public CuentaBancaria(String IBAN, Cliente cliente, Double saldo) {
		
	this.IBAN = IBAN;
	this.cliente = cliente;
	this.saldo = saldo;
	
	
	}
	
	public CuentaBancaria() {
		this.numActualesMovimientos = 0;
		this.saldo = 0.00;
	}
	

	public void MostrarInfoCuentaBancaria() {
		String s = "\nIBAN " + this.IBAN + ", Cliente "+ this.cliente + ", Saldo " + this.saldo; 
		System.out.println(s);
		
		if(this.numActualesMovimientos > 0) {
			System.out.println("Los movimientos son: ");
			
				System.out.println(this.coleccion.toString());
			
		}
	
	}
	
	public void MostrarNombreCuenta() {
		String d = "\nNombre de cuenta"+ this.cliente;
		System.out.println(d);
	}
	
	public void addMovimiento(int ID, LocalDateTime fecha, Tipo tipo, Double cantidad) {
		
			
			Movimiento nuevoMovimiento = new Movimiento(ID, fecha, tipo, cantidad);
			
			coleccion.add(nuevoMovimiento);
			numActualesMovimientos++;
			
		
	
	}
	
	public void mostrarMovimiento() {
		
			System.out.println(coleccion.toString());
			
		
		
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
		
	}
	

	
}

package DawBank;

import java.time.LocalDateTime;

public class Movimiento {


	private int ID;
	private LocalDateTime fecha;
	private Tipo tipo;
	private Double cantidad;
	
	public Movimiento (int ID, LocalDateTime fecha, Tipo tipo, Double cantidad) {
		this.ID = ID;
		this.fecha = fecha;
		this.tipo = tipo;
		this.setCantidad(cantidad);
	
	}

	
	@Override
	public String toString() {
		return "Movimiento [ID=" + ID + ", fecha=" + fecha + ", tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}

	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
	
		this.cantidad = cantidad;
	
	}


	
}


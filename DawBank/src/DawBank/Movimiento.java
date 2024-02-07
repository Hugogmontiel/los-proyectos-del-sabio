package DawBank;

public class Movimiento {


	private int ID;
	private String fecha;
	private Tipo tipo;
	private Double cantidad;
	
	public Movimiento (int ID, String fecha, Tipo tipo, Double cantidad) {
		this.ID = ID;
		this.fecha = fecha;
		this.tipo = tipo;
		this.setCantidad(cantidad);
	
	}

	public String mostrarInfoMovimientos() {
	
		String s = "ID "+ this.ID +", Fecha "+ this.fecha + ", Tipo "+ this.tipo + ", Cantidad "+ this.cantidad + "€";
	
		return s;
	}

	
	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
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


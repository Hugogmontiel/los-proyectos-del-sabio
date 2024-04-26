package ficheros_combinados;

import java.io.Serializable;

public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String referencia;
	private String descripcion;
	private String tipo;
	private int cantidad;
	private double precio;
	private int descuento;
	private int IVA;
	private boolean aplciarDto;
	
	public Producto(String referencia, String descripcion, String tipo, int cantidad, double precio, int descuento,
			int iVA, boolean aplciarDto) {
		super();
		this.referencia = referencia;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descuento = descuento;
		IVA = iVA;
		this.aplciarDto = aplciarDto;
	}
		
	
	
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", descripcion=" + descripcion + ", Tipo=" + this.tipo + ", cantidad="
				+ cantidad + ", precio=" + precio + ", descuento=" + descuento + ", IVA=" + IVA + ", aplciarDto="
				+ aplciarDto + "]";
	}



	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public boolean isAplciarDto() {
		return aplciarDto;
	}

	public void setAplciarDto(boolean aplciarDto) {
		this.aplciarDto = aplciarDto;
	}
	
	
	
}

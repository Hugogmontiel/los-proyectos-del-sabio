import java.time.LocalDate;
	public class Pelicula {
	
		private String COD;
		private String titulo;
		private Genero genero;
		private LocalDate fechaRegistro;
		private LocalDate fechaBaja;
		private LocalDate fechaAlquiler;
		private Boolean isAlquilada;
		

	
	public Pelicula (String COD, String titulo, Genero genero, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDate fechaAlquiler, Boolean isAlquilada) {
		this.COD = COD;
		this.titulo = titulo;
		this.genero = genero;
		this.fechaRegistro = fechaRegistro;
		this.fechaBaja = fechaBaja;
		this.fechaAlquiler = fechaAlquiler;
		this.isAlquilada = isAlquilada;
		
	}
	
	public void mostrarInfoPelicula () {
		String s = "COD: "+ this.COD + "\nTitulo: " + this.titulo + "\nGenero: " + this.genero + "\n Fecha de registro: " + this.fechaRegistro 
				+ "\nFecha de baja: " + this.fechaBaja + "\nFecha de Alquier: " + this.fechaAlquiler + "\nEsta alquilada: " + this.isAlquilada;
		
		System.out.println(s);
		
	}


	public String getCOD() {
		return COD;
	}


	public void setCOD(String COD) {
		this.COD = COD;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public LocalDate getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}


	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}


	public Boolean getIsAlquilada() {
		return isAlquilada;
	}


	public void setIsAlquilada(Boolean isAlquilada) {
		this.isAlquilada = isAlquilada;
	}
	
	


}

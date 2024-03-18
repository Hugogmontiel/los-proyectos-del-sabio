package daw;

import java.time.LocalDate;

public class Libro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	private LocalDate fechaPublicion;
	
	
	public Libro(String iSBN, String titulo, String autor, LocalDate fechaPublicion) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicion = fechaPublicion;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public LocalDate getFechaPublicion() {
		return fechaPublicion;
	}


	public void setFechaPublicion(LocalDate fechaPublicion) {
		this.fechaPublicion = fechaPublicion;
	}
	
	
	
	

}

package mascotas;

import java.time.LocalDate;

public class Mascotas {

	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;
	public Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	
	public void mostrarMascotas() {
		String s = "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
		System.out.println(s);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}

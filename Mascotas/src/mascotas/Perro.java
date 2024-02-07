package mascotas;

import java.time.LocalDate;

public class Perro extends Mascotas{
	
	private String raza;
	private boolean pulgas;
	
	public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
		System.out.println(s);
	}

	public void hablar() {
		
		System.out.println("Guau");
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	
	

}

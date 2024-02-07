package mascotas;

import java.time.LocalDate;

public class Aves extends Mascotas{
	
	private String pico;
	private boolean vuela;
	public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	public String getPico() {
		return pico;
	}
	public void setPico(String pico) {
		this.pico = pico;
	}
	public boolean isVuela() {
		return vuela;
	}
	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	

}

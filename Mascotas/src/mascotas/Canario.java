package mascotas;

import java.time.LocalDate;

public class Canario extends Aves{
	
	private String color;
	private boolean canta;
	public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}
	@Override
	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Canario [color=" + color + ", canta=" + canta + "]";
		System.out.println(s);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCanta() {
		return canta;
	}
	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
	

}

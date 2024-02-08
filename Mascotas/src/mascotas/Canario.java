package mascotas;

import java.time.LocalDate;

/**
 * @author Hugo García Montiel
 * @version 1.0
 * @since 08/02/2024
 */
public class Canario extends Aves{
	
	private String color;
	private boolean canta;
	
	/*
	 *@param color El color que tienen los canarios
	 *@param canta Si el canario canta o no
	 */
	public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}
	
	/*
	 * Metodo para mostrar toda la información de los canarios
	 * 
	 * @param s Se guarda la informacion de la mascota y despues se pinta
	 */
	@Override
	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Canario [color=" + color + ", canta=" + canta + "]";
		System.out.println(s);
	}
	
	/*
	 * Metodo get de color
	 * 
	 * @return devuelve valor que tiene color
	 */
	public String getColor() {
		return color;
	}
	/*
	 * Metodo set de color
	 * 
	 * @param color el valor que tiene color para el canario
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/*
	 * Metodo get de isCanta
	 * 
	 * @return devuelve valor true o false para si canta o no un canario
	 */
	public boolean isCanta() {
		return canta;
	}
	
	/*
	 * Metodo set de canta
	 * 
	 * @param canta el valor que tiene canta, true o false
	 */
	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
	

}

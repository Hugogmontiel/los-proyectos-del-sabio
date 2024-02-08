package mascotas;

import java.time.LocalDate;
/**
 * @author Hugo García Montiel
 * @version 1.0
 * @since 08/02/2024
 */

public class Aves extends Mascotas{
	
	private String pico;
	private boolean vuela;
	
	/*
	 *@param pico El tipo de pico de cada ave
	 *@param vuela Si vuela o no vuela en el caso de cada ave
	 */
	
	public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	/*
	 * Metodo get de pico
	 * 
	 * @return el valor de pico
	 */
	public String getPico() {
		return pico;
	}
	
	/*
	 * Metodo set de pico
	 * 
	 * @param el valor de pico
	 */
	public void setPico(String pico) {
		this.pico = pico;
	}
	/*
	 * Metodo get de vuela
	 * 
	 * @return true o false de si vuela o no
	 */
	public boolean isVuela() {
		return vuela;
	}
	/*
	 * Metodo set de vuela
	 * 
	 * @param el valor de vuela false o true
	 */
	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	

}

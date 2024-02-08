package mascotas;

import java.time.LocalDate;

/**
 * @author Hugo García Montiel
 * @version 1.0
 * @since 08/02/2024
 */

public class Gato extends Mascotas{
	
	private String color;
	private boolean peloLargo;
	
	/*
	 *@param color El color que tienen los gatos
	 *@param peloLargo Si el gato tiene pelo largo o no
	 */

	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	
	/*
	 * Metodo para mostrar la información de los gatos
	 * 
	 * @param s Variable a la que se asigna toda la información del gato
	 */

	
	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
		System.out.println(s);
	}
	
	/*
	 * Metodo con el sonido que hace un gato
	 * 
	 */
	public void hablar() {
		
		System.out.println("Miau");
	}

	/*
	 * Metodo get de color
	 * 
	 * @return color  devuelve valor que tiene color para un gato
	 */

	public String getColor() {
		return color;
	}


	/*
	 * Metodo set de color
	 * 
	 * @param color el valor que se le da al color de un gato
	 */

	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * Metodo get de peloLargo
	 * 
	 * @return peloLargo devuelve true o false de si tiene pelo largo o no
	 */



	public boolean isPeloLargo() {
		return peloLargo;
	}

	/*
	 * Metodo set de peloLargo
	 * 
	 * @param peloLargo el valor true o false que se le da a peloLargo de un gato
	 */



	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	
	
}

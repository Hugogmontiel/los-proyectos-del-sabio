package mascotas;

import java.time.LocalDate;

public class Gato extends Mascotas{
	
	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	
	

	
	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
		System.out.println(s);
	}

	public void hablar() {
		
		System.out.println("Miau");
	}



	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public boolean isPeloLargo() {
		return peloLargo;
	}





	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	
	
}

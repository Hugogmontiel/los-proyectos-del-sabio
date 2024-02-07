package mascotas;

import java.time.LocalDate;

public class Loro extends Aves{
	
	private String origen;
	private boolean habla;
	public Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	@Override
	public void mostrarMascotas() {
		super.mostrarMascotas();
		String s = "Loro [origen=" + origen + ", habla=" + habla + "]";
		System.out.println(s);
	}
	
	public void habla() {
		
		System.out.println("Hola");
	}
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public boolean isHabla() {
		return habla;
	}
	public void setHabla(boolean habla) {
		this.habla = habla;
	}
	
		

}

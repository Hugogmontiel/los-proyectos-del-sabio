package act_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gato {
	private String nombre;
	private int edad;
	
	public Gato(String nombre, int edad) {	
		this.nombre = nombre;
		this.edad = edad;
	}
	public Gato() {	
		
	}
	
	public String imprimir() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) throws NombreLongitudException {
		boolean isValid = false;
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		Matcher matcher = pattern.matcher(nombre);
		if(nombre.length() < 3 || !matcher.matches()) {
			throw new NombreLongitudException(nombre.length());
			
		}
		else {
			this.nombre = nombre;
		}
		return isValid;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws EdadException {
		if(edad < 0) {
			throw new EdadException(edad);
			
		}
		else  {
			this.edad = edad;
		}
	}
	
	
	
}

package act_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {
	
	private String nombre;
	private String telefono;
	private String correo;
	
	public Contacto(String nombre, String telefono, String correo) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	public boolean validatorNombre(String nombre) {
		boolean isValid = false;
		String regex = "^[A-Z][a-z]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(nombre);
		
		if(matcher.matches()) {
			isValid = true;
		}
		
		
		return isValid;
	}
	
	public boolean validatorTelefono(String telefono) {
		boolean isValid = false;
		String regex = "^[679]\\d{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(telefono);
		
		if(matcher.matches()) {
			isValid = true;
		}
		
		
		return isValid;
	}
	
	public boolean validatorCorreo(String correo) {
		boolean isValid = false;
		String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		
		if(matcher.matches()) {
			isValid = true;
		}
		
		
		return isValid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}

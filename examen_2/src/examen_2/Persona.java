package examen_2;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class Persona {

		private String nombre;
		private LocalDate fechaNacimiento;
		private String DNI;
		private String direccion;
		
	public Persona (String nombre, LocalDate fechaNacimiento, String DNI, String direccion) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.DNI = DNI;
		this.direccion = direccion;
		
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", DNI=" + DNI + ", direccion="
				+ direccion + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) throws DNIException {
		String regex = "^d{8}//[A-Z]{1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(DNI);
		
		if(matcher.matches()) {
			DNI = dNI;
		}
		else {
			throw new DNIException();
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
}
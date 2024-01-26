import java.time.LocalDate;

public class Trabajador {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String DNI;
	private String direccion;
	private String numeroSS;



	public Trabajador(String nombre, LocalDate fechaNacimiento, String DNI, String direccion, String numeroSS) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.DNI = DNI;
		this.direccion = direccion;
		this.numeroSS = numeroSS;
		
	}
	
	public void mostrarInfoTrabajador() {
		String s = "Nombre: " + this.nombre + ", fechaNacimiento: "+ this.fechaNacimiento + ", DNI: " + this.DNI +
				", Dirección: " + this.direccion + ", NumeroSS: " + this.numeroSS;
		
		System.out.println(s);
		
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



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getNumeroSS() {
		return numeroSS;
	}



	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}
	
	
	

}



import java.time.LocalDate;
	public class Cliente {

		private String DNI;
		private String nombre;
		private int numSocio;
		private String direccion;
		private LocalDate fechaNacimiento; //mayor de edad si o si
		private LocalDate fechaBaja;
	
		private Pelicula [] peliculasAlquiladas;
		
		private int numActualPeliculas = 0;
		
		
	
	public Cliente (String DNI, String nombre, int numSocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBaja) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.numSocio = numSocio;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaBaja = fechaBaja;
		
	}
	
		public void mostarInfoCliente () {
			String s = "DNI : "+ this.DNI + "\nNombre: " + this.nombre + "\nNumero de socios: " + this.numSocio + "\nDireccion: " + this.direccion + "\nFecha nacimiento: " + this.fechaNacimiento
					+ "\nFecha baja: " + this.fechaBaja;
			
			System.out.println(s);
		}
		
		public void mostrarPeliculasAlquiladas () {
			for(int i = 0; i < peliculasAlquiladas.length; i++) {
				
				if(this.peliculasAlquiladas[i].getIsAlquilada()) {
					System.out.println(this.peliculasAlquiladas[i]);
					
				}
			}
		}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String DNI) {
		this.DNI = DNI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumSocio() {
		return numSocio;
	}



	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public LocalDate getFechaBaja() {
		return fechaBaja;
	}



	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	
	
}

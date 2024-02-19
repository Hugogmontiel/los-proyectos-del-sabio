package DawBank;

import java.time.LocalDate;

public class Persona {
		private String nombre;
		private String DNI;
		private LocalDate fechaNacimiento;
		
		public Persona(String nombre, String dNI, LocalDate fechaNacimiento) {
			
			this.nombre = nombre;
			DNI = dNI;
			this.fechaNacimiento = fechaNacimiento;
		}

		
		
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", fechaNacimiento=" + fechaNacimiento + "]";
		}



		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}		
		
	}

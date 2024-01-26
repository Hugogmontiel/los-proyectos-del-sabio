import java.time.LocalDate;
import java.util.Scanner;

public class Empresa {

	private String nombre;
	private String CIF;
	private LocalDate fechaFundacion;
	private int maximoTrabajadores;
	
	private Trabajador [] coleccion;
	
	private Trabajador [] personas;
	
	private int numActualPersonas = 0;
	
	private int numTrabajadorActual = 0;
	
	public Empresa(String nombre, String CIF, LocalDate fechaFundacion, int maximoTrabajadores, Trabajador[] coleccion, Trabajador [] personas, int numTrabajadorActual) {
		this.numTrabajadorActual = numTrabajadorActual;
		this.nombre = nombre;
		this.CIF = CIF;
		this.fechaFundacion = fechaFundacion;
		this.maximoTrabajadores = maximoTrabajadores;
		this.coleccion = coleccion;
		this.personas = personas;
		
	}
	
	public Empresa (int maximoTrabajadores) {
		this.maximoTrabajadores = maximoTrabajadores;
		this.coleccion = new Trabajador[maximoTrabajadores];
		this.personas = new Trabajador[maximoTrabajadores];
	}
	
	public void registrarTrabajador() {
		boolean existeTrabajador = false;
		if(coleccion[0] == null) {
			coleccion[0] = personas[0];
			System.out.println("Trabajador añadido");
			numTrabajadorActual++;
			
		}
		else {
			
		for(int i = 0; i < numTrabajadorActual; i++) {
			for(int j = 0; j < numTrabajadorActual; j++) {
				if(coleccion[i].getDNI().equalsIgnoreCase(personas[j].getDNI())) {
					existeTrabajador = true;
				}
			}	
		}
			
		if(existeTrabajador == true) {
			System.out.println("No se puede añadir ese trabajador porque esta repetido");
			
		}
		
		if(existeTrabajador == false ) {
			coleccion[numTrabajadorActual] = personas[numActualPersonas];
			numTrabajadorActual++;
			System.out.println("Trabajador añadido");
			
		}
		
		}	
	}
	
	public void eliminarTrabajadorEmpresa() {
		if (coleccion[numTrabajadorActual] != null) {
			boolean trabajadorBorrado = false;
			
			for(int i = 0; i < numTrabajadorActual; i++) {
				if(coleccion[i].getDNI().equalsIgnoreCase(personas[i].getDNI())) {
					coleccion[i] = null;
					numTrabajadorActual--;
					System.out.println("Se ha borrado el trabajador");
					trabajadorBorrado = true;
				}
			}
			
			if(trabajadorBorrado == false) {
				System.out.println("No se ha podido eliminar al trabajador porque el DNI no existe");
			}
		}
		else {
			System.out.println("No se puede eliminar trabajador ya que no hay ninguno");
			
		}
		
	}
	
	public void mostrarInfoEmpresa() {
		String s = "Nombre: " + this.nombre + ", CIF: " + this.CIF + ", Fecha de fundación: " + this.fechaFundacion + "Número maximo de trabajadores: " + this.maximoTrabajadores;
		
		System.out.println(s);
		
	}
			
	public void mostrarInfoTrabajadores() {
		for (int i = 0; i < numTrabajadorActual; i++) {
			
				coleccion[i].mostrarInfoTrabajador();
			
		}
		
	}
	
	public void mostrarTrabajadoresActuales() {
		System.out.println("Hay "+ numTrabajadorActual + " trabajador/es");
	}
	
	public void nuevaPersona(String nombre, LocalDate fechaNacimiento, String DNI, String direccion, String numeroSS) {
		if(numTrabajadorActual < maximoTrabajadores) {
			Trabajador nuevoTrabajador = new Trabajador(nombre, fechaNacimiento, DNI, direccion, numeroSS);
			
			 personas[numActualPersonas] = nuevoTrabajador;
			 numActualPersonas++;
			
		}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String CIF) {
		this.CIF = CIF;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public int getMaximoTrabajadores() {
		return maximoTrabajadores;
	}

	public void setMaximoTrabajadores(int maximoTrabajadores) {
		this.maximoTrabajadores = maximoTrabajadores;
	}

	public Trabajador[] getColeccion() {
		return coleccion;
	}

	public void setColeccion(Trabajador[] coleccion) {
		this.coleccion = coleccion;
	}
	
	public int getnumTrabajadorActual() {
		return numTrabajadorActual;
	}

	public void setnumTrabajadorActua(int numTrabajadorActua) {
		this.numTrabajadorActual = numTrabajadorActua;
	}
	
	
}
